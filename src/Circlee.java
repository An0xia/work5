public class Circlee {
    double radius;
    static int numberOfObjects = 0;
    Circlee(){
        radius = 1;
        numberOfObjects ++;
    }
    Circlee(double newRadius){
        radius = newRadius;
        numberOfObjects ++;
    }
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius * radius *Math.PI;
    }
}
