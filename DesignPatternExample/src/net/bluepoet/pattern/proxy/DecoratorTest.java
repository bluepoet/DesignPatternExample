package net.bluepoet.pattern.proxy;

public class DecoratorTest {
	public static void main(String[] args) {
		IMyBusinessObject target = new MyBusinessObject();
		IMyBusinessObject wrappedObject = new AnotherConcreteDecorator(new DebugConcreteDecorator(target));
		wrappedObject.doExecute("Hello World");
	}
}
