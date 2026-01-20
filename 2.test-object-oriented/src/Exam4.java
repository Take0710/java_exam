public class Exam4 {
    public static void main(String[] args) {
        Calculation ca = new Calculation();
     
        System.out.println("足し算結果:"+ca.addition(5, 3));
          System.out.println("引き算結果:"+ca.subtraction(5, 3));
            System.out.println("掛け算結果:"+ca.multiplication(5, 3));
              System.out.println("割り算結果:"+ca.division(5, 3));
                System.out.println("余剰算結果"+ca.remainder(5, 3));
    }
}
