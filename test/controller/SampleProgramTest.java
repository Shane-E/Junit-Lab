/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shane
 */
public class SampleProgramTest {
    
    public SampleProgramTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void multiplyTest(){
        System.out.println("multiplyTest");
        
        SimpleProgram instance = new SimpleProgram();
        int expected = 30;
        int x1 = 5;
        int x2 = 6;
        int actual = instance.multiply(x1, x2);
        assertEqual(expected, actual);
    }
}
