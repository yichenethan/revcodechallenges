public class Cities {
  public static int countWays(int N, int T, int K, int[] E) {
    if( N < 1 || T < 0) {
      System.out.println("died");
      return 0;
    }
    int result = 0;
    int position = E.length - N;
    int currentEnergy = T - E[position];
    if(N == 1 && currentEnergy >= 0) {
      System.out.println("Solution found!");
      return 1;
    }
    for(int i = 1; i <= K; i++) {
      System.out.println("position/T/energy: " + position + " iteration" + i + ", " + T + " " + currentEnergy);
      result += countWays(N - i, currentEnergy, K, E);
    }
    System.out.println("(DONE) position/T/energy: " + position + ", " + T + " " + currentEnergy);
    return result;
  }

  public static void main(String[] args) {
    int[] costs = new int[]{1, 2, 3, 1};
    System.out.println(countWays(4, 7, 4, costs));
  }
}
