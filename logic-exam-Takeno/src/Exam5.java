public class Exam5 {
    public static void main(String[] args) {
        String supo[] = {"soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer"};
        int soccer = 0;  
       int baseball = 0; 
        int jogging = 0; 
         int surfing = 0; 
         int boxing = 0;
        for(String e : supo){
                if(e.equals("soccer")){
                        soccer++;
                }
                 if(e.equals("baseball")){
                        baseball++;
                }
                   if(e.equals("jogging")){
                        jogging++;
                }    if(e.equals("surfing")){
                        surfing++;
                }   if(e.equals("boxing")){
                        boxing++;
                }
            }
            if(soccer > baseball && soccer > jogging && soccer > surfing && soccer > boxing){
                System.out.println("最も出現回数の多いスポーツは「soccer」で、出現回数は "+soccer+" 回です");
            }else if(baseball > soccer && baseball > jogging && baseball > surfing && baseball > boxing){
System.out.println("最も出現回数の多いスポーツは「baseball」で、出現回数は "+baseball+" 回です");
   }
   else if(jogging > soccer && jogging > baseball && jogging > surfing && jogging > boxing){
System.out.println("最も出現回数の多いスポーツは「jogging」で、出現回数は "+jogging+" 回です");
    }
      else if(surfing > soccer && surfing > baseball && surfing> jogging && surfing > boxing){
System.out.println("最も出現回数の多いスポーツは「surfing」で、出現回数は "+surfing+" 回です");
    }
         else if(boxing > soccer && boxing > baseball &&boxing> jogging && boxing> surfing){
System.out.println("最も出現回数の多いスポーツは「surfing」で、出現回数は "+boxing+" 回です");
    }
}
}
