import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main
{
  public static int freqSum(int N, String S)
  {

    //this is default OUTPUT. You can change it.
    int result = 0;

    //write your Logic here:
    int comb = (int)Math.pow(2, N) - 1;
    for(int index = 1; index <= comb; index++) {
      int bits = index;
      String sub = "";
      for(int i = S.length() - 1; i >= 0; i--) {
        if(bits % 2 == 1) {
          sub += S.charAt(i);
        }
        bits = bits / 2;
      }
      HashMap<Character, Integer> frequent = new HashMap<>();
      for(int j = 0; j < sub.length(); j++) {
        Character c = sub.charAt(j);
        if(frequent.containsKey(c)) {
          frequent.put(c, frequent.get(c) + 1);
        } else {
          frequent.put(c, 1);
        }
      }

      result += Collections.max(frequent.values());
    }
      return result;
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);

    //INPUT [uncomment & modify if required]
    int N = sc.nextInt();
    String S = sc.next();

    sc.close();

    //OUTPUT [uncomment & modify if required]
    System.out.print(freqSum(N,S));
  }
}