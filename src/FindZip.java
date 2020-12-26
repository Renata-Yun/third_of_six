public class FindZip
{
    public static int findZip (String str)
    {
        int kk = -1;
        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i)=='z' && str.charAt(i+1)=='i' && str.charAt(i+2)=='p')
                //проверка символов на первое слово "zip"
            {
                for (int j=i+2; j<str.length(); j++)
                {
                    if (str.charAt(j)=='z' && str.charAt(j+1)=='i' && str.charAt(j+2)=='p')
                    //проверка символов на второе слово "zip"
                    {
                        kk = j; //позиция начала второго слова "zip"
                    }
                }
            }
        }
        return kk;
    }
}
