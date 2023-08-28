public class Cat implements Animal, Pet, ComparableCat, OverloadCat {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void greet() {
        String ownerName;
        if (owner != null) {
            ownerName = owner.getName();
        } else {
            ownerName = "нет владельца";
        }
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + ownerName + ".");
    }

    @Override
    public void play() {
        System.out.println("Кот играет.");
    }
}