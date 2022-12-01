import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    enum Shapes { CIRCLE , RECTANGLE }

    public static void main(String[] args) {
        AreaClass obj = new AreaClass() ;
        ArrayList radiusArray = new ArrayList();
        System.out.println("choose the area you want \"CIRCLE\" or \"RECTANGLE\" in capital please!");
        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();
       Shapes answer = Shapes.valueOf(userAnswer);
      try {
          switch (answer){

              case CIRCLE :{
                  System.out.println("how many radius do you want?");
                  int numberOfRadius = sc.nextInt();
                  for(int i = 0 ; i<numberOfRadius ; i++){
                  System.out.println("enter the radius please!");
                  float radius = sc.nextFloat();
                  radiusArray.add(radius);
                  obj.area(radius);
                  }
                  System.out.println(radiusArray);
                  break;
              }
              case RECTANGLE :{
                  System.out.println("enter the height please!");
                  float height = sc.nextFloat();
                  System.out.println("enter the width please!");
                  float width = sc.nextFloat();
                  obj.area(height,width);
                  break;
              }
          }
      }catch (IllegalArgumentException e){
          System.out.println("in capital please");
      }

    }
}

//MCQ:
// (Inheritance)
// (compilation)
// (compile time)
// (encapsulation)
// (true)