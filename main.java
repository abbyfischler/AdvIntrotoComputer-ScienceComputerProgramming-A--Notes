class main {
  public static void main(String[] args) {
    Student freshPerson;
    Student sophmore;
    Student junior;
    Student graduate;

    freshPerson = new Student();
    freshPerson.setName("New Student");
    sophmore = new Student();
    sophmore.setName("Returning Student");
    junior = new Student();
    junior.setName("Pre College Stressed Student");
    graduate = new Student();

    System.out.printf("Hello %s!\n",freshPerson.getName());
    System.out.printf("Hello %s!\n",sophmore.getName());
    System.out.printf("Hello %s!\n",junior.getName());
    System.out.printf("Hello %s!\n",graduate.getName());

  }

  int adder() {
    return 2 + 2;
  }
}
/*
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
*/