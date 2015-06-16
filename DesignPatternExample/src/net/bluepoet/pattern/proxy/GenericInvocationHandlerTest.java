package net.bluepoet.pattern.proxy;

public class GenericInvocationHandlerTest {
	public static void main(String[] args) throws Throwable {
		String[] interceptorClasses = { "net.bluepoet.pattern.proxy.MyDebugInterceptor", "net.bluepoet.pattern.proxy.MyAnotherInterceptor" };

		IMyBusinessObject aMyBusinessObject = (IMyBusinessObject) MyProxyFactory.getProxyObject("net.bluepoet.pattern.proxy.MyBusinessObject",
						interceptorClasses);

		System.out.println(aMyBusinessObject.doExecute("Hello World"));
	}
}
