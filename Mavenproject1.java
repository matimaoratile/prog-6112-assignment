/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Student
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

// ===================== ENUM: PatientCategory =====================
enum PatientCategory {
    INPATIENT,
    OUTPATIENT,
    EMERGENCY;

    @Override
    public String toString() {
        switch (this) {
            case INPATIENT:
                return "Inpatient";
            case OUTPATIENT:
                return "Outpatient";
            case EMERGENCY:
                return "Emergency";
            default:
                return "Unknown";
        }
    }
}

// ===================== BASE CLASS: Patient =====================
class Patient {

    private String patientID;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String medicalCondition;
    private PatientCategory category;

    public Patient(
            String patientID,
            String firstName,
            String lastName,
            int age,
            String gender,
            String medicalCondition,
            PatientCategory category) {

        if (patientID == null || patientID.trim().isEmpty()) {
            throw new IllegalArgumentException("Patient ID cannot be empty.");
        }

        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }

        if (age <= 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 1 and 150.");
        }

        if (gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Gender cannot be empty.");
        }

        if (medicalCondition == null || medicalCondition.trim().isEmpty()) {
            throw new IllegalArgumentException("Medical condition cannot be empty.");
        }

        if (category == null) {
            throw new IllegalArgumentException("Patient category cannot be null.");
        }

        this.patientID = patientID.trim();
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.age = age;
        this.gender = gender.trim();
        this.medicalCondition = medicalCondition.trim();
        this.category = category;
    }

    // ===================== GETTERS =====================

    public String getPatientID() {
        return patientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public PatientCategory getCategory() {
        return category;
    }

    // ===================== SETTERS =====================

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        this.firstName = firstName.trim();
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }
        this.lastName = lastName.trim();
    }

    public void setAge(int age) {
        if (age <= 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 1 and 150.");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Gender cannot be empty.");
        }
        this.gender = gender.trim();
    }

    public void setMedicalCondition(String medicalCondition) {
        if (medicalCondition == null || medicalCondition.trim().isEmpty()) {
            throw new IllegalArgumentException("Medical condition cannot be empty.");
        }
        this.medicalCondition = medicalCondition.trim();
    }

    public void setCategory(PatientCategory category) {
        if (category == null) {
            throw new IllegalArgumentException("Category cannot be null.");
        }
        this.category = category;
    }

    // ===================== DISPLAY DETAILS =====================

    public void displayDetails() {
        System.out.println("==========================================");
        System.out.println("  Patient ID      : " + patientID);
        System.out.println("  Full Name       : " + firstName + " " + lastName);
        System.out.println("  Age             : " + age);
        System.out.println("  Gender          : " + gender);
        System.out.println("  Medical Cond.   : " + medicalCondition);
        System.out.println("  Category        : " + category);
        System.out.println("==========================================");
    }

    @Override
    public String toString() {
        return "Patient[ID=" + patientID
                + ", Name=" + firstName + " " + lastName
                + ", Age=" + age
                + ", Gender=" + gender
                + ", Condition=" + medicalCondition
                + ", Category=" + category + "]";
    }
}

// ===================== SUBCLASS: Inpatient =====================
class Inpatient extends Patient {

    private int wardNumber;
    private String bedNumber;

    public Inpatient(
            String patientID,
            String firstName,
            String lastName,
            int age,
            String gender,
            String medicalCondition,
            int wardNumber,
            String bedNumber) {

        super(patientID, firstName, lastName, age, gender, medicalCondition, PatientCategory.INPATIENT);

        if (wardNumber <= 0) {
            throw new IllegalArgumentException("Ward number must be positive.");
        }

        this.wardNumber = wardNumber;

        if (bedNumber == null || bedNumber.trim().isEmpty()) {
            this.bedNumber = "Not Assigned";
        } else {
            this.bedNumber = bedNumber.trim();
        }
    }

    // ===================== GETTERS =====================

