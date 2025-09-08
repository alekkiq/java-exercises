package CourseEnrollment;

import java.io.*;

import CourseEnrollment.model.Student;
import CourseEnrollment.model.Course;
import CourseEnrollment.system.Enrollment;

public class Main {
    private final static String FILENAME = "enrollments.ser";

    public static void main(String[] args) {
        File f = new File(FILENAME);

        Student s = new Student(1, "Alice", 20);
        Course c = new Course("CS101", "Introduction to Computer Science", "Dr. Smith");
        Enrollment e = new Enrollment(s, c, "01.09.2025");

        // serialize test
        try (
            FileOutputStream fos = new FileOutputStream(FILENAME);
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ) {
            out.writeObject(e);
            System.out.println("Serialized\n" + e);
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        // deserialize test
        try (
            FileInputStream fis = new FileInputStream(FILENAME);
            ObjectInputStream in = new ObjectInputStream(fis);
        ) {
            Enrollment loaded = (Enrollment) in.readObject();
            System.out.println("Deserialized:\n" + loaded);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}
