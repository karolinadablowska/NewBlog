import java.time.LocalDate;
import java.util.Scanner;

public class Blog {

    public int postIndex = 0;
    public int pageIndex = 0;
    public int authorIndex = 0;

    private Post[] posts;
    private Page[] pages;
    private Author[] authors;

    public Blog(int postSize, int pageSize, int authorSize) {
        posts = new Post[postSize];
        pages = new Page[pageSize];
        authors = new Author[authorSize];
    }

    public void addPost() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a title: ");
        String title = sc.next();

        System.out.println("Enter a date: ");
        LocalDate date = LocalDate.parse(sc.next());

        System.out.println("Enter a description: ");
        String description = sc.next();

        System.out.println("Enter a tag: ");
        String tag = sc.next();

        Author author;
        do {
            System.out.println("Enter a id of the author");
            int id = sc.nextInt();
            author = findAuthor(id);
        } while (author == null);

        Post post = new Post(title, date, description, tag, author);

        posts[postIndex++] = post;
    }

    public void modifyPost(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a id: ");
        int id = sc.nextInt();

        Post post = findPost(id);
        if(post != null) {

            System.out.println("Enter a title ("+post.getTitle()+"): ");
            String title = sc.next();
            post.setTitle(title);

            System.out.println("Enter a date ("+post.getDate()+"): ");
            LocalDate date = LocalDate.parse(sc.next());
            post.setDate(date);

            System.out.println("Enter a description ("+post.getDescription()+"): ");
            String description = sc.next();
            post.setDescription(description);

            System.out.println("Enter a tag ("+post.getTag()+"): ");
            String tag = sc.next();
            post.setTag(tag);

            Author author;
            do {
                System.out.println("Enter a id of the author ("+post.getAuthor().getId()+"): ");
                id = sc.nextInt();
                author = findAuthor(id);
            } while (author == null);
            post.setAuthor(author);
        } else {
            System.out.println("Post not exists.");
        }
    }

    private Post findPost(int id) {
        for (int i = 0; i < posts.length && posts[i] != null; i++) {
            if (posts[i].getId() == id) {
                return posts[i];
            }
        }
        return null;
    }

    public void displayPosts() {
        for (int i = 0; i < posts.length && posts[i] != null; i++) {
            System.out.println(posts[i]);
        }
    }

    public void deletePost() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a id: ");
        int id = sc.nextInt();

        if (postExists(id)) {
            if (id == postIndex - 1) {
                posts[id] = null;
            } else {
                int i;
                for (i = id; i < posts.length - 1; i++) {
                    posts[i] = posts[i + 1];
                }
                posts[i] = null;
            }
            postIndex--;
        } else {
            System.out.println("Post not exists.");
        }
    }

    private boolean postExists(int id) {
        for (int i = 0; i < posts.length && posts[i] != null; i++) {
            if(posts[i].getId() == id){
                return true;
            }
        }
        return false;
    }

    public void addAuthor() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name = sc.next();

        System.out.println("Enter a surname: ");
        String surname = sc.next();

        Author author = new Author(name, surname);

        authors[authorIndex++] = author;
    }

    public void displayAuthors() {
        for (int i = 0; i < authors.length && authors[i] != null; i++) {
            System.out.println(authors[i]);
        }
    }

    private Author findAuthor(int id) {
        for (int i = 0; i < authors.length && authors[i] != null; i++) {
            if (authors[i].getId() == id) {
                return authors[i];
            }
        }
        return null;
    }
}
