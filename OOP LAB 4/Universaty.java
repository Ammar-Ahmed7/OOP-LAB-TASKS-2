public class Universaty {
    public String universityName;
    public String Address;
    public int rank;

    public Universaty(String universityName, String address, int rank) {
        this.universityName = universityName;
        Address = address;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return  "\nUniversity Name: " + universityName +
                "\nUniversity Address: '" + Address +
                "\nUniversity Rank: " + rank ;
    }
}
