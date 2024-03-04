import java.util.Scanner;

class College {
    String CollegeName;
    String CollegeLoc;

    College(String CollegeName, String CollegeLoc) {
        this.CollegeLoc = CollegeLoc;
        this.CollegeName = CollegeName;
    }

    College() {

    }

    void set_collegename(String CollegeName) {
        this.CollegeName = CollegeName;

    }

    void set_collegeLoc(String CollegeLoc) {
        this.CollegeLoc = CollegeLoc;

    }

    String get_collegename() {
        return CollegeName;

    }

    String get_collegeLoc() {
        return CollegeLoc;
    }

}

class Student extends College {
    private int studentId;
    private String studentName;
    private College collegeName;

    Student(int studentId, String studentName, College collegeName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.collegeName = collegeName;

    }

    void displayStudentInfo() {
        System.out.println(
                studentId + " " + studentName + " " + collegeName.CollegeName + " " + collegeName.get_collegeLoc());
    }

}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student Id: ");
        int id = sc.nextInt();
        System.out.print("Enter student name: ");
        String name = sc.next();
        System.out.print("Enter college name: ");
        String cname = sc.next();
        System.out.print("Enter college Location: ");
        String location = sc.next();
        System.out.print("Enter student1 Id: ");
        int id1 = sc.nextInt();
        System.out.print("Enter student1 name: ");
        String name1 = sc.next();
        System.out.print("Enter college1 name: ");
        String cname1 = sc.next();
        System.out.print("Enter college1 Location: ");
        String location1 = sc.next();
        College obj1 = new College(cname, location);
        College obj2 = new College(cname1, location1);

        Student s1 = new Student(id, name, obj1);
        Student s2 = new Student(id1, name1, obj2);
        s1.displayStudentInfo();
        s2.displayStudentInfo();

    }

}
