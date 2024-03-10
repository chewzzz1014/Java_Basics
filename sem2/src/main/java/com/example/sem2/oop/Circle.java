package com.example.sem2.oop;

class Circle {

    double radius=1, diameter;
    String name = "This Circle";

    Circle(){
    }

    Circle(double getRadius){
        radius = getRadius;
    }

    Circle (String getName){
        name = getName.substring(0, 1).toUpperCase() + getName.substring(1);
    }

    Circle (String getName, double getRadius){
        name = getName.substring(0, 1).toUpperCase() + getName.substring(1);
        radius = getRadius;
    }

    double calcArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    double getDiameter(){
        diameter = 2*radius;
        return diameter;
    }

    void printDetail() {
        System.out.printf("%1s has radius of %.2fcm, diameter of %.2fcm and it's area is %.2fcm^2.\n",
                this.name,
                this.radius,
                this.getDiameter(),
                this.calcArea());
    }

}
