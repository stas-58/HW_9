public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] spending = new int[5];
        spending[0] = 373000;
        spending[1] = 469000;
        spending[2] = 671500;
        spending[3] = 364399;
        spending[4] = 471399;
        int spendingByMonth = 0;
        for (int i = 0; i < spending.length; i++) {
            spendingByMonth = spendingByMonth + spending[i];
        }
        System.out.println("Сумма трат за месяц составила " + spendingByMonth + " рублей");
        System.out.println(" ");


        System.out.println("Задача 2");
        int[] spending2 = new int[5];
        spending2[0] = 573044;
        spending2[1] = 569064;
        spending2[2] = 671513;
        spending2[3] = 765663;
        spending2[4] = 371394;

        int maxSpending = 0;
        for (int i : spending2) {
            if (i > maxSpending)
                maxSpending = i;
        }

        var minSpending = spending2[0];
        for (int j : spending2) {
            if (j < minSpending) {
                minSpending = j;
            }

        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpending + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxSpending + " рублей");
        System.out.println(" ");


        System.out.println("Задача 3");
        int[] spending3 = new int[5];
        spending3[0] = 273400;
        spending3[1] = 264050;
        spending3[2] = 176507;
        spending3[3] = 464399;
        spending3[4] = 371399;
        int spendingByMonth3 = 0;
        for (int i = 0; i < spending3.length; i++) {
            spendingByMonth3 = spendingByMonth3 + spending3[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + (float) (spendingByMonth3) / 4 + " рублей");
        System.out.println(" ");


        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}