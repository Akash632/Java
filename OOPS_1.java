import java.util.*;

class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;

    Employee(int ID, String NAME, String DESIGNATION, double SALARY){
        this.id = ID;
        this.name = NAME;
        this.designation = DESIGNATION;
        this.salary = SALARY;
    }

    // public int getId(){
    //     return this.id;
    // }

    // public void setId(int ID){
    //     this.id = ID;
    // }

    public double getSalary(){
        return this.salary;
    }
    
    public String getDesignation(){
        return this.designation;
    }
}

class Company{
    private String name;
    private Employee[] emp;
    private int numEmployees;

    Company(String comp, Employee[] newArr, int nums){
        this.name =  comp;
        this.emp = newArr;
        this.numEmployees = nums;
    }

    public double getAvgSalary(Employee[] arr){
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i].getSalary();
        }
        return sum/arr.length;
    }

    public double getMaxSalary(Employee[] arr){
        double max = Double.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i].getSalary() > max){
                max = arr[i].getSalary();
            }
        }
        return max;
    }
}
public class OOPS_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Company name : ");
        String cn = sc.nextLine();
        System.out.print("Enter noof Employees : ");
        int empNum = sc.nextInt();
        sc.nextLine();
        Employee[] emp = new Employee[empNum];
        System.out.println("Enter Employee details : ");
        for(int i=0; i<empNum; i++){
            System.out.print("Employee "+(i+1)+": ");
            System.out.print("Enter id : ");
            int id = sc.nextInt(); sc.nextLine();

            System.out.print("Enter name : ");
            String name = sc.nextLine();

            System.out.print("Enter designation : ");
            String designation = sc.nextLine();

            System.out.print("Enter salary : ");
            double salary = sc.nextDouble();

             emp[i] = new Employee(id, name, designation, salary);
        }

        Company c = new Company(cn, emp, empNum);

        System.out.println("Average Salary : " + c.getAvgSalary(emp));

        System.out.println("Maximum Salary : " + c.getMaxSalary(emp));

        System.out.print("Employees with Designation : ");

    }
}
