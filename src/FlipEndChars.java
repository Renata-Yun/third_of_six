public class FlipEndChars
{
    public static String flipEndChars (String str)
    {
        String tutu = "";
        char [] fil = str.toCharArray();
        int j = str.length()-1;
        char i = ' ';
        if (str.length()>2)
        {
            if (fil[0]!=fil[j])
            {
                i = fil[0];
                fil[0] = fil[j];
                fil[j] = i;
                for (int k=0; k<str.length(); k++)
                {
                    tutu += fil[k];
                }
            }
            else
                tutu = "два-это пара";
        }
        else
            tutu = "несовместимо";
        return tutu;
    }
}
