package main;

import java.util.Scanner;

import character.Hero;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("名前を入力してください：");
        String inputName = scanner.nextLine();
        scanner.close();

        // nullまたは空文字チェック
        if (inputName == null || inputName.trim().isEmpty()) {
            System.out.println("名前が未入力です。もう一度実行してください。");
            return;
        }

        Hero hero = new Hero(inputName);

        System.out.println("\nこんにちは 「" + hero.getName() + "」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hero.getHp());
        System.out.println("MP：" + hero.getMp());
        System.out.println("攻撃力：" + hero.getAttack());
        System.out.println("素早さ：" + hero.getSpeed());
        System.out.println("防御力：" + hero.getDefense());
        System.out.println("\nさあ冒険に出かけよう！");
    }
}