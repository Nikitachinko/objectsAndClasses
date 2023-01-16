import java.util.Objects;

public class Book {
   private final String name;
   private final Author author;
    private int publishingYear;

    public  Book (String name, Author author, int publishingYear){
        this.name = name;
        this.author = author;
        this.publishingYear=publishingYear;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
public void setPublishingYear(int publishingYear){
        this.publishingYear = publishingYear;
}
@Override
public String toString(){
    return "Произведение " + getName() + " " + getAuthor() + " Публикация " + getPublishingYear();
}
@Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null||getClass()!=o.getClass())return false;
        Book book = (Book) o;
        return publishingYear==book.publishingYear&&Objects.equals(name,book.name)&&Objects.equals(author,book.author);
}
@Override
    public int hashCode(){
        return Objects.hash(name,author,publishingYear);
}

}
