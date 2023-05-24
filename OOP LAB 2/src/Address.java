public class Address {

    private int houseNumber;
    private int streetNo;
    private String society;
    private String city;

    public Address(int houseNumber,int streetNo,String society,String city)
    {
        this.houseNumber=houseNumber;
        this.streetNo=streetNo;
        this.society=society;
        this.city=city;

    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(int streetNo) {
        this.streetNo = streetNo;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address" +
                "houseNumber=" + houseNumber + '\n'+
                "streetNo=" + streetNo + '\n'+
                "society=" + society + '\n' +
                "city=" + city + '\n' +
                '\n';
    }
}
