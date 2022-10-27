public class Main {

    private String outerMsg = "Mainクラスのメンバ変数";

    public static void main(String[] args) {

        Main test = new Main();
        test.say();

    }

    public Main() {
        super();
    }

    //内部クラスInnerの宣言
    private class Inner {
        private String innerMsg = "Innerクラスのメンバ変数";
        void innerSay() {
            //内部クラスからOuterクラスのメンバ変数が参照可能
            System.out.println(outerMsg);
            System.out.println(innerMsg);
        }
    }

    void say() {
        //Outerクラスのメソッドから内部クラスのインスタンス化が可能
        Inner ins1 = new Inner();
        ins1.innerSay();
    }

}