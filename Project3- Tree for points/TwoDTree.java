import java.util.*;

public class TwoDTree{
private class TreeNode{ Point item; // an object of the class Point 
TreeNode l; // pointer to left subtree
TreeNode r; // pointer to right subtree
TreeNode(Point item){this.item=item; l=null;r=null;}
}
 private TreeNode head; //roat of the tree
public TwoDTree(){
head=null;

} // construct an empty tree
public boolean isEmpty(){return head==null;} // is the tree empty
public int size(){
return count(head);
} // number of points in the tree
private int count(TreeNode h) { if (h == null) return 0; return 1 + count(h.l) + count(h.r);}
public TreeNode insert(Point p) {
if (isEmpty()) return  TreeNode(p); if (p.x()<head.item.x()||p.y()<head.item.y()) head.l.insert(p); else h.r.insert(p); return head; }// inserts the point p to the tree
public boolean search(Point p){
return search(head,p);}
public boolean searchTree(TreeNode head, Point p){
if (isEmpty()) return false;
if(p.x()==head.item.x()&&p.y()==head.item.y()) return true; 
if (x() > p.x()) return searchTree(h.l, p); 
if (y() < p.y()) return selectTree(h.r, k-t-1);
} // does the tree contain p
public Point nearestNeighbor(Point p){int min=head.item.distanceTo(p);searchNeighbor(head,p,min);}
// point in the tree that is //closest to p (null if tree is empty)
private Point searchNeighbor(TreeNode h, Point P, int min){if(isEmpty())return null; 
if(h.item.distanceTo(p)<min)min=h.item.distanceTo(p);
if(!h.isEmpty()){if(h.item.x()<p.x()||h.item.y()<p.y()) searchNeighbor(h.l,p,min);} 
else{ searchNeighbor(h.r,p,min); } return min;
}

//public List<Point>rangeSearch(Rectanglerect); // Returns a list//with the Points that are contained in the rectangle
}
