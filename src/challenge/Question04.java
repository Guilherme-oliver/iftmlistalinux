package challenge;

public class Question04 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c =4;

        if (a > b && a > c){
            if (b > c){
                //System.out.println("%d, %d, %d", a, b, c);
            }else {
                //System.out.println("%d, %d, %d", a, b,c);
            }
        } else if (b > a && b > c) {
            if (a > c){
                //System.out.println("%d, %d, %d", b, a,c);
            }else {
                //System.out.println("%d, %d, %d", b,c,a);
            }
        }else {
            if (b > a){
                //System.out.println("%d, %d, %d", c, a, b);
            }else {
                //System.out.println("%d, %d, %d", c, b, a);
            }
        }
    }
}
