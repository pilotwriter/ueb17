package ueb17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class TestFactorial {
	Factorial topLevel = new Factorial();
	@Test
	@DisplayName("Top level factorial test")
	void testToplevelFactorial() {
		assertEquals(topLevel.apply(5),120);
		assertEquals(topLevel.apply(0),1);
		assertEquals(topLevel.apply(1),1);
		assertEquals(topLevel.apply(10),3628800);
	}
	
	@Test
	@DisplayName("Factorial Lambda")
	void testLambdaFactorial() {
		MyFunction factorialLambda = i -> {
			int result = 1;
			for (int j = i; j > 0; j--) {
				result = result * j;
			}
			return result;
		};
		
		assertEquals(factorialLambda.apply(5),120);
		assertEquals(factorialLambda.apply(0),1);
		assertEquals(factorialLambda.apply(1),1);
		assertEquals(factorialLambda.apply(10),3628800);
	}
	@Test
	@DisplayName("Factorial Anon Class")
	void testFactorialAnonClass() {
		MyFunction factorialAnon = new MyFunction() {
			@Override
			public int apply(int i) {
				int result = 1;
				for (int j = i; j > 0; j--) {
					result = result * j;
				}
				return result;
			}
		};
		assertEquals(factorialAnon.apply(5),120);
		assertEquals(factorialAnon.apply(0),1);
		assertEquals(factorialAnon.apply(1),1);
		assertEquals(factorialAnon.apply(10),3628800);
	}

}
