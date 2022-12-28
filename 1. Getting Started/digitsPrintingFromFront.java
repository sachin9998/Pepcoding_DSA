import java.util.Scanner;

public class digitsPrintingFromFront {

  public static int countDigits(int n) {
    int count = 0;

    while (n != 0) {
      n /= 10;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int temp = n;
    int digitsCount = countDigits(temp);

    int div = (int) Math.pow(10, digitsCount - 1);

    while (div != 0) {

      int q = n / div;
      System.out.println(q);
      n = n % div;
      div = div / 10;
    }

  }
}
