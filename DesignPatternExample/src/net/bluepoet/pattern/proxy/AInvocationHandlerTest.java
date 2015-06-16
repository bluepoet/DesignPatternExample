package net.bluepoet.pattern.proxy;

public class AInvocationHandlerTest {
	public static void main(String[] args) throws Throwable {
		AMyDebugInvocationHandler dHandler = new AMyDebugInvocationHandler();
		AMyAnotherInvocationHandler aHandler = new AMyAnotherInvocationHandler();
		IMyBusinessObject bo = new MyBusinessObject();

		String[] handlers = { "net.bluepoet.pattern.proxy.AMyDebugInvocationHandler",
				"net.bluepoet.pattern.proxy.AMyAnotherInvocationHandler" };
		IMyBusinessObject aMyBusinessObject = (IMyBusinessObject) AMyProxyFactory.getProxyObject(bo, handlers);

		System.out.println(aMyBusinessObject.doExecute("Hello World"));

	}
}
