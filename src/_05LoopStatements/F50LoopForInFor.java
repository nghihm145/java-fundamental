package _05LoopStatements;
/*
* Bạn hãy viết chương trình hiển thị ra màn hình các số từ 0 tới 24 giống như sau:
* 0 1 2 3 4
* 5 6 7 8 9
* 10 11 12 13 14
* 15 16 17 18 19
* 20 21 22 23 24
* */
public class F50LoopForInFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i * 5 + j + " ");
            }
            System.out.println();
        }
    }
}
