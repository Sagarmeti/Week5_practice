import java.util.Scanner;
class Book{
  int year;
  String name;
  String title;

  Book(int y,String n, String t){
    year=y;
    name=n;
    title=t;
  }
  void display(){
    System.out.println(year+" "+name+" "+title);
  }
}

class BookDemo{

  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Book b=new Book(s.nextInt(),s.next(),s.next());
    b.display();
  }
}