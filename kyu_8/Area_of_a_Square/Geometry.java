package kyu_8.Area_of_a_Square;

class Geometry {
    static double squareArea(double X) {
        return Math.round(Math.pow(.636619 * X, 2) * 100) / 100.;
    }
}