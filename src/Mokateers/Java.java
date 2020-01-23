

public class Mokateers {
    private int employeeID;
    private String name;
    private long salary;

    public Mokateers(int employeeID, String name, long salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void print(){
        System.out.println("Name :" + getName());
        System.out.println("Employee ID :" + getEmployeeID());
        System.out.println("Salary :" + getSalary());


    }
}

