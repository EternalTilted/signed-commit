import org.junit.Test;
import static org.junit.Assert.*;
import isPrime.IsPrime;

public class IsPrimeTest {
    @Test
    public void isPrime1(){
        assertEquals(false, IsPrime.isPrime(1));
    }

    @Test
    public void isPrime2(){
        assertEquals(true, IsPrime.isPrime(2));
    }

    @Test
    public void isPrime3(){
        assertEquals(true, IsPrime.isPrime(3));
    }

    @Test
    public void isPrime4(){
        assertEquals(false, IsPrime.isPrime(4));
    }

    @Test
    public void isPrime5(){
        assertEquals(true, IsPrime.isPrime(5));
    }

    @Test
    public void isPrime6(){
        assertEquals(false, IsPrime.isPrime(6));
    }

    @Test
    public void isPrime7(){
        assertEquals(true, IsPrime.isPrime(7));
    }

    @Test
    public void isPrime8(){
        assertEquals(false, IsPrime.isPrime(8));
    }

    @Test
    public void isPrime9(){
        assertEquals(false, IsPrime.isPrime(9));
    }

    @Test
    public void isPrime10(){
        assertEquals(false, IsPrime.isPrime(10));
    }
}
