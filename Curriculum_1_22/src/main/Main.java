package main;

import logic.Logic;

public class Main {
    public static void main(String[] args) {
        // Logicクラスのインスタンスを作成（寿司という和食）
        Logic sushi = new Logic("寿司", "和食");

        // メッセージ出力
        System.out.println("こんにちは！ここは日本です！");
        System.out.println("この" + sushi.getName() + "はうまい");
        System.out.println(sushi.getName() + "は" + sushi.getType() + "です");

        // 現在日時の取得と表示（nullチェックあり）
        String now = sushi.getCurrentDateTime();
        if (now != null) {
            System.out.println("今の現在日時は" + now + "です");
        } else {
            System.out.println("現在日時を取得できませんでした。");
        }
    }
}