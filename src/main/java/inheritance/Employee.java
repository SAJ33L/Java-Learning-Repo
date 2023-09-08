package inheritance;

public class Employee extends Person {

    private String employeeID;
    private String title;

    public Employee(){
        super("Sajeel");
        System.out.println("In employee default constructor");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
