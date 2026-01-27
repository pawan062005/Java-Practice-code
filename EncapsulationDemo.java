class Student {
    private String name;  
    private int age;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Pawan");
        s.setAge(20);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}
