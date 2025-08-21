package logic;

public class Animal {
    private String name;           // 動物名
    private double height;         // 体長
    private int speed;             // 速度
    private String scientificName; // 学名

    // コンストラクタ（最初に値を入れる）
    public Animal(String name, double height, int speed) {
        this.name = name;
        this.height = height;
        this.speed = speed;
        this.scientificName = setScientificNameByName(name);
    }

    // 学名を動物名に応じてセットするメソッド
    private String setScientificNameByName(String name) {
        switch (name) {
            case "ライオン": return "パンテラ レオ";
            case "ゾウ": return "ロキソドンタ・サイクロティス";
            case "パンダ": return "アイルロポダ・メラノレウカ";
            case "チンパンジー": return "パン・トゥログロディテス";
            case "シマウマ": return "チャップマンシマウマ";
            default: return "不明";
        }
    }

    // getter（値を取り出す）
    public String getName() { return name; }
    public double getHeight() { return height; }
    public int getSpeed() { return speed; }
    public String getScientificName() { return scientificName; }
}
