
public class Micro {
    public static int countWays(int N,int T,int K,int[] E){
        //this is default OUTPUT. You can change it.
        int energy = T;
        int position = E.length - N;
        if(position == N) {
            return 1;
        }
        if (position > N) {
            return 0;
        }
        energy -= E[position];
        if(energy < 0) {
            return 0;
        }
        //write your Logic here:
        int result = 0;
        for(int i = 0; i < K; i++) {
            result += countWays(N - i - 1, energy, K, E );
        }
        return result;
    }
}

