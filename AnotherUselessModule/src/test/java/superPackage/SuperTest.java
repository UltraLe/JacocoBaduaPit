package superPackage;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class SuperTest
{
    @Test
    public void WhatATest(){
        assertThat(new SuperClass().Hey(), containsString("y"));
    }
}