public class point {
    // deklarasi variabel privat
    private int x, y;

    // konstruktor point dengan nilai default x dan y 
    public point() {
        this.x = 0;
        this.y = 0;
    }

    // konstruktor point dengan nilai x dan y yang diinputkan
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // publik getter untuk variabel x privat
    // mengembalikan nilai x
    public int getX() {
        return this.x;
    }
    
    // publik setter untuk variabel x
    // mengatur nilai x
    public void setX(int x) {
        this.x = x;
    }
    
    // publik getter untuk variabel y privat
    // mengembalikan nilai y
    public int getY() {
        return this.y;
    }
    
    // publik setter untuk variabel y
    // mengatur nilai y
    public void setY(int y) {
        this.y = y;
    }

    // menampilkan/mencetak nilai x dan y dengan format (x,y)
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    // mengembalikan nilai int array x dan y
    public int[] getXY() {
        int[] hasil = new int[2];
        hasil[0] = this.x;
        hasil[1] = this.y;
        return hasil;
    }

    // mengatur nilai x dan y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // mengembalikan selisih dari x dan y
    public double selisih(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    // mengembalikan selisih dari x dan y dari Point yg diinputkan
    public double selisih(point lainnya) {
        int xDiff = this.x - lainnya.x;
        int yDiff = this.y - lainnya.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    // mengembalikan selisih dari x dan y menjadi (0,0)
    public double selisih() {
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }
}
