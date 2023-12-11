import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "employees.csv";
        File file = new File(fileName);

        Employee[] employees = EmployeeDataReader.initEmployeeArray(fileName);

        if (file.exists()) {
            File stats = new File("stats.txt");
            stats.createNewFile();

            FileWriter fileWriter = new FileWriter(stats);

            fileWriter.write("Średnia wypłata: " + EmployeeStatsData.calculateAverageSalary(employees) + "\n");
            fileWriter.write("Minimalna wypłata: " + EmployeeStatsData.findMinSalary(employees) + "\n");
            fileWriter.write("Maksymalna wypłata: " + EmployeeStatsData.findMaxSalary(employees) + "\n");
            fileWriter.write("Liczba pracowników IT: " + EmployeeStatsData.countItEmployees(employees) + "\n");
            fileWriter.write("Liczba pracowników Management: " + EmployeeStatsData.countManagementEmployees(employees) + "\n");
            fileWriter.write("Liczba pracowników Support: " + EmployeeStatsData.countSupportEmployees(employees) + "\n");
            fileWriter.close();
        }

    }
}
