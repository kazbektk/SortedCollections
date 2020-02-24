import java.util.ArrayList;
import java.util.List;

public class Composite {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void removeEmployee(Employee employee){
        if(employees.contains(employee)) {
            employees.remove(employee);
        }
    }
    public void show(){
        for(Employee e: employees){
            e.show();
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
