public class MVCPatternExample {

    public static void main(String[] args) {
        // Create a Student model
        Student model = new Student("1", "John Doe", "A");

        // Create a Student view
        StudentView view = new StudentView();

        // Create a Student controller
        StudentController controller = new StudentController(model, view);

        // Update the view
        controller.updateView();

        // Update the model data
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Update the view again
        controller.updateView();
    }
}
