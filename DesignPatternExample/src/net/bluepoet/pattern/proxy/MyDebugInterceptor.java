package net.bluepoet.pattern.proxy;

import java.lang.reflect.Method;

public class MyDebugInterceptor implements IMethodInterceptor {

	@Override
	public Object interceptBefore(Object proxy, Method method, Object[] args, Object realTarget) {
		System.out.println("Going to execute method : " + method.getName());
		return null;
	}

	@Override
	public void interceptAfter(Object proxy, Method method, Object[] args, Object realTarget, Object retObject,
					Object interceptBeforeReturnObject) {
		System.out.println("After execute method : " + method.getName());
	}

}
