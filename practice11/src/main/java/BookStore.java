public class BookStore {
    private ISales sales;

    public BookStore(ISales sales) {
        this.sales = sales;
    }

    public void setSale(ISales sales){
        this.sales=sales;
    }
    public void sellBook(double price){
        System.out.println(sales.sellBook(price));

    }
}
