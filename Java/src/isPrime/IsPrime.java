package isPrime;

public class IsPrime {
    public static boolean isPrime(int n)
    {
        if (n <= 1) return false;

        for (int i = 2; i < n; ++i)
        {
            if (n % i == 0) return false;

        }

        return true;
    }
}