    public int getWardNumber() {
        return wardNumber;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    // ===================== SETTERS =====================

    public void setWardNumber(int wardNumber) {
        if (wardNumber <= 0) {
            throw new IllegalArgumentException("Ward number must be positive.");
        }
        this.wardNumber = wardNumber;
    }

    public void setBedNumber(String bedNumber) {
        if (bedNumber == null || bedNumber.trim().isEmpty()) {
            this.bedNumber = "Not Assigned";
        } else {
            this.bedNumber = bedNumber.trim();
        }
    }

    // ===================== DISPLAY DETAILS =====================

    @Override
    public void displayDetails() {
        System.out.println("==========================================");
        System.out.println("  Patient ID      : " + getPatientID());
        System.out.println("  Full Name       : " + getFirstName() + " " + getLastName());
        System.out.println("  Age             : " + getAge());
        System.out.println("  Gender          : " + getGender());
        System.out.println("  Medical Cond.   : " + getMedicalCondition());
        System.out.println("  Category        : " + getCategory());
        System.out.println("  Ward Number     : " + wardNumber);
        System.out.println("  Bed Number      : " + bedNumber);
        System.out.println("==========================================");
    }

    @Override
    public String toString() {
        return "Inpatient[ID=" + getPatientID()
                + ", Name=" + getFirstName() + " " + getLastName()
                + ", Ward=" + wardNumber
                + ", Bed=" + bedNumber + "]";
    }
}

// ===================== BED MANAGER =====================
class BedManager {

    private static final int ROWS = 4;
    private static final int COLS = 5;
    private static final int TOTAL_BEDS = ROWS * COLS;

    private final String[][] bedLayout;

    public BedManager() {
        bedLayout = new String[ROWS][COLS];
    }

    private int[] bedNumberToIndex(String bedNumber) {
        if (bedNumber == null || bedNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Bed number cannot be empty.");
        }

        bedNumber = bedNumber.trim().toUpperCase();

        if (!bedNumber.matches("B\\d{2}")) {
            throw new IllegalArgumentException("Invalid bed number. Use B01 to B20.");
        }

        int number;
        try {
            number = Integer.parseInt(bedNumber.substring(1));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid bed number format: " + bedNumber);
        }

        if (number < 1 || number > TOTAL_BEDS) {
            throw new IllegalArgumentException("Bed number must be between B01 and B20.");
        }

        int index = number - 1;
        int row = index / COLS;
        int col = index % COLS;

        return new int[]{row, col};
    }

    public String indexToBedNumber(int row, int col) {
        if (row < 0 || row >= ROWS || col < 0 || col >= COLS) {
            throw new IllegalArgumentException("Invalid bed position.");
        }

        int number = row * COLS + col + 1;
        return String.format("B%02d", number);
    }

    public String allocateBed(String patientID) {
        if (patientID == null || patientID.trim().isEmpty()) {
            throw new IllegalArgumentException("Patient ID cannot be empty.");
        }

        if (getAvailableBedCount() == 0) {
            throw new IllegalStateException("No beds available. All 20 beds are occupied.");
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (bedLayout[i][j] == null) {
                    bedLayout[i][j] = patientID.trim();
                    return indexToBedNumber(i, j);
                }
            }
        }

        throw new IllegalStateException("No beds available.");
    }

    public void allocateSpecificBed(String bedNumber, String patientID) {
        if (patientID == null || patientID.trim().isEmpty()) {
            throw new IllegalArgumentException("Patient ID cannot be empty.");
        }

        int[] index = bedNumberToIndex(bedNumber);

        if (bedLayout[index[0]][index[1]] != null) {
            throw new IllegalStateException("Bed " + bedNumber + " is already occupied by patient " + bedLayout[index[0]][index[1]]);
        }

        bedLayout[index[0]][index[1]] = patientID.trim();
    }

    public void releaseBed(String bedNumber) {
        int[] index = bedNumberToIndex(bedNumber);

        if (bedLayout[index[0]][index[1]] == null) {
            throw new IllegalStateException("Bed " + bedNumber + " is already available.");
        }

        bedLayout[index[0]][index[1]] = null;
    }

    public String releaseBedByPatientID(String patientID) {
        if (patientID == null || patientID.trim().isEmpty()) {
            throw new IllegalArgumentException("Patient ID cannot be empty.");
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (bedLayout[i][j] != null && bedLayout[i][j].equalsIgnoreCase(patientID.trim())) {
                    String bedNumber = indexToBedNumber(i, j);
                    bedLayout[i][j] = null;
                    return bedNumber;
                }
            }
        }

