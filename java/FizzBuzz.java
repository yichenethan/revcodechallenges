
public class FizzBuzz {
  public static void main(String[] args) {
    String result = fizzBuzz(100);
    System.out.println(result);
  }
  public static String fizzBuzz(int nums) {
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i <= nums; i++) {
      if(i % 3 == 0) {
        sb.append("Fizz");
      }
      if(i % 5 == 0) {
        sb.append("Buzz");
      }
      if(i % 5 != 0 && i % 3 != 0) {
        sb.append(i);
      }
      //if(i != nums) {
        sb.append(", ");
      //}
    }
    sb.delete(sb.length() - 2, sb.length());
    return sb.toString();
  }
}

