package exercise4;

import java.util.Scanner;

public class ArrayInput {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int gr = input.nextInt();
    int[] array = new int[gr];

    for (int index = 0; index < gr; index++) {
      array[index] = input.nextInt();
    }
      System.out.print("Numbers: [");

      for (int index = 0; index < array.length; index++) {
        if (index + 1 != array.length && index != 0) {
          System.out.print(" " + array[index] + ",");
        } else if (index == 0) {
          System.out.print(array[index] + ",");
        } else if (index + 1 == array.length) {
          System.out.print(" " + array[i]);
        }
      }
    System.out.print("]")
  }
}