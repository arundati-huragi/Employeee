public class Employee {
    String name;
    int id;
    double salary;
    int phno;

    //Constructor
    public Employee(String name, int id, double salary,int phno){
        this.name = name;
        this.id = id;
        this.salary= salary;
        this.salary= phno;
    }
        //Method to display student details
        public void displayinfo(){
            System.out.println("Employee ID: "+id);
            System.out.println("Employee Name: "+name);
            System.out.println("Salary: "+salary);
            System.out.println("phone number"+phno);
        }
    
    //Main method
    public static void main(String[] args){
        Employee emp1 = new Employee("Abhi",107,49000.0,843148905);
        emp1.displayinfo(); 
    }
    }
