import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始数字：");
        int startNum = sc.nextInt();

        System.out.println("请输入结束数字：");
        int endNum = sc.nextInt();
        getPrimeNumber(startNum,endNum);


    }

    public static void getPrimeNumber(int start,int end){
        int count = 0;


        for (int i = start; i <=end ; i++) {
            boolean flag = true;
            for (int j = 2; j <=i/2 ; j++) {

                if (i%j==0){
                    flag = false;
                    break;

                }
            }
            if (flag){
                count++;
                System.out.println(i + "是素数");
            }
        }
        System.out.println("共有" + count + "个素数");
    }
}
