public class testPoint {
    public static void main(String[] args) {
        // Tes konstruktor dan toString()
        point p1 = new point(1, 2);
        System.out.println(p1);  // toString()
        //(1,2)
        point p2 = new point();  // default konstruktor
        System.out.println(p2);
        //(0,0)
  
        // Tes Setter dan Getter
        p1.setX(3);
        p1.setY(4);
        System.out.println(p1);  // run toString() to menampilkan nilai Point yg sdh diubah
        //(3,4)
        System.out.println("X is: " + p1.getX());
        //X is: 3
        System.out.println("Y is: " + p1.getY());
        //Y is: 4
  
        // Tes setXY() dan getXY()
        p1.setXY(5, 6);
        System.out.println(p1);  // toString()
        //(5,6)
        System.out.println("X is: " + p1.getXY()[0]);
        //X is: 5
        System.out.println("Y is: " + p1.getXY()[1]);
        //Y is: 6
  
        // Tes the 3 overloaded versions of selisih()
        p2.setXY(10, 11);
        System.out.printf("selisih is: %.2f%n", p1.selisih(10, 11));
        //selisih is: 7.07
        System.out.printf("selisih is: %.2f%n", p1.selisih(p2));
        //selisih is: 7.07
        System.out.printf("selisih is: %.2f%n", p2.selisih(p1));
        //selisih is: 7.07
        System.out.printf("selisih is: %.2f%n", p1.selisih());
        //selisih is: 7.81
     }
}
