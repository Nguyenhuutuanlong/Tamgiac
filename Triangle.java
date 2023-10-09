import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        double a,b,c,  chuvi,P, dientich;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Độ dài cạnh thứ nhất =");a=nhap.nextDouble();
        System.out.println("Độ dài cạnh thứ Hai =");b=nhap.nextDouble();
        System.out.println("Độ dài cạnh thứ Ba =");c=nhap.nextDouble();
        chuvi=a+b+c;
        P=(a+b+c)/2;
        dientich= Math.sqrt(P*(P-a)*(P-b)*(P-c));
        System.out.println("chuvi=" +chuvi);
        System.out.println("dientich="+dientich);
        if (a<=0 || b<=0 || c<=0){

            System.out.println("Bạn đã nhập sai dữ liệu ");

        }
        if (a+b>c | b+c>a && c+a>b){
            System.out.println("Đây có thể là một hình tam giác ");

        if (a==b&&b==c&&c==a){
            System.out.println("Đây là một tam giác cân ");
        } else if (a==b &&a!=c||b==c &&b!=a||c==a &&c!=a) {
            System.out.println("Đây là tam giác đều ");
            
        } else if (a*a==b*b+c*c||b*b==a*a+c*c||c*c==b*b+a*a) {
            System.out.println("Đây là một tam giác vuông ");


            
        }
        else {
            System.out.println("Đây không phải là hình tam giác");
        }
        }


    }
}
