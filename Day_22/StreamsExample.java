import java.util.List;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 4, 5, 6);
        List<Integer> multiplyBy2 = nums.stream().map((i) -> i * 2).toList();

        System.out.println(multiplyBy2);

        //Reduce
        List<Integer> evenNumbers = nums.stream().filter((i) -> i % 2 == 0).toList();
        int total = multiplyBy2.stream().reduce(0, (a, b) -> a + b);
        System.out.println(total);
        System.out.println(evenNumbers);

        //Map
        List<Employee> employees = List.of(new Employee("Employee1", 222222), new Employee("Employee2", 444444));
        List<String> names = employees.stream().map((i) -> i.getName()).toList();
        System.out.println(names);

        // Filter
        List<Employee> greatSalary = employees.stream().filter((i) -> i.getSalary() > 30000).toList();
        System.out.println("After filter:" + greatSalary.toString());
        System.out.println(names);

    }
}