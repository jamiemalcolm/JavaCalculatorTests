public class Printer {

    private int pagesLeft;

    public Printer(int pagesLeft){
        this.pagesLeft = pagesLeft;
    }

    public int getPagesLeft() {
        return this.pagesLeft;
    }

    public void print(int pages, int copies) {
        while (copies > 0 && this.pagesLeft >= pages){
            this.pagesLeft = this.pagesLeft - pages;
            copies = copies -1;
        }
    }
}
