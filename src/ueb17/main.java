package ueb17;
import java.util.function.IntPredicate;
public class main {
	// Static nested call for fibonacci!
	public static class FactorialStatic implements MyFunction {
		@Override
		public int apply(int i) {
			 if (i == 0)
				 return 1;
			 else {
				    return i * apply(i - 1);
			 }
		}
	}

	public static void main(String[] args) {
		Calculation calcObj = new Calculation();
		// i f(x) = x^2 Lambda implementation
		MyFunction squareLambda = x -> x * x;
		// calcObj.applyandPrint(1,10 ,squareLambda);
		
		// i f(x) = x^2 Anon. Class implementation
		MyFunction squareAnon = new MyFunction() {
			public int apply(int i) {
				return i * i;
			};
		};
		// calcObj.applyandPrint(0, 10,squareAnon);

		//ii f(x) = x! factorial lambda implementation
		MyFunction factorialLambda = i -> {
			int result = 1;
			for (int j = i; j > 0; j--) {
				result = result * j;
			}
			return result;
		};

		//calcObj.applyandPrint(0, 10,factorialLambda);
		//ii f(x) = x! factorial Anon.Class  implementation

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
		// calcObj.applyandPrint(0, 10,factorialAnon);

		// iii f(x) = x^x+1 power of lambda implementation
		MyFunction powerOfLambda = i -> (int) Math.pow(i, i + 1);
		 //calcObj.applyandPrint(0, 10,powerOfLambda);

		// iii f(x) = x^x+1 power of Anon.class implementation
		MyFunction powerOfAnon = new MyFunction() {
			public int apply(int i) {
				return (int) Math.pow(i, i + 1);
			};
		};
		
		// calcObj.applyandPrint(0, 10,powerOfAnon);
		//iv f(x) = fib(x) (Fibonacci-Folge) fn = fn-1 + fn-2
		MyFunction fibLambda = number -> {
			if(number == 0)
				return 0;
			int previouspreviousNumber, previousNumber = 0, currentNumber = 1;

			for (int i = 1; i < number; i++) {

				previouspreviousNumber = previousNumber;

				previousNumber = currentNumber;

				currentNumber = previouspreviousNumber + previousNumber;

			}
			return currentNumber;
		};
		//calcObj.applyandPrint(0, 15, fibLambda);	
		
		//iv f(x) = fib(x) (Fibonacci-Folge) anon.class implementationfn = fn-1 + fn-2
		MyFunction fibAnon = new MyFunction() {
			@Override
			public int apply(int i) {
				if (i <= 1)
					return i;
				else
					return this.apply(i - 1) + this.apply(i - 2);

			}
		};
		// calcObj.applyandPrint( 2,9, fibAnon );
		
		//Fibonacci static nested class 
		main.FactorialStatic obj = new main.FactorialStatic();
		//System.out.println(obj.apply(3));

		//Factorial Top-Level-Klasse implementation
		Factorial fac = new Factorial();
		//System.out.println(fac.apply(15));
		
		// IntPredicate even checks if the given number is even
		IntPredicate even = value -> {
			if(value % 2 == 0) {
				return true;
			}
			else
				return false;
		};
		//checks if the given number is odd
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
		
		//Rufen Sie die Methode applyAndPrint mit einem Lambda-Ausdruck auf, welcher für gerade
		//Zahlen die Quadratzahl berechnet.
		ConditionateInterface quadraterLambda = value -> value * value;
		calcObj.applyandPrint( 0,10, quadraterLambda.conditionateInput(even));
	
		
		//This apply function takes the factorial of given number
		ConditionateInterface factorialOdd = value -> fac.apply(value);
		//1)conditionateOutputun icine odd atip faktorilyel(apply function ) sonucu tek mi diye kontrol ediyoruz. 
		//tekse sayiyi return eden degilse 0 donen bir method return ediyor. return edilen methodunu icini
		//for ile tek tek dolduruyoruz
	//	calcObj.applyandPrint(0, 10, factorialOdd.conditionateOutput(odd));

	}
	
	
	
	


}
