/**
 * @author Julius Panduro
 */

public class Book {
    private String isbnNr;
    private String yearOfPublication;
    private String title;


    public Book(String isbnNr, String yearOfPublication, String title) {
        this.isbnNr = isbnNr;
        this.yearOfPublication = yearOfPublication;
        this.title = title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public String getIsbnNr() {
        return isbnNr;
    }

    public String getTitle() {
        return title;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setIsbnNr(String isbnNr) {
        this.isbnNr = isbnNr;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "isbnNr=" + isbnNr +
                ", date=" + yearOfPublication +
                ", title='" + title + '\'' +
                '}';
    }
}
