import java.util.*;
public class Operations {
  public static void main(String args[])
  {
      Scanner obj = new Scanner(System.in);
      System.out.print("Enter 1st String: ");
      String a = obj.next();
      System.out.print("Enter 2nd String: ");
      String b = obj.next();
      obj.close();

//      String c = a+" "+b;    //String Concatenation
//      System.out.println("Concatenated String: "+c);

      String c = a.concat(b);   //Alternate
      System.out.print("Concatenated String: "+c);
      System.out.print("\nLength Of Concatenated String = "+c.length()); //String Length
      System.out.println("\n3rd Letter In String a = "+a.charAt(2));  //Index

      String d = " No Spaces At Start & End ";
      System.out.print(d.trim());  //Trims Start & End Spaces
      System.out.print("\nUppercased String: "+d.toUpperCase());  //Convert To Uppercase
      System.out.print("\nLowercased String: "+d.toLowerCase());  //Convert To Lowercase
      System.out.print("\nIs String b Empty: "+b.isEmpty()); //Check If Empty String
  }
}