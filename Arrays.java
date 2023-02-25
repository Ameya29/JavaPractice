public class Arrays {
  public static void main(String args[])
  {
      String daysOfWeek[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}; //Length Fixed
      System.out.println(daysOfWeek.length); //Arrays Are Immutable

//      daysOfWeek[2] = "Wed";
//      System.out.println(daysOfWeek[2]);

      for(int i=0; i<=daysOfWeek.length-1; i++)
          {
              System.out.println("Day "+i+": "+daysOfWeek[i]);
          }
  }
}