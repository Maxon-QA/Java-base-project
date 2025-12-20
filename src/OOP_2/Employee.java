package OOP_2;

public class Employee{
    private final String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        setDepartment(department);

    }

    private void setDepartment(Department department) {
        this.department = new Department(department.getName(), department.getBoss());
        if (department.getBoss() == null) {
            department.setBoss(this);
            System.out.println("Сотрудник " + name + " Автоматически назначен начальником отдела " + department.getName());
        }

    }

    /*
    Не получается сделать инкапсуляцию, так как:
    1) Появляются ошибки, если сделать метод приватным
    2) если возвращать новый объект
     */
    public Department getDepartment() {
        return new Department(department.getName(), department.getBoss()) ;
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + department.getName();
    }
}
