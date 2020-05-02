import java.sql.SQLOutput;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("~~~~Задание №1~~~~");
        String[] colors = {"Красный", "Оранжевый", "Жёлтый", "Зелёный", "Голубой", "Синий", "Феолетоый"};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("----Переварачиваю массив----");
        System.out.println("Вариант №1");
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }


        System.out.println("==================");
        System.out.println("Вариант №2");

        int a = colors.length;
        String temp;

        for (int i = 0; i < a / 2; i++) {
            temp = colors[a - i - 1];
            colors[a - i - 1] = colors[i];
            colors[i] = temp;
        }

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
        System.out.println("==============================");
        System.out.println("~~~~Задание №2~~~~");
        double t;
        double summ = 0;
        int healthy = 0;

        double[] pacient = new double[30];
        for (int i = 0; i < pacient.length; i++) {
            t = (32 + 8 * Math.random());
            double temperature = Math.round(t * 10.0) / 10.0;
            pacient[i] = temperature;
            summ = summ + temperature;
            if (temperature >= 36.2 && temperature < 36.9) {
                healthy++;
            }
        }


        double sr = summ / 30;
        System.out.println("Средняя температура пациентов = " + sr);
        System.out.println("Количество здоровых пациентов - " + healthy);


        System.out.println("==============================");
        System.out.println("~~~~Задание №3~~~~");
        System.out.println("==============================");
        Scanner in = new Scanner(System.in);
        System.out.print("введите высоту креста ");
        int height = in.nextInt();
        System.out.print("введите ширину креста ");
        int width = in.nextInt();
        String[][] mass = new String [height][width];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j <  mass[height-1].length; j++) {
                if (i == j || j == width - i - 1) {
                    mass[i][j] = "X";
                } else {
                    mass[i][j] = " ";
                }
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
    }
}