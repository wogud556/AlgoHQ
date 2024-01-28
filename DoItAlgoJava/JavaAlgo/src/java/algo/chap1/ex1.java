package java.algo.chap1;

public class ex1 {
    static int mid3(int a, int b, int c){//중간값을 구하는 함수

        if(a>=b){
            if(b>=c){
                return b;
            }else if(a<=c){
                return a;
            }else{
                return c;
            }
        }else if(a > c){
            return a;
        }else if(b > c){
            return c;
        }else{
            return b;
        }

    }
}
