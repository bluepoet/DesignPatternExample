package net.bluepoet.pattern.proxy;

public interface IMyInvocationHandler {
	void setTarget(Object target);
	void setRealTarget(Object realTarget);
}
