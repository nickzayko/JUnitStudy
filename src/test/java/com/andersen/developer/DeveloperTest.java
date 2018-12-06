package com.andersen.developer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeveloperTest {

    Developer developer = new Developer();
    DeveloperLogic logic = new DeveloperLogic();

    @Before
    public void setUp() throws Exception {
        developer.setFirstName("Simple");
        developer.setLastName("Developer");
        developer.setSpecialty("Java");
        developer.setSalary(2000_00);
    }

    @Test
    public void shouldCreateDeveloperInstanceTest(){
        assertEquals("Simple", developer.getFirstName());
        assertEquals("Developer", developer.getLastName());
        assertEquals("Java", developer.getSpecialty());
        assertEquals(2000_00, developer.getSalary());
    }

    @Test
    public void shouldCalculateAnnualSalaryTest() throws Exception {
        assertEquals(24_000_00, logic.calculateAnnualSalary(developer));
    }

    @Test
    public void shouldCalculateHourRateTest() throws Exception {
        assertEquals(1250, logic.calculateHourRate(developer));
    }
}