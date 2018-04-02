/*
	ISYS 320
	Name(s):Clayton Bruce
	Date: 4/1/2018
*/

public class P9_ATMDispenser {

	public static void main(String[] args) {
		GiveTens(85);
	}

	public static void GiveTens(int money) {
		int tens;
		System.out.println("Here is :" +money%10 + " one dollar bills");
		tens = money - (money%10);
		System.out.println("Here is :"+ tens/10 +" ten dollar bills");
	}
	
		
}

