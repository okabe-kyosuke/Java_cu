package curriculmu_B;

import java.util.Random;
import java.util.Scanner;
public class QES1_3 {

	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
    
		 
		
	//b-1-3　入力チェックシステムの作成
	//b-1
		
	Scanner scanner = new Scanner(System.in);  //入力を受け取る準備
	String username = scanner.nextLine();      //入力された文字を変数にいれる
	
	if (username.length() > 10) {
		System.out.println("名前を10文字以内にしてください");
	}
	
	else if (username == null || username.length() == 0) {
		System.out.println("名前を入力してください");
	}
	
	//b-2
	
	else if (!username.matches("[0-9a-zA-Z]+")) {
		System.out.println("半角英数字のみで入力してください");
	}
	
	else {System.out.println("ユーザー名「" + username + "」を登録しました");
	}
	
	//b-3
	 // じゃんけんスタート
    startJanken(username);
}

public static void startJanken(String username) {
    Random rand = new Random();
    String[] hands = { "グー", "チョキ", "パー" };
    int count = 0;

    while (true) {
        count++;

        int myHand = rand.nextInt(3);
        int enemyHand = rand.nextInt(3);

        System.out.println(username + "の手は「" + hands[myHand] + "」");
        System.out.println("相手の手は「" + hands[enemyHand] + "」");

        if (myHand == enemyHand) {
            System.out.println("DRAW あいこもう一回しましょう！");
            continue;
        }

        // 勝ち条件
        if ((myHand == 0 && enemyHand == 1) ||
            (myHand == 1 && enemyHand == 2) ||
            (myHand == 2 && enemyHand == 0)) {
            System.out.println("やるやん。\n次は俺にリベンジさせて");
            break;
        }

        // 負け：相手が勝った手ごとにメッセージを変える
        if (enemyHand == 0) {
            System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！");
        } else if (enemyHand == 1) {
            System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
        } else {
            System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
        }
    }

    System.out.println("勝つまでにかかった合計回数は " + count + " 回です");
}
}
