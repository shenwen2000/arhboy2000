package Q3;
public class DPlan extends ISP {
    private int Mpbs, GB;

    public DPlan(int Mpbs, int GB, String name) {
        super(name);
        this.Mpbs = Mpbs;
        this.GB = GB;
    }

    public int getMpbs() {
        return Mpbs;
    }

    public int getGB() {
        return GB;
    }

    public void setMpbs(int Mpbs) {
        this.Mpbs = Mpbs;
    }

    public void setGB(int GB) {
        this.GB = GB;
    }
    
    public double cal(){
        double price;
        price = (Mpbs*10)+(0.2*GB);
        return price;
    }
    public String display(){
        String dis ;
        dis = super.toString()+" price RM:" + cal();
        return dis;
    }
}
