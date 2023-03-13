package Question_3;

public class driver {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Rick", "Ramirez", 365);
        Textbook book = new Textbook("The Quantum Ten", "Sheilla Jones", "Gordon Shillingford Publishing");

        Course course = new Course("Test Course", instructor, book);

        course.print_info();
    }
}
