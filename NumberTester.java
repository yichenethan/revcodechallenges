public class NumberTester{
  public static void main(String[] args) {
    evenOrOdd(13);
    evenOrOdd(12);
    System.out.println(primeCheck(13));
    System.out.println(primeCheck(100000));
    primeCheck(1337);
  }

  public static void evenOrOdd(int num) {
    //Limitations: not going to handle decimal cases (spec does not say integer,
    // just number)
    if(num % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }

  public static boolean primeCheck(int num) {
    //limitations: Unessasary divison checks, negatives
    for(int i = num - 1; i > 1; i--)
      if(num % i == 0){
        return false;
      }
      return true;
  }
}