public interface OverloadCat {
    void greet();

    default void greet(int age) {
        System.out.println("Мяу! Меня зовут " + getName() + ". Мне " + age + " года(лет).");
        play();
    }

    void play();

    String getName();
}