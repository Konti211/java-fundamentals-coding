package Kutia;

public class Kuti {
    public int gjatesi;
    public int gjeresi;
    public int lartesi;

    public Kuti(int gjatesi, int gjeresi, int lartesi) {
        this.gjatesi = gjatesi;
        this.gjeresi = gjeresi;
        this.lartesi = lartesi;
    }
        public double vellimi() {
            int vellimi = this.gjatesi * this.gjeresi * this.lartesi;
            return vellimi;
    }
}
