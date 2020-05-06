package com.company;

import java.util.Date;

public class HashData<K1, K2> {
    private String k1; //date
    private String k2; //times

    public void put(String a, String b)
    {
        this.k1 = a;
        this.k2 = b;
    }
    public void increaseTimes()
    {
        int i = Integer.parseInt(this.k2);
        i++;
        this.k2 = String.valueOf(i);
    }
    public String getDate()
    {
        return this.k1;
    }
    public String getTimes()
    {
        return this.k2;
    }

}
