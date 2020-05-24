package second;

public class Car {
    //车辆序号、名称、费用、载人（货）能力
    private int num;
    private String name;
    private double cost;
    private float load_cap;
    private int people;
    public Car(int num,String name,double cost,float load_cap)
    {
        this.num=num;
        this.cost=cost;
        this.load_cap=load_cap;
        this.name=name;
    }

    public Car(int num,String name,double cost,int people)
    {
        this.num=num;
        this.cost=cost;
        this.people=people;
        this.name=name;
    }
    public Car(int num,String name,double cost,int people,float load_cap)
    {
        this.num=num;
        this.cost=cost;
        this.people=people;
        this.name=name;
        this.load_cap=load_cap;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setLoad_cap(float load_cap) {
        this.load_cap = load_cap;
    }

    public float getLoad_cap() {
        return load_cap;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public String togetinfo()
    {
        if(this.people==0)
        return "车的编号为"+this.num+"名称是"+this.name+"费用为"+this.cost+"载货量为"+this.load_cap;
        else
        {
            if(this.load_cap==0)return "车的编号为"+this.num+"名称是"+this.name+"费用为"+this.cost+"载人量为"+this.people;
            return        "车的编号为"+this.num+"名称是"+this.name+"费用为"+this.cost+"载人量为"+this.people+"载货量为"+this.load_cap;

        }

    }
}
