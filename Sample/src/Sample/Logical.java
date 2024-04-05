package Sample;

public class Logical {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int score=59;
        
        System.out.println("scoreが40以上かつ50以下");
        System.out.println(score>=40 && score<=50);
        
        System.out.println("scoreが40以上または50以下");
        System.out.println(score>=40 || score<=50);
        
        System.out.println("scoreが60以上ではない");
        System.out.println(!(score>=60));
        

    }

}
