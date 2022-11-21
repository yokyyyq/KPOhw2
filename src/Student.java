import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Student {
    private List<Integer> marks;
    private String name;

    String getName() {
        return name;
    }

    List<Integer> getList() {
        return marks;
    }

    double average() {
        var marks = getList();
        double markssum = 0;
        double numberofmarks = 0;
        for (int i = 0; i < marks.size(); i++) {
            markssum += marks.get(i);
            numberofmarks += 1;
        }
        return markssum / numberofmarks;
    }

    void addMark() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество оценок за семинар");
         int amountofmarks = scanner.nextInt();
        System.out.println("Введите оценки/ку за семинар");
        for (int i = 0; i < amountofmarks; i++) {
            int mark = scanner.nextInt();
            marks.add(mark);
        }
    }

    Student(String name) {
        this.name = name;
        this.marks = new ArrayList<>();
    }
}

