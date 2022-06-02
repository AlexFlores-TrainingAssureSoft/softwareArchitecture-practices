import static org.junit.Assert.*;

public class OverallSaleBookTest {

    @org.junit.Test
    public void testSellBookReturnString() {
        //Arrange
        OverallSaleBook overallSaleBook = new OverallSaleBook();
        //Act
        String result = overallSaleBook.sellBook(150);
        //Assert
        assertTrue(result.length()>0);
    }
}