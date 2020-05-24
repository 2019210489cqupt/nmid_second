package second;

import java.util.Scanner;

public class Rent_demo {
    public static void main(String args[]) {
        Car one = new Car(1, "小轿车", 40, 4);
        Car two = new Car(2, "面包车", 65, 7);
        Car three = new Car(3, "大巴车", 180, 20);
        Car four = new Car(4, "低栏车", 30, (float) 1.5);
        Car five = new Car(5, "高栏车", 47, (float) 2.5);
        Car six = new Car(6, "厢式车", 80, (float) 4.5);
        Car seven = new Car(7, "日式皮卡车", 60, 5, 1);
        Car eight = new Car(8, "美式皮卡车", 60, 2, 3);
        Car cars[]={one,two,three,four,five,six,seven,eight};
        System.out.println(one.togetinfo());
        System.out.println(two.togetinfo());
        System.out.println(three.togetinfo());
        System.out.println(four.togetinfo());
        System.out.println(five.togetinfo());
        System.out.println(six.togetinfo());
        System.out.println(seven.togetinfo());
        System.out.println(eight.togetinfo());
        System.out.println("请问租用哪辆车吗(输入对应编号，不加空格）");
        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        char b[]=a.toCharArray();
        double Acost=0;
        int Aday=0;
        int Anum=0;
        int i;
        for(i=0;i<b.length;i++)
        {
            System.out.println("请输入序号为"+b[i]+"的租车数量");
            Scanner scanner1=new Scanner(System.in);
            int n=scanner1.nextInt();
           System.out.println("租车天数为");
            Scanner scanner2=new Scanner(System.in);
            int m=scanner2.nextInt();
            Aday+=m;
            Anum+=n;
            rent c=new rent(m,n);
            Acost+=c.getCost(cars[b[0]]);
         c.togetinfo(cars[i]);
        }
        System.out.println("总天数为"+Aday+"总租车量"+Anum+"总费用为"+Acost);
    }
}

