package models;

public class Teacher extends Person {
    private int yearsOfExperience;
    private String subject;
    private int salary;

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Teacher(String name, String surname, int age, String inGender , String subject, int yearsOfExperience, int salary) {
        super( name, surname,age, inGender );
        this.yearsOfExperience = yearsOfExperience;
        this.subject = subject;
        this.salary = salary;
    }

    public void giveRaise(int persent) {
        salary += salary * persent / 100;
    }
    @Override
    public String toString(){

        return super.toString()+"I teach "+subject+" and my salary is "+salary+"$.";
    }
}
