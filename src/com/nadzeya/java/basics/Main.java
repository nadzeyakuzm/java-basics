package com.nadzeya.java.basics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException   {
	    task_1();
	    task_2();
        task_3();
        task_4();
        task_5();
    }

    /*
1) Создать по одной переменной каждого примитивного типа, присвоить им значения.
Попробовать совершить какие-либо действия над ними (арифметические, логические, сравнения).
Вывести на экран результаты этих действий.
    */

    public static void task_1() {
        System.out.println("\nTask 1:\n");
        int a = 5;
        int b = 2;
        int sum = a + b;
        int sub = a - b;
        int mult = a * b;
        float f_div = a / b;
        double d_div = a / b;
        int rem = a % b;
        boolean eq = a == b;
        boolean equ = a < (b + 4);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Float Division: " + f_div);
        System.out.println("Double Division: " + d_div);
        System.out.println("Remainder: " + rem);
        System.out.println("Equal: " + eq);
        System.out.println("Equation: " + equ);
        System.out.println("\nEnd of Task 1.");
    }

    /*
2) Создать переменную r целого типа. Присвоить ей какое-то значение. r – радиус окружности.
Проверьте, что r – положительно. Если так – то вычисляем площадь круга и длину окружности, если нет – выведем на консоль сообщение о невалидности входных данных.
     */

    public static void task_2() throws IOException   {
        System.out.println("\nTask 2:\n");

        System.out.println("Please, enter Circle Radius:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String radius = reader.readLine();

        int r = Integer.parseInt(radius);
        double PI = 3.14;

        if (r >= 0) {
            double area = PI * r * r;
            double length = 2 * PI * r;
            System.out.println("Circle Area: " + area);
            System.out.println("Circle Length: " + length);
        } else {
            System.out.println("Invalid Data.");
        }

        System.out.println("\nEnd of Task 2.");
    }

    /*
3) Дана температура в градусах. Вывести на экран , что лучше надеть: куртку, свитер, майку или ничего.
Например,при температуре менее 10 – куртку, от 10 до 15 – ветровку, от 16 до 20 свитер,от 21 до 30 майку, выше 30 – ничего.
     */

    public static void task_3() throws IOException   {
        System.out.println("\nTask 3:\n");

        System.out.println("Please, enter Weather temperature:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temperature = reader.readLine();

        int temp = Integer.parseInt(temperature);

        if (temp < 10) {
            System.out.println("Наденьте куртку.");
        } else {
            if (temp > 10 && temp <= 15) {
                System.out.println("Наденьте ветровку.");
            } else {
                if (temp > 15 && temp <= 20) {
                    System.out.println("Наденьте свитер.");
                } else {
                    if (temp > 20 && temp <= 30) {
                        System.out.println("Наденьте майку.");
                    } else {
                        System.out.println("Ничего не надевайте.");
                    }
                }
            }
        }

        System.out.println("\nEnd of Task 3.");
    }

    /*
    4) Даны зарплаты трех людей salary1, salary2 и salary3. Найти разницу между максимальной и минимальной зарплатой.
    */

    public static void task_4() throws IOException   {
        System.out.println("\nTask 4:\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter Salary 1:");
        String sal1 = reader.readLine();
        System.out.println("Please, enter Salary 2:");
        String sal2 = reader.readLine();
        System.out.println("Please, enter Salary 3:");
        String sal3 = reader.readLine();

        double salary1 = Double.parseDouble(sal1);
        double salary2 = Double.parseDouble(sal2);
        double salary3 = Double.parseDouble(sal3);

        // max - min

        double max = salary1;
        if (salary2 > max) {
            max = salary2;
        }
        if (salary3 > max) {
            max = salary3;
        }

        double min = salary1;
        if (salary2 < min) {
            min = salary2;
        }
        if (salary3 < min) {
            min = salary3;
        }

        double subtraction = max - min;
        System.out.println("Max and Min salary difference: " + subtraction);

        System.out.println("\nEnd of Task 4.");
    }

    /*
5) Даны 2 числа, a – целое, n – целое положительное.
Используя цикл, найти результат возведения a в степень n.
 */

    public static void task_5() throws IOException   {
        System.out.println("\nTask 5:\n");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter a:");
        String a_temp = reader.readLine();
        System.out.println("Please, enter n:");
        String n_temp = reader.readLine();

        int a = Integer.parseInt(a_temp);
        int n = Integer.parseInt(n_temp);

        if (n >= 0) {
           int result = 1;
           while(n > 0) {
                result *= a; // result = result * a;
               n--;
           }
            System.out.println("Result: " + result);
        } else{
            System.out.println("Wrong n.");
        }


        System.out.println("\nEnd of Task 5.");
    }
}
