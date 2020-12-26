public class RightTriangle
{
    public static boolean rightTriangle(int x, int y, int z)
    {
        int gipotenuza;
        int katet1;
        int katet2;
        if (x > y && x > z)
        {
            gipotenuza = x;
            katet1 = y;
            katet2 = z;
        }
        else if (y > x && y > z)
        {
            gipotenuza = y;
            katet1 = x;
            katet2 = z;
        }
        else if (z > x && z > y)
        {
            gipotenuza = z;
            katet1 = x;
            katet2 = y;
        }
        else
        {
            return false;
        }
        return gipotenuza * gipotenuza == katet1 * katet1 + katet2 * katet2;
    }
}
