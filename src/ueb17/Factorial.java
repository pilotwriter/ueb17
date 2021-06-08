package ueb17;
class Factorial implements MyFunction{
	
	//Factorial Top-Level-Klasse implementation

	@Override
	public int apply(int i) {
		 if (i == 0)
			 return 1;
		 else {
			    return i * apply(i - 1);
		 }
	}
}