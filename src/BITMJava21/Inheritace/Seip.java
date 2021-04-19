package BITMJava21.Inheritace;

public class Seip extends BitmStudent {
    private String seipId;
    private double styfen;

    public Seip(String name, String id, String phnNum, String seipId, double styfen) {
        super(name, id, phnNum);
        this.seipId = seipId;
        this.styfen = styfen;
    }

    public String getSeipId() {
        return seipId;
    }

    public void setSeipId(String seipId) {
        this.seipId = seipId;
    }

    public double getStyfen() {
        return styfen;
    }

    public void setStyfen(double styfen) {
        this.styfen = styfen;
    }

    @Override
    public String getInfo() {
        return super.getName() + "\n" + super.getNid() + "\n"
                + "\n" + super.getPhnNum() + "\n" + seipId + "\n" + styfen;
    }
}
