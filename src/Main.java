import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
       Composite employees = new Composite();

        employees.addEmployee(new Employee(2,"John","Mike",Employee.POSITION_JUNIOR));
        employees.addEmployee(new Employee(1,"Smith","Will",Employee.POSITION_MIDDLE));
        employees.addEmployee(new Employee(4,"Maksatov","Korabek",Employee.POSITION_SENIOR));
        employees.addEmployee(new Employee(3,"Baibekov","Alpamys",Employee.POSITION_LEAD));
        Collections.sort(employees.getEmployees());

        employees.show();
    }
}
