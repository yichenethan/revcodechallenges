
public class PigLatin {
  public static void main(String[] args) {
    System.out.println(pLatin("Revature"));
    System.out.println(pLatinBuild("Makima"));
    System.out.println(encode("I want to be Makimas dog."));
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

  public static String encode(String sentence) {
    StringBuilder sb = new StringBuilder();
    sb.append(sentence);
    char punctuation = sb.charAt(sb.length() - 1);


    sb.deleteCharAt(sb.length() - 1 );

    if(sb.toString().contains("\\p{Punct}")) {
      return("Invalid stuff");
    }
    String[] words = sb.toString().split(" ");
    StringBuilder reBuild = new StringBuilder();
    for (String word: words) {
      reBuild.append(pLatinBuild(word));
      reBuild.append(" ");
    }
    reBuild.deleteCharAt(reBuild.length() - 1);
    reBuild.append(punctuation);

    return reBuild.toString();
  }
}