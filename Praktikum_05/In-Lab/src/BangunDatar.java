public abstract class BangunDatar {
    protected String warna;
    protected String border;

    // Constructor
    public BangunDatar() {}
    public BangunDatar(String warna, String border) {
        this.warna = warna;
        this.border = border;
    }

    // Getter & Setter
    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }
    public String getBorder() { return border; }
    public void setBorder(String border) { this.border = border; }

    // Abstract method
    public abstract double getLuas();
    public abstract double getKeliling();

    // Method isEqualLuas & isEqualKeliling
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}