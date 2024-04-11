import java.util.Date;

public class Employee implements Cloneable {

    String employeeID;
    String name;
    String department;
    Double salary;
    Date hireDate;

    public Employee(String employeeID, String name, String department, Double salary, Date hireDate) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public boolean equals(Object object){
        Employee employee = (Employee)object;
        if (this.employeeID.equals(employee.employeeID) &&
                this.name.equals(employee.name) &&
                this.department.equals(employee.department) &&
                this.salary.equals(employee.salary) &&
                this.hireDate.equals(employee.hireDate))  return true;
    else return false;
    }

    @Override
    public int hashCode() {
        return employeeID.hashCode() + name.hashCode() + department.hashCode() + salary.hashCode() + hireDate.hashCode();
    }
    @Override
    public Employee clone(){
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }


}
