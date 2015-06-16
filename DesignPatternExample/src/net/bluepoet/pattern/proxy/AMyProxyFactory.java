package net.bluepoet.pattern.proxy;

import java.lang.reflect.Proxy;

public class AMyProxyFactory {
	public static Object getProxyObject(Object inObject, String[] invocationHandlers) throws Throwable {
		if (invocationHandlers != null && invocationHandlers.length > 0) {
			Object inProxiedObject = inObject;

			for (int i = 0; i < invocationHandlers.length; i++) {
				AMyInvocationHandler handler = (AMyInvocationHandler) getInvocationHandler(invocationHandlers[i]);
				inProxiedObject = getProxyObject(inObject, handler, inProxiedObject);
			}
			return inProxiedObject;
		} else {
			return inObject;
		}
	}

	private static Object getProxyObject(Object inObject, AMyInvocationHandler handler, Object inProxiedObject) {
		handler.setRealTarget(inObject);
		handler.setTarget(inProxiedObject);

		return Proxy.newProxyInstance(inObject.getClass().getClassLoader(), inObject.getClass().getInterfaces(),
						handler);
	}

	private static Object getInvocationHandler(String invocationHandler) {
		try {
			Class klass = Class.forName(invocationHandler);
			return klass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private static Object getTargetObject(String className) {
		try {
			Class klass = Class.forName(className);
			return klass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
