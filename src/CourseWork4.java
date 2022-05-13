import java.util.Scanner;

public class CourseWork4 {

    static int Method (String str) {
        char [] strArray = str.toCharArray();                          // создание масива char и перевод стринги в него
        int sum=0;                                                     // переменная для суммы чисел
        for (int i = 0; i < strArray.length; i++) {                    // цикл который идет по длинне массива
            if (i!=2 & i!=5) {                                         // условие при котором программа игнорирует прибавление '.' или '/'
                sum += Integer.parseInt(String.valueOf(strArray[i]));  // парс в тип int полученого значения в массиве по индексу 'i'
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в курсовую работу №4");
        System.out.println("Тема курсовой: Создайте программу, которая выводит в консоль число даты. " +
                           "Например, на вход 02/11/1995 = 0 + \n" +
                            "2 + 1 + 1 + 1 + 9 + 9 + 5 = 28 на выход = 28\n");
        System.out.println("Введите любую дату в формате дд/мм/гггг (допускается использование точки т.е. дд.мм.гггг)");

        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println("Число даты " + str + " = " + Method(str));

    }
}
