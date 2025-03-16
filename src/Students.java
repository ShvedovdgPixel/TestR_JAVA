import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Students{
    ArrayList<Student> students;

    public Students(){
        students = new ArrayList<>();
    }
    public void addStudent(){
        String n = input("Введите имя студента:");
        int a = Integer.parseInt( input("Введите возраст студента:"));
        int g = Integer.parseInt(input("Введите балл студента"));
        Student s = new Student(n,a,g);
        students.add(s);
    }
    public void deleteByName(){
        String n = input("Введите имя для удаления:");
        for (int i = 0 ;i < students.size();i++){
            if (Objects.equals(students.get(i).getName(), n)) {
                students.remove(students.get(i));
                break;
            }
        }
    }
    public void findStudent(){
        String n = input("Введите имя для поиска:");
        Student temp = null;
        for (Student student : students) {
            if (Objects.equals(student.getName(), n)) {
                temp = student;
                break;
            }
        }
        if (temp == null){
            System.out.println("Нет такого студента");
        }else {
            System.out.println("    Имя студента:       "+ temp.getName());
            System.out.println("    Возраст студента:   "+ temp.getAge());
            System.out.println("    Балл студента:      "+ temp.getGrade());
        }
    }

    public void getAverage(){
        float all = 0;
        for (Student student : students) {
            all += student.getGrade();
        }
        System.out.println("    Средняя оценка:     "+ all/students.size());
    }
    public void all(){
        System.out.println("Номер   Имя         Возраст     Оценка:");
        for (int i = 0 ;i < students.size();i++){
            System.out.println( "    "+(i+1)+"  "+students.get(i).getName()+
                                "       "+students.get(i).getAge()+
                                "       "+students.get(i).getGrade());
        }
    }
    private String input(String s){
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        return scanner.nextLine();
    }
}
