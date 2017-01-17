

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double Sqr(){
        if((a+b >= c) & (a+c >= b) & (c+b >= a)){
            double p = (a+b+c)/2;
            return Math.sqrt((p-a)*(p-b)*(p-c)*p);
        }else{
            return 0;
        }
    }
}
