package Implementing_the_MVC_Pattern;

public class MVCPattern {
    public static void main(String[] args) {
 
        Student student = new Student("Alice", 101, "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println("\nUpdating student details...\n");

        controller.setStudentName("Alice Smith");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}

