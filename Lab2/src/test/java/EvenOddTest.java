import static org.junit.Assert.*;
import org.junit.Test;
public class EvenOddTest {

    @Test
    public void test1(){
        EvenOdd n1 = new EvenOdd();
        assertEquals("Number is even",n1.EvenOddCheck(8));
    }
    @Test
    public void test2(){
        EvenOdd n2 = new EvenOdd();
        assertEquals("Number is odd",n2.EvenOddCheck(55));
    }
    @Test
    public void test3(){
        EvenOdd n3 = new EvenOdd();
        assertEquals("Number is odd",n3.EvenOddCheck(-9));
    }
    @Test
    public void test4(){
        EvenOdd n4 = new EvenOdd();
        assertEquals("Number is even",n4.EvenOddCheck(0));
    }
}