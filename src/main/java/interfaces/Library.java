package interfaces;

public class Library {

    public static void main(String[] args) {
        Product book = new Book();
        book.setName("A Tale of the Two Cities");
        System.out.println(book.getName());
    }
}
