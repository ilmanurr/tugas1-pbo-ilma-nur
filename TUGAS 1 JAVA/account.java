public class account {
    // deklarasi variabel privat
    private int noRekening;
    private double saldo;

    // konstruktor account dengan noRekening yang diinputkan dan nilai saldo adalah 0
    public account(int noRekening) {
        this.noRekening = noRekening;
        this.saldo = 0.0;
    }

    // konstruktor account dengan noRekening dan saldo yang diinputkan
    public account(int noRekening, double saldo) {
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    // tidak menggunakan setter untuk noRekening dan saldo
    // noRekening tidak didesain untuk diubah nilainya
    // nilai saldo hanya dapat diubah melalui kredit dan debit
    // publik getter untuk variabel noRekening privat
    public int getNoRekening() {
        return this.noRekening;
    }
    
    // publik getter untuk variabel saldo privat
    public double getSaldo() {
        return this.saldo;
    }

    // menampilkan/mencetak nilai noRekening dan saldo
    public String toString() {
        return String.format("account[no. Rekening=%d, saldo=$%.2f]", noRekening, saldo);
    }

    // menghitung jumlah kredit dan menambah saldo
    public void kredit(double jumlah) {
        saldo += jumlah;
    }
    
    // menghitung jumlah debit dan mengurangi saldo jika saldo >= jumlah
    public void debit(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
        } else {
            System.out.println("jumlah terlampaui");
        }
    }

    // mentransfer ke account lainnya jika saldo >= jumlah
    public void transferKe(double jumlah, account lainnya) {
        if (saldo >= jumlah) {
            this.saldo -= jumlah;
            lainnya.saldo += jumlah;
        } else {
            System.out.println("jumlah terlampaui");
        }
    }
}
