import java.time.LocalDate;

public class Post implements Actions {

    private static int iterator = 0;
    private int id;
    private String title;
    private LocalDate date;
    private String description;
    private String tag;
    private Author author;

    public Post(String title, LocalDate date, String description, String tag, Author author) {
        this.id = iterator++;
        this.title = title;
        this.date = date;
        this.description = description;
        this.tag = tag;
        this.author = author;
    }

    public Post() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getTag() {
        return tag;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format(id+", "+title + ", " + date + ", " + description + ", " + tag + ", " + author);
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

}
