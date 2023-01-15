package chapter6;

public class Box {
    double width;
    double height;
    double depth;

    void volume(){
        System.out.println(width * height * depth);
        }
    double volume (double vol){
        return width * height * depth;
    }

   void setDim (double w, double h, double d){
        width = w;
        height = h;
        depth = d;

   }
  Box () {
      System.out.println("Box");
      width = 10;
      height = 20;
      depth = 15;

  }
  Box( double w,double h, double d){
        width = w;
        height = h;
        depth = d;


  }

}






