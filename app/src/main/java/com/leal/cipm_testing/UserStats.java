package com.leal.cipm_testing;

public class UserStats {
     String lastUsedDate;
     int usageCount;

    public UserStats() {
        // Firestore needs a default constructor
    }

    public UserStats(String lastUsedDate, int usageCount) {
        this.lastUsedDate = lastUsedDate;
        this.usageCount = usageCount;
    }

    public String getLastUsedDate() {
        return lastUsedDate;
    }

    public void setLastUsedDate(String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }

    public int getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(int usageCount) {
        this.usageCount = usageCount;
    }
}

