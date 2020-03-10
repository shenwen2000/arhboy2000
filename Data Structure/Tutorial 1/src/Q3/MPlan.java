package Q3;
public class MPlan extends ISP {
    private int Mpbs, GB;

    public MPlan(int Mpbs, int GB, String name) {
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
        price = (Mpbs*5)+(0.8*GB);
        return price;
    }
     public String display(){
        String dis ;
        dis = super.toString()+" price RM:" + cal();
        return dis;
    }
}
