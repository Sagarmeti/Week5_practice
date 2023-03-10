import java.util.Scanner;
class Person{
  int age;
  String name;
  String address="Hubli";

  Person(int a,String n){
    name=n;
    age=a;
  }
  void display(){
    System.out.println(name+" "+age+" "+address);
  }
}

class PersonDemo{

  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Person per=new Person(s.nextInt(),s.next());
    per.display();
  }
}