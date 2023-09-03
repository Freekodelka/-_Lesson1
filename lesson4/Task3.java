/* Задача 3 (по желанию):Напишите обобщенную функцию getMax, которая принимает два параметра типа T и возвращает максимальное значение из них.

В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, ограниченных интерфейсом Comparable. Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.

В методе main мы вызываем getMax с разными типами данных: целое число (Integer), число с плавающей запятой (Double) и строку (String). В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.

Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, сохраняя при этом безопасность типов */

class Main {
    public static <T extends Comparable<T>> T getMax(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        // Примеры вызова функции getMax с различными типами данных
        Integer maxInt = getMax(2, 5); 
        Double maxDouble = getMax(3.5, 1.2); 
        String maxString = getMax("Привет", "Мир");

        System.out.println(maxInt);
        System.out.println(maxDouble);
        System.out.println(maxString);
    }
}