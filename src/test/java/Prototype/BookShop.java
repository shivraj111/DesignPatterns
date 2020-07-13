package Prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class BookShop implements Cloneable{
    String shopname;
    List<Book> lstBook= new ArrayList<>();

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Book> getLstBook() {
        return lstBook;
    }

    public void loadData()
    {
    for(int i=0;i<=5;i++)
        {
            Book book= new Book();
            book.setBid(i);
            book.setBname("Book"+i);
            this.getLstBook().add(book);
        }

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopname='" + shopname + '\'' +
                ", lstBook=" + lstBook +
                '}';
    }



    public void setLstBook(List<Book> lstBook) {
        this.lstBook = lstBook;
    }





}
