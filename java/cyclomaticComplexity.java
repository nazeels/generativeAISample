public class ComplexCode {
    public static void main(String[] args) {
        int number = 10;
        int result = 0;

        if (number > 0) {
            if (number < 5) {
                switch (number) {
                    case 1:
                        result = 10;
                        break;
                    case 2:
                        result = 20;
                        break;
                    case 3:
                        result = 30;
                        break;
                    case 4:
                        result = 40;
                        break;
                }
            } else if (number == 5) {
                for (int i = 0; i < 5; i++) {
                    result += i;
                }
            } else {
                while (number > 0) {
                    if (number % 2 == 0) {
                        result -= number;
                    } else {
                        result += number;
                    }
                    number--;
                }
            }
        } else {
            do {
                result -= number;
                number++;
            } while (number < 0);
        }

        System.out.println("Result: " + result);
    }
}

