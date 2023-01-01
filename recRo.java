import java.util.Random;

public class recRo {
    public static void main(String[] args) {
        Random r = new Random();
        int [] arr1 = new int[5];
        for (int i = 0; i < arr1.length; ) {
            int num = r.nextInt(5)+1;
            boolean flag = true;
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[j]==num){
                    flag = false;
                    break;
                }
            }
            if (flag){
                arr1[i] = num;
                i++;

            }
        }


        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
