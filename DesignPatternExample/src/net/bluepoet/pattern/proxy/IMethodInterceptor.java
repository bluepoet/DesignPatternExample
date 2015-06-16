package net.bluepoet.pattern.proxy;

import java.lang.reflect.Method;

public interface IMethodInterceptor {
	Object interceptBefore(Object proxy, Method method, Object[] args, Object realTarget);

	void interceptAfter(Object proxy, Method method, Object[] args, Object realTarget, Object retObject,
					Object interceptBeforeReturnObject);
}
