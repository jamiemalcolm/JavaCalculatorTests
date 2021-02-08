public class Printer {

    private int pagesLeft;
    private int tonerLevel;

    public Printer(int pagesLeft, int tonerLevel){
        this.pagesLeft = pagesLeft;
        this.tonerLevel = tonerLevel;
    }

    public int getPagesLeft() {
        return this.pagesLeft;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public void print(int pages, int copies) {
        while (copies > 0 && this.pagesLeft >= pages && this.tonerLevel > 0){
            this.pagesLeft = this.pagesLeft - pages;
            this.tonerLevel = this.tonerLevel - pages;
            copies = copies -1;
        }
    }
}
