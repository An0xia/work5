public class Circleee {
    private double radius=1;
    private static int numberOfObjects=0;
    public Circleee(){
        numberOfObjects++;
    }
    public Circleee(double newRaidus){
        radius=newRaidus;
        numberOfObjects++;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public void setRadius(double newRaidus){
        radius=(newRaidus>=0)?newRaidus:0;
    }
    public static int getNumberOfObjects(){
        return numberOfObjects;
    }
    public double getRadius(){
        return radius;
    }
}
