import java.util.*;
public class MakeStars{
  public static void main( String[]args ){
    String in = "";
    for (int i = 0; i < args.length; i++) {
        in += args[i];
    }

      //as the string that you read from
      Scanner n = new Scanner( System.in );
      while (n.hasNextLine()){
        String result = "";
        Scanner line = new Scanner (n.nextLine());
        while (line.hasNext()){
          String word = line.next();
          for (int i = 0; i<word.length(); i++){
          result += ("*");
        }
        result +=(" ");
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
