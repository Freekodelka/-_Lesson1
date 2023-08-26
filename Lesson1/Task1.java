class Cat {
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

    public void greet() {
        String ownerName = owner != null ? owner.getName() : "нет владельца";
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + ownerName + ".");
    }
}

class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 3);
        Cat cat2 = new Cat("Мурзик", 2);

        Owner owner1 = new Owner("Иван");
        Owner owner2 = new Owner("Мария");

        cat1.setOwner(owner1);
        cat2.setOwner(owner2);

        cat1.greet();
        cat2.greet();
    }
}