public class StaticKeyword {
//  String name = "ABC";
    //Static Keyword Is Used When You Want To Share A Variable Among Objects
    //Simply Call A Static Variable Using `Classname.Variable` No Need Of Object
  static String name = "Ameya";  //Makes The Name Of The Class, Not Related To Object Anymore
  byte age = 6;
  String grade = "1st";
  public void displayDetails()
  {
      System.out.printf("\n%s Is %d Years Old & In %s Grade",name,age,grade);
  }

    public static void staticMethod()
    {
        System.out.println("\nYou Called A Static Method Without An Object");
    }

    public static void main(String args[])
    {
        StaticKeyword ob1 = new StaticKeyword();
        StaticKeyword ob2 = new StaticKeyword();

        StaticKeyword.name = "Ram";
        ob1.age = 7;
        ob1.grade = "2nd";

        StaticKeyword.name = "Wadawau";
        ob2.age = 8;
        ob2.grade = "3rd";

        ob1.displayDetails();
        ob2.displayDetails();
        StaticKeyword.staticMethod();
    }
}