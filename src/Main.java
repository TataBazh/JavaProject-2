public class Main {
    public static void main(String[] args) {
        System.out.println("Бесплатные мили за перелёты");
        System.out.println("За каждые 20 рублей, потраченные на билет, начисляется 1 миля");

        int ticket = 10000; // стоимость билета
        int rouble = 20; // количество рублей для одной бонусной милли
        System.out.println((ticket) + " Стоимость билета");
        System.out.println("Итого:");
        System.out.println((ticket / rouble) + " бонусных миль");
    }
}
