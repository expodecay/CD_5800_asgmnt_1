package Question_3;

public class driver {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook book = new Textbook("Clean Code", "Robert Cecil Martin", "Pearson Education");

        Course course = new Course("CS 5800-01", instructor, book);

        course.print_info();

        MultiCourse new_course = new MultiCourse("CS 5800-02", "Nima_1", "Davarpanah_2", "3-2636",
                "Nima_2", "Davarpanah_2", "3-2637",
                "Clean Code_1", "Robert Cecil Martin_1", "Pearson Education_1",
                "Clean Code_2", "Robert Cecil Martin_2", "Pearson Education_2");

        new_course.print_info();
    }
}
