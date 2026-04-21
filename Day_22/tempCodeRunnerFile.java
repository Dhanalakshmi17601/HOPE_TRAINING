import java.util.List;

public class Employees {
    String Name;
    String Dept;
    Double Salary;
    int Age;

    Employees(String name, String dept, Double salary, int age) {
        this.Name = name;
        this.Dept = dept;
        this.Salary = salary;
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getDept() {
        return Dept;
    }

    public Double getSalary() {
        return Salary;
    }

    public int getAge() {
        return Age;
    }

    @Overridepublic
    String toString() {
        return Name + " " + Dept + " " + Salary + " " + Age;
    }
}

public class task {
    public static void main(String[] args) {
        List<Employee> emp = List.of(
                new Employee("Emp1", "Dev", 60000, 25),
                new Employee("Emp2", "HR", 40000, 30),
                new Employee("Emp3", "Dev", 80000, 28),
                new Employee("Emp4", "Support", 55000, 35),
                new Employee("Emp5", "Dev", 45000, 22));

        // 1. Filter by Department Dev
        List<Employees> devList = emp.stream().filter(e -> e.getDept().equals("Dev")).toList();
        System.out.println("Dev Employees: " + devList);

        // 2. salary>50k
        List<Employees> greatSalary = emp.stream().mapToInt(e -> e.getSalary() > 50000).toList();
        System.out.println("Salary>50k: " + greatSalary);

        // 3. Total Salray using sum method
        List<Employee> sum = emp.stream().mapToInt(e -> e.getSalary()).sum();
        System.out.println("Total Salary:" + sum);

        // 4. Average Salary
        List<Employee> avg = emp.stream().mapToInt(e -> e.getSalary()).average();
        System.out.println("Total Salary:" + avg);

        // 5. employee count
        long count = emp.stream().count();
        System.out.println(count);

    }

}
