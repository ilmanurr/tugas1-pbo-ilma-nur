public class testAccount {
    public static void main(String[] args) {
        // Tes Konstruktor dan toString()
        account a1 = new account(5566);
        System.out.println(a1);
        //account[no. Rekening=5566,saldo=$0.00]
        account a2 = new account(1234, 99.9);
        System.out.println(a2);
        //account[no. Rekening=1234,saldo=$99.90]
  
        // Tes getters
        System.out.println("No. Rekening : " + a2.getNoRekening());
        //no. Rekening : 1234
        System.out.println("Saldo : " + a2.getSaldo());
        //Saldo : 99.9
  
        // Tes kredit(), debit() dan transferKe()
        a1.kredit(11.1);
        System.out.println(a1);
        //account[no. Rekening=5566,saldo=$11.10]
        a1.debit(5.5);
        System.out.println(a1);
        //account[no. Rekening=5566,saldo=$5.60]
        a1.debit(500);   // Tes debit() error
        //amount exceeded
        System.out.println(a1);
        //account[no. Rekening=5566,saldo=$5.60]
  
        a2.transferKe(1.0, a1);
        System.out.println(a1);
        //account[no. Rekening=5566,saldo=$6.60]
        System.out.println(a2);
        //account[no. Rekening=1234,saldo=$98.90]
      }
}
