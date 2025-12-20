package OOP_2;

public class Department {
    private final String name;
    private Employee boss;

    public Department(String name, Employee boss) {
        this.name = name;
        setBoss(boss);
    }

    public Department(String name) {
        this(name, null);
    }

    public void setBoss (Employee boss) {
        if (boss == null) {
            return;
        } else if (boss.getDepartment() == this) {
            this.boss = boss;
        } else {
            throw new IllegalArgumentException("Указанный начальник работает в другом отделе");
        }
    }

    public Employee getBoss() {
        return new Employee(boss.getName(), boss.getDepartment());
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", boss=" + boss.getName() +
                '}';
    }
}
