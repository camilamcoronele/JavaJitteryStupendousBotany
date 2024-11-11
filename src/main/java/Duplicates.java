
//2024-11-10_CoronelCamila_Module 7: Exercise 7.15
import java.util.Scanner;

public class Duplicates {
  public static int[] eliminateDuplicates(int[] list) {
    int[] tempArray = new int[list.length];
    int count = 0;

    for (int i = 0; i < list.length; i++) {
      boolean isDuplicate = false;
      for (int j = 0; j < count; j++) {
        if (list[i] == tempArray[j]) {
          isDuplicate = true;
          break;
        }
      }
      if (!isDuplicate) {
        tempArray[count] = list[i];
        count++;
      }
    }

    int[] distinctArray = new int[count];
    System.arraycopy(tempArray, 0, distinctArray, 0, count);
    return distinctArray;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[10];
    System.out.println("Hello 👋🏼 Please enter ten random numbers 🔢");

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    int[] distinctNumbers = eliminateDuplicates(numbers);
    System.out.print("The distinct numbers you entered are 👀: ");

    for (int number : distinctNumbers) {
      System.out.print(number + " ");
    }

    System.out.println();
    scanner.close();
  }
}
