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