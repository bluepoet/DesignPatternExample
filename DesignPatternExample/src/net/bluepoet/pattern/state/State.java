package net.bluepoet.pattern.state;

public interface State {
	void increaseCoin(int coin, VendingMachine vm);
	void select(int productId, VendingMachine vm);
}
