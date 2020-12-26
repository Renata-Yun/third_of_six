public class NextPrime
{
    public static boolean isPrime(int n)
    {
        boolean result = true;
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int nextPrime(int num)
    {
        while (true)
        {
            if (isPrime(num))
            {
                return num;
            }
            num++;
        }
    }
}
