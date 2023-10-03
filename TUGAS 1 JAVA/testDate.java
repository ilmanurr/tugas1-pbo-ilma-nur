public class testDate {
  public static void main(String[] args) {
    // Tes konstruktor dan toString()
    date d1 = new date(2020, 2, 8);
    System.out.println(d1); // toString()
    // 02/08/2020

    // Tes Setter dan Getter
    d1.setTahun(2012);
    d1.setBulan(12);
    d1.setHari(23);
    System.out.println(d1);
    // 12/23/2012
    System.out.println("Tahun : " + d1.getTahun());
    // Tahun : 2012
    System.out.println("Bulan : " + d1.getBulan());
    // Bulan : 12
    System.out.println("Hari : " + d1.getHari());
    // Hari : 23

    // Test setDate()
    d1.setDate(2988, 1, 2);
    System.out.println(d1);
    // 01/02/2988
  }
}