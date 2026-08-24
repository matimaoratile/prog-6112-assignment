/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
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
public class PatientManagerTest {
    
    public PatientManagerTest() {
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
     * Test of registerPatient method, of class PatientManager.
     */
    @Test
    public void testRegisterPatient() {
        System.out.println("registerPatient");
        Patient patient = null;
        PatientManager instance = null;
        instance.registerPatient(patient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchPatientByID method, of class PatientManager.
     */
    @Test
    public void testSearchPatientByID() {
        System.out.println("searchPatientByID");
        String patientID = "";
        PatientManager instance = null;
        Patient expResult = null;
        Patient result = instance.searchPatientByID(patientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatient method, of class PatientManager.
     */
    @Test
    public void testUpdatePatient() {
        System.out.println("updatePatient");
        String patientID = "";
        String firstName = "";
        String lastName = "";
        int age = 0;
        String gender = "";
        String medicalCondition = "";
        PatientManager instance = null;
        boolean expResult = false;
        boolean result = instance.updatePatient(patientID, firstName, lastName, age, gender, medicalCondition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePatient method, of class PatientManager.
     */
    @Test
    public void testDeletePatient() {
        System.out.println("deletePatient");
        String patientID = "";
        PatientManager instance = null;
        boolean expResult = false;
        boolean result = instance.deletePatient(patientID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllPatients method, of class PatientManager.
     */
    @Test
    public void testDisplayAllPatients() {
        System.out.println("displayAllPatients");
        PatientManager instance = null;
        instance.displayAllPatients();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortPatientsBySurname method, of class PatientManager.
     */
    @Test
    public void testSortPatientsBySurname() {
        System.out.println("sortPatientsBySurname");
        PatientManager instance = null;
        instance.sortPatientsBySurname();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortPatientsByID method, of class PatientManager.
     */
    @Test
    public void testSortPatientsByID() {
        System.out.println("sortPatientsByID");
        PatientManager instance = null;
        instance.sortPatientsByID();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPatients method, of class PatientManager.
     */
    @Test
    public void testGetAllPatients() {
        System.out.println("getAllPatients");
        PatientManager instance = null;
        ArrayList<Patient> expResult = null;
        ArrayList<Patient> result = instance.getAllPatients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPatients method, of class PatientManager.
     */
    @Test
    public void testGetTotalPatients() {
        System.out.println("getTotalPatients");
        PatientManager instance = null;
        int expResult = 0;
        int result = instance.getTotalPatients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInpatientCount method, of class PatientManager.
     */
    @Test
    public void testGetInpatientCount() {
        System.out.println("getInpatientCount");
        PatientManager instance = null;
        int expResult = 0;
        int result = instance.getInpatientCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOutpatientCount method, of class PatientManager.
     */
    @Test
    public void testGetOutpatientCount() {
        System.out.println("getOutpatientCount");
        PatientManager instance = null;
        int expResult = 0;
        int result = instance.getOutpatientCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmergencyCount method, of class PatientManager.
     */
    @Test
    public void testGetEmergencyCount() {
        System.out.println("getEmergencyCount");
        PatientManager instance = null;
        int expResult = 0;
        int result = instance.getEmergencyCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
