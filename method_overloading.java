class Main{
    static void area(int side){
        System.out.println("Area of square= "+side*side);
    }
    static void area(int length,int breadth){
        System.out.println("Area of Rectangle: "+length*breadth);
    }
    static void area(double radius){
        System.out.println("Area of circle: "+3.14*radius*radius);
    }
    public static void main(String[] args){

        area(5);
        area(5,10);
        area(7.0);
    }
}