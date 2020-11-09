public class Printer {

  private int paper;
  private int toner;

  public Printer(int paper, int toner){
    this.paper = paper;
    this.toner = toner;
  }

  public int getPaper() {
    return paper;
  }

  public int getToner() {
    return toner;
  }

  public void setPaper(int paper) {
    this.paper = paper;
  }

  public void setToner(int toner) {
    this.toner = toner;
  }

  public boolean checkPaper(int paperNeeded){
    return this.paper >= paperNeeded ? true : false;
  }

  public boolean checkToner(int paperNeeded){
    return this.toner >= paperNeeded ? true : false;
  }

  public void print(int pages, int copies){
    int paperNeeded = pages * copies;
    if (this.checkPaper(paperNeeded) && this.checkToner(paperNeeded)) {
      this.paper -= paperNeeded;
      this.toner -= paperNeeded;
    }
  }

}
