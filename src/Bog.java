public class Bog {
    private int isbnNr;
    private int date;
    private String title;

    public Bog(int isbnNr, int date, String title) {
        this.isbnNr = isbnNr;
        this.date = date;
        this.title = title;
    }

    public int getDate() {
        return date;
    }

    public int getIsbnNr() {
        return isbnNr;
    }

    public String getTitle() {
        return title;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setIsbnNr(int isbnNr) {
        this.isbnNr = isbnNr;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "isbnNr=" + isbnNr +
                ", date=" + date +
                ", title='" + title + '\'' +
                '}';
    }
}
