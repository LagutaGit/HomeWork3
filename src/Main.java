// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age1 = 18;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        int tempreture = 5;
        if (tempreture < 5) {
            System.out.println("На улице " + tempreture + " градусов " + "На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + tempreture + " градусов " + "Сегодня тепло, можно идти без шапки");
        }

        //Задача 3
        int speedDriver = 60;
        if (speedDriver > 60) {
            System.out.println("Если скорость " + speedDriver + " придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedDriver + " можно ездить спокойно");
        }

        //Задача 4
        int age = 27;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        //Задача 5
        int ageHuman = 6;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст ребенка равен " + ageHuman + ", то ему нельзя кататься на аттракционе");
        } else if (ageHuman >= 5 && ageHuman < 14) {
            System.out.println("Если возраст ребенка равен " + ageHuman + ", то ему можно кататься на аттракционе в сопровождении");
        } else if (ageHuman >= 14) {
            System.out.println("Если возраст ребенка равен " + ageHuman + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        //Задача 6
        int capacityTrain = 102;
        int sittingPlace = 0;
        int standingPlace = 0;

        if (capacityTrain > 0) {
            if (sittingPlace > 0) {
                System.out.println("Есть сидячие места");
            }
            if (standingPlace > 0) {
                System.out.println("Есть стоячие места ");
            }
        } else {
            System.out.println("Мест нет");
        }

        //Задача 7
        System.out.println("7 Task");
        int one = 6;
        int two = 3;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Первая цифра больше остальных.");
        } else if (two > one && two > three) {
            System.out.println("Вторая цифра больше остальных.");
        } else if (three > one && three > two) {
            System.out.println("Третья цифра больше остальных.");
        }

    }
}