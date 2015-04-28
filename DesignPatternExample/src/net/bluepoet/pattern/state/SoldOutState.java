package net.bluepoet.pattern.state;


public class SoldOutState implements State {

	@Override
	public void increaseCoin(int coin, VendingMachine vm) {
		vm.increaseCoin(coin);
		vm.changeState(new SoldOutState());
	}

	@Override
	public void select(int productId, VendingMachine vm) {
	}

}
