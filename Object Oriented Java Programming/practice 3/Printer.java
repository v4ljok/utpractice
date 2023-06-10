public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.duplex = duplex;
        if (tonerLevel > -1 & tonerLevel < 100 | tonerLevel == 100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
    }
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 & tonerAmount < 100 | tonerAmount == 100) {
            if (tonerAmount + tonerLevel > 100) {
                return -1;
            }
            else {
                return tonerAmount + tonerLevel;
            }
        }
        else {
            return -1;
        }
    }
    public int printPages(int pages) {
        int pagesToPrint;
        if (duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = pages / 2;
        }
        else {
            pagesToPrint = pages;
        }
        return pagesToPrint;
    }
    public int getPagesPrinted() {
        return printPages();
    }
}
