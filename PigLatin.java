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


        String in = "";
        for (int i = 0; i < args.length; i++) {
            in += args[i];
        }

          //as the string that you read from
          Scanner n = new Scanner( System.in );

          while (n.hasNextLine()){
            Scanner line = new Scanner( n.nextLine());
            String result = "";
            while (line.hasNext()){
            String word = line.next().toLowerCase();

            int fl = (int)word.charAt(0);
            int ll = (int) word.charAt(word.length()-1);
            String ft = word;
            if (word.length()>2){
              ft = word.substring(0,2);
            }
            if (isLetter(fl)) {
              if (isVowel(fl)){
                if(isLetter(ll)){
                  result += word + "hay ";
                }
                else{
                  result += word.substring(0,word.length()-1) + "hay" + word.charAt(word.length()-1) + " ";
                }
            }
            else {
            if (isSpecial(ft)){
              if(isLetter(ll)){
                result += word.substring(2,word.length()) + ft + "ay ";
              }
              else{
                result += word.substring(2,word.length()-1) + ft  + "ay" + word.charAt(word.length()-1) + " ";
              }
            }
            else{
              
            }

            }

            }
          }
          System.out.println(result);
        }
    System.out.println("");
      //use hasNextLine()/nextLine() to loop over
      //all of the data

      //If you want to read the input word by word
      //this can be replaced with hasNext() and next()


}
}
