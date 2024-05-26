/**
 * Phone Pyae Moe Yan
 * 05/25/2024
 * Lab 6
 * To learn to familiarize with q queue as used for simulation.
*/
public class Person {
    private String name;
    private String libraryCardNumber;
    private String reasonForBeingInLine;

    public Person(String name, String libraryCardNumber, String reasonForBeingInLine) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.reasonForBeingInLine = reasonForBeingInLine;
    }

    public String getName() {
        return name;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public String getReasonForBeingInLine() {
        return reasonForBeingInLine;
    }

    @Override
    public String toString() {
        return "{ Name: " + name + ", Library Card Number: " + libraryCardNumber + ", Reason: " + reasonForBeingInLine + " }";
    }
}
