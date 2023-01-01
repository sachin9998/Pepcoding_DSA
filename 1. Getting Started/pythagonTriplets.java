import java.util.Scanner;

public class pythagonTriplets {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    int max = a;

    if (b >= max) {
      max = b;
    }

    if (c >= max) {
      max = c;
    }

    if (max == a) {
      boolean flag = (b * b + c * c) == a * a;
      System.out.println(flag);
    } else if (max == b) {
      boolean flag = (a * a + c * c) == b * b;
      System.out.println(flag);
    } else {
      boolean flag = (a * a + b * b) == c * c;
      System.out.println(flag);
    }

  }
}
