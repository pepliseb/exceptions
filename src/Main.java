import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        try {
            main.prepareDivide();
        } catch (IOException fsdfsdfsfd) {
            System.out.println("Witaj w mojej aplikacji o API OSKARA");
            System.out.println("nie można tutaj  dzielić przez O");
        }
    }
//Api
    public int prepareDivide() throws IOException{
        return divide(5,0);
    }

    private int divide(int a, int b) throws IOException {

        if (b == 0) {
            throw new IOException("Do not divide by 0");

        }
        return a / b;


    }
}