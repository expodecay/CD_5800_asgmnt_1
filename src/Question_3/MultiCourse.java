package Question_3;

import Question_4.Folder;

import java.util.ArrayList;

public class MultiCourse {
    String course_name;
    private final Instructor first_instructor;
    private final Instructor second_instructor;
    private final Textbook first_textbook;
    private final Textbook second_textbook;

    public MultiCourse(String course_name, String first_instructor_first_name, String first_instructor_last_name, String first_instructor_office_number,
    String second_instructor_first_name, String second_instructor_last_name, String second_instructor_office_number, String first_title,
                       String first_author, String first_publisher, String second_title, String second_author, String second_publisher){
        this.course_name = course_name;
        this.first_instructor = new Instructor(first_instructor_first_name, first_instructor_last_name, first_instructor_office_number);
        this.second_instructor = new Instructor(second_instructor_first_name, second_instructor_last_name, second_instructor_office_number);

        this.first_textbook = new Textbook(first_title, first_author, first_publisher);
        this.second_textbook = new Textbook(second_title, second_author, second_publisher);
    }

    public void print_info(){
        System.out.println("-------------------------------\nCourse Name: " + this.course_name + "\n" +
                "First Instructor: " + first_instructor.getInstructor_first_name() + " " + first_instructor.getInstructor_last_lane() + "  Office Number: " + first_instructor.getOffice_number() + "\n" +
                "First Textbook: " + first_textbook.getTitle() + " Author: " + first_textbook.getAuthor() + " Publisher: " + first_textbook.getPublisher() + "\n\n" +
                "Second Instructor: " + second_instructor.getInstructor_first_name() + " "  + second_instructor.getInstructor_last_lane() + "  Office Number: " + second_instructor.getOffice_number() + "\n" +
                "Second Textbook: " + second_textbook.getTitle() + " Author: " + second_textbook.getAuthor() + " Publisher: " + second_textbook.getPublisher());
    }
}
