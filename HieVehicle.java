/*Create a class called Vehicle with attributes make and model. Create two subclasses, Car and Truck, that both inherit from Vehicle. Add an attribute num_doors to Car and an attribute payload_capacity to Truck. Create a method in Car called rev_engine() that prints out "Vroom!". Create a method in Truck called load_payload() that adds weight to the payload capacity.*/

class Vehicle{
  String make,model;
  
}

class Car extends Vehicle{
  int num_doors;

  void rev_engine(){
    System.out.println("Vroom!");
  }
}

class Truck extends Vehicle{
  int paload_cap;

  void load_payload(){
   int weight=payload_cap+weight;
    System.out.println("Weight:"+weight);
  }
}

class HieVehicle{
  public static void main(String args[]){
    Truck t=new Truck();
    t.weight=20;
    
  }
}