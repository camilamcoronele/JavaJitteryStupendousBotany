//2024-09-29_CoronelCamila_Module4Exercise4.13 
import java.util.Scanner;
public class VowelOrConsonant{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello there 👋🏼");
    System.out.println("We are going to determine if a letter is a vowl or a consonant!! 👀 🔤 ");

    while(true){
      System.out.println("Please enter a letter: ");
      String input = scanner.nextLine();

      if (!Character.isLetter(input.charAt(0))){
        System.out.println(input + " is an invalid input! Please just enter a single letter! Thanks :)");
        continue;
      }
      char letter = Character.toLowerCase(input.charAt(0));
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter =='o' || letter == 'u'){
          System.out.println("The letter " + letter + " is a vowel!");
        }
        else {
          System.out.println("The letter " + letter +  " is a consonant:)!");
        }
      break;
    }
    scanner.close();
  }
}