import static org.junit.Assert.*;
import org.junit.Test;
public class WatchTest {

    @Test
    public void test1(){
        Watch watch = new Watch();
        String string = "abadacaad";
        String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 00:00";
        assertEquals( output , watch.handwatch(string));
    }

    @Test
    public void test2(){
        Watch watch = new Watch();
        String string = "cbababababa";
        String output = "Current state: Normal_Display, Time  Date: 2 - 2 - 2001  Time: 01:01";
        assertEquals( output , watch.handwatch(string));
    }


    @Test
    public void test3(){
        Watch watch = new Watch();
        String string = "cbbabbbaaaa";
        String output = "Current state: Normal_Display, Time  Date: 1 - 1 - 2000  Time: 03:02";
        assertEquals( output , watch.handwatch(string));
    }

    @Test
    public void test4(){
        Watch watch = new Watch();
        String string = "caabbabbbbabbba";
        String output = "Current state: Normal_Display, Time  Date: 3 - 5 - 2003  Time: 00:00";
        assertEquals( output , watch.handwatch(string));
    }
}