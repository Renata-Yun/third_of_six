public class Solutions
{
    public static char solutions (int a, int b, int c)
    {
        char D = ' ';
        if (b*b-4*a*c == 0) //Дискреминант=0; значит 1 корень
        {
            D = '1';
        }
        else if ((b*b-4*a*c)>0) //Дискреминант>0; значит 2 корня
        {
            D = '2';
        }
        else if ((b*b-4*a*c)<0) //Дискреминант<0; значит 0 корней
        {
            D = '0';
        }
        else
            D = '-'; //иначе просто "-"
        return D;
    }
}
