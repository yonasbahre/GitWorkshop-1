import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("*** Welcome to Chick-Fil-A ***");
        int option = 1;
        Order order = new Order();

        while (option != 0) {
            System.out.println("");
            System.out.println("1. Drink");
            System.out.println("2. Fries");
            System.out.println("3. Salad");
            System.out.println("4. Shake");
            System.out.println("5. Chicken Nuggies");
            System.out.println("6. Chicken sandwich");
            System.out.println("0. Done");
            System.out.print("Select an option: ");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option) {
                case 0:
                    order.printOrder();
                    break;
                case 6:
                    order.addChickenSandwich();
                //Eric
                //put your case below this comment
                case 4:
                    order.addShake();
            }
        }
    }
}
