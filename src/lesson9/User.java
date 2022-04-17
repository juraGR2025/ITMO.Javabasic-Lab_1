package lesson9;

import java.util.*;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void userScore(Map map){
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        Set<User> keys = map.keySet();
        for (User user : keys) {
            if (userName.equals(user.getName())) {
                System.out.println("У пользователя  " + userName +  " " + map.get(user) + " очков");
                return;
            }
    }
        System.out.println("Пользователь " + userName + " не делал ставки.");
        return;
    }
}
