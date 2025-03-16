import java.util.ArrayList;

public class Student{

    private final String name;
    private final int age;
    private final int grade;

    public Student(String name_of_student, int age_of_student,int grade_of_student){
        name = name_of_student;
        age = age_of_student;
        grade = grade_of_student;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getGrade(){
        return grade;
    }
}

