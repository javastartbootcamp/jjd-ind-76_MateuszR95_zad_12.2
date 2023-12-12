public class EmployeeStatsData {

    public static final String IT_DEPARTMENT = "IT";
    public static final String SUPPORT_DEPARTMENT = "Support";
    public static final String MANAGEMENT_DEPARTMENT = "Management";

    public static int calculateAverageSalary(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum / employees.length;
    }

    public static int findMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static int findMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public static int countEmployees(Employee[] employees, String departmentType) {
        int employeesCounter = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(departmentType)) {
                employeesCounter++;
            }
        }
        return employeesCounter;
    }

}
