package exercise4;
import java.util.Scanner;

public class MinIndex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int arr[] = new int[size];
    int min = 0;
    for(int i = 0; i < arr.length; i++) {
      arr[i] = input.nextInt();
      if (arr[min] > arr[i]) {
        min = i;
      }
    }
    System.out.println("Min index: " + min);
  }
}