// Базовый класс ГорячийНапиток
class HotBeverage {
    private String name; // название напитка
    private int volume; // объём напитка

    public HotBeverage(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}

// Наследник класса ГорячийНапиток с дополнительным полем температура
class HotDrink extends HotBeverage {
    private int temperature; // температура напитка

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}

// Интерфейс ТорговыйАвтомат
interface VendingMachine {
    public HotBeverage getProduct(String name, int volume);
    public HotDrink getProduct(String name, int volume, int temperature);
}

// Класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
class HotBeverageMachine implements VendingMachine {
    @Override
    public HotBeverage getProduct(String name, int volume) {
        return new HotBeverage(name, volume);
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        return new HotDrink(name, volume, temperature);
    }
}

class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new HotBeverageMachine();

        // Создание объектов Горячих Напитков
        HotBeverage beverage1 = vendingMachine.getProduct("Чай", 200);
        HotDrink drink1 = vendingMachine.getProduct("Кофе", 300, 60);

        // Вывод информации о напитках
        System.out.println("Напиток 1: " + beverage1.getName() + ", объём: " + beverage1.getVolume());
        System.out.println("Напиток 2: " + drink1.getName() + ", объём: " + drink1.getVolume() + ", температура: " + drink1.getTemperature());
    }
}