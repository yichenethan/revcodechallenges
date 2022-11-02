public class numbers{
  public static void main(String[] args) {
  int octal = 0144;
  int binary = 0b1100100;
  int hexaDecimal = 0x64;
  int zeroOne = 01;
  int one = 1;

  int refer = 'D';

  System.out.println(zeroOne == one);

  System.out.println(refer);
  System.out.println(octal);
  System.out.println(binary);
  System.out.println(hexaDecimal);
  //notmain();
  //exceptiongen();
  nestExcep();

  firstKdigit(3, 2);

  }


  public static void notmain() {
		int i = 1234;
		String s = String.format("%08d",i );
		System.out.println(s);
	}

  public static void exceptiongen(){
    try
    {
    int b=5/0;
    }
    catch(ArithmeticException e)
    {
        System.out.println(e);
    }
    System.out.println("Exception Occurred");
}

  public static void nestExcep() {
    try{
      try{
       System.out.println("Divide by zero error");
       int b =50/0;
     }
      catch(ArithmeticException e){
        System.out.println(e);
      }
      try{
      int b[]=new int[10];
       b[20]=40;
       }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println(e);
      }
      System.out.println("other statement");
    }
    catch(Exception e){
      System.out.println("handled the exception (outer catch)");
    }

    System.out.println("normal flow..");
  }
  public static int firstKdigit(int N,int K) {

    //this is default OUTPUT. You can change it.
    int result = 0;
    int max = 0;
    int min = 0;

    for(int i = 1; i <= N; i++) {
        max += K * Math.pow(10, i);
    }
    for(int i = 1; i <= N; i++) {
        min += 1 * Math.pow(10, i);
    }
    for(int i = min; i <= max; i++) {
        if(i % 3 == 0) {
            int disect = i;
            boolean valid = true;
            while(disect > 10 && valid) {
                if(disect % 10 == 0 || disect % 10 > K) {
                    valid = false;
                }
            }
            if(valid) {
                result += 1;
            }
        }
    }

    //write your Logic here:
    return result;
}
}