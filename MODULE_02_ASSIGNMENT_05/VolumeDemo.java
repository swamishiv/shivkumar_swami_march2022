//1. Create a class Box that uses a parameterized method to initialize 
//the dimensions of a box.(dimensions are width, height, depth of double type). 
//The class should have a method that can return volume. Obtain an object 
//and print the corresponding volume in main() function


class Box
{
  double width;
  double height;
  double depth;
  
  Box(double width, double height, double depth)
  {
	  this.width=width;
	  this.height=height;
	  this.depth=depth;
	
  }
  
  
  double Volume()
  {
	  double volume = width*height*depth;
	  return volume;
 }
 
}




class VolumeDemo
{
   public static void main (String args[])
   {
	   Box v = new Box(10.0,10.0,10.0);
	   System.out.println(v.Volume());
	  
	   
   }
}