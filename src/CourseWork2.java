import java.util.Scanner;
public class CourseWork2 {

        static int Method (int number) {
        StringBuilder numbers = new StringBuilder();  // создание строки которая будет помещать наши числа в обратном порядке
        while (number!=0) {                           // цикл который будет выполняться до тех пор пока number не равно нулю
            if (number%10==0) {                       // условный оператор для проверки наявности нолей в введенном числе и выход при обнаружении
                System.out.println("Вы ввели недопустимое число, так как содержит: ");
                return 0;
            }
            else {
                numbers.append(number % 10);          // добавляем в строку numbers остаток от деления 10 нашего числа
                number /= 10;                         // присваеваем нашему числу значение оставшихся чисел которые нужно будет вывести через %10
            }
        }
        System.out.println("Ваше число в обратном порядке: ");
        return Integer.parseInt(numbers.toString());   //возврат нашей строки через класс обвертку так как метод должен вернуть число, а не строку
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать ! \nВы попали в курсовую работу: \"Напишите метод, который принимает число, которое " +
                "не содержит нулей \nи возвращает цифры в " + "обратном порядке.\" ");

        System.out.println("Введите любое целое число");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(Method(number));
    }
}
