/*Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT*/


class Teacher{
  String collegename;
  String designation;

  void work(){
  }
}

class ComputerTeacher extends Teacher{
  ComputerTeacher(){
  designation="Computer teacher";
  collegename="IIT";
  }
}

class TeacherDemo{
  public static void main(String args[]){
    ComputerTeacher c=new ComputerTeacher();
    System.out.println("Designation:"+c.designation);
    System.out.println("College name:"+c.collegename);
    c.work();
  }
}