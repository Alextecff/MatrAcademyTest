public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menu();

        Calculator calculator = new Calculator(menu);
        calculator.calculate();

    }
}
