import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Answer {
    ArrayList<Student> addStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Билли Палыч"));
        students.add(new Student("Стив Рембо"));
        students.add(new Student("Виталий Цаль"));
        students.add(new Student("Погорелов Игорь"));
        students.add(new Student("Сергей Даубига"));
        return students;
    }

    void randomStudent() {
        System.out.println("Введите команду /p для просмотра студентов\n " +
                "Введите команду /r для оценки студента\n " +
                "Введите команду /q для выходи из программы");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayList<Student> students = addStudents();
        Random random = new Random();
        while (true) {
            if (command.equals("/p")) {
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).getList().size() == 0) {
                        System.out.println(students.get(i).getName() + " " + students.get(i).getList() + " " + " - ");
                    } else {
                        System.out.println(students.get(i).getName() + " " + students.get(i).getList() + " " + "Average:" + " " + students.get(i).average());
                    }
                }
            }
            if (command.equals("/q")) {
                System.exit(0);
            }
            if (command.equals("/r")) {
                int randomNumber = (int) (Math.random() * students.size());
                Student rndstudent = students.get(randomNumber);
                System.out.println(rndstudent.getName());
                rndstudent.addMark();
                System.out.println(rndstudent.getName() + " : " + rndstudent.average());
            }
            if (command.length() > 2 || command.isEmpty() || Checker.isInteger(command)) {
                System.out.println("Попробуйте иную команду");
            }
            command = scanner.nextLine();
        }
    }

}
