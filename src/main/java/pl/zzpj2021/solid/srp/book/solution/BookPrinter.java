package pl.zzpj2021.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter {

    private final Book book;
    private int currentPage = 0;

    public BookPrinter(Book book) {
        this.book = book;
    }

    public String getCurrentPageContents() {
        return book.getPage(currentPage);
    }

    public void turnPage() {
        currentPage ++;
    }

    /**
     * Prints the current page.
     */
    public void printCurrentPage() {
        System.out.println(book.getPage(currentPage));
    }

    /**
     * Prints all pages
     * @return
     */
    public String printAllPages() {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getAllPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
