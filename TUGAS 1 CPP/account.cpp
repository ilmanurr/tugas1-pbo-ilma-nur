#include <iostream>
#include <iomanip>
using namespace std;

class Account {
    private :
        // deklarasi variabel privat
        int noRekening;
        double saldo;

    public :
        // konstruktor dengan nilai saldo default
        Account(int noRek) {
            this->noRekening = noRek;
            this->saldo = 0.0;
        }

        // konstruktor 
        Account (int noRek, double sld) {
            this->noRekening = noRek;
            this->saldo = sld;
        }

        // fungsi getter untuk mengembalikan nilai variabel noRekening privat
        int getNoRekening() const {
            return noRekening;
        }

        // fungsi getter untuk mengembalikan nilai variabel saldo privat
        double getSaldo() const {
            return saldo;
        }

        // fungsi setter untuk mengubah variabel saldo
        void setSaldo(double sld) {
            this->saldo = sld;
        }

        // fungsi untuk menambahkan jumlah pada saldo
        void kredit(double jumlah) {
            saldo += jumlah;
        }

        // fungsi untuk mengurangi jumlah pada saldo
        void debit(double jumlah) {
            if (jumlah <= saldo) {
                saldo -= jumlah;
            } else {
                cout << "Jumlah yang ditarik melebihi saldo saat ini!" << endl;
            }
        }

        // fungsi untuk menampilkan deskripsi Akun
        void cetakAccount() const {
            cout << fixed << setprecision(2);
            cout << "A/C no : " << noRekening << "  Saldo saat ini : $" << saldo << endl;
        }
};

int main() {
    // deklarasi konstruktor account ke-1
    Account account1(8111, 99.99);
    cout << "--- Account 1 ----" << endl;
    account1.cetakAccount(); // menampilkan output no rekening dan saldo pada account ke-1
    account1.kredit(20); // menambahkan jumlah saldo dengan menggunakan fungsi kredit
    account1.debit(10); // mengurangi jumlah saldo dengan menggunakan fungsi debit
    account1.cetakAccount(); // menampilkan output no rekening dan saldo terbaru

    // deklarasi konstruktor account ke-2
    Account account2(8222);
    cout << "\n--- Account 2 ----" << endl;
    account2.cetakAccount(); // menampilkan output no rekening dan saldo pada account ke-2 dengan nilai default
    account2.setSaldo(100); // mengubah/menambahkan nilai saldo dengan menggunakan fungsi setSaldo
    account2.kredit(20); // menambahkan jumlah saldo dengan menggunakan fungsi kredit
    account2.debit(200); // menampilkan pesan bahwa jumlah yg ditarik melebihi saldo terkini
    account2.cetakAccount(); // menampilkan output no rekening dan saldo terbaru

    return 0;
}