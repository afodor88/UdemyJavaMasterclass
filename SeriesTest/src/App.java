import com.mylibrary.Series.Series;

public class App {
    public static void main(String[] args) throws Exception {
        for(int i=0;i<=10;i++){
            System.out.println(Series.nSum(i));
        }

        for(int i=0;i<=10;i++){
            System.out.println(Series.factorial(i));
        }

        for(int i=0;i<=10;i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}
