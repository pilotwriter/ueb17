package ueb17;

import java.util.function.IntPredicate;

public interface ConditionateInterface extends MyFunction {
	
//	IntPredicate even = value -> {
//		if(value % 2 == 0) {
//			return true;
//		}
//		else
//			return false;
//	};
//	
	public default MyFunction conditionateInput(IntPredicate pradikat) {
		MyFunction lambda = (i) -> {
			if (pradikat.test(i))
				return this.apply(i);
			else
				return 0;
		};
		return lambda;
	}

	public default MyFunction conditionateOutput(IntPredicate pradikat) {
		MyFunction lambda = i -> {
			if(pradikat.test(this.apply(i))) {
				return this.apply(i);
			}
			else {
				return 0;
			}
			
		};
		return lambda;
	}

}
