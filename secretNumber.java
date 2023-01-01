import java.util.Scanner;

public class secretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要加密的数字（大于0的整数）：");
        int oldNum = sc.nextInt();
        if (oldNum>0){
            int []arr1 = encryptNum(oldNum);
            String sNum = "";
            for (int i = 0; i < arr1.length; i++) {
                sNum = sNum + arr1[i];
            }

            System.out.println("加密后的数字是：" + sNum);

            System.out.println("数字解密：" + getEncryptNum(encryptNum(oldNum)));
        }else {
            System.out.println("请输入大于0的整数");

        }





    }

    public static int[] encryptNum(int num){
        int newNum = num;
        int count = 0;

        while(num>0){
            num = num/10;
            count++;
        }

        int [] arr1 = new int[count];
        for (int i = 0; i < count; i++) {
            arr1[count-1-i] = (newNum%10 + 5)%10;
            newNum = newNum/10;
        }

        int [] arr2 = new int[count];
        for (int i = 0; i < count; i++) {
            arr2[i] = arr1[count-1-i];
        }

        return arr2;
    }


    public static String getEncryptNum(int [] num){

        String sNum = "";

        int [] arr1 = num;

        int [] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[arr1.length-1-i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]>=0&&arr2[i]<=4){
                arr2[i] = (arr2[i] + 10)-5;
            }else{
                arr2[i] = arr2[i] - 5;
            }
        }
        for (int i = 0; i < arr2.length ; i++) {
            sNum = sNum + arr2[i];
        }


        return sNum;
    }
}
