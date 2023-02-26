import java.util.*;
public class Comparison {
  public static void main(String args[])
  {
      /*
        Equals
        Compare To
        Matches
      */
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter 1st String: ");
      String a = obj.next();
      System.out.print("Enter 2nd String: ");
      String b = obj.next();
      obj.close();

      System.out.print("Are Both Strings Equal (CaseSensitive): "+a.equals(b));  //Case Sensitive String Compare
      System.out.println("\nIgnore Case And Compare String: "+a.equalsIgnoreCase(b)); //String Content Compare

      System.out.print("\nCompare 2 Strings (Case Sensitive): "+a.compareTo(b)); //Returns +ve if a>b, else -ve, else 0 if a=b
      System.out.print("\nCompare 2 Strings Lexicographically: "+a.compareToIgnoreCase(b)); //Ignore Case

      String pattern = "[A-Z]{1,}";
      System.out.print("\nDoes String a Match The Pattern: "+a.matches(pattern));  //Match A String To Regex
  }
}