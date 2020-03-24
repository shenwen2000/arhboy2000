package Q5;
public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double Discriminant(){
        return (Math.pow(b, 2)-(4*a*c));
    }
    public double calcRoot1(){
        double r1 ;
        r1 = ((b*-1)+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        if(Discriminant()>=0){
            return r1;
        }
        else 
            return 0;
    }
    public double calcRoot2(){
        double r2;
        r2 =  r2 = ((b*-1)-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        if(Discriminant()>=0){
          return r2;
    }
        else 
            return 0;
  }
}
