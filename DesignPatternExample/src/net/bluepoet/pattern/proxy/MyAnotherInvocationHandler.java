package net.bluepoet.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyAnotherInvocationHandler implements InvocationHandler {
	private Object target;

	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			System.out.println("MyAnotherInvocationHandler : Going to execute method ");
			args[0] = args[0] + " Modified by AnotherConcreteDecorator";
			Object ret = method.invoke(target, args);
			System.out.println("MyAnotherInvocationHandler : After to execute method ");
			return ret;
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw e;
		}
	}
}
