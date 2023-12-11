import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeDataReader {

    public static Employee[] initEmployeeArray(String fileName) throws FileNotFoundException {
        int fileLines = calculateFileLength(fileName);
        Employee[] employees = new Employee[fileLines];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < fileLines; i++) {
                String csvLine = scanner.nextLine();
                employees[i] = createEmployeeFromCsv(csvLine);
            }
        }
        return employees;
    }

    private static Employee createEmployeeFromCsv(String csvLine) {
        String[] employeeData = csvLine.split(";");
        String firstName = employeeData[0];
        String lastName = employeeData[1];
        String id = employeeData[2];
        String employeeDatum = employeeData[3];
        int salary = Integer.parseInt(employeeData[4]);
        return new Employee(firstName, lastName, id, employeeDatum, salary);
    }

    private static int calculateFileLength(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        }
        return lines;
    }

}
