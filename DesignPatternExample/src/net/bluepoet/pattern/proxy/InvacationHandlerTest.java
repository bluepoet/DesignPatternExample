package net.bluepoet.pattern.proxy;

import java.lang.reflect.Proxy;

public class InvacationHandlerTest {
	public static void main(String[] args) {
		IMyBusinessObject bo = new MyBusinessObject();
		MyDebugInvocationHandler aMyDebugInvocationHandler = new MyDebugInvocationHandler();
		aMyDebugInvocationHandler.setTarget(bo);
		MyAnotherInvocationHandler aMyAnotherInvocationHandler = new MyAnotherInvocationHandler();

		IMyBusinessObject proxyObject = (IMyBusinessObject) Proxy.newProxyInstance(
						IMyBusinessObject.class.getClassLoader(), new Class[] { IMyBusinessObject.class },
						aMyDebugInvocationHandler);

		aMyAnotherInvocationHandler.setTarget(proxyObject);

		IMyBusinessObject nextProxyObject = (IMyBusinessObject) Proxy.newProxyInstance(
						IMyBusinessObject.class.getClassLoader(), new Class[] { IMyBusinessObject.class },
						aMyAnotherInvocationHandler);

		System.out.println(nextProxyObject.doExecute("Hello World"));
	}
}
