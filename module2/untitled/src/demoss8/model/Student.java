package demoss8.model;

public class Student extends Person {
    private String className;

    public Student() {

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student(int id, String name, String className) {
        super(id, name);
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
