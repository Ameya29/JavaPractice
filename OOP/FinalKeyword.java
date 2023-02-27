public final class FinalKeyword {  //Cannot Be Inherited By Anyone
  /*
    Final Field Is Used To Create A Constant
    Final Method Is Used To Avoid Method Overriding
    Final Class Is Used To Prevent Class Inheritance
  */
    final double PI = 3.14;  //Constants In CAPS

    final void abc()  //Cannot Be Overriden By Child Class
    {
        System.out.println("Final Method ABC");
    }

    public static void main(String args[])
    {
        FinalKeyword ob = new FinalKeyword();
        //ob.PI = 2.58;  //Check This Error
    }
}