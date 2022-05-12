/*
Create a class that capture  


*/

class Student {

    private String firstName;
    private String lastName;
    private int year;
    private String major;

    Student() {
    }

    Student(String firstName, String lastName, int year, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}

public class Exercise1 {
    public static void main(String[] args) {

        Student st = new Student();
        st.setFirstName("Vishal");
        st.setLastName("Dhanure");
        st.setYear(2022);
        st.setMajor("CSE");

        System.out.println("Student First Name: " + st.getFirstName());
        System.out.println("Student Last Name: " + st.getLastName());
        System.out.println("year Name: " + st.getYear());
        System.out.println("Major  : " + st.getMajor());
    }

}
