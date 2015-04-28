package net.bluepoet.pattern.state;

public class NoCoinState implements State {

	@Override
	public void increaseCoin(int coin, VendingMachine vm) {
		vm.increaseCoin(coin);
		vm.changeState(new SelectableState());
	}

	@Override
	public void select(int productId, VendingMachine vm) {
		System.out.println("제품선택가능!");
	}
}
