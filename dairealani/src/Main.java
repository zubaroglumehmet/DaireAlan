import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14,a,alan ;
        Scanner inp = new Scanner(System.in);

        System.out.println("Dairenin Yaricapini Giriniz");
        r=inp.nextInt();
        System.out.println("Dairenin merkez aci olcusunu giriniz");
        a=inp.nextInt();

       /* double alan = pi*r*r;
        double cevre =2*pi*r;*/
        alan=(pi*(r*r)*a)/360;
System.out.println("Dairenin Alani"+alan);
//System.out.println("Dairenin Cevresi:"+cevre);






    }
}