package com.endava.taskstream;

public class StlSitl {
    private int limit;
    private String currency;

    public StlSitl(int limit, String currency) {
        this.limit = limit;
        this.currency = currency;
    }

    public int getLimit() {
        return limit;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "StlSitl{" +
                "limit=" + limit +
                ", currency='" + currency + '\'' +
                '}';
    }
}
