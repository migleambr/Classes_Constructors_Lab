public class Rectangle {

    // identifying properties
    Double length;
    Double width;

    // constructor
    public Rectangle(Double newLength, Double newWidth) {
        this.length = newLength;
        this.width = newWidth;
    }

    // identifying methods
    Double getPerimeter() {
        return this.length * 2 + this.width * 2;
    }

    Double getArea() {
        return this.length * this.width;
    }

    Double getDiagonal() {
        return Math.sqrt(Math.pow(this.length, 2) + Math.pow(this.width, 2));
    }

}
