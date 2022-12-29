import java.util.Scanner;

public class rotateNumber {

  public static void main(String[] args) {
    // write your code here
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int k = scan.nextInt();

    int noOfDigits = 0;

    int temp = n;
    while (temp > 0) {
      temp = temp / 10;
      noOfDigits++;
    }

    // For rotations greater than no of digits
    k = k % noOfDigits;

    // For negative rotations
    if (k < 0) {
      k = k + noOfDigits;
    }

    int divisor = 1;
    int multiplier = 1;

    for (int i = 1; i <= noOfDigits; i++) {

      if (i <= k) {
        divisor = divisor * 10;
      } else {
        multiplier = multiplier * 10;
      }

    }

    int quotient = n / divisor;
    int reminder = n % divisor;

    int ans = reminder * multiplier + quotient;
    System.out.println(ans);

  }
}