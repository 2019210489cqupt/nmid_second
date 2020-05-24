package second;

public class rent {
    private int rday;
    private int rnum;
    public rent(int day,int num)
    {
        this.rday=day;
        this.rnum=num;
    }

    public int getRday() {
        return rday;
    }

    public int getRnum() {
        if(rnum>=0)
        return rnum;
        else
            return -1;
    }

    public void setRday(int rday) {
        this.rday = rday;
    }

    public void setRnum(int rnum) {
        if(rnum>=0)
        this.rnum = rnum;
    }

    public String togetinfo(Car car)
    {
        return "请输入序号"+car.getNum()+"的租用数量"+this.rnum+"总费用为"+this.rday*car.getCost()*this.rday;
    }
    public double getCost(Car car)
    {
        double c=this.rday*car.getCost()*this.rday;
        return c;
    }
}
