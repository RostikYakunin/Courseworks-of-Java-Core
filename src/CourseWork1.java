import java.util.Scanner;

public class CourseWork1 {

    static int NumberSumNumber (int number) {

        int sum = 0;
                                 // создание переменной которая будет считать наши числа
        while (number!=0) {      // цикл который будет выполняться до тех пор пока number не равно нулю
        sum += number %10;       // добавляем в переменную sum остаток от деления 10 нашего числа
        number /= 10;            // присваеваем нашему числу значение оставшихся чисел которые нужно будет вывести через %10
        }
        return sum;              // возврат суммы чисел почле окончания работы цикла
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать ! Вы попали в курсовую работу: \"Напишите метод, который " +
                           "принимает число и возвращает сумму цифр данного числа\" ");

        System.out.println("Введите любое целое число");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println("Возвращенная сумма цифр введенного числа: " + NumberSumNumber(number));
    }
}
