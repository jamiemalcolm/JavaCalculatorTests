import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(10);
    }
    @Test
    public void hasNumberOfSheetsLeft(){
        assertEquals(10, printer.getPagesLeft());
    }

    @Test
    public void printThreeCopiesOfTwoPages(){
        printer.print(2,3);
        assertEquals(4, printer.getPagesLeft());
    }

    @Test
    public void printThreeCopiesOfFourPages(){
        printer.print(4,3);
        assertEquals(2, printer.getPagesLeft());
    }

    @Test
    public void printTwoCopiesOfFivePages(){
        printer.print(5,2);
        assertEquals(0, printer.getPagesLeft());
    }
}
