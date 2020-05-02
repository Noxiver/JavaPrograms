import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class loader {

    public static <K, V> K getKey(Map<K, V> list, V value) {
        for (K key : list.keySet()) {
            if (value.equals(list.get(key))) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String something = "", telephone, name;
        System.out.println("list для списка телефонов, exit для выхода");
        TreeMap<String, String> list = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (!something.matches("exit")) {

            System.out.print("Введите имя, телефон или команду: ");
            something = scanner.nextLine().toLowerCase();

                if (something.matches("exit")) {
                    System.out.println("выход из программы...");
                }

                else if(something.equals("list"))
                {
                    printMap(list);
                    continue;
                }

            else if (something.matches("[A-Za-zА-Яа-я]+")){
                    name = something;
                    if(!list.containsKey(name)){
                        System.out.print("Введите телефон: ");
                        telephone = scanner.nextLine();
                        if(!list.containsValue(telephone)) {
                            list.put(name, telephone);
                        }

                        else{System.out.println("Этот телефон уже записан!");}
                    }
                    else {
                        System.out.println(" Имя -  " + name + " Телефон -  " + list.get(name));
                    }
                }

            else if (something.matches("[0-9]+")){
                    telephone = something;
                if(!list.containsValue(telephone)){
                    System.out.print("Введите имя: ");
                    name = scanner.nextLine();
                    list.put(name, telephone);
                }
                else{
                    System.out.println(" Имя - " + getKey(list, telephone) + " Телефон - " + telephone);
                }
                }

            else { System.out.print("Вы ввели неправильные данные");}
        }

        }

        private static void  printMap(Map<String, String> map)
        {
            for(String key : map.keySet()){
                System.out.println("Имя: " + key + " Телефон: " + map.get(key));
            }
        }
    }