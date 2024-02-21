import java.util.ArrayList;
import java.util.List;

public class Handbook {

  public static List<Employee> employees = new ArrayList<>();

  public static void handbookAdd(List<Employee> employees, Employee employee) {
    employees.add(employee);
  }

  public static void findEmployeeByExp(List<Employee> employees, double exp) {
    List<Employee> employees2 = new ArrayList<>();
    for (Employee employee : employees) {
      if (employee.getExp() == exp) {
        employees2.add(employee);
      }
    }
    System.out.println("Результат поиска по стажу " + exp +":");
    System.out.println(employees2);
  }

  public static void findPhoneByEmployeeName(List<Employee> employees, String employeeName) {
    List<Employee> employees2 = new ArrayList<>();
    for (Employee employee : employees) {
      if (employee.getName().equals(employeeName)) {
        employees2.add(employee);
      }
    }
    System.out.println("Результат поиска телефона по имени " + employeeName +":");
    System.out.println(employees2);

  }

  public static void findEmployeeByBadgeNumber(List<Employee> employees, int num) {
    List<Employee> employees2 = new ArrayList<>();
    for (Employee employee : employees) {
      if (employee.getTabNum() == num) {
        employees2.add(employee);
      }
    }
    System.out.println("Результат поиска сотрудника по табелному номеру " + num +":");
    System.out.println(employees2);
  }
}
