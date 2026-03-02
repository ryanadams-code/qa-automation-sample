package com.ryan.qa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MonitoringTest {

    TransactionValidator validator = new TransactionValidator();

    @Test
    void cpuThresholdShouldTriggerWarning() {
        boolean result = validator.shouldTriggerWarning(75, 70);
        assertTrue(result);
    }

    @Test
    void cpuBelowThresholdShouldNotTriggerAlert() {
        boolean result = validator.shouldTriggerWarning(40, 70);
        assertFalse(result);
    }

    @Test
    void transactionAmountShouldNotBeNegative() {
        boolean result = validator.isValidTransaction(-5000);
        assertFalse(result);
    }

    @Test
    void transactionAmountShouldBeValidWhenPositive() {
        boolean result = validator.isValidTransaction(1000);
        assertTrue(result);
    }
}
