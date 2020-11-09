import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

  Printer printer;

  @Before
  public void before(){ printer = new Printer(10, 15); }

  @Test
  public void hasPaper(){ assertEquals(10, printer.getPaper()); }

  @Test
  public void hasToner(){ assertEquals(15, printer.getToner()); }

  @Test
  public void checkPrintPaper(){ assertEquals( true, printer.checkPaper(8));}

  @Test
  public void checkPrintToner(){ assertEquals( true, printer.checkToner(8));}

  @Test
  public void noPrintPaper(){ assertEquals( false, printer.checkPaper(20));}

  @Test
  public void noPrintToner(){ assertEquals( false, printer.checkToner(20));}

  @Test
  public void letsPrint(){
    printer.print(2, 4);
    assertEquals(2, printer.getPaper());
    assertEquals(7, printer.getToner());
  }

  @Test
  public void doesntLetPrint(){
    printer.print(4, 4);
    assertEquals(10, printer.getPaper());
    assertEquals(15, printer.getToner());
  }
}
