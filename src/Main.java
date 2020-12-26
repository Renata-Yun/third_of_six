import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        int kek1 = 0;
        int kek2 = 0;
        int kek3 = 0;
        String luck = " ";
        String sos = " ";
        double rar = 0;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

/*        // 1 program - Квадратное уравнение; выводит количество корней
        System.out.println("Программа №1 - Квадратное уравнение");
        System.out.println("Введите коэффицент a");
        kek1 = scanner.nextInt();
        System.out.println("Введите коэффицент b");
        kek2 = scanner.nextInt();
        System.out.println("Введите коэффицент c");
        kek3 = scanner.nextInt();
        System.out.println("Вывод: ");
        System.out.println(Solutions.solutions(kek1, kek2, kek3));

        // 2 program - вводится строка; если "zip" в строке дважды,
        // то вывод позиции второго слова; иначе вывод "-1"
        System.out.println("Программа №2 - Поиск слова Zip");
        System.out.println("Введите предложение: ");
        luck = scanner1.nextLine();
        System.out.println("Вывод:");
        System.out.println(FindZip.findZip(luck));

        // 3 program - Совершенное число (6; 28; 496)
        System.out.println("Программа №3 - Совершенное число");
        System.out.println("Введите число:");
        kek1 = scanner.nextInt();
        System.out.println("Вывод:");
        System.out.println(CheckPerfect.checkPerfect(kek1));

        // 4 program - поменять 1 и последний символ строки
        System.out.println("Программа №4 - Поменять первый и последний символ строки");
        System.out.println("Введите предложение:");
        luck = scanner1.nextLine();
        System.out.println("Новая строка: ");
        System.out.println(FlipEndChars.flipEndChars(luck));

        // 5 program - ввод шестнадцатеричного кода (#123450; #EY4R3T; #rte3y9)
        System.out.println("Программа №5 - Шестнадцатеричное число");
        System.out.println("Введите код через #:");
        luck = scanner2.nextLine();
        System.out.println("Вывод:");
        System.out.println(IsValidHexCode.isValidHexCode(luck));
*/
        // 6 program
        System.out.println("Программа №6 - Уникальные числа");
        System.out.println("Введите количество чисел в массиве №1:");
        kek1 = scanner1.nextInt();
        int [] pop1 = new int [kek1];
        System.out.println("Введите значения массива №1:");
        for (int i=0; i<kek1; i++)
        {
            pop1[i] = scanner.nextInt();
        }
        System.out.println("Введите количество чисел в массиве №2:");
        kek2 = scanner1.nextInt();
        int [] pop2 = new int [kek2];
        System.out.println("Введите значения массива №2:");
        for (int i=0; i<kek2; i++)
        {
            pop2[i] = scanner.nextInt();
        }
        System.out.println("Вывод:");
        System.out.println(IsSame.isSame(pop1,pop2));

        // 7 program
        System.out.println("Программа №7 - Число Капрекара");
        System.out.println("Введите число:");
        kek3 = scanner.nextInt();
        System.out.println("Вывод:");
        System.out.println(IsKaprekar.isKaprekar(kek3));

        // 8 program - возвращает самую длинную последовательность последовательных нулей в двоичной строке.
        System.out.println("Программа №8 - Последовательность из нулей");
        System.out.println("Введите строку:");
        luck = scanner1.nextLine();
        System.out.println("Вывод:");
        System.out.println(LongestZero.longestZero(luck));

        // 9 program - функция, которая возвращает следующее простое число, либо само число
        System.out.println("Программа №9 - Простое число");
        System.out.println("Введите число");
        kek1 = scanner2.nextInt();
        System.out.println("Вывод:");
        System.out.println(NextPrime.nextPrime(kek1));

        // 10 program - Ввод x,y,z - являются ли ребрами прямоугольного треугольника?
        System.out.println("Программа №10 - Прямоугольный треугольник");
        System.out.println("Введите ребро X:");
        kek1 = scanner1.nextInt();
        System.out.println("Введите ребро Y:");
        kek2 = scanner2.nextInt();
        System.out.println("Введите ребро Z:");
        kek3 = scanner.nextInt();
        System.out.println("Вывод:");
        System.out.println(RightTriangle.rightTriangle(kek1,kek2,kek3));

    }
}
