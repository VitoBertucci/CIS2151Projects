public class Cars {
    public String tires;
    public int length;
    public int horses;
    public String name;

    Cars() {
        tires = "dope";
        length = 200;
        horses = 130;
        name = "Fiat";
    }

    Cars(String uTires) {
        setTires(uTires);
        length = 300;
        horses = 200;
        name = "BMW";
    }

    public void setTires(String uTires) {
        tires = uTires;
    }
    public String getTires() {
        return tires;
    }
}
