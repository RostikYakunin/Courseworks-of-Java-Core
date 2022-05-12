import java.util.Scanner;

public class CourseWork4 {

   static int Method (String str) {
       int sum = 0;                              // создание переменной для подсчета значений букв
       for (int i = 0;i < str.length(); i++){    // цикл который проходиться по длинне строки используя индексы букв
           sum += str.charAt(i);                 // сумирование значений букв найденых по индексу i
       }
       return sum;                               // возврат суммы
   }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в курсовую работу №4");
        System.out.println("Задание курсовой: Создайте программу, которая выводит в консоль число имени");
        System.out.println("Введите имя");

        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println("Число имени " + str + " = " + Method(str));
    }
}
