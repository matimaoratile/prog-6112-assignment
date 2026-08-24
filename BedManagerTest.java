/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class BedManagerTest {
    
    public BedManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of indexToBedNumber method, of class BedManager.
     */
    @Test
    public void testIndexToBedNumber() {
        System.out.println("indexToBedNumber");
        int row = 0;
        int col = 0;
        BedManager instance = new BedManager();
        String expResult = "";
        String result = instance.indexToBedNumber(row, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allocateBed method, of class BedManager.
     */
    @Test
    public void testAllocateBed() {
        System.out.println("allocateBed");
        String patientID = "";
        BedManager instance = new BedManager();
        String expResult = "";
        String result = instance.allocateBed(patientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allocateSpecificBed method, of class BedManager.
     */
    @Test
    public void testAllocateSpecificBed() {
        System.out.println("allocateSpecificBed");
        String bedNumber = "";
        String patientID = "";
        BedManager instance = new BedManager();
        instance.allocateSpecificBed(bedNumber, patientID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of releaseBed method, of class BedManager.
     */
    @Test
    public void testReleaseBed() {
        System.out.println("releaseBed");
        String bedNumber = "";
        BedManager instance = new BedManager();
        instance.releaseBed(bedNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of releaseBedByPatientID method, of class BedManager.
     */
    @Test
    public void testReleaseBedByPatientID() {
        System.out.println("releaseBedByPatientID");
        String patientID = "";
        BedManager instance = new BedManager();
        String expResult = "";
        String result = instance.releaseBedByPatientID(patientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBedAvailable method, of class BedManager.
     */
    @Test
    public void testIsBedAvailable() {
        System.out.println("isBedAvailable");
        String bedNumber = "";
        BedManager instance = new BedManager();
        boolean expResult = false;
        boolean result = instance.isBedAvailable(bedNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailableBedCount method, of class BedManager.
     */
    @Test
    public void testGetAvailableBedCount() {
        System.out.println("getAvailableBedCount");
        BedManager instance = new BedManager();
        int expResult = 0;
        int result = instance.getAvailableBedCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOccupiedBedCount method, of class BedManager.
     */
    @Test
    public void testGetOccupiedBedCount() {
        System.out.println("getOccupiedBedCount");
        BedManager instance = new BedManager();
        int expResult = 0;
        int result = instance.getOccupiedBedCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalBeds method, of class BedManager.
     */
    @Test
    public void testGetTotalBeds() {
        System.out.println("getTotalBeds");
        BedManager instance = new BedManager();
        int expResult = 0;
        int result = instance.getTotalBeds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBedLayout method, of class BedManager.
     */
    @Test
    public void testGetBedLayout() {
        System.out.println("getBedLayout");
        BedManager instance = new BedManager();
        String[][] expResult = null;
        String[][] result = instance.getBedLayout();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayWardLayout method, of class BedManager.
     */
    @Test
    public void testDisplayWardLayout() {
        System.out.println("displayWardLayout");
        BedManager instance = new BedManager();
        instance.displayWardLayout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAvailableBeds method, of class BedManager.
     */
    @Test
    public void testDisplayAvailableBeds() {
        System.out.println("displayAvailableBeds");
        BedManager instance = new BedManager();
        instance.displayAvailableBeds();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayOccupiedBeds method, of class BedManager.
     */
    @Test
    public void testDisplayOccupiedBeds() {
        System.out.println("displayOccupiedBeds");
        BedManager instance = new BedManager();
        instance.displayOccupiedBeds();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
