package Question_3;

public class Course {
    private String course_name;
    private Instructor instructor;
    private Textbook textbook;


    public Course(String course_name, Instructor instructor, Textbook book) {
        this.course_name = course_name;
        this.instructor = instructor;
        this.textbook = book;
    }

    public String getCourse_name() {
        return course_name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void print_info(){
        System.out.println("-------------------------------\nCourse Name: " + this.course_name + "\n" +
                "Instrustor: " + instructor.getInstructor_first_name() + " " + instructor.getInstructor_last_lane() + "\n" +
                "Textbook: " + textbook.getTitle() + " Author: " + textbook.getAuthor() + " Publisher: " + textbook.getPublisher());
    }
}
