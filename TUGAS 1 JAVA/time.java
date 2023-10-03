public class time {
    // deklarasi variabel privat
    private int detik, menit, jam;

    // konstruktor time dengan detik, menit, dan jam yang diinputkan
    public time(int detik, int menit, int jam) {
        this.detik = detik;
        this.menit = menit;
        this.jam = jam;
    }

    // konstruktor time dengan nilai default detik, menit, dan jam
    public time() {
        this.detik = 0;
        this.menit = 0;
        this.jam = 0;
    }

    // publik getter untuk variabel detik privat
    // mengembalikan nilai detik
    public int getDetik() {
        return this.detik;
    }
    
    // publik getter untuk variabel menit privat
    // mengembalikan nilai menit
    public int getMenit() {
        return this.menit;
    }
    
    // publik getter untuk variabel jam privat
    // mengembalikan nilai jam
    public int getJam() {
        return this.jam;
    }

    // publik setter untuk variabel detik
    // mengatur nilai detik
    public void setDetik(int detik) {
        this.detik = detik;
    }
    
    // publik setter untuk variabel menit
    // mengatur nilai menit
    public void setMenit(int menit) {
        this.menit = menit;
    }
    
    // publik setter untuk variabel jam
    // mengatur nilai jam
    public void setJam(int jam) {
        this.jam = jam;
    }
    
    // menampilkan/mencetak nilai detik, menit, dan jam dengan format hh:mm:ss
    public String toString() {
        return String.format("%02d:%02d:%02d", jam, menit, detik);
    }

    // mengatur detik, menit, dan jam ke nilai yang diberikan
    public void setTime(int detik, int menit, int jam) {
        this.detik = detik;
        this.menit = menit;
        this.jam = jam;
    }

    // mengatur pertambahan nilai time setiap 1 detik dengan instan
    public time nextDetik() {
        ++detik;
        if (detik >= 60) {
            detik = 0;
            ++menit;
            if (menit >= 60) {
                menit = 0;
                ++jam;
                if (jam>= 24) {
                    jam = 0;
                }
            }
        }
        return this;
    }
}
