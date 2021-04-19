package BITMJava21.Inheritace;

public class BitmStudent {
    private String name;
    private String nid;
    private String phnNum;

    public BitmStudent(String name, String nid, String phnNum) {
        this.name = name;
        this.nid = nid;
        this.phnNum = phnNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
    }

    public String getInfo() {
        return null;
    }
}
