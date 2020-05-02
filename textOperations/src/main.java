import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        System.out.println("Задание №1 \n");
        String str = "America’s music culture has been growing and spreading its popularity for many years. The best known American singers are those who sing to the rock beat. Rock revolutionized music in America in the early 1950s and nowadays, shows no sign of slowing down. There isn’t a corner of the globe that hasn’t felt the drive of American rock." +
                "Two other genres of American music have had a strong hold for the past decade. They are rap and hip hop. Born of inner-city poverty, rap replaces sung melodies, with rhythmically punchy recitation set to an African-American roots. However, they were quickly embraced by white performers. Today rappers appear in TV commercials, movies and various shows." +
                "A look around the pop scene will turn up the presence of \"techno\" music in nightclubs and new \"garage bands\". The Vines and The Strokes are among today’s examples of \"garage bands\" in the USA. Mainstream pop provides its typical lion’s share of entertainment. Along with female vocalists (Sheryl Crowe, Lucinda Williams, Jennifer Paige, etc.), \"boy bands\" (Backstreet Boys, Boys II Men and others) have performed their music since the 1990s." +
                "Due to a great number of radio stations, which play \"the greatest hits of the ’80s, ’90s and today\", older styles of pop continue to be a strong part of America’s music culture. Sounds from even earlier in rock history do not fade away. For instance, the group Sugar Ray combines so many elements from earlier rock styles, so that their music is at once nostalgic and refreshing. Norah Jones, a female singer who captured eight Grammy Awards in 2003, provides a direct link between the softer rock beat and communicative lyrics." +
                "American classical artists have long been known for their remarkable virtuosity. Every year the level of their music art is getting higher. Never before have so many unusually gifted American conductors organized lots of the country’s most prominent orchestras. Among the gifted are the following American conductors Michael Tilson Thomas (the San Francisco Symphony); Leonard Slatkin (the National Symphony Orchestra in Washington D.C.); Robert Spano (the Atlanta Symphony Orchestra); Lorin Maazel (the New York Philharmonic); James Levine (the Boston Symphony Orchestra), etc. Other exclusively talented American conductors like: Marin Alsop, David Robertson, James Conlon, and Kent Nagano reinforce and enrich Americas music culture in the twenty-first century." +
                "As a wrap up America’s music culture does everything possible to unite in it not only people of different music genres, but of different generations, as well.";
        String[] mass = str.split("[\\s.,\\n(;)]");

        for (int i = 0; i < mass.length; i++) {
            if (!mass[i].isEmpty()) System.out.println(mass[i]);
        }

        System.out.println("======================================");
        System.out.println("Задание №2 \n");

        String name = "";
        String lastName = "";
        String patronymic = "";

        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine();
        System.out.println("Введите ФИО");
        if (stroka.matches("[A-Za-zА-Яа-я ]+")) {
            try {
                patronymic = stroka.split(" ")[2];
                lastName = stroka.split(" ")[1];
                name = stroka.split(" ")[0];
                System.out.println("Имя: " + name);
                System.out.println("Фамилия: " + lastName);
                System.out.println("Отчество: " + patronymic);
            } catch (Exception e) {
                System.out.println("Неверный формат данных");
            }

        } else System.out.println("Вы использовали недопустимый символ");

        System.out.println("======================================");
        System.out.println("Задание №3 \n");

        String telephone = in.nextLine();
        telephone = telephone.replaceAll("[+\\-()\\s ]*", "");
        System.out.println("Телефон:" + telephone);

    }
}