import java.util.*;
public class PigLatin{
  public static boolean isLetter(int x){
    if (x>96 && x<123){
      return true;
    }
    return false;
  }
  public static boolean isVowel(int y){
    List<Integer> vowels = new ArrayList<>(Arrays.asList(97, 101, 105, 111, 117));

    if (vowels.contains(y)){
      return true;
    }
    return false;
  }
  public static boolean isSpecial(String z){
    List<String> special = new ArrayList<>(Arrays.asList("bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"));
    if (special.contains(z)){
      return true;
    }
    return false;
  }
  public static void main( String[]args ){


      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()


}
}
