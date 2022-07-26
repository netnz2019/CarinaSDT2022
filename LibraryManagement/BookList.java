package book;

public class BookList {

    private Book[] books = new Book[10];// The size of this bookshelf

    private int usedSize;// There are several books in the array

    public BookList() {
        Books [0] = new book (1, "Sunflower Fields", "Rosaline Ferrell", 90, "novel");
        Books [1] = new book (2, "Journey through Teyvat", "Venti Wine", 78, "novel");
        Books [2] = new book (3, "Dreams of Endless Mansions", "Montgomery Gator", 89, "novel");
        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getPos(int pos) {
        return books[pos];
    }

    public void setBooks(int pos,Book book) {
        books[pos] = book;
    }

}
