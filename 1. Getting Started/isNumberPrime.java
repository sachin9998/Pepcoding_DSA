class Solution {

  public long prime_Sum(int n) {
    long count = 0;

    for (int i = 1; i <= n; i++) {
      if (isPrime(i)) {
        count = count + i;
      }
    }

    return count;
  }

  public boolean isPrime(int num) {

    if (num == 0 || num == 1) {
      return false;
    }

    for (int j = 2; j <= Math.sqrt(num); j++) {
      if (num % j == 0) {
        return false;
      }
    }
    return true;
  }

}