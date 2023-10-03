public class testCircle {
   public static void main(String[] args) {
      // Mengecek semua konstruktor dan toString()
      circle c1 = new circle(1.1, "blue");
      System.out.println(c1);  // menjalankan toString()
      //circle[jari2=1.1, warna=blue]
      circle c2 = new circle(2.2);
      System.out.println(c2);
      //circle[jari2=2.2, warna=red]
      circle c3 = new circle();
      System.out.println(c3);
      //circle[jari2=1.0, warna=red]

      // Mengecek Setter dan Getter
      c1.setJariJari(3.3);
      c1.setWarna("green");
      System.out.println(c1);  
      //circle[jari2=3.3, warna=green]
      System.out.println("Jari-jari : " + c1.getJariJari());
      //Jari-jari : 3.3
      System.out.println("Warna : " + c1.getWarna());
      //Warna : green

      // mengecek getLuasLingkaran() dan getKelilingLingkaran()
      System.out.printf("Luas lingkaran: %.2f%n", c1.getLuasLingkaran());
      //Luas lingkaran: 34.21
      System.out.printf("Keliling lingkaran : %.2f%n", c1.getKelilingLingkaran());
      //Keliling lingkaran: 20.73
   }
}