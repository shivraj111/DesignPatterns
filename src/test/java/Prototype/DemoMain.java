package Prototype;

public class DemoMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop book= new BookShop();
        book.setShopname("Novelty");
        book.loadData();
        System.out.println(book.toString());

        BookShop bookCopy= (BookShop)book.clone();
        bookCopy.setShopname("Store");
        bookCopy.loadData();
        System.out.println(bookCopy.toString());

        book.getLstBook().remove(0);
        System.out.println(book.toString());
        System.out.println(bookCopy.toString());

    }

}
