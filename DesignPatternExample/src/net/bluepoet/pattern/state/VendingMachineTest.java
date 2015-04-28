package net.bluepoet.pattern.state;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * 상태패턴예제 테스트코드 실습
 * 
 * @author bluepoet
 * 
 */
public class VendingMachineTest {
	private VendingMachine vm = new VendingMachine();

	@Test
	public void NoCoin_State() {
		// Given
		State state = new NoCoinState();

		// When
		state.increaseCoin(500, vm);

		// Then
		assertThat(vm.getState(), is(SelectableState.class));
	}

	@Test
	public void Selectable_State() {
		// Given
		State state = new NoCoinState();
		state.increaseCoin(500, vm);

		// When
		vm.getState().select(500, vm);

		// Then
		assertThat(vm.getState(), is(NoCoinState.class));
	}

	@Test
	public void SoldOut_State() {
		// Given
		State state = new SoldOutState();

		// When
		state.increaseCoin(1000, vm);

		// Then
		assertThat(vm.returnCoin(), is(1000));
	}
}
