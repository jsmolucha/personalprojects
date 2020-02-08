public class truck {
    private String truckid;
    private String zipcode;
    private String numpkg;
    private int pos;

    public truck (int pos, String truckid, String zipcode, String numpkg) {
        this.pos = pos;
        this.truckid = truckid;
        this.zipcode = zipcode;
        this.numpkg = numpkg;
    }

    public truck() {
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public String getTruckid() {
        return truckid;
    }

    public void setTruckid(String truckid) {
        this.truckid = truckid;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getNumpkg() {
        return numpkg;
    }

    public void setNumpkg(String numpkg) {
        this.numpkg = numpkg;
    }

    @Override
    public String toString() {
        return "pos: " + pos
                + " truck_id:" + truckid
                + " zip: " + zipcode
                + " npack: " + numpkg
                + "\n";
    }
}
