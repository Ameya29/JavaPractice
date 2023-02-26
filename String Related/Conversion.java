public class Conversion {
  public static void main(String args[])
  {
      /*
        toString
        toBinaryString
        toHexString
        toOctalString
        parseInt
      */

      int num1 = 100;
      System.out.println(Integer.toString(num1));
      System.out.println(Integer.toBinaryString(num1));
      System.out.println(Integer.toOctalString(num1));
      System.out.println(Integer.toHexString(num1));

      String str1 = "200";
      String str2 = "101111";
      String str3 = "142";
      String str4 = "96";
      System.out.println("\n"+Integer.parseInt(str1));
      System.out.println(Integer.parseInt(str2,2));
      System.out.println(Integer.parseInt(str3,8));
      System.out.println(Integer.parseInt(str4,16));  //Optional Radix (Base)
  }
}