public class Temp {
  public static void main(String args[])
  {
      Vehicle myCar1 = new Vehicle();
      myCar1.mode = "Petrol";
      myCar1.displayDetails();


      Vehicle myCar2 = new Vehicle();
      myCar2.colour = "Sky Blue";
      myCar2.maker = "Toyota";
      myCar2.displayDetails();

      Vehicle myTruck1 = new Vehicle();
      myTruck1.vehicleType = "Truck";
      myTruck1.mode = "Diesel";
      myTruck1.maker = "Ashok Leyland";
      myTruck1.displayDetails();
  }
}