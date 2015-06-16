package net.bluepoet.pattern.proxy;

import java.lang.reflect.Proxy;

public class SingleInstanceMyProxyFactory {
	public static Object getProxyObject(String className, String[] interceptors) throws Throwable {
		Object inObject = getTargetObject(className);

		if (interceptors != null && interceptors.length > 0) {
			return getProxyObject(inObject, interceptors);
		} else {
			return inObject;
		}
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

	private static Object getProxyObject(Object inObject, String[] interceptors) {
		SingleInstanceGenericInvocationHandler handler = new SingleInstanceGenericInvocationHandler();
		Object[] interceptorObjects = getInterceptors(interceptors);
		handler.setRealTarget(inObject);
		handler.setMethodInterceptor(interceptorObjects);

		return Proxy.newProxyInstance(inObject.getClass().getClassLoader(), inObject.getClass().getInterfaces(),
						handler);
	}

	private static Object[] getInterceptors(String[] interceptors) {
		Object[] objInterceptors = new Object[interceptors.length];
		for (int i = 0; i < objInterceptors.length; i++) {
			objInterceptors[i] = getInterceptor((String) interceptors[i]);
		}
		return objInterceptors;
	}

	private static Object getInterceptor(String className) {
		try {
			Class klass = Class.forName(className);
			return klass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
