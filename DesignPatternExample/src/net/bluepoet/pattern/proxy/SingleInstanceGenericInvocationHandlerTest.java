package net.bluepoet.pattern.proxy;

public class SingleInstanceGenericInvocationHandlerTest {
	public static void main(String[] args) throws Throwable {
		String[] interceptorClasses = { "net.bluepoet.pattern.proxy.MyDebugInterceptor",
				"net.bluepoet.pattern.proxy.MyAnotherInterceptor" };

		IMyBusinessObject aMyBusinessObject = (IMyBusinessObject) SingleInstanceMyProxyFactory.getProxyObject(
						"net.bluepoet.pattern.proxy.MyBusinessObject", interceptorClasses);

		System.out.println(aMyBusinessObject.doExecute("Hello World"));
	}
}
