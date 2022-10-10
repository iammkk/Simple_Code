public class DistanceBetweenTwoPoints {
}
class Point2D{
  int x,y;
  public Point2D(int x, int y){
    this.x=x;
    this.y=y;
  }
  public double dist2D(Point2D p){
    int x = this.x-p.x;
    x*=x;
    int y = this.y-p.y;
    y*=y;
    return Math.sqrt(x+y);
  }
  public void printDistance(double d){
    System.out.println("2D distance = "+(int)Math.ceil(d));
  }
}
class Point3D extends Point2D{
  int z;
  public Point3D(int x,int y,int z){
    super(x,y);
    this.z = z;
  }
  public double dist3D(Point3D p){
    int x= this.x-p.x;
    x*=x;
    int y=this.y-p.y;
    y*=y;
    int z=this.z-p.z;
    z*=z;
    return Math.sqrt(x+y+z);
  }
  public void printDistance(double d){
    System.out.println("3D distance = "+(int)Math.ceil(d));
  }
}
