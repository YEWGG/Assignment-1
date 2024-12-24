import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;


import models.Person;
import models.School;
import models.Student;
import models.Teacher;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Locale.setDefault(Locale.US);
        File file = new File("src/students.txt");

        Scanner sc = new Scanner(file);
        School school = new School();
        while (sc.hasNextLine()) {
            Student student = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next());
            while (sc.hasNextInt()) {
                student.addGrade(sc.nextInt());
            }
            school.addMember(student);
        }
        File file2 = new File("src/teachers.txt");

        Scanner sc2 = new Scanner(file2);
        while (sc2.hasNextLine()) {
            Teacher teacher = new Teacher(sc2.next(), sc2.next(), sc2.nextInt(), sc2.next(), sc2.next(),
                    sc2.nextInt(), sc2.nextInt());
            if( teacher.getYearsOfExperience()>10){
                teacher.giveRaise(teacher.getYearsOfExperience());
            }

            school.addMember(teacher);
        }
        school.sortMembers();
        System.out.println(school);

    }
}