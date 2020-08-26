public class Triangle {

    int base = 0;
    int height = 0;
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    boolean check(){
        return base > 0 && height > 0;
    }
    public float getArea(){
        if(check()) {
            return (float) ((base * height) / 2.0);
        }
        return 0;
    }
    public void show(){
        if(check()){
            System.out.println("Base: "+base+", Height: "+height + "Area: "+getArea());
        }else{
            System.out.println("Error - base / height cannot be 0 or negative");
        }
    }
    public void compare(Triangle t2){
        if(getArea()>0) {
            if (getArea() == t2.getArea()) {
                System.out.println("Equal Size");
            } else if (getArea() > t2.getArea()) {
                System.out.println("Larger Size");
            } else {
                System.out.println("Smaller Size");
            }
        }else{
            System.out.println("Error - base / height cannot be 0 or negative");
        }
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(10,10);
        t1.show();

        Triangle t2 = new Triangle(0,10);
        t2.show();

        Triangle t3 = new Triangle(10,-100);
        t3.show();

        Triangle t4 = new Triangle(10,50);
        Triangle t5 = new Triangle(5,100);
        t4.compare(t5);

        t4.base = 100;
        t4.height = 50;
        t4.compare(t5);

        t4.base = 10;
        t4.height = -50;
        t4.compare(t5);


    }
}
