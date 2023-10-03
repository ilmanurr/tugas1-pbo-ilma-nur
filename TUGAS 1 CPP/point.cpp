#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

class Point {
    private :
        // deklarasi variabel privat
        int x;
        int y;

    public :
        // konstruktor dengan nilai default
        Point() {
            this->x = 0;
            this->y = 0;
        }
        // konstruktor dengan data x dan y yang diberikan
        Point(int x, int y) {
            x = x;
            y = y;
        }

        // fungsi getter untuk mengembalikan nilai variabel x privat 
        int getX() const {
            return x;
        }

        // fungsi setter untuk mengubah variabel x
        void setX(int x) {
            this->x = x;
        }

        // fungsi getter untuk mengembalikan nilai variabel y privat 
        int getY() const {
            return y;
        }

        // fungsi setter untuk mengubah variabel y
        int setY(int y) {
            this->y = y;
        }

        // fungsi setter untuk mengubah/mengatur kedua x dan y 
        void setXY(int x, int y) {
            this->x = x;
            this->y = y;
        }

        // fungsi untuk menentukan dan mengembalikan nilai magnitude
        double getMagnitude() const {
            return sqrt(x*x + y*y);
        }

        // fungsi untuk menentukan dan mengembalikan nilai argument
        double getArgument() const {
            return atan2(y, x);
        }

        // fungsi untuk memberikan output point
        void cetakPoint() const {
            cout << "(" << x << "," << y << ")" << endl;
        }
};

int main() {
    // deklarasi konstruktor point ke-1
    Point point1(3, 4);
    cout << "Point 1 : "; // menampilkan output point ke-1
    point1.cetakPoint();
    cout << "x = " << point1.getX() << endl;
    cout << "y = " << point1.getY() << endl;
    cout << fixed << setprecision(2);
    cout << "mag = " << point1.getMagnitude() << endl;
    cout << "arg = " << point1.getArgument() << endl;

    // mengubah nilai x dan y pada point 1
    point1.setX(6);
    point1.setY(8);
    cout << "\nPoint 1 yang telah diubah : ";
    point1.cetakPoint();

    // mengubah kedua nilai x dan y
    point1.setXY(1, 2);
    cout << "\nPoint 1 yang telah diubah : ";
    point1.cetakPoint();

    // deklarasi konstruktor point ke-2
    Point point2;
    cout << "\nPoint 2 dengan nilai default : ";
    point2.cetakPoint(); // menampilkan output point ke-2 dengan nilai default

    return 0;
}