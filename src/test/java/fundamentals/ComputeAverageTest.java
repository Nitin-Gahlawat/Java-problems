package fundamentals;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputeAverageTest {

	@Test
	void avgTest() {
		double[] arr = {10.9,20.6,30,50.3,100};
		Assertions.assertEquals(42.36,ComputeAverage.avg(5,arr));
	}

}
