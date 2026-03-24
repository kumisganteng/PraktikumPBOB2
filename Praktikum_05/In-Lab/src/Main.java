public class Main {
    public static void main(String[] args) {

        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);

        System.out.println("Luas P1      : " + P1.getLuas());
        System.out.println("Keliling P1  : " + P1.getKeliling());
        System.out.println("Luas L1      : " + L1.getLuas());
        System.out.println("Keliling L1  : " + L1.getKeliling());

        System.out.println("P1 isEqualLuas P2    : " + P1.isEqualLuas(P2));
        System.out.println("P1 isEqualKeliling P2: " + P1.isEqualKeliling(P2));

        System.out.println("\n=== UJI IResize ===");
        Persegi pTest = new Persegi(10);
        System.out.println("Sebelum zoomIn  : sisi=" + pTest.getSisi());
        pTest.zoomIn();
        System.out.println("Setelah zoomIn  : sisi=" + pTest.getSisi());
        pTest.zoomOut();
        System.out.println("Setelah zoomOut : sisi=" + pTest.getSisi());
        pTest.zoom(200);
        System.out.println("Setelah zoom 200: sisi=" + pTest.getSisi());

        Lingkaran lTest = new Lingkaran(7);
        System.out.println("Sebelum zoomIn  : radius=" + lTest.getRadius());
        lTest.zoomIn();
        System.out.println("Setelah zoomIn  : radius=" + lTest.getRadius());
        lTest.zoomOut();
        System.out.println("Setelah zoomOut : radius=" + lTest.getRadius());
        lTest.zoom(200);
        System.out.println("Setelah zoom 200: radius=" + lTest.getRadius());
    }
}