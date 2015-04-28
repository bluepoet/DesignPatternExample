package net.bluepoet.pattern.state;


public class SelectableState implements State {

	@Override
	public void increaseCoin(int coin, VendingMachine vm) {
		vm.increaseCoin(coin);
	}

	@Override
	public void select(int productId, VendingMachine vm) {
		System.out.println("제품 : " + productId + " 전달!");
		vm.decreaseCoin();
		
		if(vm.isNotSelectable()) {
			vm.changeState(new NoCoinState());
		}
	}
}
