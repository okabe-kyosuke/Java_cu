package main;

import java.util.Scanner;

import logic.Animal;

public class Main {
    public static void main(String[] args) {
        // 入力受付
        Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください");

        // 入力例 → ライオン:2.1:80,ゾウ:3.2:40,...
        String input = scanner.nextLine();
        scanner.close();  // 入力閉じる

        // カンマで分割（動物ごとに）
        String[] animalData = input.split(",");

        for (String data : animalData) {
            // コロンで分割（1頭の情報）
            String[] parts = data.split(":");

            // ヌルチェック & 長さ確認
            if (parts.length != 3) continue;

            String name = parts[0];
            double height = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);

            // Animalクラスに渡して作成
            Animal animal = new Animal(name, height, speed);

            // 出力
            System.out.println();
            System.out.println("動物名：" + animal.getName());
            System.out.println("体長：" + animal.getHeight() + "m");
            System.out.println("速度：" + animal.getSpeed() + "km/h");
            System.out.println("学名：" + animal.getScientificName());
        }
    }
}