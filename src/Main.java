// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Ты можешь водить!");
        }
        else {
            System.out.println("Нельзя");
        }

        int ageSecond = 17;
        if (ageSecond >= 18) {
            System.out.println("Ты можешь водить");
        }

        if (ageSecond < 18) {
            System.out.println("Ты не можешь водить");
        }

        //И
        int weight = 84;
        if (weight >= 55 && weight <= 85) {
            System.out.println("Вес в норме");
        }
        else {
            System.out.println("Нужно что-то думать");
        }

        //Или
        int tempreture = 35;
        if (tempreture < 0 || tempreture > 40){
            System.out.println("Экстремальные условия");
        }

        //boolean
        int peopleInRoom = 55;
        boolean roomIsNotSuitable = peopleInRoom < 20 || peopleInRoom > 60;
        if (roomIsNotSuitable) {
            System.out.println("В аудитории недостаточно или слишком много людей");
        }
    }
}