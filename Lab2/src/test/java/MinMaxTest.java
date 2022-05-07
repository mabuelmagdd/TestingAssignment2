import static org.junit.Assert.*;
import org.junit.Test;
public class MinMaxTest {

    @Test
    public void test1(){
        MinMax minmax = new MinMax();
        int []arr = {1,6,8,8,5,6,6,7,5};
        int []expected = {1,8};
        assertArrayEquals(expected, minmax.minmax(arr));
    }
    @Test
    public void test2(){
        MinMax minmax = new MinMax();
        int []arr = {1,22,3,-4,-5,6};
        int []expected = {-5,22};
        assertArrayEquals(expected, minmax.minmax(arr));
    }
    @Test
    public void test3(){
        MinMax minmax = new MinMax();
        int []arr = {8,5852,53,466,56,6};
        int []expected = {6,5852};
        assertArrayEquals(expected, minmax.minmax(arr));
    }

    @Test
    public void test4(){
        MinMax minmax = new MinMax();
        int []arr = {-3331,-4455,-443,-433,-38,-328};
        int []expected = {-4455,-38};
        assertArrayEquals(expected, minmax.minmax(arr));
    }
    @Test
    public void test5(){
        MinMax minmax = new MinMax();
        int []arr = {7};
        int []expected = {7,7};
        assertArrayEquals(expected, minmax.minmax(arr));
    }
}