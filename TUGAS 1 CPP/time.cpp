#include <iostream>
#include <iomanip>
using namespace std;

class Time {
    private:
        // deklarasi variabel privat
        int jam;
        int menit;
        int detik;

    public:
        // konstruktor dengan nilai default
        Time() {
            this->jam = 0;
            this->menit = 0;
            this->detik = 0;
        }

        // konstruktor dengan data jam, menit, detik yang diberikan
        Time(int h, int m, int s) {
            this->jam = h;
            this->menit = m;
            this->detik = s;
        }

        // deklarasi fungsi untuk mengembalikan nilai Jam
        // fungsi getter yang bersifat publik untuk variabel jam privat 
        int getJam() const {
            return jam;
        }

        // fungsi setter yang bersifat publik untuk mengatur variabel jam 
        void setJam(int h) {
            this->jam = h;
        }

        // deklarasi fungsi untuk mengembalikan nilai menit
        // fungsi getter yang bersifat publik untuk variabel menit privat 
        int getMenit() const {
            return menit;
        }

        // fungsi setter yang bersifat publik untuk mengatur variabel menit
        void setMenit(int m) {
            this->menit = m;
        }

        // deklarasi fungsi untuk mengembalikan nilai detik
        // fungsi getter yang bersifat publik untuk variabel detik privat 
        int getDetik() const {
            return detik;
        }

        // fungsi setter yang bersifat publik untuk mengatur variabel detik
        void setDetik(int s) {
            this->detik = s;
        }

        // fungsi untuk mengatur nilai Time
        void setTime(int h, int m, int s) {
            this->jam = h;
            this->menit = m;
            this->detik = s;
        }

        // fungsi untuk menampilkan nilai Time
        void cetakTime() const {
            cout << setfill('0');
            cout << setw(2) << jam
                << ":" << setw(2) << menit
                << ":" << setw(2) << detik << endl;
        }

        // fungsi untuk mengatur pertambahan setiap 1 detik dengan instan
        void DetikSelanjutnya() {
            ++detik;
            if (detik >= 60) {
                detik = 0;
                ++menit;
            }
            if (menit >= 60) {
                menit = 0;
                ++jam;
            }
            if (jam >= 24) {
                jam = 0;
            }
        }
};

int main() {
    // deklarasi konstruktor time ke-1
    Time time1(23, 59, 59);
    cout << "Time 1 : ";
    time1.cetakTime(); // menampilkan output time ke-1

    // mengubah nilai jam, menit dan detik dengan setter
    time1.setJam(12);
    time1.setMenit(30);
    time1.setDetik(15);

    // menampilkan output Time yang sebelumnya telah diubah nilainy
    cout << "Time 1 yang telah diubah : ";
    time1.cetakTime();  
    cout << "Jam : " << time1.getJam() << endl;
    cout << "Menit : " << time1.getMenit() << endl;
    cout << "Detik : " << time1.getDetik() << endl;
    cout << endl;

    // deklarasi konstruktor time ke-2
    Time time2;
    cout << "Time 2 : ";
    time2.cetakTime(); // menampilkan output time ke-2
    
    // mengubah nilai Time dengan setter setTime
    time2.setTime(1, 2, 3);
    cout << "Time 2 yang telah diubah : ";
    time2.cetakTime();
    
    // deklarasi konstruktor time ke-3
    Time time3(12, 0, 0);  // Perbaikan 6: Menggunakan nilai default yang sesuai
    cout << "\nTime 3 :";
    time3.cetakTime();

    // deklarasi konstruktor time ke-4
    Time time4(23, 59, 58);
    // menampilkan time ke-4 dan perubahan detiknya
    cout << "\nTime 4 :";
    time4.cetakTime();
    time4.DetikSelanjutnya();
    time4.cetakTime();
    time4.DetikSelanjutnya();
    time4.cetakTime();

    // menggunakan nilai yang tidak valid
    Time time5(25, 61, 99);
    cout << "\nTime 5 : ";
    time5.cetakTime(); // menampilkan time ke-5

    return 0;
}
