public class Main {
    public static void main(String[] args) {
        Author vern = new Author("Жюль", "Верн");
        Author stivenson = new Author("Роберт","Стивенсон");
        Book sorok = new Book("Сорок тысяч лье под водой", vern, 1896);
        Book ostrov = new Book("Остров сокровищ", stivenson, 1780);
        System.out.println(sorok.getBookName()+" "+ sorok.getAuthorName()+" "+ sorok.getAuthorSurname()
        +" "+ sorok.getYearOfPublication());
        System.out.println(ostrov.getBookName()+" "+ ostrov.getAuthorName()+" "+ ostrov.getAuthorSurname()
                +" "+ ostrov.getYearOfPublication());
        sorok.setYearOfPublication(1899);
        ostrov.setYearOfPublication(1800);
        System.out.println(sorok.getBookName()+" "+ sorok.getAuthorName()+" "+ sorok.getAuthorSurname()
                +" "+ sorok.getYearOfPublication());
        System.out.println(ostrov.getBookName()+" "+ ostrov.getAuthorName()+" "+ ostrov.getAuthorSurname()
                +" "+ ostrov.getYearOfPublication());
        System.out.println(sorok);
        System.out.println(vern);
        System.out.println(sorok.equals(ostrov));


    }
}