        throw new IllegalStateException("No bed found for patient ID: " + patientID);
    }

    public boolean isBedAvailable(String bedNumber) {
        int[] index = bedNumberToIndex(bedNumber);
        return bedLayout[index[0]][index[1]] == null;
    }

    public int getAvailableBedCount() {
        int count = 0;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (bedLayout[i][j] == null) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getOccupiedBedCount() {
        return TOTAL_BEDS - getAvailableBedCount();
    }

    public int getTotalBeds() {
        return TOTAL_BEDS;
    }

    public String[][] getBedLayout() {
        return bedLayout;
    }

    public void displayWardLayout() {
        System.out.println("\n========== WARD BED LAYOUT ==========");
        System.out.println("  [Available = Bed#] [Occupied = XXXX]");
        System.out.println("--------------------------------------");

        for (int i = 0; i < ROWS; i++) {
            System.out.print("  ");
            for (int j = 0; j < COLS; j++) {
                String bedNumber = indexToBedNumber(i, j);
                String display = bedLayout[i][j] == null ? bedNumber : "XXXX";
                System.out.printf("%-6s", display);
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");
        System.out.println("  Total Beds    : " + TOTAL_BEDS);
        System.out.println("  Available     : " + getAvailableBedCount());
        System.out.println("  Occupied      : " + getOccupiedBedCount());
        System.out.printf("  Occupancy %%   : %.1f%%%n", ((double) getOccupiedBedCount() / TOTAL_BEDS) * 100);
        System.out.println("======================================");
    }

    public void displayAvailableBeds() {
        System.out.println("\n===== AVAILABLE BEDS =====");
        boolean any = false;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (bedLayout[i][j] == null) {
                    System.out.print("  " + indexToBedNumber(i, j));
                    any = true;
                }
            }
        }

        if (!any) {
            System.out.println("  No beds available.");
        }
        System.out.println("\n==========================");
    }

    public void displayOccupiedBeds() {
        System.out.println("\n===== OCCUPIED BEDS =====");
        boolean any = false;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (bedLayout[i][j] != null) {
                    System.out.println("  " + indexToBedNumber(i, j) + " -> Patient ID: " + bedLayout[i][j]);
                    any = true;
                }
            }
        }

        if (!any) {
            System.out.println("  No beds currently occupied.");
        }
        System.out.println("=========================");
    }
}

// ===================== PATIENT MANAGER =====================
class PatientManager {

    private final ArrayList<Patient> patients;
    private final BedManager bedManager;

    public PatientManager(BedManager bedManager) {
        this.patients = new ArrayList<>();
        this.bedManager = bedManager;
    }

    public void registerPatient(Patient patient) {
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null.");
        }

        if (searchPatientByID(patient.getPatientID()) != null) {
            throw new IllegalStateException("Patient with ID " + patient.getPatientID() + " already exists.");
        }

