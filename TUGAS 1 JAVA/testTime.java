public class testTime {
   public static void main(String[] args) {
      // Tes konstruktor dan toString()
      time t1 = new time(1, 2, 3);
      System.out.println(t1);  // toString()
      //03:02:01
      time t2 = new time();    // default konstruktor
      System.out.println(t2);
      //00:00:00

      // Tes Setter dan Getter
      t1.setJam(4);
      t1.setMenit(5);
      t1.setDetik(6);
      System.out.println(t1);  // run toString() untuk menampilkan nilai Time yang sudah diubah
      //04:05:06
      System.out.println("Jam : " + t1.getJam());
      //Jam : 4
      System.out.println("Menit : " + t1.getMenit());
      //Menit : 5
      System.out.println("Detik : " + t1.getDetik());
      //Detik : 6

      // Tes setTime()
      t1.setTime(58, 59, 23);
      System.out.println(t1);
      //23:59:58

      // Tes nextDetik() dan chaining
      System.out.println(t1.nextDetik()); // mengembalikan nilai Time yang sudah bertambah satu detik
      //23:59:59
      System.out.println(t1.nextDetik().nextDetik().nextDetik());
      //00:00:02
   }
}