import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner s = new Scanner(System.in);
    System.out.println("What's your name?: ");
    String name = s.nextLine();
    System.out.println("What's your age?: ");
    int age = s.nextInt();
    
    helloBack(name, age);

    System.out.println("You'll be " + ageUp(age) + " on your next birthday");
  }
  static void helloBack(String theName, int theAge) {
    System.out.println("Hello "+ theName + "!");
    System.out.println("You are " + theAge + " years old!");
  }
  static int ageUp(int theAge) {
    theAge++;
    return theAge;
  }
}