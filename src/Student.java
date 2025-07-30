public class Student {

    private String name;
    private int age;
    private double gpa;

    public Student() {}
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    void study(){
        if(gpa >= 0 && gpa <= 4.0){
            if (gpa < 1.0) {
                System.out.println("Studying plan is too low (probation)");
            }
            else if (gpa < 2.0) {
                System.out.println("Studying plan is low (probation)");
            }
            else if (gpa < 3.0) {
                System.out.println("Studying plan need to be improved");
            }
            else if (gpa < 4.0) {
                System.out.println("Studying plan is good");
            }
            else {
                System.out.println("Studying plan is too high (Full merit scholarship awarded) ");
            }

        }
        else{
            System.out.println("Invalid gpa");
        }

    }
    String getName() {
        return name;
    }
    void setName(String Name) {
        name = Name;
    }
    int getAge() {
        return age;
    }
    void setAge(int Age) {
        age = Age;
    }
    double getGpa() {
        return gpa;
    }
    void setGpa(double Gpa) {
        gpa = Gpa;
    }
    void displayinfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gpa: " + getGpa());
    }


}
