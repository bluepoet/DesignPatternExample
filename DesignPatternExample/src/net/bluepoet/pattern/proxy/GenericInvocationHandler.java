package net.bluepoet.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GenericInvocationHandler implements InvocationHandler {
	private Object target = null;
	private Object realTarget = null;
	private IMethodInterceptor methodInterceptor = null;
	
	public void setTarget(Object target) {
		this.target = target;
	}
	
	public void setRealTarget(Object realTarget) {
		this.realTarget = realTarget;
	}


	public void setMethodInterceptor(IMethodInterceptor methodInterceptor) {
		this.methodInterceptor = methodInterceptor;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			Object interceptBeforeReturnObject = null;
			if(methodInterceptor != null) {
				interceptBeforeReturnObject = methodInterceptor.interceptBefore(proxy, method, args, realTarget);
			}
			Object retObject = method.invoke(target, args);
			if(methodInterceptor != null) {
				methodInterceptor.interceptAfter(proxy, method, args, realTarget, retObject, interceptBeforeReturnObject);
			}
			return retObject;
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch(Exception e) {
			throw e;
		}
	}

}
