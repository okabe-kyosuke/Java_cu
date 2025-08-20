package logic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logic {
    // フィールド（データを入れておく箱）
    private String name;
    private String type;

    // コンストラクタ（newしたときに呼ばれる）
    public Logic(String name, String type) {
        this.name = name;  // thisは「自分のクラスのフィールド」を指す
        this.type = type;
    }

    // nameを返すメソッド
    public String getName() {
        return this.name;
    }

    // typeを返すメソッド
    public String getType() {
        return this.type;
    }

    // 現在の日時を取得して文字列で返すメソッド（nullチェック対策でtry-catch）
    public String getCurrentDateTime() {
        try {
            LocalDateTime now = LocalDateTime.now(); // 今の日時
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            return now.format(formatter);  // フォーマットして返す
        } catch (Exception e) {
            return null; // 失敗したらnullを返す
        }
    }
}