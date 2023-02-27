public class RoadToll {
  String vehicleType;
  int numOfTyres;

  //Beware This Is Just A Class-named Method NOT A CONSTRUCTOR
  public void RoadToll(String vehicleType, int numOfTyres)
  {
      switch(numOfTyres)
      {
          case 2:
              System.out.printf("\nToll Amount For Your %s Is %d$",vehicleType,0);
              break;
          case 4:
              System.out.printf("\nToll Amount For Your %s Is %d$",vehicleType,20);
              break;
          case 6:
              System.out.printf("\nToll Amount For Your %s Is %d$",vehicleType,40);
              break;
          default:
              System.out.printf("\nToll Amount For Your %s Is %d$",vehicleType,50);
      }
  }

    //Constructor => Special Member Function, Gets Called Whenever Object Created
    //Generally Used For Variables Initialization
    //Has No Returntype
    //Can Have Parameters
    public RoadToll()   //Default Constructor Declaration
    {
        System.out.printf("\nConstructor Called! (Object Created)");
    }

    //Parameterized Constructor Declaration
    public RoadToll(String vehicleType, int numOfTyres)
    {
        this.vehicleType = vehicleType;  //Referring This Variable Of Current Class
        this.numOfTyres = numOfTyres;  //Latter numOfTyres Value Is Assigned To Class Variable numOfTyres
    }
    //Constructor Overloading => Same Name, Different (Types Of) Arguments
    //Default Constructor Is Only Assumed When There's No Other Constructor

    public static void main(String args[])
    {
        RoadToll obj1 = new RoadToll();
        RoadToll obj2 = new RoadToll();
        RoadToll obj3 = new RoadToll("SUV",4);
        obj1.RoadToll("Truck",8);
        obj2.RoadToll("Sedan",4);
        obj3.RoadToll("Mini",4);
    }

}