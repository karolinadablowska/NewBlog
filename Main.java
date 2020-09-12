import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Author author = new Author("KK", "hh");
        Page page = new Page();
        BlogPost blogPost = new BlogPost();

        Scanner sc = new Scanner(System.in);

        String name = null;
        String surname = null;
        String title = null;
        LocalDate date = null;
        String description = null;
        String tag = null;
        String pageName = null;
        String description2 = null;



        ArrayList<Object> list = new ArrayList<Object>();
        list.add(new Author("Stephen", "King"));
        list.add(new BlogPost("hh", LocalDate.of(1993, 9, 27), "jjj", "jj", new Author("jj", "jj")));
        list.add(new Page("Zakupy", "................"));

        System.out.println(".....................................................................................");

        System.out.println("Your list looks like this: ");
        for (Object o : list) {
            System.out.println(o.toString());
        }

        System.out.println("What do you want to do? Press 1 to go to an author, 2 to a blog post, 3 to a page.. ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("What do you want to do? Press 1 to add an author, 2 to show an author, 3 to modify an author, 4 to delete an author.. ");
                int number1 = sc.nextInt();
                switch (number1) {
                    case 1:
                        System.out.println("Enter a name of the author");
                        title = sc.next();
                        System.out.println("Enter a name of the author");
                        surname = sc.next();
                        list.add(new Author(name, surname));
                        break;
                    case 2:
                        author.toString();
                        break;
                    case 3:
                        author.modify();
                        break;
                    case 4:
                        author.delete();
                        System.out.println("What index do you want to remove?");
                        int index = sc.nextInt();
                        list.remove(index);
                        break;
                }

            case 2:
                System.out.println("What do you want to do? Press 1 to add a post blog, 2 to show a post blog, 3 to modify a post blog, 4 to delete a post blog... ");
                int number2 = sc.nextInt();
                switch (number2) {
                    case 1:
                        System.out.println("Enter a title: ");
                        title = sc.next();
                        System.out.println("Enter a date: ");
                        date = LocalDate.parse(sc.next());
                        System.out.println("Enter a description: ");
                        description =  sc.next();
                        System.out.println("Enter a tag: ");
                        tag = sc.next();
                        System.out.println("Enter a name of the author");
                        title = sc.next();
                        System.out.println("Enter a name of the author");
                        surname = sc.next();
                        list.add(new BlogPost(title, date, description, tag, new Author(name, surname)));
                        break;
                    case 2:
                        blogPost.toString();
                        break;
                    case 3:
                        blogPost.modify();
                        break;
                    case 4:
                        blogPost.delete();
                        System.out.println("What index do you want to remove?");
                        int index = sc.nextInt();
                        list.remove(index);
                        break;
                }
                    case 3:
                        System.out.println("What do you want to do? Press 1 to add a new page, 2 to show a new page, 3 to modify a new page, 4 to delete a new page... ");
                        int number3 = sc.nextInt();
                        switch (number3) {
                            case 1:
                                System.out.println("Enter a name of page: ");
                                pageName = sc.next();
                                System.out.println("Enter a description: ");
                                description2 = sc.next();
                                list.add(new Page(pageName, description2));
                                break;
                            case 2:
                                page.toString();
                                break;
                            case 3:
                                page.modify();
                                break;
                            case 4:
                                page.delete();
                                System.out.println("What index do you want to remove?");
                                int index = sc.nextInt();
                                list.remove(index);
                                break;


                        }

                }


                System.out.println("Your list after modifikation: ");
                for (Object o : list) {
                    System.out.println(o.toString());
                }



        }
    }





