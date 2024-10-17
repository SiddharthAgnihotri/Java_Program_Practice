import java.util.Scanner;
public class Addition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c,max,min,sum;
		System.out.println("Enter three numbers : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if(a>b && a>c){
			max = a;
		}else if(b>a && b>c){
			max = b;
		}else{
			max=c;
		}
		if(a<b && a<c){
			min = a;
		}else if(b<a && b<c){
			min = b;
		}else {
			min = c;
		}
		sum = min + max;
		System.out.println("Sum of numbers : " + sum);

	}
}
