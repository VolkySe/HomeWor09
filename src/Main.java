import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int minPayment;
        int maxPayment;

        System.out.println();
        System.out.println("task1");
        int[] allPayments = new int[5];
        minPayment = 100;
        maxPayment = 900;
        int paymentAmounts = 0;

        for (int i = 0; i < allPayments.length; i++) {
            allPayments[i] = rnd(minPayment, maxPayment);
            paymentAmounts += allPayments[i];
        }
        System.out.println(Arrays.toString(allPayments)); //не требуется по условию - для контроля
        System.out.println("Сумма " + allPayments.length + " выплат равна: " + paymentAmounts + " руб.");

        System.out.println();
        System.out.println("Task2");
        minPayment = 1000;
        maxPayment = 2000;

        int[] allCosts = new int[5];
        for (int i = 0; i < allCosts.length; i++) {
            allCosts[i] = rnd(minPayment, maxPayment);
        }
        System.out.println(Arrays.toString(allCosts));//не требуется по условию - для контроля

        int costMin = allCosts[0];
        int costMax = allCosts[0];
        for (final int current : allCosts) {
            if (costMin > current) {
                costMin = current;
            }
            if (costMax < current) {
                costMax = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + costMin +
                " руб. Максимальная сумма трат за неделю составила " + costMax +
                " руб.");

        System.out.println();
        System.out.println("task3");
        allPayments = new int[5];
        minPayment = 100;
        maxPayment = 900;
        paymentAmounts = 0;

        for (int i = 0; i < allPayments.length; i++) {
            allPayments[i] = rnd(minPayment, maxPayment);
            paymentAmounts += allPayments[i];
        }
        System.out.println(Arrays.toString(allPayments)); //не требуется по условию - для контроля
        System.out.println("Средняя сумма трат за месяц составила " +
                (float) paymentAmounts / (float) allPayments.length +
                " руб."); //считаю, что в пятую неполную неделю затраты тоже были

        System.out.println();
        System.out.println("Task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}