package net.bluepoet.pattern.proxy;

public abstract class ADecorator implements IMyBusinessObject {
	protected IMyBusinessObject target;
	
	public void setTarget(IMyBusinessObject target) {
		this.target = target;
	}
	
	public ADecorator() {}
	
	public ADecorator(IMyBusinessObject target) {
		setTarget(target);
	}
}
