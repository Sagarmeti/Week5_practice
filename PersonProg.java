import java.util.Scanner;
class Person{
  String name;
  String gender;
  int age;

  
  Person(String n,int a,String g){
    name=n;
    age=a;
    gender=g;
  }

  void yearCalculation(){
    int year = 2023 - age;
    System.out.println("The person was born in "+year);
    
  } 
  void display(){
    System.out.println("Name of the person : "+name);
    System.out.println("Age of the person : "+age);
    System.out.println("Gender : "+gender);    
  }  
}
 
class PersonProg{
    public static void main(String args[]){
    System.out.println("please enter the Person's information");
    Scanner sc=new Scanner(System.in);
    Person c=new Person(sc.next(),sc.nextInt(),sc.next());
    System.out.println("**Person Information*");
      c.display();
      c.yearCalculation();
  }
}