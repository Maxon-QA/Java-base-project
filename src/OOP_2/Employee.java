package OOP_2;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        setDepartment(department); // Используем сеттер для проверки
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department != null ? new Department(department.getName()) : null;
    }

    public void setDepartment(Department department) {
        if (department != null && department.getHead() != null && !department.getHead().equals(this)) {
            throw new IllegalArgumentException("Начальник отдела должен быть сотрудником этого отдела");
        }
        this.department = department;
    }

    @Override
    public String toString() {
        if (department == null || department.getHead() == null) {
            return name; // Защита от null
        }

        if (this.equals(department.getHead())) {
            return String.format("%s - начальник отдела %s", name, department.getName());
        } else {
            return String.format("%s работает в отделе %s, начальник которого %s",
                    name, department.getName(), department.getHead().getName());
        }
    }
}