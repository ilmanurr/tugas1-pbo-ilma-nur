#include <iostream>
#include <iomanip>
using namespace std;

class Date {
    private:
        // deklarasi variabel privat
        int tahun;
        int bulan;
        int hari;

    public:
        // konstruktor dengan data tahun, bulan, dan hari yang diberikan
        Date(int thn, int bln, int hr) {
            this->tahun = thn;
            this->bulan = bln;
            this->hari = hr;
        }

        // fungsi getter yang bersifat publik untuk variabel tahun privat 
        int getTahun() const {
            return this->tahun;
        }

        // fungsi getter yang bersifat publik untuk variabel bulan privat 
        int getBulan() const {
            return this->bulan;
        }

        // fungsi getter yang bersifat publik untuk variabel hari privat 
        int getHari() const {
            return this->hari;
        }

        // fungsi setter yang bersifat publik untuk variabel tahun privat
        void setTahun(int thn) {
            this->tahun = thn;
        }

        // fungsi setter yang bersifat publik untuk variabel bulan privat
        void setBulan(int bln) {
            this->bulan = bln;
        }

        // fungsi setter yang bersifat publik untuk variabel hari privat
        void setHari(int hr) {
            this->hari = hr;
        }

        // fungsi untuk menampilkan/mencetak Date dengan format dd/mm/yyyy
        void cetakDate() const {
            cout << setfill('0');
            cout << setw(2) << hari
                    << "/" << setw(2) << bulan
                    << "/" << setw(4) << tahun << endl;
        }

        // fungsi untuk mengubah output date yang diberikan sebelumnya
        void setDate(int thn, int bln, int hr) {
            this->tahun = thn;
            this->bulan = bln;
            this->hari = hr;
        }
};

int main() {
    // deklarasi konstruktor
    Date date1(2020, 12, 10);
    cout << "Date 1 : ";
    date1.cetakDate(); // menampilkan output Date
    cout << endl;

    // mengubah nilai tahun, bulan, dan hari dengan setter
    date1.setTahun(2012);
    date1.setBulan(12);
    date1.setHari(23);

    // menampilkan Date yang sebelumnya telah diubah nilainya
    cout << "Date 1 yang sudah diubah : ";
    date1.cetakDate();
    cout << endl;
    cout << "Tahun : " << date1.getTahun() << endl;
    cout << "Bulan : " << date1.getBulan() << endl;
    cout << "Hari/tanggal : " << date1.getHari() << endl;

    // mengubah nilai Date dengan menggunakan fungsi setDate
    date1.setDate(2100, 1, 2);
    cout << "\nDate 1 setelah setDate : ";
    date1.cetakDate();

    return 0;
}
