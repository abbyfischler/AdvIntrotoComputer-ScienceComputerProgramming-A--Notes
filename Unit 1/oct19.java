/*
1. sequence
2. conditional
3. iteration

While loops
While (boolean) is true do a bunch of statements and automaitcally(sequecning part bring you back to top and test expression again) if false go to a new function

*/class Main {
	static int goal = 20;
	static int score = 0;
	static int makes = 20;
	static double shootingPercentage = makes / 58.0; //.344

  public static void main(String[] args) {
    boolean madeShot = simulation();
		boolean isTall = true;
		

		while( score < goal ) {

		}

  }

	public static boolean simulation() {
		double rand = Math.random();
		boolean result;

		if(rand <= shootingPercentage) {
			System.out.print( "You made ");
			result = true;
		} else {
			System.out.print( "You missed ");
			result = false;
		}
		System.out.println(" the shot");
		return result;

	}
}








		// if(isTall) {
		// 	if(shootingPercentage > 50) {
		// 		if( !madeShot) {
		// 			System.out.println("you are tall and have a high shooting percentage. you should have made it!!");
		// 		} else {
		// 			System.out.println(" You are supposed to make those bunnies...");
		// 		}
		// 	}
		// }








		// if(isTall) {
		// 	if(shootingPercentage > 50) {
		// 		if( !madeShot) {
		// 			System.out.println("you are tall and have a high shooting percentage. you should have made it!!");
		// 		} else {
		// 			System.out.println(" You are supposed to make those bunnies...");
		// 		}
		// 	}
		// }
