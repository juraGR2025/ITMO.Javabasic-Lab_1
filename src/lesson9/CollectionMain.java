package lesson9;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionMain {
    static ArrayList<String> bankClient = new ArrayList<>(Arrays.asList("Егор", "Олег", "Анна", "Елена",
            "Юрий", "Ирина", "Егор"));
    public static void main(String[] args) throws InterruptedException {
        CollectionsAndMaps cAm = new CollectionsAndMaps();
        cAm.uniqueCollection(bankClient);
        System.out.println("Клиенты банка: " + cAm.uniqueCollection(bankClient));
        cAm.timemanagement();
    }
}