        patients.add(patient);
        System.out.println("Patient registered successfully: " + patient.getFirstName() + " " + patient.getLastName() + " [ID: " + patient.getPatientID() + "]");
    }

    public Patient searchPatientByID(String patientID) {
        if (patientID == null || patientID.trim().isEmpty()) {
            throw new IllegalArgumentException("Patient ID cannot be empty.");
        }

        for (Patient patient : patients) {
            if (patient.getPatientID().equalsIgnoreCase(patientID.trim())) {
                return patient;
            }
        }

        return null;
    }

    public boolean updatePatient(String patientID, String firstName, String lastName, int age, String gender, String medicalCondition) {
        Patient patient = searchPatientByID(patientID);

        if (patient == null) {
            throw new IllegalStateException("Patient with ID " + patientID + " not found.");
        }

        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setAge(age);
        patient.setGender(gender);
        patient.setMedicalCondition(medicalCondition);

        System.out.println("Patient details updated successfully for ID: " + patientID);
        return true;
    }

    public boolean deletePatient(String patientID) {
        Patient patient = searchPatientByID(patientID);

        if (patient == null) {
            throw new IllegalStateException("Patient with ID " + patientID + " not found.");
        }

        if (patient.getCategory() == PatientCategory.INPATIENT) {
            Inpatient inpatient = (Inpatient) patient;
            if (!inpatient.getBedNumber().equalsIgnoreCase("Not Assigned")) {
                try {
                    String bed = bedManager.releaseBedByPatientID(patientID);
                    System.out.println("Bed " + bed + " released for patient " + patientID);
                } catch (IllegalStateException e) {
                    System.out.println("Note: " + e.getMessage());
                }
            }
        }

        patients.remove(patient);
        System.out.println("Patient with ID " + patientID + " deleted successfully.");
        return true;
    }

    public void displayAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
            return;
        }

        System.out.println("\n========== ALL REGISTERED PATIENTS ==========");
        System.out.println("Total Patients: " + patients.size());
        System.out.println("----------------------------------------------");

        for (Patient patient : patients) {
            patient.displayDetails();
        }
    }

    public void sortPatientsBySurname() {
        patients.sort(Comparator.comparing(Patient::getLastName, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Patients sorted by surname.");
    }

    public void sortPatientsByID() {
        patients.sort(Comparator.comparing(Patient::getPatientID, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Patients sorted by Patient ID.");
    }

    public ArrayList<Patient> getAllPatients() {
        return patients;
    }

    public int getTotalPatients() {
        return patients.size();
    }

    public int getInpatientCount() {
        int count = 0;
        for (Patient patient : patients) {
            if (patient.getCategory() == PatientCategory.INPATIENT) {
                count++;
            }
        }
        return count;
    }

    public int getOutpatientCount() {
        int count = 0;
        for (Patient patient : patients) {
            if (patient.getCategory() == PatientCategory.OUTPATIENT) {
                count++;
            }
        }
        return count;
    }

    public int getEmergencyCount() {
        int count = 0;
        for (Patient patient : patients) {
            if (patient.getCategory() == PatientCategory.EMERGENCY) {
                count++;
            }
        }
        return count;
    }
}

// ===================== MAIN APPLICATION =====================
public class Mavenproject1 {

    private static PatientManager patientManager;
    private static BedManager bedManager;
    private static Scanner scanner;

    public static void main(String[] args) {
        bedManager = new BedManager();
        patientManager = new PatientManager(bedManager);
        scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("     MediCare Hospital Admission System");
        System.out.println("==========================================");

        boolean running = true;

        while (running) {
            displayMainMenu();
            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    patientManagementMenu();
                    break;
                case 2:
                    bedManagementMenu();
                    break;
                case 3:
                    reportsMenu();
                    break;
                case 4:
                    sortingMenu();
                    break;
                case 0:
                    System.out.println("\nThank you for using MediCare Hospital System. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    // ===================== MENUS =====================

    private static void displayMainMenu() {
        System.out.println("\n==========================================");
        System.out.println("                  MAIN MENU");
        System.out.println("==========================================");
        System.out.println("1. Patient Management");
        System.out.println("2. Bed Management");
        System.out.println("3. Reports");
        System.out.println("4. Sort Patients");
        System.out.println("0. Exit");
        System.out.println("==========================================");
    }

    private static void patientManagementMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n========== PATIENT MANAGEMENT ==========");
            System.out.println("1. Register New Patient");
            System.out.println("2. Search Patient by ID");
            System.out.println("3. Update Patient Details");
            System.out.println("4. Delete Patient");
            System.out.println("5. Display All Patients");
            System.out.println("0. Back to Main Menu");
            System.out.println("========================================");

            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    registerPatient();
                    break;
                case 2:
                    searchPatient();
                    break;
                case 3:
                    updatePatient();
                    break;
                case 4:
                    deletePatient();
                    break;
                case 5:
                    patientManager.displayAllPatients();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void registerPatient() {
        System.out.println("\n--- Register New Patient ---");

        try {
            String id = getStringInput("Patient ID: ");

            if (patientManager.searchPatientByID(id) != null) {
                System.out.println("Patient with ID " + id + " already exists.");
                return;
            }

            String firstName = getStringInput("First Name: ");
            String lastName = getStringInput("Last Name: ");
            int age = getIntInput("Age: ");
            String gender = getStringInput("Gender: ");
            String condition = getStringInput("Medical Condition: ");

            System.out.println("\nCategory Options:");
            System.out.println("1. Inpatient");
            System.out.println("2. Outpatient");
            System.out.println("3. Emergency");

            int categoryChoice = getIntInput("Select Category: ");
            PatientCategory category;

            switch (categoryChoice) {
                case 1:
                    category = PatientCategory.INPATIENT;
                    break;
                case 2:
                    category = PatientCategory.OUTPATIENT;
                    break;
                case 3:
                    category = PatientCategory.EMERGENCY;
                    break;
                default:
                    System.out.println("Invalid category choice.");
                    return;
            }

            Patient newPatient;

            if (category == PatientCategory.INPATIENT) {
                int wardNumber = getIntInput("Ward Number: ");
                System.out.println("Bed Allocation: 1. Auto-Allocate | 2. Specify Bed Number");
                int bedOption = getIntInput("Choice: ");

                String bedNumber = "Not Assigned";
                if (bedOption == 2) {
                    bedNumber = getStringInput("Enter Bed Number (e.g., B01): ");
                    bedManager.allocateSpecificBed(bedNumber, id);
                } else {
                    bedNumber = bedManager.allocateBed(id);
                    System.out.println("Auto-allocated Bed: " + bedNumber);
                }

                newPatient = new Inpatient(id, firstName, lastName, age, gender, condition, wardNumber, bedNumber);
            } else {
                newPatient = new Patient(id, firstName, lastName, age, gender, condition, category);
            }

            patientManager.registerPatient(newPatient);

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void searchPatient() {
        System.out.println("\n--- Search Patient ---");
        String id = getStringInput("Enter Patient ID: ");
        Patient patient = patientManager.searchPatientByID(id);

        if (patient != null) {
            patient.displayDetails();
        } else {
            System.out.println("Patient with ID " + id + " not found.");
        }
    }

    private static void updatePatient() {
        System.out.println("\n--- Update Patient Details ---");
        String id = getStringInput("Enter Patient ID to update: ");
        Patient existing = patientManager.searchPatientByID(id);

        if (existing == null) {
            System.out.println("Patient with ID " + id + " not found.");
            return;
        }

        try {
            String firstName = getStringInput("Enter New First Name: ");
            String lastName = getStringInput("Enter New Last Name: ");
            int age = getIntInput("Enter New Age: ");
            String gender = getStringInput("Enter New Gender: ");
            String condition = getStringInput("Enter New Medical Condition: ");

            patientManager.updatePatient(id, firstName, lastName, age, gender, condition);
        } catch (IllegalArgumentException e) {
            System.out.println("Error updating patient: " + e.getMessage());
        }
    }

    private static void deletePatient() {
        System.out.println("\n--- Delete Patient ---");
        String id = getStringInput("Enter Patient ID to delete: ");

        try {
            patientManager.deletePatient(id);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void bedManagementMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n========== BED MANAGEMENT ==========");
            System.out.println("1. Display Ward Bed Layout");
            System.out.println("2. Display Available Beds");
            System.out.println("3. Display Occupied Beds");
            System.out.println("4. Allocate Specific Bed");
            System.out.println("5. Release Bed");
            System.out.println("0. Back to Main Menu");
            System.out.println("====================================");

            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    bedManager.displayWardLayout();
                    break;
                case 2:
                    bedManager.displayAvailableBeds();
                    break;
                case 3:
                    bedManager.displayOccupiedBeds();
                    break;
                case 4:
                    try {
                        String bedNum = getStringInput("Enter Bed Number (B01-B20): ");
                        String pId = getStringInput("Enter Patient ID: ");
                        bedManager.allocateSpecificBed(bedNum, pId);
                        System.out.println("Bed " + bedNum + " successfully allocated to Patient " + pId);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        String bedNum = getStringInput("Enter Bed Number to release (B01-B20): ");
                        bedManager.releaseBed(bedNum);
                        System.out.println("Bed " + bedNum + " released.");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void reportsMenu() {
        System.out.println("\n========== SYSTEM REPORTS ==========");
        System.out.println("Total Registered Patients: " + patientManager.getTotalPatients());
        System.out.println("  - Inpatients : " + patientManager.getInpatientCount());
        System.out.println("  - Outpatients: " + patientManager.getOutpatientCount());
        System.out.println("  - Emergency  : " + patientManager.getEmergencyCount());
        System.out.println("------------------------------------");
        System.out.println("Bed Statistics:");
        System.out.println("  - Total Beds    : " + bedManager.getTotalBeds());
        System.out.println("  - Available Beds: " + bedManager.getAvailableBedCount());
        System.out.println("  - Occupied Beds : " + bedManager.getOccupiedBedCount());
        System.out.println("====================================");
    }

    private static void sortingMenu() {
        boolean back = false;

        while (!back) {
            System.out.println("\n========== SORT PATIENTS ==========");
            System.out.println("1. Sort by Surname");
            System.out.println("2. Sort by Patient ID");
            System.out.println("0. Back to Main Menu");
            System.out.println("===================================");

            int choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    patientManager.sortPatientsBySurname();
                    patientManager.displayAllPatients();
                    break;
                case 2:
                    patientManager.sortPatientsByID();
                    patientManager.displayAllPatients();
                    break;
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ===================== INPUT HELPERS =====================

    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int value = scanner.nextInt();
                scanner.nextLine(); // Consume newline leftover
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear invalid token
            }
        }
    }

    private static String getStringInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty. Please try again.");
        }
    }
}

