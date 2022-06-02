import org.junit.Test;

import static org.junit.Assert.*;

public class StudentSaleBookTest {

    @Test
    public void testSellBookReturnString() {
        //Arrange
        StudentSaleBook studentSaleBook = new StudentSaleBook();
        //Act
        String result = studentSaleBook.sellBook(100);
        //Assert
        assertTrue(result.length()>0);
    }
}