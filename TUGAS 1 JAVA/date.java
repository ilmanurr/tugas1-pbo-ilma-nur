public class date {
    // deklarasi variabel privat
    private int tahun, bulan, hari;

    // konstruktor date dengan tahun, bulan, dan hari yg diinputkan
    public date(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }

    // publik getter untuk variabel tahun privat
    // mengembalikan nilai tahun
    public int getTahun() {
        return this.tahun;
    }
    
    // publik getter untuk variabel bulan privat
    // mengembalikan nilai bulan
    public int getBulan() {
        return this.bulan;
    }
    
    // publik getter untuk variabel hari privat
    // mengembalikan nilai hari
    public int getHari() {
        return this.hari;
    }

    // publik setter untuk variabel tahun
    // mengatur nilai tahun
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    // publik setter untuk variabel bulan
    // mengatur nilai bulan
    public void setBulan(int bulan) {
        this.bulan = bulan;
    }
    
    // publik setter untuk variabel hari
    // mengatur nilai hari
    public void setHari(int hari) {
        this.hari = hari;
    }

    // menampilkan/mencetak nilai tahun, bulan, dan hari dengan format mm/dd/yyyy 
    public String toString() {
        return String.format("%02d/%02d/%4d", bulan, hari, tahun);
    }

    // mengatur tahun, bulan, dan hari
    public void setDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }
}