class Employee {
  String name;
  int idNum;
  int salary;
  boolean sex;
}

public class Main {
  public static void main(String[] args) {
    Employee myJik = new Employee();
    myJik.name = "홍길동";
    myJik.idNum = 17001;
    myJik.salary = 450000;
    myJik.sex = true;
    System.out.println(myJik.name);
    System.out.println(myJik.idNum);
    System.out.println(myJik.salary);
    System.out.println(myJik.sex);
  }
}