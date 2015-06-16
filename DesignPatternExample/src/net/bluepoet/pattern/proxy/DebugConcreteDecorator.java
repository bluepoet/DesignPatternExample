package net.bluepoet.pattern.proxy;

public class DebugConcreteDecorator extends ADecorator {
	public DebugConcreteDecorator(IMyBusinessObject target) {
		super(target);
	}
	
	@Override
	public String doExecute(String in) {
		System.out.println("DebugConcreteDecorator: before method : doExecute : ");
		String ret = target.doExecute(in);
		System.out.println("DebugConcreteDecorator: after method : doExecute : ");
		return ret;
	}
}
