package com.andersen;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.Test;

public class TestSuiteDemo {
    TestSuite testSuite = new TestSuite(CalculatorTest.class, CalculatorBeforeAfterTest.class);

    TestResult testResult = new TestResult();

    @Test
    public void testSuiteInAction(){
        testSuite.run(testResult);

        System.out.println("Amount of test cases: " + testSuite.countTestCases());
        testSuite.setName("ExampleOfRestSuite");
        System.out.println("Name of test suites: " + testSuite.getName());
    }
}
