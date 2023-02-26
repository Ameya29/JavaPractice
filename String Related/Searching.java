import java.util.*;
public class Searching {
  public static void main(String args[])
  {
      /*
        Contains
        Starts With
        Ends With
        Index Of
        Last Index Of
      */
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter 1st String: ");
      String a = obj.nextLine();
      System.out.print("Enter 2nd String: ");
      String b = obj.nextLine();
      obj.close();

      System.out.print("String a Contains "+b+": "+a.contains(b));  //Is b A Part Of a String (Case Sensitive)
      System.out.print("\nStarts With: "+a.startsWith(b));  //Check If Starts With String b
      System.out.print("\nEnds With: "+a.endsWith(b));   //Check If Ends With b
      System.out.print("\nIndex Of: "+a.indexOf(b));  //Get Index Of b In a (Optional Parameter: Starting Index)
      System.out.print("\nReverse Index Of: "+a.lastIndexOf(b));  //Reverse Index Search.
      System.out.print("\nUnderstood");
  }
}