package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

    public static void main(String[] args) {
        // Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
        Dog dog1 = new Dog();  // 引数なしのコンストラクタで生成
        System.out.println("動物の名前：" + dog1.getName());

        // Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
        Dog dog2 = new Dog(4);  // 引数ありのコンストラクタで生成
        System.out.println("動物の数：" + dog2.getCount());

        // Q3：現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        LocalDateTime now = LocalDateTime.now();  // 今の時間を取得
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s"); // 書式を指定
        String formattedDate = now.format(formatter); // フォーマットを適用
        System.out.println("現在の日時：" + formattedDate);
		

	}

}
