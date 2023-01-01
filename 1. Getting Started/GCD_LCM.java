import java.util.Scanner;

public class GCD_LCM {

  public static int gcd(int n1, int n2) {
    while (n1 % n2 != 0) {
      int rem = n1 % n2;
      n1 = n2;
      n2 = rem;
    }

    return n2;
  }

  public static int lcm(int gcd, int n1, int n2) {
    // LCM = (n1 * n2) / gcd
    int lcm = (n1 * n2) / gcd;
    return lcm;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    int gcd = gcd(num1, num2);
    
    System.out.println("The GCD is " + gcd);
    System.out.println("The LCM is " + lcm(gcd, num1, num2));

  }
}
