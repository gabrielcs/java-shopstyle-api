package com.popsugar.shopping.api;

abstract class HistogramEntry
{
    private int count;

    public int getCount()
    {
        return count;
    }
    
    public void setCount(int count)
    {
        this.count = count;
    }
}
