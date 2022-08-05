public class PigLatin {
  public static void main(String[] args) {
    System.out.println(pLatin("Revature"));
    System.out.println(pLatinBuild("Makima"));
  }

  //Strings are not mutable - this is making new objects!
  public static String pLatin(String word) {
    char first = word.charAt(0);
    String pig = word.substring(1) + first + "ay";
    return pig;
  }

  //Buffer is threadsafe, Builder is faster. Both don't create new strings per edit.
  public static String pLatinBuild(String word) {
    StringBuilder sb = new StringBuilder();
    sb.append(word);
    sb.deleteCharAt(0);
    sb.append(word.charAt(0));
    sb.append("ay");
    return sb.toString();
  }
}