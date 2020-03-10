package Q3;
public class Tester {
    public static void main(String[] args){
        
        System.out.println("5Mpbs Subscription and 50GB");
        
        DPlan a = new DPlan(5,50,"DPlanwith");
        MPlan b = new MPlan(5,50,"MPlanwith");
        System.out.println(a.display());
        System.out.println(b.display());
        
        if(a.cal() < b.cal()){
            System.out.println("DPlan is cheaper as compared to MPlan");
        }
        else if(a.cal() > b.cal()){
            System.out.println("MPlan is cheaper as compared to DPlan");
        }
    }
}
