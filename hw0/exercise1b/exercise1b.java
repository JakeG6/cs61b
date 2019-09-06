public class exercise1b {

    public static void drawTriangle(int N) {
        
        String star = "*";

        for (int i = 1; i <= N; i++) {
            
            System.out.println(star);
            star += "*";

        }
    }

    public static void main(String[] args) {
        
        drawTriangle(10);

    }
}