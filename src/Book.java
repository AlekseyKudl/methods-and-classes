import java.util.Objects;

public class Book {
        private String bookName;
        private Author author;
        private int yearOfPublication;


        public Book(String bookName, Author author, int yearOfPublication) {
            this.bookName = bookName;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
        }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", " + author +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getYearOfPublication() == book.getYearOfPublication() && getBookName().equals(book.getBookName()) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), author, getYearOfPublication());
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getYearOfPublication(){
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorSurname(){
        return author.getSurname();
    }
}
