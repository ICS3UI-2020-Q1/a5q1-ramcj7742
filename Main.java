import java.util.Scanner;
/**
 * Creates multiplication table for user number up * to 12
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number from user
    System.out.println("Please enter an integer to create a multiplication table for");
    int userNum = input.nextInt();

    //declare variable for multiplication
    int multi;

    //for loop for multiplication table
    for(int i = 1; i <= 12; i++){
      //multiplies count and users entered number
      multi = i * userNum;
      System.out.println(i + " x " + userNum + " = " + multi);
    }
    
  }
}
