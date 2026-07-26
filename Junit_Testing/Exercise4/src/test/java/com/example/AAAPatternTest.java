package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AAAPatternTest {

    private BankAccount account;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Global setup before any test execution.");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Global teardown after all tests execution.");
    }

    @Before
    public void setUp() {
        // Setup test fixture before each test execution
        account = new BankAccount("ACC12345", 500.00);
        System.out.println("Test Fixture Initialized: Account ACC12345 with balance $500.00");
    }

    @After
    public void tearDown() {
        // Teardown test fixture after each test execution
        account = null;
        System.out.println("Test Fixture Cleaned Up.");
    }

    @Test
    public void testDepositUsingAAAPattern() {
        // Arrange
        double depositAmount = 250.00;
        double expectedBalance = 750.00;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(expectedBalance, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawUsingAAAPattern() {
        // Arrange
        double withdrawAmount = 200.00;
        double expectedBalance = 300.00;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(expectedBalance, account.getBalance(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawInsufficientFundsUsingAAAPattern() {
        // Arrange
        double withdrawAmount = 1000.00; // Exceeds balance of 500

        // Act
        account.withdraw(withdrawAmount);

        // Assert: Expected exception IllegalArgumentException
    }
}
