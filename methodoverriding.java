class Shape{
    void area(){
        System.out.println("Area of shape");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("Area of circle= "+3.14*5*5);
    }
}

class Rectangle extends Shape{
    void area(){
        System.out.println("Area of rectangle= "+5*10);
    }
}

class Main{
    public static void main(String[] args){
        Shape s1=new Circle();
        Shape s2=new Rectangle();

        s1.area();
        s2.area();
    }
}
