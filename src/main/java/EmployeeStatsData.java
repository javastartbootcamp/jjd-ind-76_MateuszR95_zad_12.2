public class EmployeeStatsData {

    private static final String IT_DEPARTMENT = "IT";
    private static final String SUPPORT_DEPARTMENT = "Support";
    private static final String MANAGEMENT_DEPARTMENT = "Management";

    public static int calculateAverageSalary(Employee[] employees) {
        int salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum += employees[i].getSalary();
        }
        return salarySum / employees.length;
    }

    public static int findMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static int findMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static int countItEmployees(Employee[] employees) {
        int itEmployeesCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(IT_DEPARTMENT)) {
                itEmployeesCounter++;
            }
        }
        return itEmployeesCounter;
    }

    public static int countSupportEmployees(Employee[] employees) {
        int supportEmployeesCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(SUPPORT_DEPARTMENT)) {
                supportEmployeesCounter++;
            }
        }
        return supportEmployeesCounter;
    }

    public static int countManagementEmployees(Employee[] employees) {
        int managementEmployeesCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment().equalsIgnoreCase(MANAGEMENT_DEPARTMENT)) {
                managementEmployeesCounter++;
            }
        }
        return managementEmployeesCounter;
    }
}
