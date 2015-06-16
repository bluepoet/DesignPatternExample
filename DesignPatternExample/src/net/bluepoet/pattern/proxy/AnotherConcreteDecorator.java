package net.bluepoet.pattern.proxy;

public class AnotherConcreteDecorator extends ADecorator {
	public AnotherConcreteDecorator(IMyBusinessObject target) {
		super(target);
	}

	@Override
	public String doExecute(String in) {
		System.out.println("AnotherConcreteDecorator : Going to execute method : doExecute");
		in = in + " Modified by AnotherConcreteDecorator";
		String ret = target.doExecute(in);
		System.out.println("AnotherConcreteDecorator : After to execute method : doExecute");
		return ret;
	}
}
