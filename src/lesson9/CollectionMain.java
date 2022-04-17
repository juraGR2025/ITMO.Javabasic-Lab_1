package lesson9;

import java.util.*;

public class CollectionMain {
    static ArrayList<String> bankClient = new ArrayList<>(Arrays.asList("Егор", "Олег", "Анна", "Елена",
            "Юрий", "Ирина", "Егор"));
    public static void main(String[] args) throws InterruptedException {
      /*  CollectionsAndMaps cAm = new CollectionsAndMaps();
        cAm.uniqueCollection(bankClient);
        System.out.println("Клиенты банка: " + cAm.uniqueCollection(bankClient));
        cAm.timemanagement();*/

        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        User maxim = new User("Максим");//Здесь создаются экземпляры класса User.
        User mikhail = new User("Михаил");
        User elena = new User("Elena");
        User irina = new User("Ирина");
        User egor = new User("Егор");

        Map<User, Integer> usermap = new HashMap<>();
        usermap.put(maxim, r.nextInt(100));//Здесь в Map usermap добавляются ключи - имена игроков.
        usermap.put(mikhail, r.nextInt(100));
        usermap.put(elena, r.nextInt(100));
        usermap.put(irina, r.nextInt(100));
        usermap.put(egor, r.nextInt(100));

        User.userScore(usermap);
    }
}
