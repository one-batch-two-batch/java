class Student{
    private String name;
    private int m1, m2, m3;

    Student(){
        name="unknown";
        m1=m2=m3=0;
    }
    Student(String name, int m1, int m2, int m3){
        this.name=name;
        setMarks(m1,m2,m3);
    }

    void setMarks(int a, int b, int c){
        if (a>=0 && a<=100 && b>=0 &&b<=100 &&c>=0 &&c<=100){
            m1=a;
            m2=b;
            m3=c;            
        }
        else
            System.out.println("Invalid Marks");
    }
    void display(){
        double p=(m1+m2+m3)/3.0;
        char grade;
        if (p>=90) grade='A';
        else if(p>=75) grade='B';
        else if(p>=60) grade='C';
        else if(p>=40) grade='D';
        else grade='F';

        System.out.println("Name: "+name);
        System.out.println("Percentage: "+p);
        System.out.println("Grade: "+grade);

    }
}

class Main{
    public static void main(String[] args){
        Student s=new Student("Sohan",80,75,90);
        s.display();
    }
}