
public class FinalKeyword {

	public static void main(String[] args) {
		CircleCalculation circle = new CircleCalculation();
		circle.areaOfCircle(3);
		circle.cumferenceOfCircle(3);
	}
}



class CircleCalculation {
	
	final double pi = 3.14;
	
	public void areaOfCircle(int r) {
		System.out.println("Area Of Circle : "+ (pi * (r * r)));
	}
	
	public void cumferenceOfCircle(int r) {
		System.out.println("Cumference Of Circle : "+ (2 * pi * r));
	}
}
