public class Exam3 {
    public static void main(String[] args) {
        int A = 200;
        int B = 250;
        int subtotal = (200*3)+(250*4);
        int tax = (int)(((200*3)*0.1)+((250*4)*0.1));
        int total = subtotal + tax;
        System.out.println("==============");
        System.out.println("小計");
        System.out.println(subtotal+"円"); 
        System.out.println("消費税");
        System.out.println(tax+"円");
        System.out.println("合計⾦額");
        System.out.println(total+"円");
        System.out.println("==============");
    }
}
