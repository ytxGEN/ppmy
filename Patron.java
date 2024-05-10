/**
 * A class to represent library patron
 */
public class Patron {
    private String name;
    private int libraryCardNumber;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;

    public Patron(String name, int libraryCardNumber, String streetAddress, String city, String state, String zip) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "name=" + name +
                ", libraryCardNumber=" + libraryCardNumber +
                ", streetAddress=" + streetAddress +
                ", city=" + city +
                ", state=" + state +
                ", zip=" + zip +
                '}';
    }
}
