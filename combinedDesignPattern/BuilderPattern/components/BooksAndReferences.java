package BuilderPattern.components;
import java.util.List;
import java.util.ArrayList;

public class BooksAndReferences {
    public List<String> books;
    public List<String> references;
    public List<String> webLink;

    public BooksAndReferences(){
        this.books = new ArrayList<>();
        this.references = new ArrayList<>();
        this.webLink = new ArrayList<>();
    }

    public void addBook(String book){
        this.books.add(book);
    }

    public void addReferences(String references){
        this.references.add(references);
    }

    public void addWebLink(String webLink){
        this.webLink.add(webLink);
    }
}
