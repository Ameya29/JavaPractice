public class Replace {
  public static void main(String args[])
  {
      /*
        Replace - Normal
        ReplaceAll - Regex
      */
      String str1 = "CONCENTRAT1234ON 1234MPROVES W1234TH PRACT1234CE";
      String str2 = "1234";
      String str3 = "I";

      System.out.print(str1.replace(str2,str3)); //Find str2 In str1 Replace With str3

      String str4 = "HELLO WORLD";
      String pattern = "\\s";
      System.out.print("\nReplace All: "+str4.replaceAll(pattern," & ")); //Replace Space With &
  }
}