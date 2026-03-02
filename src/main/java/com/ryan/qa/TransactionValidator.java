package com.ryan.qa;

public class TransactionValidator {

    public boolean isValidTransaction(double amount) {
        return amount >= 0;
    }

    public boolean shouldTriggerWarning(int cpuUsage, int threshold) {
        return cpuUsage > threshold;
    }
}
