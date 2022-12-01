package task5;


public class AreaClass implements AreaCalculation {


    private final float pi = (float) 3.14;

    public float getPi() {
        return pi;
    }
    @Override
    public void area(float radius) {
        System.out.println("the area = "+ getPi()*radius*radius);
    }

    @Override
    public void area(float height, float width) {
        System.out.println("the area = " + height*width);
    }
}
