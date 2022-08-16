public class Circle {

    // identifying properties
    Double radius;

    // constructor
    public Circle(Double newRadius) {
        this.radius = newRadius;
    }

    // identifying methods
    Double getCircumference() {
        return this.radius * 2 * Math.PI;
    }

    void setRadius(Double radius) {
        this.radius = radius;
    }

}
