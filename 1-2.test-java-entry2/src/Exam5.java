public class Exam5 {
    public static void main(String[] args) {
        for(int i =1;  i <=100; i++){
            //出力する数値が3と5の倍数が成り立つときは 「FizzBuzz」と出力
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            //出力する数値が3の倍数の時は「Fizz」と出力
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            //出力する数値が5の倍数の時は「Buzz」と出力
            else if(i % 5 == 0){
                 System.out.println("Buzz");
            }
            //その他の数値
            else{
                System.out.println(i);
            }
        }
    }
}
