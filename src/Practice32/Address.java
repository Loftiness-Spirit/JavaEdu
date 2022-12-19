package Practice32;

public final class Address {
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private char buildingLetter;
    private int apartmentNumber;
    public static Address EMPTY_ADDRESS;

    public Address(String cityName, int zipCode,
                   String streetName, int buildingNumber,
                   char buildingLetter, int apartmentNumber)
    {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
    public String fileString()
    {
        return "'" + this.cityName + "' " + this.zipCode + " '" + this.streetName + "' " + this.buildingNumber + " " + this.buildingLetter + " " + this.apartmentNumber;
    }
    @Override
    public String toString() {
        return "г. " + cityName + " ин. " + zipCode + " ул. " + streetName + " д. " + buildingNumber + " к. " + buildingLetter + " кв. " + apartmentNumber;
    }
}
