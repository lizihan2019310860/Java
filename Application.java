package jiekou;

public class Application {
	public static void main(String args[]){
		Doctor people1;
		Doctor people2;
		people1 =new Doctor("张三","男","20");
		people2 =new Doctor("李四","男","20");
		System.out.println(people1.toString());
		people1.getPay(500);
		people1.setPay(500);
		people1.getSalaly(10000);
		people1.setSalaly(10000);
		System.out.println(people2.toString());
		people2.getPay(500);
		people2.setPay(500);
		people2.getSalaly(10000);
		people2.setSalaly(10000);
		Text T1;
		T1=new Text();
		T1.Sub(people1.Salaly,people1.Pay);
	}
}
