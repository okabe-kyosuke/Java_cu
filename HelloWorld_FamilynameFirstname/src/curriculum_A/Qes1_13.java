package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//バイト型変数として宣言
				byte b;
				//短整数型変数として宣言
				short s;
				//整数型変数として宣言
				int i;
				//長整数型変数として宣言
				long l;
				//単精度浮動小数点数型変数として宣言
				float f;
				//倍精度浮動小数点数型変数として宣言
				double d;
				//文字型変数として宣言
				char c;
				//文字列型変数として宣言
				String str;
				//ブーリアン型変数として宣言
				boolean boo;
				//バイト型変数の初期化
				b = 0;
				//短整数型変数の初期化
				s = 0;
				//整数型変数の初期化		
				i = 0;
				//長整数型変数の初期化
				l = 0;
				//単精度浮動小数点数型変数の初期化
				f = 0.0f;
				//倍精度浮動小数点数型変数の初期化
				d = 0.0d;
				
				//初期化をした変数に代入する
				
				b = 10;
				
				s = 100;
				
				i = 1000;
				
				l = 10000;
				
				f = 9.5f;
				
				d = 10.5;
				
				c = 'a';
				
				str = "ハロー";
				
				boo = true;
				
				
				//上記の変数を利用して値を出していく
				//A-4
				
				long result = b + s + i +l;
				
				System.out.println(result);
				
				double result1 = f + d;
				
				System.out.println(result1);
				
				String result2 = c + str + boo;
				
				System.out.println(result2);
				
				double result3 = b + s + i + l + f + d;
				
				System.out.println(result3);
				
				double result4 = d / s;
				
				System.out.println(result4);
				
				double result5 = b - s;
				
				System.out.println(result5); 
				
				//ハローJAVA43と表示させる
				//A-5
				
				int num = 20;
				
				int num1 =23;
				
				System.out.println("ハローJAVA"+(num+num1));
				
				
				//変数を変更しフォーマットのとおりに出力
				//A-6
				
				String name = "山田太郎";
				
				int age = 18;
				
				double height = 170.5;
				
				double weight = 62.2;
				
				String favoriteFood = "寿司";
				
				System.out.println("初めまして"+name+"です");
				
				System.out.println("年齢は"+age+"歳です");
				
				System.out.println("身長は"+height+"cmです");
				
				System.out.println("体重は"+weight+"kgです");
				
				System.out.println("好きな食べ物は"+favoriteFood+"です");
				
				//BMIを出力させる
				//A-7
				
				height = 1.705;
				
				double result6 = weight/(height*height);
				
				System.out.printf("BMIは%.2fです%n",result6);
				
				//A-6の変数に再代入してコンソールに出力させる
				//A-8
				
				name = "鈴木一郎";
				
				age = 24;
				
				height = 168.5;
				
				weight = 64.2;
				
				favoriteFood  = "オムライス";
				
				System.out.println("初めまして"+name+"です");
				
                System.out.println("年齢は"+age+"歳です");
				
				System.out.println("身長は"+height+"cmです");
				
				System.out.println("体重は"+weight+"kgです");
				
				System.out.println("好きな食べ物は"+favoriteFood+"です");
				
				height = 1.685;
				
				result6 = weight/(height*height);
			
				System.out.printf("BMIは%.2fです%n",result6);
				
				//A-8を利用し、和算で自己代入しコンソールに出力させる
				//A-9
				
				height = 168.5;
				
				int result7 = age+age;
				
				double result8 = height+height;
				
				double result9 = weight+weight;
				
                System.out.println("初めまして"+name+"です");
				
                System.out.println("年齢は"+result7+"歳です");
				
				System.out.println("身長は"+result8+"cmです");
				
				System.out.println("体重は"+result9+"kgです");
				
				System.out.println("好きな食べ物は"+favoriteFood+"です");
				
				height = 3.37;
				
				result6 = result9/(height*height);
				
				System.out.printf("BMIは%.2fです%n",result6);
				
				//A-8で使用された年齢が25歳以上ならtrueが出力される
				//A-10
				
				System.out.println(age >= 25);
				
				//A-8で使用した【年齢・身長・体重】を文字列型に型変換しつなげて出力する
				//A-11
				
                age = 24;
				
				height = 168.5;
				
				weight = 64.2;
				
				String str1 = String.valueOf(age);
				
				String str2 = String.valueOf(height);
				
				String str3 = String.valueOf(weight);
				
				System.out.println(str1);
				
				System.out.println(str2);
				
				System.out.println(str3);
				
				String str4 = String.valueOf(age) + String.valueOf(height) + String.valueOf(weight);
				
				System.out.println(str4);
				
				
				
				//A-11で変換した【年齢・身長】を整数型に変換して出力
				//A-12
				
				
				
				
	}

}
