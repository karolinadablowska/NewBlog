public class Page implements Actions {

   private int id;
    private String nameOfPage;
    private String content;

    public Page(String nameOfPage, String content) {
        this.nameOfPage = nameOfPage;
        this.content = content;
    }

    public Page() {
           }

    @Override
    public String toString() {
        return String.format(nameOfPage + ", " + content);
    }

    @Override
    public void modify() {
        System.out.println("Your page is being modified......... ");
    }

    @Override
    public void delete() {
        System.out.println("Deleting a page........");

    }
}
