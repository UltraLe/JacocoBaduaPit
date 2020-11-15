package superPackage;

import org.junit.Assert;
import org.junit.Test;

public class SuperTest
{
    @Test
    public void WhatATest(){
        new SuperClass().Hey();
        Assert.assertTrue(true);
    }

    @Test
    public void NotATest()
    {
        int a = 2*3243245;
        Assert.assertTrue(true);
    }
}