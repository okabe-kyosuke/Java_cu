package curriculmu_B;

import java.util.Scanner;

public class Qes_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

        int students;

        // 【ステップ①】2人以上が入力されるまでループで確認
        do {
            System.out.print("生徒の人数を入力してください（2以上）：");
            students = scanner.nextInt();
        } while (students < 2);

        // 【ステップ②】各教科の点数を格納する配列を作成
        int[] english = new int[students];
        int[] math = new int[students];
        int[] science = new int[students];
        int[] social = new int[students];

        // 各教科の合計点用の変数
        int totalEnglish = 0;
        int totalMath = 0;
        int totalScience = 0;
        int totalSocial = 0;

        // 【ステップ③】生徒ごとの点数を入力
        for (int i = 0; i < students; i++) {
            System.out.print((i + 1) + "人目の『英語』の点数を入力してください：");
            english[i] = scanner.nextInt();
            totalEnglish += english[i];

            System.out.print((i + 1) + "人目の『数学』の点数を入力してください：");
            math[i] = scanner.nextInt();
            totalMath += math[i];

            System.out.print((i + 1) + "人目の『理科』の点数を入力してください：");
            science[i] = scanner.nextInt();
            totalScience += science[i];

            System.out.print((i + 1) + "人目の『社会』の点数を入力してください：");
            social[i] = scanner.nextInt();
            totalSocial += social[i];
        }

        System.out.println(); // 出力の間を空ける

        // 【ステップ④】各生徒の平均点を出力
        for (int i = 0; i < students; i++) {
            double avg = (english[i] + math[i] + science[i] + social[i]) / 4.0;
            System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, avg);
        }

        System.out.println(); // 出力の間を空ける

        // 【ステップ⑤】各教科の平均点を出力
        System.out.printf("英語の平均点は%.2f点です。\n", (double) totalEnglish / students);
        System.out.printf("数学の平均点は%.2f点です。\n", (double) totalMath / students);
        System.out.printf("理科の平均点は%.2f点です。\n", (double) totalScience / students);
        System.out.printf("社会の平均点は%.2f点です。\n", (double) totalSocial / students);

        // 【ステップ⑥】全体の平均点を出力
        int totalAll = totalEnglish + totalMath + totalScience + totalSocial;
        double totalAvg = (double) totalAll / (students * 4);
        System.out.printf("全体の平均点は%.2f点です。\n", totalAvg);

        scanner.close();
    }

	}

