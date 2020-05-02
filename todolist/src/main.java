import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String command = "";
        ArrayList<String> list = new ArrayList<>() {{
            add("Первоe дело");
            add("Второе дело");
            add("Третье дело");
            add("Четвертое дело");
            add("Пятое дело");
        }};
        System.out.println(list);
        System.out.println("Help для списка команд, exit для выхода");
        while (!command.matches("exit")) {
            String thing = "";
            int number = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите команду : ");
            command = in.nextLine();

            if (command.matches("edit [0-9]+ [а-яА-Яa-zA-Z ]+")) {
                String[] stroka = command.split(" ");
                number = Integer.parseInt(stroka[1]);
                if (number-1 <= list.size()){
                    for (int i = 2; i < stroka.length; i++) {
                        thing += stroka[i] + " ";
                    }
                    list.set(number-1, thing);}
                else {
                    System.out.println("Вы ввели некоректные данные");
                }
            }

            else if (command.matches("help")) {
                System.out.println(" edit номер дело - изменить дело\n list - вывести список дел\n add номер - нобавить дело на номер\n add - добавить дело\n delete номер - удалить дело\n");
            }

            else if (command.matches("add [а-яА-Яa-zA-Z ]+")) {
                String[] stroka = command.split(" ");
                for (int i = 1; i < stroka.length; i++) {
                    thing += stroka[i] + " ";
                }
                list.add(thing);}


            else if (command.matches("add [0-9]+ [а-яА-Яa-zA-Z ]+")) {
                String[] stroka = command.split(" ");
                number = Integer.parseInt(stroka[1]);
                if (number-1 <= list.size()){
                    for (int i = 2; i < stroka.length; i++) {
                        thing += stroka[i] + " ";
                    }
                    list.add(number-1, thing);}
                else {
                    System.out.println("Вы ввели некоректные данные");
                }
            }

            else if (command.matches("list")){
                for( String item : list) {
                    System.out.println(item);
                }
            }

            else if (command.matches("delete [0-9]+")){
                String[] stroka = command.split(" ");
                number = Integer.parseInt(stroka[1]);
                if (number-1 <= list.size()){
                    for (int i = 2; i < stroka.length; i++) {
                        thing += stroka[i] + " ";
                    }
                    list.remove(number-1);}
                else {
                    System.out.println("Вы ввели некоректные данные");
                }
            }

            else if (command.matches("exit")) {
                System.out.println("выход из программы...");
            }

            else{
                System.out.println("Неправильная команда");
            }
        }
    }
}