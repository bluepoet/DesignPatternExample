package net.bluepoet.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SingleInstanceGenericInvocationHandler implements InvocationHandler {
	private Object realTarget = null;
	private Object[] methodInterceptors = null;

	public void setRealTarget(Object realTarget) {
		this.realTarget = realTarget;
	}

	public void setMethodInterceptor(Object[] methodInterceptors) {
		this.methodInterceptors = methodInterceptors;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			Object[] retInterceptBefore = null;
			if (methodInterceptors != null && methodInterceptors.length > 0) {
				retInterceptBefore = new Object[methodInterceptors.length];

				for (int i = methodInterceptors.length - 1; i >= 0; i--) {
					if (methodInterceptors[i] != null) {
						retInterceptBefore[i] = ((IMethodInterceptor) methodInterceptors[i]).interceptBefore(proxy,
										method, args, realTarget);

					}
				}
			}
			Object retObject = method.invoke(realTarget, args);
			if (methodInterceptors != null && methodInterceptors.length > 0) {
				for (int i = 0; i < methodInterceptors.length; i++) {
					((IMethodInterceptor) methodInterceptors[i]).interceptAfter(proxy, method, args, realTarget,
									retObject, retInterceptBefore[i]);
				}
			}
			return retObject;
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw e;
		}
	}
}
