public class Slicing {
  public static void main(String args[])
  {
      /*
        charAt
        Substring
        Split
      */
      String a = "Ameya";
      System.out.print("Character At Index 1: "+a.charAt(1));  //Exception String Index Out Of Bound

      //Reverse A String
      String b = "";
      for(int i=a.length()-1; i>=0; i--)
          {
              b = b + a.charAt(i);
          }
      System.out.print("\nReversed String: "+b);

      //Substring
      System.out.print("\nSubstring From Index 2: "+a.substring(2)); //Optional End Index  (2,4); 4 Excluded

      //Splitting String
      String myDelimiter = "@";
      String email = "ameya@example.com";
      String arr[] = email.split(myDelimiter);  //Splits The String At @ & Stores In Array
      System.out.println("\nArray Contents:");
      for(String x : arr)
          {
              System.out.println(x);
          }
  }
}