import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int age, currentYear;

    currentYear = 2022;
    age = 0;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("How old are you? ");
    age = keyboard.nextInt();

    int birthYear = currentYear - age;

    System.out.print("You were born in " + birthYear);

  }
}
