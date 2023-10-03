#include <iostream>
#include <string>
using namespace std;

class Circle {
    private :
        // deklarasi variabel privat
        double jari2;
        string warna;
        
    public :
        // deklarasi variabel publik default yang konstan
        const double jari2_default = 1.0;
        const string warna_default = "merah";

        // Konstruktor pertama dengan jari-jari dan warna yang default
        Circle() {
            jari2 = jari2_default;
            warna = warna_default;
        }

        // Konstruktor kedua dengan jari-jari dan warna yang diberikan
        Circle(double r, string c){
            jari2 = r;
            warna = c;
        }

        // Publik getter untuk jari-jari pada member data privat
        double getJariJari() const {
            return jari2;
        }

        // Publikk setter untuk jari-jari pada member data privat
        void setJariJari(double r) {
            this->jari2 = r;
        }

        // Publik getter untuk warna pada member data privat
        string getWarna() const {
            return warna;
        }

        // Publik setter untuk warna pada member data privat
        void setWarna(string c) {
            this->warna = c;
        }

        // Fungsi untuk menghitung luas lingkaran
        double getLuasLingkaran() const {
            return jari2 * jari2 * 3.14;
        }

        double getKelilingLingkaran() const {
            return 2.0 * jari2 * 3.14;
        }
};

int main() {
    // C1 adalah lingkaran yang memiliki jari-jari 1.2 dan berwarna hijau
    Circle c1(1.2, "hijau");
    cout << "----- C1 -----\n";
    cout << "Jari-jari = " << c1.getJariJari() << " || Warna Lingkaran = " << c1.getWarna() << endl
        << "Luas Lingkaran = " << c1.getLuasLingkaran() << " || Keliling Lingkaran = " << c1.getKelilingLingkaran() << endl;

    // C1 diubah ke lingkaran yang memiliki jari-jari 2.1 dan berwarna biru
    c1.setJariJari(2.1);
    c1.setWarna("biru");
    cout << "\n----- C1 dengan jari-jari dan warna yg berbeda -----\n";
    cout << "Jari-jari = " << c1.getJariJari() << " || Warna Lingkaran = " << c1.getWarna() << endl
        << "Luas Lingkaran = " << c1.getLuasLingkaran() << " || Keliling Lingkaran = " << c1.getKelilingLingkaran() << endl;

    // C2 adalah circle default
    Circle c2;
    cout << "\n----- C2 -----\n";
    cout << "Jari-jari = " << c2.getJariJari() << " || Warna Lingkaran = " << c2.getWarna() << endl
        << "Luas Lingkaran = " << c2.getLuasLingkaran() << " || Keliling Lingkaran = " << c2.getKelilingLingkaran() << endl;

    return 0;
}