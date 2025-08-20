package main;

import logic.Animal;

public class Main {
    public static void main(String[] args) {
        // Animalクラスのインスタンス作成
        Animal lion = new Animal();

        // データをセット
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        // 出力処理（ヌルチェック込）
        if (lion.getName() != null) {
            System.out.println("動物名：" + lion.getName());
        } else {
            System.out.println("動物名：未設定");
        }

        if (lion.getLength() != null) {
            System.out.println("体長：" + lion.getLength() + "m");
        } else {
            System.out.println("体長：未設定");
        }

        if (lion.getSpeed() != null) {
            System.out.println("速度：" + lion.getSpeed() + "km/h");
        } else {
            System.out.println("速度：未設定");
        }
    }
}