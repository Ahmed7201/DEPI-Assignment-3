public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student("hamed",18,1.9);

        student1.setName("Not ahmed");
        student1.setAge(18);
        student1.setGpa(4.0);
        student2.setName("mohamed");
        student2.setAge(19);
        student2.setGpa(2.9);


        student1.displayinfo();
        student1.study();
        student2.displayinfo();
        student2.study();
        student3.displayinfo();
        student3.study();
    }
}