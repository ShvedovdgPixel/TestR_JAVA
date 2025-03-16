import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Students students = new Students();
    public static void main(String[] args) {

        run();

    }
    private static void run(){
        Scanner scanner = new Scanner(System.in);
        boolean exit_flag = false;
        while (!exit_flag){
            System.out.println("Введите число:");
            System.out.println("    1)Список всех студентов");
            System.out.println("    2)Добавить студента");
            System.out.println("    3)Удалить по имени");
            System.out.println("    4)Инфо по имени");
            System.out.println("    5)Средний балл");
            System.out.println("    6)Выход");

            switch (scanner.nextLine()){
                case "1":{
                    students.all();
                    break;
                }
                case "2":{
                    students.addStudent();
                    break;
                }
                case "3":{
                    students.deleteByName();
                    break;
                }
                case "4":{
                    students.findStudent();
                    break;
                }
                case "5":{
                    students.getAverage();
                    break;
                }
                case "6":{
                    exit_flag = true;
                    break;
                }
                default:
            }
        }
    }
}

