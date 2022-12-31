import java.util.Scanner;

public class airPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double oldPrice = sc.nextDouble();

        System.out.println("请输入月份：");
        int month = sc.nextInt();

        System.out.println("请输入机舱类型(1为头等舱，2为经济舱)：");
        int cabinNum = sc.nextInt();

        double newPrice = oldPrice;

        if(month >= 5 && month <= 10){
            switch (cabinNum){
                case 1 -> newPrice = oldPrice*0.9;
                case 2 -> newPrice = oldPrice*0.85;
            }

        } else if ((month>=1&&month <=4) || (month >= 11&&month<=12)) {
            switch (cabinNum){
                case 1 -> newPrice = oldPrice*0.7;
                case 2 -> newPrice = oldPrice*0.65;
            }
        }else {
            System.out.println("请输入正确的月份");
        }

        System.out.println(newPrice);

    }
}
