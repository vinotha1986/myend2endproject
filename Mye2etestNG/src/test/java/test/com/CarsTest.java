/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author vinot
 */
public class CarsTest {
Car car;    
    public CarsTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    car = new Car();
    
    
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

  @Test
        public void validateCar(){
        car.setModel("sedan");
        car.setMake("chrysler");
        car.setPrice(22000);
        car.setColor("silver");
        
        assertEquals("sedan",car.getModel());
        assertEquals("chrysler",car.getMake());
        assertEquals(22000.0,car.getPrice());
        assertEquals("silver",car.getColor());
    }



}
