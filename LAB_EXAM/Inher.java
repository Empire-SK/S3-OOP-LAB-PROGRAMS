import java.util.Scanner;
class Employee{

    String Name;
    int Age;
    float PhoneNo;
    String address;
    double Salary;
    public void printSalary(){
        System.out.print("Salary is:"+Salary);
    }

    public Employee(String name,int age,float PhoneNo,String address,double Salary){
        this.Name=name;
        this.Age=age;
        this.PhoneNo=PhoneNo;
        this.address=address;
        this.Salary=Salary;
    }
    void DisplayEmployee(){
        System.out.println("Name:"+this.Name);
        System.out.println("Age:"+this.Age);
        System.out.println("Phone No:"+this.PhoneNo);
        printSalary();
    }
}

class Manager extends Employee{
    private String specialzation;
    private String department;

    public Manager(String name,int age,float PhoneNo,String address,String specialzation,String department,double Salary){
        super(name,age,PhoneNo,address,Salary);
        this.specialzation=specialzation;
        this.department=department;
    }

    public void Display(){
        DisplayEmployee();
        System.out.println("Specialzartion:"+this.specialzation);
        System.out.println("Department:"+this.department);
    }
}

class Officer extends Employee{
    private String specialzation;
    private String department;

    public Officer(String name,int age,float PhoneNo,String address,String specialzation,String department,double Salary){
        super(name,age,PhoneNo,address,Salary);
        this.specialzation=specialzation;
        this.department=department;
    }

    public void Display(){
        DisplayEmployee();
        System.out.println("Specialzartion:"+this.specialzation);
        System.out.println("Department:"+this.department);
    }
}


public class Inher {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the Deatails of Manager\n");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Age:");
        int age = sc.nextInt(); sc.nextLine();
        System.out.print("Phone No:");
        float PhoneNo= sc.nextFloat();sc.nextLine();
        System.out.print("Address:");
        String address=sc.nextLine();
        System.out.print("Specialization:");
        String specialzation=sc.nextLine();
        System.out.print("Department");
        String dept=sc.nextLine();
        System.out.print("Salary:");
        double sal = sc.nextDouble();sc.nextLine();


        System.out.print("Enter the Deatails of Officer\n");
        System.out.print("Name:");
        String name1 = sc.nextLine();
        System.out.print("Age:");
        int age1 = sc.nextInt();sc.nextLine();
        System.out.print("Phone No:");
        float PhoneNo1= sc.nextFloat();sc.nextLine();
        System.out.print("Address:");
        String address1=sc.nextLine();
        System.out.print("Specialization:");
        String specialzation1=sc.nextLine();
        System.out.print("Department");
        String dept1=sc.nextLine();
        System.out.print("Salary:");
        double sal1 = sc.nextDouble();

       Manager man=new Manager(name,age,PhoneNo,address,specialzation,dept,sal);
       Officer off=new Officer(name1,age1,PhoneNo1,address1,specialzation1,dept1,sal1);
        man.Display();
        off.Display();

    }
}