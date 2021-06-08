package ueb17;

public class Calculation {
	
	public void applyandPrint( int begin, int end, MyFunction func ) {
		
		for( int i = begin; i <= end; i++) {
			System.out.println(func.apply(i));
		}
	}

}
