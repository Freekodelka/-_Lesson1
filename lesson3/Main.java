import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 3);
        Cat cat2 = new Cat("Мурзик", 2);
        Cat cat3 = new Cat("Рыжик", 5);

        List<Cat> cats = Arrays.asList(cat1, cat2, cat3);

        Collections.sort(cats);

        for (Cat cat : cats) {
            System.out.println(cat.getName() + " - " + cat.getAge());
        }
    }
}