package models;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class LoadFile {

    static final String FILE_NAME = "berkft.txt";
    public LoadFile() {
    }

    public static ArrayList<Employee> load() {
        ArrayList<Employee> employeeList = null;
        try {
            employeeList = tryLoad();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
           
        }
        return employeeList;
    }
    public static ArrayList<Employee> tryLoad() throws FileNotFoundException {
        ArrayList<Employee> employeeList = new ArrayList<>();
        File file = new File(FILE_NAME);
        Scanner scanner = new Scanner(file, "utf-8");
        // String firstRow = scanner.nextLine();       
        while(scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");
            Employee emp = new Employee();
            emp.name = lineArray[0];
            emp.city = lineArray[1];
            emp.address = lineArray[2];
            String[] dataStrArray = lineArray[3].split("-");
            int year = Integer.parseInt(dataStrArray[0]);
            int month = Integer.parseInt(dataStrArray[1]);
            int day = Integer.parseInt(dataStrArray[2]);
            emp.birth = LocalDate.of(year, month, day);
            emp.salary = Double.parseDouble(lineArray[4]);

            employeeList.add(emp);            

        }
        return employeeList;
    }
}
