package ru.geekbrains.java.lesson1;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(compute(2,1,1,3));
        System.out.println(chek10to20(10, 11));
        signOfNumber(-35);
        System.out.println(isNegative(-78));
        sayHello("Димасик");
        leapYear(1996);
    }
    //Вычисление:
    public static float compute (float a, float b, float c, float d) {
        return a * (b + (c/d));
    }
    //Проверка вхождения суммы в диапазон:
    public static boolean chek10to20 (int a, int b) {
        /* длинное решение:
        int c = a + b; //здесь c - локальная переменная
        if (c >= 10 && c <= 20) return true;
        else return false;
        */
        //В одну строку:
        return ((a + b) >= 10 && (a + b) <= 20);
    }
    //Определение знака числа:
    public static void signOfNumber (int a) {
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }
    //Число отрицательное?:
    public static boolean isNegative (int a) {
        /* длинное решение:
        boolean b = false;
        if (a < 0) b = true;
        return b;
        */
        //В одну строку:
        return a < 0;
    }
    //Приветствие:
    public static void sayHello (String str) {
        System.out.println("Привет, " + str + "!");
    }
    //Високосный или нет?:
    public static void leapYear (int year) {
        int a = year % 400;
        if (a == 0) System.out.println(year + " год - редкий високосный, раз в 400 лет случается!");
        else {
            a = year % 4;
            int b = year % 100;
            if (a == 0 && b != 0) System.out.println(year + " год - високосный.");
            else System.out.println(year + " год - не високосный.");
        }
    }
}
