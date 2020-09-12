public class Author implements  Actions {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Author() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format(name + ", " + surname);

    }

    @Override
    public void modify() {
        System.out.println("Your author is being modified......... ");
    }

    @Override
    public void delete() {
        System.out.println("Deleting an author........");

    }
}
