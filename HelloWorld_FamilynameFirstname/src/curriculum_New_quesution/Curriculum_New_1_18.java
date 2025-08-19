package curriculum_New_quesution;

import java.util.Random;

public class Curriculum_New_1_18 {
    //Q1　
	public static void  printHello(String text, int number) {
		System.out.println("Hello" + text + " " + number);

	}
	//Q2　
	public static void multiply(int a, int b) {
		int result = a * b;
		System.out.println("掛け算の結果は:" + result);
	}
	//Q3
	public static void printArray(int[] numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	//Q4
	public static void multiply(double a, double b) {
		double sum = a + b;
		System.out.println("足し算の結果は:" + sum);
	}
	//Q5
	public static int[] randomNumbers(int count) {
		Random rand =  new Random();
		int[] numbers = new int[count];
		
		for (int i = 0; i < count; i++) {
			numbers[i] = rand.nextInt(100) + 1;
		    System.out.println("生成された数:" + numbers[i]);
		}
		return numbers;
	}
	//Q6
	public static double calculateAverage(int[] numbers) {
	    int sum = 0;
	    for (int num : numbers) {
	        sum += num;
	    }
	    double average = (double) sum / numbers.length;
	    System.out.printf("平均値は %.2f です。\n", average);
	    return average;
	
	}
	//Q7
	public static boolean isAbove50(double average) {
	    boolean result = average >= 50;
	    System.out.println(result);
	    return result;
	}
	
	//メインメソッド
	public static void main(String[] args) {
		printHello("JavaSE", 11);
		
		multiply(2, 5);
		
		int [] numbers = {1, 3, 5, 4, 2};
		printArray(numbers);
		
		multiply(1.5, 3.5);
		
		int[] randoms= randomNumbers(5);
		
		double avg= calculateAverage(randoms);
		
		isAbove50(avg);
	}
}
