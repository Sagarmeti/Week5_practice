class Person {
  String name;
  String gender;
  int age;
  String address;

  void print() {
    System.out.println(name + " " + gender + " " + age);
  }

  void address() {
    System.out.print(address);
  }
}

class Student extends Person {
  int id;
  double sub1, sub2, sub3;

  void average() {
    double avg = (sub1 + sub2 + sub3) / 3;
    System.out.println("Average is:" + avg);
  }

  void percentage() {
    double percent = (sub1 + sub2 + sub3)/300*100;
    System.out.println("Percentage is:" + percent);
  }

}

class PersonStd {
  public static void main(String args[]) {
    Student st = new Student();
    st.name = "SAGAR";
    st.gender = "Male";
    st.age = 22;
    st.address = "Hubli";
    st.sub1 = 80;
    st.sub2 = 68;
    st.sub3 = 76;
    st.print();
    st.address();
    st.average();
    st.percentage();

  }
}