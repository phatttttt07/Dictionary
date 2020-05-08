package com.company;

import java.util.Date;

public class HashData<K1, K2> {
    private String k1; //word
    private String k2; //date

    public void put(String a, String b)
    {
        this.k1 = a;
        this.k2 = b;
    }
    public String getWord()
    {
        return this.k1;
    }
    public String getDate()
    {
        return this.k2;
    }

}
