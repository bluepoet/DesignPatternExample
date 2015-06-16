package net.bluepoet.pattern.proxy;

import java.lang.reflect.InvocationHandler;

public abstract class AMyInvocationHandler implements IMyInvocationHandler, InvocationHandler {
	protected Object target = null;
	protected Object realTarget = null;

	@Override
	public void setTarget(Object target) {
		this.target = target;
	}

	@Override
	public void setRealTarget(Object realTarget) {
		this.realTarget = realTarget;
	}
}
