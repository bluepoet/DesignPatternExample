package net.bluepoet.pattern.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AMyAnotherInvocationHandler extends AMyInvocationHandler {

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			System.out.println("AMyAnotherInvocationHandler : Going to execute method ");
			if(method.getName().equals("doExecute") && args != null && args.length >= 1) {
				if(args[0] instanceof String) {
					args[0] = args[0] + " Modified by MyAnotherInterceptor";
				}
			}
			Object ret = method.invoke(target, args);
			System.out.println("AMyAnotherInvocationHandler : After to execute method ");
			return ret;
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw e;
		}
	}

}
