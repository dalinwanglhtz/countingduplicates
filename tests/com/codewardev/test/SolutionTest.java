package com.codewardev.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewardev.CountingDuplicates;

class SolutionTest {

	@Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }
    
    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }
    
    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }
    
    @Test
    public void aA11ReturnTwo() {
        assertEquals(2, CountingDuplicates.duplicateCount("aA11"));
    }
    
    @Test
    public void ABBAReturnTwo() {
        assertEquals(2, CountingDuplicates.duplicateCount("ABBA"));
    }
    
    @Test 
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A'); 
        String test1d = new String(new char[1]).replace('\0', 'd'); 
        String test = test1d + test1CapitalA + testTenC + 
            testHundredB + testThousandA;
        

        assertEquals(3, CountingDuplicates.duplicateCount(test));
    }

}
