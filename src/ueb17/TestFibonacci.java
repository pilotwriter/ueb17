package ueb17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class TestFibonacci {

	@Test
	@DisplayName("Fibonacci Lambda")
	void testFibonacciLambda() {
		MyFunction fibLambda = number -> {
			// use loop
			int previouspreviousNumber, previousNumber = 0, currentNumber = 1;
			if(number == 0)
				return 0;
			for (int i = 1; i < number; i++) {

				previouspreviousNumber = previousNumber;

				previousNumber = currentNumber;

				currentNumber = previouspreviousNumber + previousNumber;

			}
			return currentNumber;
		};
		assertEquals(fibLambda.apply(0),0);
		assertEquals(fibLambda.apply(1),1);
		assertEquals(fibLambda.apply(2),1);
		assertEquals(fibLambda.apply(3),2);
		assertEquals(fibLambda.apply(4),3);
		assertEquals(fibLambda.apply(5),5);
		assertEquals(fibLambda.apply(6),8);
	}
	@Test
	@DisplayName("Fibonacci Anon")
	void testFibonacciAnon() {
		MyFunction fibAnon = new MyFunction() {
			@Override
			public int apply(int i) {
				if (i <= 1)
					return i;
				else
					return this.apply(i - 1) + this.apply(i - 2);

			}
		};
			
		assertEquals(fibAnon.apply(0),0);
		assertEquals(fibAnon.apply(1),1);
		assertEquals(fibAnon.apply(2),1);
		assertEquals(fibAnon.apply(3),2);
		assertEquals(fibAnon.apply(4),3);
		assertEquals(fibAnon.apply(5),5);
		assertEquals(fibAnon.apply(6),8);
	}
	@Test
	@DisplayName("Fibonacci Static")
	void testFibonacciStatic() {
		main.FactorialStatic obj = new main.FactorialStatic();
		assertEquals(obj.apply(0),0);
		assertEquals(obj.apply(1),1);
		assertEquals(obj.apply(2),1);
		assertEquals(obj.apply(3),2);
		assertEquals(obj.apply(4),3);
		assertEquals(obj.apply(5),5);
		assertEquals(obj.apply(6),8);
	}

}
