public class IsKaprekar
{
    public static boolean isKaprekar (int kap)
    {
        int pow = kap*kap;
        String strPow = String.valueOf(pow); // возвращение значения аргумента в строковое
        String strFirst = strPow.substring(0, strPow.length() / 2); // "обрезали" строку с 0 элемента до середины
        String strSecond = strPow.substring(strPow.length() / 2);
        if (strFirst.length() == 0)
        { // Если число однозначное
            int intSecond = Integer.parseInt(strSecond);
            return intSecond == kap;
        }
        else
        { // неоднозначное число
            int intFirst = Integer.parseInt(strFirst); // строка (первая половина числа) преобразовывается в число
            int intSecond = Integer.parseInt(strSecond); // строка (вторая половина числа) преобразовывается в число
            return intFirst + intSecond == kap; // сравнение - если сумма двух частей равна исходному числу, то всё хорошо
        }
    }
}
