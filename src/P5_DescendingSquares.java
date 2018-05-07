/*
  	ISYS 320
  	Name(s):Clayton Bruce
  	Date: 4/1/2018
	EDITED ON 5/6/2018
*/

/* 6. Your pseudocode algorithm here
	for i = 10 while not 0 i -- {
	Now compute i^2 or i*i
	print(result sepearated by a space)
	}
*/

public class P5_DescendingSquares {

	public static void main(String[] args) {
		DSqaures();
	}

	public static void DSqaures() {

		for (int i = 10; i != 0; i--) {

			System.out.print(i * i + " ");
		}
	}

}
