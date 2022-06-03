public class OverallSaleBook implements ISales {
    @Override
    public String sellBook(double price) {
        return "Sale price : " + price;
    }
}
