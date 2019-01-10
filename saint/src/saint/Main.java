package saint;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");//使用decimalformat精确小数位数
        while(input.hasNext()) {
            double x,y;
            x = input.nextDouble();
            if(x > 0) {
                y = x*x+1;
            }
            else if(x < 0) {
                y = -x;
            }
            else {
                y = 100;
            }
            System.out.println(df.format(y));
        }
        input.close();
    }

}
