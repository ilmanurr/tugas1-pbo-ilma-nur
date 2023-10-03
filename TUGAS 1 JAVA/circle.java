public class circle {
    // deklarasi variabel publik konstan
    public static final double jari2_default = 1.0;
    public static final String warna_deafult = "blue";

    // deklarasi variabel privat
    private double jari2;
    private String warna;

    // konstruktor circle dengan jari-jari dan warna default
    public circle() {
        this.jari2 = jari2_default;
        this.warna = warna_deafult;
    }

    // konstruktor circle dengan jari-jari custom dan warna default
    public circle (double jari2) {
        this.jari2 = jari2;
        this.warna = warna_deafult;
    }

    // konstruktor circle dengan jari-jari dan warna custom
    public circle (double jari2, String warna) {
        this.jari2 = jari2;
        this.warna = warna;
    }

    // deklarasi publik getter untuk variabel jari2 privat
    // mengembalikan nilai jari-jari
    public double getJariJari() {
        return this.jari2;
    }
    
    // deklarasi publik setter untuk variabel jari2
    // mengatur nilai jari-jari
    public void setJariJari(double jari2) {
        this.jari2 = jari2;
    }
    
    // deklarasi publik getter untuk variabel warna privat
    // mengembalikan nilai warna
    public String getWarna() {
        return this.warna;
    }
    
    // deklarasi publik setter untuk variabel warna
    // mengatur nilai warna
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    // menampilkan/mencetak nilai jari2 dan warna circle
    public String toString() {
        return "circle[jari2=" + jari2 + ", warna=" + warna +"]";
    }
    
    // menghitung dan menampilkan luas lingkaran
    public double getLuasLingkaran() {
        return jari2 * jari2 * Math.PI;
    }

    // menghitung dan menampilkan keliling lingkaran
    public double getKelilingLingkaran() {
        return 2.0 * jari2 * Math.PI;
    }
}
