import java.util.Scanner;  // Import the Scanner class
class sept13{
  public static void main(String[] args) {
System.out.println("Input the year you were born:");

// if ur born before this year then your might be cool
int yearCutOffForCool = 2007;

//THIS IS GOING TO STORE THE USER'S Input
int userBirthYear;
Scanner in  = new Scanner(System.in);
userBirthYear = in.nextInt();
 


if(userBirthYear <= yearCutOffForCool){
System.out.println("You may be cool");
}
}






}


