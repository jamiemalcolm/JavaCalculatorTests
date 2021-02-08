import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(10, 100);
    }

    @Test
    public void hasNumberOfSheetsLeft() {
        assertEquals(10, printer.getPagesLeft());
    }

    @Test
    public void printThreeCopiesOfTwoPages() {
        printer.print(2, 3);
        assertEquals(4, printer.getPagesLeft());
    }

    @Test
    public void printThreeCopiesOfFourPages() {
        printer.print(4, 3);
        assertEquals(2, printer.getPagesLeft());
    }

    @Test
    public void printTwoCopiesOfFivePages() {
        printer.print(5, 2);
        assertEquals(0, printer.getPagesLeft());
    }

    @Test
    public void printOneCopiesOf11Pages() {
        printer.print(11, 1);
        assertEquals(10, printer.getPagesLeft());
    }

    @Test
    public void printerHasTonerLevel() {
        assertEquals(100, printer.getTonerLevel());
    }

    @Test
    public void printerTonerLevelReducedByOne() {
        printer.print(1, 1);
        assertEquals(99, printer.getTonerLevel());
    }

    @Test
    public void printerTonerLevelLowerThanPagesLeft_CheckPagesLeft() {
        Printer lowTonerPrinter = new Printer(5, 4);
        lowTonerPrinter.print(1, 5);
        assertEquals(1, lowTonerPrinter.getPagesLeft());
    }

    @Test
    public void printerTonerLevelLowerThanPagesLeft_CheckTonerLevel() {
        Printer lowTonerPrinter = new Printer(5, 4);
        lowTonerPrinter.print(1, 5);
        assertEquals(0, lowTonerPrinter.getTonerLevel());
    }
}
