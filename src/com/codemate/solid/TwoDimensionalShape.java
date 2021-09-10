
package com.codemate.solid;

interface TwoDimensionalShape {
    double calculateArea();
}

interface ThreeDimensionalShape {
    double calculateVolume();

}

class Cuboid implements TwoDimensionalShape, ThreeDimensionalShape {

    @Override
    public double calculateArea() {
        // TODO Auto-generated method Stub
        return 0;
    }

    @Override
    public double calculateVolume() {
        // TODO Auto-generated method Stub
        return 0;
    }

}


class Square implements TwoDimensionalShape {

    @Override
    public double calculateArea() {
        // TODO Auto-generated method Stub
        return 0;
    }
}