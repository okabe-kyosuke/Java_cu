package basicClass;

public class Dog {

	 // Q1：フィールドに動物の名前の変数を定義してください。
    private String name;

    // Q2：フィールドに動物の数の変数を定義してください。
    private int count;

    // Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
    public Dog() {
        this.name = "犬";  // 「犬」を代入
    }

    // Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
    public Dog(int count) {
        this.name = "犬";       // 名前は同じく「犬」にしておく
        this.count = count;     // 引数で受け取った値を代入
    }

    // nameを外から使うためのメソッド（getter）
    public String getName() {
        return name;
    }

    // countを外から使うためのメソッド（getter）
    public int getCount() {
        return count;

	}

}
