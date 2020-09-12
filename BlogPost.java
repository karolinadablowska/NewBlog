import java.time.LocalDate;

public class BlogPost implements Actions, Id {


    private String title;
    private LocalDate date;
    private String description;
    private String tag;
    private Author author;

    public BlogPost(String title, LocalDate date, String description, String tag, Author author) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.tag = tag;
        this.author = author;
    }

    public BlogPost() {

    }

    @Override
    public String toString() {
        return String.format(title + ", " + date + ", " + description + ", " + tag + ", " + author);
    }

    @Override
    public void modify()
    {
        System.out.println("Your post is being modified......... ");
    }

    @Override
    public void delete() {
        System.out.println("Deleting a post........");

    }

    @Override
    public int id() {
        int i = 0;
       return i++;
    }
}
