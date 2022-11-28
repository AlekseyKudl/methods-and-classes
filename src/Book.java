public class Book {
        private String bookName;
        private Author author;
        private int yearOfPublication;


        public Book(String bookName, Author author, int yearOfPublication) {
            this.bookName = bookName;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
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
