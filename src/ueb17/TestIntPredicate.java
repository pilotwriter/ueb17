package ueb17;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.IntPredicate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestIntPredicate {
	@Test
	@DisplayName("IntPredicate even")
	void testIntPredicateEven() {
		IntPredicate even = value -> {
			if(value % 2 == 0) {
				return true;
			}
			else
				return false;
		};
		assertEquals(even.test(0),true);
		assertEquals(even.test(1),false);
		assertEquals(even.test(2),true);
		assertEquals(even.test(3),false);
		assertEquals(even.test(4),true);
		assertEquals(even.test(5),false);
		assertEquals(even.test(6),true);
		assertEquals(even.test(7),false);
	}
	@Test
	@DisplayName("test intPredicateOdd")
	void testIntPredicateOdd() {
		IntPredicate odd  = new IntPredicate() {
			public boolean test(int value) {
				if(value % 2 == 0) {
					return false;
				}
				else {
					return true;
				}
						
			};
		};
		assertEquals(odd.test(0),false);
		assertEquals(odd.test(1),true);
		assertEquals(odd.test(2),false);
		assertEquals(odd.test(3),true);
		assertEquals(odd.test(4),false);
		assertEquals(odd.test(5),true);
		assertEquals(odd.test(6),false);
		assertEquals(odd.test(7),true);
	}

}
