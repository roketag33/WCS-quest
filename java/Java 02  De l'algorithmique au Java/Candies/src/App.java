public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(CandyCount(12.4, 1.2));    }

    public static String CandyCount(double money, double price) {
        int candy = 0;
        if (money > 0 && price > 0) {
            while (money - price >= 0) {
                candy++;
                money -= price;
            }
        }
        return "We have " + candy + " candies";
    }
}
