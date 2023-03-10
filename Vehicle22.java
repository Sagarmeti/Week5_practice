/*Create a class called Vehicle with attributes make and model. Create a subclass called Car that inherits from Vehicle and adds an attribute num_doors. Create a subclass called SportsCar that inherits from Car and adds an attribute top_speed. Create a method in SportsCar called rev_engine() that prints out "Vroom!".*/

class Vehicle{
  String make, model;
}

class Car extends Vehicle{
  int num_doors;
}

class SportsCar extends Car{
  int top_speed;

  void rev_engine(){
    System.out.println("-----Vrooom!-----");
  }
}

class Vehicle22{
public static void main(String args[]){
  SportsCar s=new SportsCar();
  s.make="Z1";
  s.model="Supra";
  s.num_doors=2;
  s.top_speed=360;
  s.rev_engine();
}
}