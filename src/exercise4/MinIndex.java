package exercise4;
import java.util.Scanner;

public class MinIndex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    float arr[] = new float[size];
    float min = 0;
    for(int i = 0; i < arr.length; i++) {
      arr[i] = input.nextFloat();
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    System.out.println("Min number: " + min);
  }
}