package models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private int studentID;
    private List<Integer> grades= new ArrayList<>();
    private static int id_gen = 1;

    private void generateID() {
        studentID = id_gen++;
    }

    public Student(String name, String surname, int age, String inGender) {
        super(name, surname,age, inGender);

        generateID();

    }

    public void addGrade(int grade){
        if (grade<0 || grade>100){
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        else {
            grades.add(grade);
        }
    }
    public double calculateGPA(){
        double sum=0;
        for (int grade: grades){
            sum+=grade;
        }
        return (sum/(grades.size()*100))*4;
    }

    DecimalFormat df= new DecimalFormat("0.00");


    @Override
    public String toString(){
        return super.toString()+"I am a student with ID "+ studentID+" and my average GPA is "+df.format(calculateGPA())+".";
    }
}
