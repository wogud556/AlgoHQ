package java.algo.chap1;

public class pl1 {
    static int max4(int a, int b, int c, int d){ //Q1
        int max = 0;
        if(a >= max){
            max = a;
        }
        if(b >= max){
            max = b;
        }
        if(c >= max){
            max = c;
        }
        if(d>=max){
            max = d;
        }

        return max;
    }

    static int min3(int a, int b, int c){ //Q2
        int min = 0;
        if(a <= min){
            min = a;
        }
        if(b <= min){
            min = b;
        }
        if(c <= min){
            min = c;
        }
        return min;
    }

    static int min4(int a, int b, int c, int d){ //Q2
        int min = 0;
        if(a <= min){
            min = a;
        }
        if(b <= min){
            min = b;
        }
        if(c <= min){
            min = c;
        }
        if(d <= min){
            min = d;
        }
        return min;
    }

    public static void main(String args[]){

    }
}
