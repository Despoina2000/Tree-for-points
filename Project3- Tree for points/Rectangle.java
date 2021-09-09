public class Rectangle{
private Point array[]= new Point[4];
public Rectangle (Point p1, Point p2, Point p3, Point p4){
	Point space[]= new Point[4];
	for(int i=0;i<=4;i++){ if((space[i].x()<0)||( space[i].x()>100)&&(space[i].y()<0)||( space[i].y()>100)) { System.out.println("Error in input"+i);break;}Point t=space[i]; array[i]=t;}} 

public int xmin(){int min=array[0].x(); for (int i=1;i<=4;i++)if(array[i].x()<min)min=array[i].x(); return min;} // minimum x-coordinate of rectangle
public int ymin(){int min=array[0].y(); for (int i=1;i<=4;i++)if(array[i].y()<min)min=array[i].y(); return min;} // minimum y-coordinate of rectangle
public int xmax(){int max=array[0].x(); for (int i=1;i<=4;i++)if(array[i].x()>max)max=array[i].x(); return max;} // maximum x-coordinate of rectangle
public int ymax(){int max=array[0].y(); for (int i=1;i<=4;i++)if(array[i].y()>max)max=array[i].y(); return max;}  // maximum y-coordinate of rectangle
public boolean contains(Point p){
if(p.x()<xmin()||p.x()>xmax()||p.y()<ymin()||p.y()>ymax()) return false; return true;} //does p belong to the rectangle
public boolean intersects(Rectangle that){
if   (  (xmin()>that.xmax())||  ( xmax()  <  that.xmin()  )  || (  ymax() > that.ymin())||( ymin() < that.ymax()))return false; return true;
} // do the two rectangles // intersect?
public double distanceTo(Point p){
double min= array[0].distanceTo(p); for(int i=1;i<=4; i++)if(array[i].distanceTo(p)<min)min= array[i].distanceTo(p); return min;
} // Euclidean distance from p//to closest point in rectangle
public int squareDistanceTo(Point p){
return (int)(distanceTo(p)* distanceTo(p)); } // square of Euclidean // distance from p to closest point in rectangle
public String toString(){return"["+xmin()+","+xmax()+"] x ["+ymin()+","+ymax()+"]";} 
// string representation:// [xmin, xmax] x [ymin, ymax]
}