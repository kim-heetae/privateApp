package myApp;

import java.util.Scanner;

public class Calculator {

	double plus(double x , double y) {
		return x + y;
	}
	double minus(double x , double y) {
		return x - y;
	}
	double multi(double x , double y) {
		return x * y;
	}
	double division(double x , double y) {
		return x / y;
	}
	double remainder(double x , double y) {
		return x % y;
	}
	public static void main(String[] args) {
		double x;
		double y;
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("첫번째 수를 입력해주세요");
		x = sc.nextDouble();
		System.out.println("두번째 수를 입력하세요");
		y = sc.nextDouble();
		System.out.println("더하기 : " + cal.plus(x,y));
		System.out.println("빼기 : " + cal.minus(x,y));
		System.out.println("곱하기 : " + cal.multi(x,y));
		System.out.println("나누기 몫 : " + Math.floor(cal.division(x,y)));
		System.out.println("나눈 나머지 : " + cal.remainder(x,y));
	}

}
