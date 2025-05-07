public class Employee {
    String name;
    int id;
    double salary;

    //Constructor
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary= salary;
    }
        //Method to display student details
        public void displayinfo(){
            System.out.println("Employee ID: "+id);
            System.out.println("Employee Name: "+name);
            System.out.println("Salary: "+salary);
        }
    
    //Main method
    public static void main(String[] args){
        Employee emp1 = new Employee("Abhi",107,49000.0);
        emp1.displayinfo(); 
    }
    }
