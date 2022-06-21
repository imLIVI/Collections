public class Student {
    private String name;
    private String group;
    private String studentId;

    public Student(String name, String group, String studentId) {
        this.group = group;
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return studentId.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return studentId.equals(((Student) o).studentId);
    }

    @Override
    public String toString() {
        return " - " + name + ", " + group + ", " + studentId;
    }


}
