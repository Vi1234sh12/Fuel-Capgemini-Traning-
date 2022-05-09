/*

 */

class student {
    int id;
    String name;

    student(int a , String b)
    {
        id = a;
        name = b;
    }

    public void display()
    {
        System.out.println("student id : "+id );
        System.out.println("student name : "+name);

    }
}

public class Exercise1 {
    public static void main(String[] args) {
   student st = new student(46156,"Vishal Dhanure");
   st.display();
    }
}
