public class Main{

public Scanner scan;
scan= new Scanner(new File("Tree.txt"));
int N = scan.nextInt(); 
int i=0;
TwoDTree tree;  
while (i<N && scanner.hasNextLine()) {
String line = scanner.nextLine();
try{ 
	int x= (int) line[0];
	int y= (int) line[1];
	Point a= new Point(x,y);
	tree.insert(a); i++;
}catch{System.out,println("Error at input pointers in the tree!!");}}





}