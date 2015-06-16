package net.bluepoet.pattern.proxy;

import java.lang.reflect.Method;

public class MyAnotherInterceptor implements IMethodInterceptor {

	@Override
	public Object interceptBefore(Object proxy, Method method, Object[] args, Object realTarget) {
		System.out.println("MyAnotherInterceptor : Going to execute method ");
		if(method.getName().equals("doExecute") && args != null && args.length >= 1) {
			if(args[0] instanceof String) {
				args[0] = args[0] + " Modified by MyAnotherInterceptor";
			}
		}
		return null;
	}

	@Override
	public void interceptAfter(Object proxy, Method method, Object[] args, Object realTarget, Object retObject,
					Object interceptBeforeReturnObject) {
		System.out.println("MyAnotherInterceptor : After to execute method ");
	}
}
