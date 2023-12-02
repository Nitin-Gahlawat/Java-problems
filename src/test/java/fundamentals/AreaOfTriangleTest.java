package fundamentals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AreaOfTriangleTest {

	@Test
	void areaTest() {
		Assertions.assertEquals(50,AreaOfTriangle.area(10, 10));
	}

}
