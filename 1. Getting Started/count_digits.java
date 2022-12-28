public class count_digits {

  public static int countDigits(int n) {
    int count = 0;

    while (n != 0) {
      n /= 10;
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    int news = countDigits(7893);
    System.out.println(news);
  }

}
