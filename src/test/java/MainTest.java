import com.sun.tools.javac.Main;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void shouldReturnFor100000() {
        //given
        Test2 test = new Test2();
        int x = 100000;
        //when
        int calc = test.podatki(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(19470));
    }
    @Test
    public void shouldReturnFor85528() {
        //given
        Test2 test = new Test2();
        int x = 85528;
        //when
        int calc = test.podatki(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(14839));
    }
    @Test
    public void shouldReturnFor85529() {
        //given
        Test2 test = new Test2();
        int x = 85529;
        //when
        int calc = test.podatki(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(14839));
    }
}
