package net.bluepoet.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyDebugInvocationHandler implements InvocationHandler {
	private Object target;

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			System.out.println("Going to execute method : " + method.getName());
			Object retObject = method.invoke(target, args);
			System.out.println("After execute method : " + method.getName());
			return retObject;
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw e;
		}
	}
}
