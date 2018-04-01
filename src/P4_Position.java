/*
  	ISYS 320
  	Name(s):Clayton Bruce
  	Date: 4/1/2018
*/

public class P4_Position {

	public static void main(String[] args) {
		Phys(2,3,4,5);
	}

	public static void Phys(int s0, int v0t, int a, int t) {

	
		double s = (s0 + v0t + .5*a*(t*t));
		
		System.out.println(s);

	}

}
