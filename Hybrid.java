/*Create a class called Person with attributes name and age. Create a subclass called Employee that inherits from Person and adds attributes salary and position. Create two subclasses, Manager and Engineer, that both inherit from Employee. Add an attribute num_reports to Manager and an attribute specialization to Engineer. Create a method in Manager called hire_employee() that increments the num_reports attribute. Create a method in Engineer called solve_problem() that prints out "Problem solved!".*/

class Person{
  String name;
  int age;
}

class Employee extends Person{
  int salary;
  String position;
}

class Manager{
  int num_reports;

  void hire_Employee(){
    num_reports++;
  }
}

class Engineer{
  String specialization;

  void solve_Problem(){
    System.out.println("Problem solved");
  }
}

class Hybrid{
  public static void main(String args[]){
    Engineer e=new Engineer();
    e.solve_Problem();
  }
}