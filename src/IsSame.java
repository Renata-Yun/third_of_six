import java.util.HashSet;
import java.util.Set;

public class IsSame
{
    public static boolean isSame(int[] ar1, int[] ar2)
    {
        Set<Integer> mas1 = new HashSet();
        Set<Integer> mas2 = new HashSet();
        for (int i=0; i<ar1.length; i++)
        {
            mas1.add(ar1[i]);
        }
        for (int j : ar2)
        {
            mas2.add(j);
        }
        return (mas1.size()==mas2.size());
    }
}
