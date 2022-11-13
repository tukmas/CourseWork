import java.util.Objects;

public class Employee {
    private static int counter = 0;
    private final String name;
    private int department;
    private int salory;
    public int id;

    public Employee(String name, int salory, int department) {
        this.name = name;
        this.salory = salory;
        this.department = department;
        this.id = counter++;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalory() {
        return this.salory;
    }

    public int getId() {
        return id;
    }

    public static int getCaunter() {
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalory(int salory) {
        this.salory = salory;
    }

    @Override
    public String toString() {
        return
                "id: " + id + "; Сотрудник : " + name + "; Зарплата : " + salory + "; Отдел : " + department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salory == employee.salory && department == employee.department && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salory, department);
    }
}
