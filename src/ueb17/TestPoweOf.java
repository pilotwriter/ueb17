package ueb17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestPoweOf {

	@Test
	@DisplayName("Power of Lambda")
	void testLambdaSquare() {
		MyFunction powerOfLambda = i -> (int) Math.pow(i, i + 1);
		assertEquals(powerOfLambda.apply(0),0);
		assertEquals(powerOfLambda.apply(5),15625);
		assertEquals(powerOfLambda.apply(1),1);
		assertEquals(powerOfLambda.apply(7),5764801);
	}
	@Test
	@DisplayName("Power of Anon")
	void testAnonSquare() {
		MyFunction powerOfAnon = new MyFunction() {
			public int apply(int i) {
				return (int) Math.pow(i, i + 1);
			};
		};
			
		assertEquals(powerOfAnon.apply(0),0);
		assertEquals(powerOfAnon.apply(5),15625);
		assertEquals(powerOfAnon.apply(1),1);
		assertEquals(powerOfAnon.apply(7),5764801);
	}

}
