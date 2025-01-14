public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle() {  // 1st (default) constructor
      radius = 1.0;
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double r) {  // 2nd constructor
      radius = r;
   }
   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }

   public void setRadius(double radius){
     this.radius=radius;
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }

   public double getCircumference() {
      return 2*radius*Math.PI;
   }
   
   public String toString(){
     return "Circle[radius="+radius+"]";
   }
}