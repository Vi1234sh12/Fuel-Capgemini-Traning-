class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}

public class Teacher extends Person {

    double salary;
    String startDate;
    static int Experience;

    Teacher(String firstName, String lastName, double salary, String startDate, int Experience) {
        super(firstName, lastName);
        this.salary = salary;
        this.startDate = startDate;
        this.Experience = Experience;
    }

    // setter and getter methods

    @Override
    public void setFirstName(String firstName) {

        super.setFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {

        super.setLastName(lastName);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getExperience() {
        return Experience;
    }

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Vishal", "dhanure", 15000.00, "12/05/2022", 30);

        System.out.println("first name :" + t1.firstName);
        System.out.println("last name : " + t1.lastName);
        System.out.println("Teacher Salary : " + t1.getSalary());
        System.out.println("Teacher StartDate : " + t1.getStartDate());
        System.out.println("Experience of Teaching Field : " + t1.getExperience());

    }

}

/*
 * o/p
 * 
 * first name :Vishal
 * last name : dhanure
 * Teacher Salary : 15000.0
 * Teacher StartDate : 20
 * Experience of Teaching Field : 30
 * 
 */
