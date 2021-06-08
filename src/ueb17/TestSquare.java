package ueb17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestSquare {

	@Test
	@DisplayName("Square Lambda")
	void testLambdaSquare() {
		MyFunction squareLambda = (int i) -> i * i;
		assertEquals(squareLambda.apply(5),25);
		assertEquals(squareLambda.apply(0),0);
		assertEquals(squareLambda.apply(1),1);
		assertEquals(squareLambda.apply(10),100);
	}
	@Test
	@DisplayName("Square Anon")
	void testAnonSquare() {
		MyFunction squareAnon = new MyFunction() {
			public int apply(int i) {
				return i * i;
			};
		};		
		assertEquals(squareAnon.apply(5),25);
		assertEquals(squareAnon.apply(0),0);
		assertEquals(squareAnon.apply(1),1);
		assertEquals(squareAnon.apply(10),100);
	}
}
