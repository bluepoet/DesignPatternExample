package net.bluepoet.pattern.state;


public class VendingMachine {
	private State state;
	private int coin;
	
	public VendingMachine() {
		this.state = new NoCoinState();
	}
	
	public State getState() {
		return state;
	}
	
	public void insertCoin(int coin) {
		state.increaseCoin(coin, this);
	}
	
	public void select(int productId) {
		state.select(productId, this);
	}
	
	public void changeState(State newState) {
		this.state = newState;
	}
	
	public void increaseCoin(int coin) {
		this.coin = coin;
	}

	public void decreaseCoin() {
		coin -= 500;
	}

	public boolean isNotSelectable() {
		if(coin == 0) {
			return true;
		}
		
		return false;
	}
	
	public int returnCoin() {
		if(state.getClass().equals(SoldOutState.class)) {
			return coin;
		}
		
		return 0;
	}
}