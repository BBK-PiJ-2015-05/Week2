/*
 * Day 4 Exercise 6
 * Defines a class of points and its methods
 */


public class Point{
            double x;
            double y;

    //calculates the distance to another point
    private double distanceTo(Point p){
        double distanceX = Math.pow((p.x - this.x), 2);
        double distanceY = Math.pow((p.y - this.y), 2);
        double distance = Math.sqrt(distanceY + distanceY);
        return distance;
    }
    
    //calculates the distance to origin
    private double distanceToOrigin(){
        double distanceX = Math.pow((0.0 - this.x), 2);
        double distanceY = Math.pow((0.0 - this.y), 2);
        double distance = Math.sqrt(distanceY + distanceY);
        return distance;
    }
    
    //changes the coordinates of this point to be the given parameters x and y
    private void moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    //changes the coordinates of this point to move where the given point is
    private void moveToPoint(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    //returns a copy of the current point with the same coordinates
    private Point clonePoint(){
        Point a = new Point();
        a.x = this.x;
        a.y = this.y;
        return a;
    }
    
    //returns a copy of the current point with the coordinates multiplied by -1
    private Point opposite(){
        Point a = new Point();
        a.x = -(this.x);
        a.y = -(this.y);
        return a;
    }
}

