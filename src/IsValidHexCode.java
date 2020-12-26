public class IsValidHexCode
{
    public static boolean isValidHexCode(String stroka)
    {
        boolean bo = false;
        if (stroka.length()==7 && stroka.charAt(0)=='#')
        {
            bo = true;
        }
        else
        {
            bo = false;
        }
        return bo;
    }
}
