interface BookOperations {
    void issueBook();
    void returnBook();
    void displayBooks();
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class LibraryMember extends Person implements BookOperations {

    int memberId;
    String bookName;
    boolean issued = false;

    LibraryMember(int memberId, String name, int age, String bookName) {
        super(name, age);
        this.memberId = memberId;
        this.bookName = bookName;
    }
    public void issueBook() {
        issued = true;
        System.out.println(bookName + " has been issued.");
    }
    public void returnBook() {
        issued = false;
        System.out.println(bookName + " has been returned.");
    }
    public void displayBooks() {
        System.out.println("\n----- Library Member Details -----");
        System.out.println("Member ID : " + memberId);
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("Book Name : " + bookName);
        System.out.println("Status    : " + (issued ? "Issued" : "Returned"));
    }
}
public class LibraryManagement {
    public static void main(String[] args) {

        LibraryMember member = new LibraryMember(101, "Lakshmi", 20, "Java Programming");

        member.issueBook();
        member.displayBooks();

        member.returnBook();
        member.displayBooks();
    }
}
