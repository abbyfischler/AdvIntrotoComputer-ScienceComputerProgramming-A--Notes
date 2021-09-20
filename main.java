public class main {

public static void main(String[] args) {
 
//declare new student
	Student youngRhazes;
  Student inquisitiveBrandon;

  //define / assigned value = is assign 
  //student is called in student
  youngRhazes = new Student();
  inquisitiveBrandon = new Student();

  //call action and passed instring

 youngRhazes.setName("Rhazes Spell");
 	System.out.println("New assinment student main:");
  System.out.printf("Welcome to Geffen %s and you too: %s\n", youngRhazes.getName(),inquisitiveBrandon.getName());

}
}