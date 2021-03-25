import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test {
    Main main;

    @Before
    public void before() {
        main = new Main();
    }

    @Test
    public void minLast() {
        Assert.assertArrayEquals(new int[]{1, 7}, main.firstArr(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void empty() {
        Assert.assertArrayEquals(new int[]{}, main.firstArr(new int[]{1, 2, 4, 4}));
    }

    @Test
    public void maxLast() {
        Assert.assertArrayEquals(new int[]{1, 7, 5, 1}, main.firstArr(new int[]{4, 4, 2, 3, 4, 1, 7, 5, 1}));
    }

    @Test(expected = RuntimeException.class)
    public void exception() {
        Assert.assertArrayEquals(new int[]{1, 2, 3}, main.firstArr(new int[]{7, 5, 1}));
    }

    @Test
    public void bool1() {
        boolean a = main.secondArr(new int[]{1, 1, 1, 4, 4, 1, 4, 4});
        Assert.assertTrue(a);
    }

    @Test
    public void bool2() {
        boolean a = main.secondArr(new int[]{1, 1, 1, 1, 1, 1});
        Assert.assertFalse(a);
    }

    @Test
    public void bool3() {
        boolean a = main.secondArr(new int[]{4, 4, 4, 4});
        Assert.assertFalse(a);
    }

    @Test
    public void bool4() {
        boolean a = main.secondArr(new int[]{1, 4, 4, 1, 1, 4, 3});
        Assert.assertFalse(a);
    }
}
