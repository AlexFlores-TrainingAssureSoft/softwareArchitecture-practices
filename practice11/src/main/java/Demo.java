public class Demo {
    public static void main(String[] args) {
        OverallSaleBook overallSaleBook = new OverallSaleBook();
        BookStore bookStore = new BookStore(overallSaleBook);
        System.out.println("General sale");
        bookStore.sellBook(100);


        StudentSaleBook studentSaleBook = new StudentSaleBook();
        bookStore.setSale(studentSaleBook);
        System.out.println("Student sale");
        bookStore.sellBook(100);
    }
}
