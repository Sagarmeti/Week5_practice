import java.util.Scanner;
class Car{
  int year, model;
  String make;

  Car(int y,int b, String m){
    year=y;
    model=b;
    make=m;
  }
  void display(){
    System.out.println(year+" "+model+" "+make);
  }
}

class CarDemo{

  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Car c=new Car(s.nextInt(),s.nextInt(),s.next());
    c.display();
  }
}