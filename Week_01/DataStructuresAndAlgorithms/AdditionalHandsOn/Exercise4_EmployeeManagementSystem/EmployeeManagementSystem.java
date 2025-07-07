class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String toString() {
        return "ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

public class EmployeeManagementSystem {
    static Employee[] records = new Employee[50];
    static int size = 0;

    public static void add(Employee e) {
        if (size < records.length) {
            records[size] = e;
            size++;
        } else {
            System.out.println("No space");
        }
    }

    // Search by ID
    public static Employee search(int id) {
        for (int i = 0; i < size; i++) {
            if (records[i].employeeId == id) {
                return records[i];
            }
        }
        return null;
    }

    // Delete an employee by ID
    public static void delete(int id) {
        for (int i = 0; i < size; i++) {
            if (records[i].employeeId == id) {
                for (int j = i; j < size - 1; j++) {
                    records[j] = records[j + 1];
                }
                records[size - 1] = null;
                size--;
                System.out.println("Employee deleted.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void displayAll() {
        System.out.println("\nCurrent Employees:");
        for (int i = 0; i < size; i++) {
            System.out.println(records[i]);
        }
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Soumyadip", "Engineer", 47069);
        Employee e2 = new Employee(102, "Karan", "Analyst", 52999);
        Employee e3 = new Employee(103, "Ankan", "Manager", 74969);
        add(e1);
        add(e2);
        add(e3);

        displayAll();

        System.out.println("\nSearching Employee ID 102:");
        Employee found = search(102);
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Not found.");
        }

        System.out.println("\nTry to Delete Employee ID 101...");
        delete(101);

        displayAll();
    }
}
