class Employee {
    int id;
    int salary;
    String name;
    public int getSalary(){
        System.out.println(salary);
        return salary;
    }
    public void getDetails(){
        System.out.println(id);
        System.out.println(name);

    }
    public int setSalary(int n){
        salary=n;
        return salary;
    }
}

    public class Oops {
    public static void main(String[]args){
        Employee emp_1=new Employee();
        emp_1.id=7;
        emp_1.name="Divya";
        emp_1.salary=9000;
        emp_1.setSalary(20000);

        Employee emp_2=new Employee();
        emp_2.id=8;
        emp_2.salary=9000;
        emp_2.name="Diya";

        emp_1.getDetails();
        emp_1.getSalary();
        emp_2.getDetails();
        emp_2.getSalary();

    }
    }

