//Мое решение
/*Complete the solution so that it reverses all of the words within the string passed in.

Example(Input --> Output):

"The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The" */

import java.util.regex.Pattern;
public class ReverseWords{

 public static String reverseWords(String str){
   Pattern pattern = Pattern.compile("\\s");
   String[] temp = pattern.split(str);
   String result = "";
   for (int k = 0; k < temp.length; k++){
     if (k == temp.length - 1 )
       result = temp[k] + result;
     else
       result = " " + temp[k] + result;
   }
   return result;
 }
  public static void main(String[] args)
    {
    String s1 = "The greatest victory is that which reqires no battle";
    System.out.println(reverseWords(s1));
  }
}
//Другое решение Code wars
/* 
public class ReverseWords {

public static String reverseWords(String str) {
  List<String> words = Arrays.asList(str.split(" "));
  Collections.reverse(words);
  return String.join(" ", words);
}
} */