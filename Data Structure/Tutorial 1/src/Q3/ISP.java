package Q3;
public class ISP {
    private String name;

    public ISP(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Plan : "+ name;
    }
}
