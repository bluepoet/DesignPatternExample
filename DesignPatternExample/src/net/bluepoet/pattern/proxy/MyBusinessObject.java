package net.bluepoet.pattern.proxy;

public class MyBusinessObject implements IMyBusinessObject {

	@Override
	public String doExecute(String in) {
		System.out.println("Here in MyBusinessObject doExecute: input : " + in);
		return in;
	}

}
