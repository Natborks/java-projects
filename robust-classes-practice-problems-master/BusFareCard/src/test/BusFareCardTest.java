package test;

import exceptions.IllegalAgeException;
import exceptions.IllegalAmountException;
import exceptions.MissingFareException;
import exceptions.NoBalanceException;

import model.BusFareCard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static model.BusFareCard.ADULT_FARE;
import static model.BusFareCard.CONCESSION_FARE;
import static org.junit.Assert.*;

public class BusFareCardTest {

    private BusFareCard adultCard, concCard, zeroBalanceCard, younginCard;

    @Before
    public void setUp() {
        try {
            adultCard = new BusFareCard("Anthony Estey", 30, 100.00);
            concCard = new BusFareCard("Amy Zhu", 18, 56.00);
            zeroBalanceCard = new BusFareCard("Test", 19, 0);
            younginCard = new BusFareCard("Young", 16, 0);
        } catch (Exception e) {
            fail("Exception should not have been thrown.");
        }
    }

    @Test
    public void testGetters() {
        assertEquals(adultCard.getBalance(),100.00, 0.05);
        assertEquals(concCard.getBalance(),56.00, 0.05);
    }

    @Test
    public void testpurchaseAdultFareNoException() {
        assertEquals(adultCard.getBalance(),100.00, 0.05);
        assertFalse(adultCard.isFareLoaded());
        try {
            adultCard.purchaseAdultFare();
        } catch (IllegalAgeException | NoBalanceException e) {
            fail("Exception should not have been thrown.");
        }
        assertEquals(adultCard.getBalance(),100.00 - ADULT_FARE, 0.05);
        assertTrue(adultCard.isFareLoaded());
    }

    @Test
    public void testpurchaseAdultFareNoBalanceException() {
        try {
            zeroBalanceCard.purchaseAdultFare();
        } catch (NoBalanceException e1) {
            System.out.println(e1.getMessage());
        } catch (IllegalAgeException e2) {
            fail("Exception should not have been thrown.");
        }
    }

    @Test (expected = IllegalAgeException.class)
    public void testPurchaseAdultFareIllegalAgeException() throws NoBalanceException, IllegalAgeException{
        younginCard.purchaseAdultFare();

        assertEquals(younginCard.getBalance(), 0, 0);
    }

    @Test
    public void testpurchaseConcessionFareIllegalAge() {
        assertEquals(adultCard.getBalance(),100.00, 0.05);
        try {
            adultCard.purchaseConcessionTicket();
            fail("IllegalAgeException should have been thrown");
        } catch (IllegalAgeException e1) {
            System.out.println(e1.getMessage());
        } catch (NoBalanceException e2) {
            System.out.println("Exception should not have been thrown.");
        }
        assertEquals(adultCard.getBalance(),100.00,0.05);
    }

    @Test(expected = NoBalanceException.class)
    public void testPurchaseConcessionFareNoBalance() throws NoBalanceException, IllegalAgeException{
        younginCard.purchaseConcessionTicket();

        assertEquals(0, zeroBalanceCard.getBalance(), 0.05);
    }

    @Test
    public void testpurchaseConcessionFareNoException() {
        assertEquals(concCard.getBalance(),56.00,0.05);
        assertFalse(concCard.isFareLoaded());
        try {
            concCard.purchaseConcessionTicket();
        } catch (IllegalAgeException | NoBalanceException e) {
            fail("Exception should not have been thrown.");
        }
        assertEquals(concCard.getBalance(),56.00 - CONCESSION_FARE,0.05);
        assertTrue(concCard.isFareLoaded());
    }

    @Test
    public void testBoardBusSuccessFul() throws MissingFareException {

        try {
            adultCard.purchaseAdultFare();
        } catch (Exception e) {
            e.printStackTrace();
        }

        adultCard.boardBus();

        assertFalse(adultCard.isFareLoaded());
    }

    @Test
    public void testBoardBusMissingFareExceptions(){
        try {
            adultCard.boardBus();
        } catch (MissingFareException e) {
            e.printStackTrace();
        }

        assertFalse(adultCard.isFareLoaded());
    }


    @Test
    public void testReloadBalanceSuccessful() throws IllegalAmountException {
        double currentBalance = adultCard.getBalance();

        adultCard.reloadBalance(20);

        assertEquals(currentBalance + 20, adultCard.getBalance(), 0.05);
    }

    @Test(expected = IllegalAmountException.class)
    public void testReloadBalanceIllegalAmount() throws IllegalAmountException{
        double currentBalance = adultCard.getBalance();

        adultCard.reloadBalance(-1);

        assertEquals(currentBalance + 0, adultCard.getBalance(), 0.05 );
    }

}
