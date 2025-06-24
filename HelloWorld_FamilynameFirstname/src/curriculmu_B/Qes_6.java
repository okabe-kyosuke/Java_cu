package curriculmu_B;

import java.util.Random;
import java.util.Scanner;

public class Qes_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
    Scanner scanner = new Scanner(System.in);
    System.out.println("商品名を「、」区切りで入力してください");
	String input = scanner.nextLine();
		
   
    
    String[] items = input.split("、");
    
    Random rand = new Random();
    int tvStock = rand.nextInt(12);
    int displayStock = 11 - tvStock;
    
    for (String item : items) {
     item = item.trim();
     int stock = rand.nextInt(12);
     
     switch (item) {
    	 case "テレビ":
    	 case "ディスプレイ":
    	   String label = item.equals("ディスプレイ") ? "ディスプレイ" : "テレビ";
    	   stock = item.equals("ディスプレイ") ? displayStock : tvStock;
    	   System.out.println(label + "の残りの台数は" + stock + "台です");
    	   break;
    	 
    	 case "パソコン":
    	 case "冷蔵庫":
    	 case "扇風機":
    	 case "洗濯機":
    	 case "加湿器":
    	   System.out.println(item + "の残りの台数は" + stock + "台です"); 
    	   break;
    	   
    	 default:
    		 System.out.println("「" + item + "」は指定の商品ではありません");
    	 
    	 
    	 
    	 
   }
  }
    scanner.close();
 }
}