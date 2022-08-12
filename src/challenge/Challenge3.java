package challenge;

public class Challenge3 {
    public static void main(String[] args) {
        int num1, num2, result;
        num1 = 12;
        num2 = 19;

        for (int i = 1; i < num1; i++){
            if ((num1 % i) == 0){
                num2 = i;
            }
        }
        System.out.println(num2);
    }
}
