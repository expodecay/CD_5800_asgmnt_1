package Question_3;

public class Instructor {
    private String instructor_first_name;
    private String instructor_last_lane;
    private int office_number;

    public Instructor(String first_name, String last_name, int office_number){
        this.instructor_first_name = first_name;
        this.instructor_last_lane  = last_name;
        this.office_number         = office_number;
    }

    public String getInstructor_first_name() {
        return instructor_first_name;
    }

    public String getInstructor_last_lane() {
        return instructor_last_lane;
    }

    public int getOffice_number() {
        return office_number;
    }

    public void setInstructor_first_name(String instructor_first_name) {
        this.instructor_first_name = instructor_first_name;
    }

    public void setInstructor_last_lane(String instructor_last_lane) {
        this.instructor_last_lane = instructor_last_lane;
    }

    public void setOffice_number(int office_number) {
        this.office_number = office_number;
    }
}
