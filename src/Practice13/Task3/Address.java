package Practice13.Task3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String flat;
    private String[] address;

    public Address(String address){

        System.out.println("Разделитель: ");
        System.out.println("1. ',' ");
        System.out.println("2. ',' '.' ';' ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextInt()==1){
            this.address = address.split(",");
            SetSeparateAddress();
        }
        else
            SetSeparateAddressX(address);



    }
    public void SetSeparateAddress(){
        setCountry(address[0]);
        setRegion(address[1]);
        setCity(address[2]);
        setStreet(address[3]);
        setHouse(address[4]);
        setCorpus(address[5]);
        setFlat(address[6]);
    }
    public void SetSeparateAddressX(String address) {
        StringTokenizer st = new StringTokenizer(address,".,;"    );
        setCountry(st.nextToken());
        setRegion(st.nextToken());
        setCity(st.nextToken());
        setStreet(st.nextToken());
        setHouse(st.nextToken());
        setCorpus(st.nextToken());
        setFlat(st.nextToken());
    }

    public String getCity() {
        return city;
    }

    public String getCorpus() {
        return corpus;
    }

    public String getCountry() {
        return country;
    }

    public String getFlat() {
        return flat;
    }

    public String getHouse() {
        return house;
    }

    public String getRegion() {
        return region;
    }

    public String getStreet() {
        return street;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCorpus(String corpus) {
        this.corpus = corpus;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
