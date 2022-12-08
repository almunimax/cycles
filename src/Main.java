
public class Main {
    public static void main(String[] args) {

        // задание 1
        System.out.println("задание 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        // задание 2
        System.out.println("задание 2");

        for (int z = 10; z >= 1; z--) {
            System.out.println("Итерация цикла " + z);
        }
        // задание 3
        System.out.println("задание 3");

        for (int x = 0; x < 17; x = x + 2) {
            System.out.println("Итерация цикла " + x);
        }
        // задание 4
        System.out.println("задание 4");

        for (int с = 10; с >= -10; с = с - 1) {
            System.out.println("Итерация цикла " + с);
        }

        // задание 5
        System.out.println("задание 5");

        for (int v = 1904; v <= 2096; v = v + 4) {
            System.out.println(v + " год является високосным");
        }

        // задание 6
        System.out.println("задание 6");

        for (int s = 7; s <= 98; s = s + 7) {
            System.out.println("Итерация цикла " + s);
        }

        // задание 7
        System.out.println("задание 7");

        for (int d = 1; d <= 512; d = d * 2) {
            System.out.println("Итерация цикла " + d);
        }

        // задание 8
        System.out.println("задание 8");

        int accumulation = 29000;
        int total1 = 0;
        for (int n = 1; n <= 12; n++) {
            total1 = total1 + accumulation;
            System.out.println("Месяц " + n + " ,сумма накоплений равна " + total1 + " рублей.");
        }
        System.out.println(total1);

        // задание 9
        System.out.println("задание 9");

        int salary = 65535;
        int total = 0;
        for (int b = 0; b < 12; b++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + b + " ,сумма накоплений равна " + total + " рублей.");
        }
        System.out.println(total);

        // задание 10
        System.out.println("задание 10");

        for ( int w = 1; w <=10; w++){
            int e = 2;

            System.out.println(e + "*" + w + "=" + w*e);
        }
    }

}