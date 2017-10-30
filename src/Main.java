import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a;
        a=in.nextInt();
        if(a<=40)
            System.out.println(a*100);

        if(a>40)
            System.out.println(4000+(a-40)*120);
    }
}
