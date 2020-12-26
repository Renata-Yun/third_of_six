public class CheckPerfect
{
    public static boolean checkPerfect (int num)
    {
        boolean bo = false;
        int mi = num;
        int ch1 = 1;
        int ch2 = 1;
        while (num%2==0)
        {
            ch2 *= 2; // делители числа num
            num /= 2; // частное от деление num на 2
            ch1 = num + ch1 +ch2; // сумма множителей
        }
        if (ch1 == mi) // проверка получившегося с исходным
        {
            bo = true;
        }
        return bo;
    }
}
