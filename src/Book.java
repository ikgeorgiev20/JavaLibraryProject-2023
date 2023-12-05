public class Book {
    private String title;
    private String author;
    private int year;

    Book(String title, String author, int year){
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean printData(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.year);
        return false;
    }

}
