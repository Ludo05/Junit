import com.teamtreehouse.vending.Creditor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;


public class CreditorTest {

    private Creditor creditor;

    @BeforeEach
    public void setUp() throws Exception{
         creditor = new Creditor();
    }


    //Checking that the available refunds returns the right number.
    @Test
    public void addingFundsIncrementingAvailableFunds() throws Exception{
        creditor.addFunds(100);

        assertEquals(100,creditor.getAvailableFunds());
    }

    @Test
    public void refundingReturnsAllAvailableFunds() throws Exception{
        creditor.addFunds(345);


        int refund = creditor.refund();


        assertEquals(345,refund);

    }
}