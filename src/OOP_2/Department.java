package OOP_2;

public class Department {
    private String name;
    private Employee head;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        if (head != null && head.getDepartment() != null && !head.getDepartment().equals(this)) {
            throw new IllegalArgumentException("Начальник должен работать в этом отделе");
        }
        this.head = head;
    }
}