public class LongestZero
{
    public static String longestZero(String num)
    {
        boolean checkNum = true;
        char[] Array = num.toCharArray();
        for (char i : Array) // перебор массива символов
        {
            if (!(i =='0' || i =='1'))
            {
                checkNum = false;
                break;
            }
        }
        if (checkNum==false)
        { return "Введены некорректные данные"; }
        else
        {
            int x = Integer.parseInt(num,2); // в Х записывается преобразованная строка в двоичное число
            int count = 0;
            long maxZero = 0;
            while (x > 0)
            {
                if ((x & 1) == 1)
                {
                    if (count > maxZero)
                    {
                        maxZero = count;
                    }
                    count = 0;
                }
                else
                {
                    count += 1;
                }
                x = x >> 1; // сдвиг поразрядно вправо на 1 бит, что есть деление на 2
            }
            String result = "";
            for (int i = 0; i < maxZero; i++)
            {
                result += "0";
            }
            return result;
        }
    }
}
