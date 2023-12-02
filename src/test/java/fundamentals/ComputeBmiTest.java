package fundamentals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputeBmiTest {

	@Test
	void bmiTest() {
		Assertions.assertEquals(24.489795918367346,ComputeBmi.bmi(1.75,75));
	}

}
