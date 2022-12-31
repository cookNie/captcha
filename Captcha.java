import java.util.Random;

public class Captcha {
    public static void main(String[] args) {
        String [] cap = getCap();
        String capS = "";
        for (int i = 0; i < 5; i++) {
            capS = capS + cap[i];
        }
        System.out.println(capS);
    }
    public static String[] getCap(){
        String [] capNum = new String[5];
        Random r = new Random();
        String [] arr1 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String [] arr2 = {"0","1","2","3","4","5","6","7","8","9"};

        for (int i = 0; i < 4; i++) {

            capNum[i] = arr1[r.nextInt(52)];
        }
        capNum[4] = arr2[r.nextInt(10)];

        return capNum;
    }
}
