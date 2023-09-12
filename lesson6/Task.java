package practice4.task1;

public class Container<T> {
    private T item;

    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void printType() {
        System.out.println("Тип элемента: " + item.getClass().getName());
    }

    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<Integer>(42);
        Container<String> stringContainer = new Container<>("Привет, мир!");

        intContainer.printType();    // Вывод: Тип элемента: java.lang.Integer
        stringContainer.printType(); // Вывод: Тип элемента: java.lang.String
    }
}


/* В данном коде рефакторим участок кода, который создает экземпляры класса `Container` с использованием обобщений:


Container<Integer> intContainer = new Container<Integer>(42);
Container<String> stringContainer = new Container<>("Привет, мир!");


Применяем принцип полиморфизма, который позволяет создавать объекты обобщенного типа и работать с ними с использованием специфичных для этого типа операций или методов. 

В данном случае мы создаем контейнеры, которые могут содержать целые числа (`Container<Integer>`) и строки (`Container<String>`). Преимущество использования обобщений в данном случае заключается в том, что мы можем использовать общий код для работы с разными типами данных, без необходимости дублирования кода. */