public class StudentSaleBook implements ISales{
    @Override
    public String sellBook(double price) {
        return "Sale price : " + price*0.75;
    }
}
