/*Create a class called Vehicle with attributes make, model, and year. Create a subclass called Car that inherits from Vehicle and adds attributes color and num_doors. Create a method in Car called get_info() that prints out the make, model, year, color, and number of doors of the car*/

class Vehicle{
  String make, model;
  int year;
}

class Car extends Vehicle{
  String color;
  int num_doors;

  void get_info(){
    System.out.println("Make-->"+make);
    System.out.println("Model-->"+model);
    System.out.println("Year-->"+year);
    System.out.println("Color-->"+color);
    System.out.println("Number of doors-->"+num_doors);
  }
}

class VehicleDemo{
  public static void main(String args[]){
    Car c=new Car();
    c.make="Supra";
    c.model="z3";
    c.year=2021;
    c.color="Black";
    c.num_doors=2;
    c.get_info();
  }
}