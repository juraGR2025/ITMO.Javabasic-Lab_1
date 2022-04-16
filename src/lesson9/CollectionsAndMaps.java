package lesson9;

import java.util.*;

public class CollectionsAndMaps {
    public Set<String> uniqueCollection(List<String> S){
        Set<String> set = new HashSet<>(S);
        return set;
    }
    public void timemanagement() throws InterruptedException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000001; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        Random r = new Random();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(r.nextInt(1000000));
        }
        Thread.sleep(1000);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;

        System.out.println("Перебор в arrayList длится: " + elapsed);

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.get(r.nextInt(1000000));
        }
        Thread.sleep(1000);
        finish = System.currentTimeMillis();
        elapsed = finish - start;

        System.out.println("Перебор в linkedList длится: " + elapsed);

        return;
    }

}
