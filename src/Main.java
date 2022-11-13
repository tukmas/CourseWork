public class Main {
    public static void main(String[] args) {
        employees = new Employee[]{
                new Employee("Антонова Радослава Викторовна", 20000, 3),
                new Employee("Ларионова Эллина Эльдаровна", 20000, 2),
                new Employee("Киселёва Златослава Еремеевна", 30000, 1),
                new Employee("Гришина Кара Артёмовна", 40000, 4),
                new Employee("Горшкова Эжени Игнатьевна", 50000, 2),
                new Employee("Елисеев Аристарх Фролович", 20000, 4),
                new Employee("Беляков Макар Яковлевич", 30000, 1),
                new Employee("Дементьев Аполлон Тихонович", 40000, 3),
                new Employee("Харитонов Макар Леонидович", 50000, 2),
                new Employee("Мельников Савелий Петрович", 60000, 3),};
        printEmployee();
        System.out.println(calculateTotalSalory());
        System.out.println(findEmployeeWithMinSalory());
        System.out.println(findEmployeeWithMaxSalory());
        System.out.println(calculateAverageSalory());
        printFullNames();
    }

    private static Employee[] employees = new Employee[10];

    public static void printEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalory() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalory();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalory() {
        Employee result = employees[0];
        int minSalory = employees[0].getSalory();
        for (Employee employee : employees) {
            if (employee.getSalory() < minSalory) {
                minSalory = employee.getSalory();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalory() {
        Employee result = employees[0];
        int maxSalory = employees[0].getSalory();
        for (Employee employee : employees) {
            if (employee.getSalory() > maxSalory) {
                maxSalory = employee.getSalory();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalory() {
        return calculateTotalSalory() / Employee.getCaunter();
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}