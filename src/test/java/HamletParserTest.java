import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testFindHamlet() {
        // given
        int expected = 472;
        // when
        int actual = hamletParser.findHamlet(hamletText);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
        // given
        int expected = 158;
        // when
        int actual = hamletParser.findHoratio(hamletText);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChangeHamletToLeon() {
        // given
        int expected = 472;
        // when
        String text = hamletParser.changeHamletToLeon(hamletText);
        int actual = hamletParser.findLeon(text);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        // given
        int expected = 158;
        // when
        String text = hamletParser.changeHoratioToTariq(hamletText);
        int actual = hamletParser.findTariq(text);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindLeon() {
        // given
        int expected = 472;
        // when
        String text = hamletParser.changeHamletToLeon(hamletText);
        int actual = hamletParser.findLeon(text);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindTariq() {
        // given
        int expected = 158;
        // when
        String text = hamletParser.changeHoratioToTariq(hamletText);
        int actual = hamletParser.findTariq(text);
        // then
        Assert.assertEquals(expected, actual);
    }
}