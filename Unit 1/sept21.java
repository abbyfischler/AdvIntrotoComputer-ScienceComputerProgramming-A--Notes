/*farmer 
// Farmer class that keeps track of their
// apples and money and other details
// related to managing a farm
class Farmer {
  // the name of the farmer
  private String name;  
  // the number of apples the farmer has
  private int appleCount;

  //Construct a new farmer
  public Farmer(String aName) {
    name = aName;
  }

  // access the name property
  public String getName() {
    return name;
  }

  // access the apple balance
  public int getApples() {
    return appleCount;
  }

  public void picked(int count) {
    appleCount = count;
  }

}


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // make a scanner for user input
    Scanner input = new Scanner(System.in);
8
    // create a couple of farmers
    Farmer farmer1 = new Farmer("Joe");
    Farmer farmer2 = new Farmer("Sue");

    // print out info about their farms
    System.out.printf("%n%s has %d apples%n",farmer1.getName(),farmer1.getApples());
    System.out.printf("%s has %d apples%n",farmer2.getName(),farmer2.getApples());   
   

    // get some input to add to their farms
    System.out.printf("%nInput the number of apples that %s picked...%n",farmer1.getName());
    int picked1 = input.nextInt();
    farmer1.picked(picked1);

    System.out.printf("Input the number of apples that %s picked...%n",farmer2.getName());    
    int picked2 = input.nextInt();
    farmer2.picked(picked2);

    //Print the updated amounts
    System.out.printf("%n-=-=-=-=%nNow %s has %d apples%n", farmer1.getName(),farmer1.getApples());
        System.out.printf("Now %s has %d apples%n", farmer2.getName(),farmer2.getApples());

  }
}


constructor creates an instance of that class

function f(x) = x+1
print 


1
101
301
*/