public class Calculator {
    private Menu menu;

    public Calculator(Menu menu) {
        this.menu = menu;
    }

    Converter converter = new Converter();

    private int[] result = new int[2];

    public void calculate() {

        if ((menu.getValues()[0].getBytes()[0] >= 48 && menu.getValues()[0].getBytes()[0] <= 57) &&
                (menu.getValues()[1].getBytes()[0] >= 48 && menu.getValues()[1].getBytes()[0] <= 57)) {
            result[0] = Integer.parseInt(menu.getValues()[0]);
            result[1] = Integer.parseInt(menu.getValues()[1]);
        } else {
            for (int i = 0; i < 2; i++) {
                converter.transform(menu.getValues()[i]);
                converter.takeArabianNumber(converter.getConvertArray());
                result[i] = converter.getResult();
            }
        }

        while (true) {
            switch (menu.getChoice()) {
                case 1: {
                    System.out.println("Result: " + (result[0] + result[1]));
                    return;
                }
                case 2: {
                    System.out.println("Result: " + (result[0] - result[1]));
                    return;
                }
                case 3: {
                    System.out.println("Result: " + (result[0] * result[1]));
                    return;
                }
                case 4: {
                    System.out.println("Result: " + (result[0] / result[1]));
                    return;
                }
                default:
                    System.out.println("Wrong choice!");
                    menu.menu();
                    break;
            }
        }
    }
}