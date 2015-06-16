package net.bluepoet.pattern.proxy;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
	public static Object getProxyObject(String className, String[] interceptors) throws Throwable {
		Object inObject = getTargetObject(className);

		if (interceptors != null && interceptors.length > 0) {
			Object inProxiedObject = inObject;

			for (int i = 0; i < interceptors.length; i++) {
				inProxiedObject = getProxyObject(inObject, interceptors[i], inProxiedObject);
			}
			return inProxiedObject;
		} else {
			return inObject;
		}
	}

	private static Object getProxyObject(Object inObject, String interceptor, Object inProxiedObject) {
		GenericInvocationHandler handler = new GenericInvocationHandler();
		IMethodInterceptor interceptorObject = (IMethodInterceptor) getInterceptor(interceptor);
		if (interceptorObject == null) {
			return inProxiedObject;
		}
		handler.setTarget(inProxiedObject);
		handler.setRealTarget(inObject);
		handler.setMethodInterceptor(interceptorObject);

		return Proxy.newProxyInstance(inObject.getClass().getClassLoader(), inObject.getClass().getInterfaces(),
						handler);
	}

	private static Object getInterceptor(String interceptor) {
		try {
			Class klass = Class.forName(interceptor);
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
