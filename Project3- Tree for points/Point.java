import java.lang.Math.*;
public class Point {
private int x,y;
 public Point (int x, int y){
this.x=x; this.y=y;}
public int x(){
return x;} // returnthe x-coordinate
public int y(){
return y;} // return the y-coordinatepublic 
double distanceTo(Point z){
return Math.sqrt((x()-z.x())*(x()-z.x())+(y()-z.y())*(y()-z.y()));} // Euclidean distance//between two points
public double squareDistanceTo(Point z){
return distanceTo(z)* distanceTo(z); } // square of the Euclidean
//distance between two pointspublic 
public String toString(){
return "("+x()+","+y()+")";} // string representation: (x, y)
}
