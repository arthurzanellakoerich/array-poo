package Poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmp {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            System.out.println("Employee # " + (i + 1));
            System.out.println("ID:");
            int id = sc.nextInt();
            while (hasID(list, id)) {
                System.out.println("Id already taken! Try again:");
                id = sc.nextInt();
            }
            System.out.println("NAME:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("SALARY:");
            double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);

        }

        System.out.println("Enter the employee id that will have salary increase:");
        int idsalary = sc.nextInt();
        sc.nextLine();
        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        //Integer pos = position(list, idsalary);
        if (emp== null) {
            System.out.println("This id does not exist");
        } else {
            System.out.println("Enter the percentage:");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee e : list){
            System.out.println(e);
        }

    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;

    }

    public static boolean hasID(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp !=null;
    }

}
