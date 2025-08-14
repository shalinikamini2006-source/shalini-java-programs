class Neonnumber{
public static void main(String[]args){
        int num=9;
        int sq=num*num;
        int sum=0;
        while(sq>0){
            sum+=sq%10;
            sq/=10;
        }
        if(sum==num){
            System.out.println(num +"is a Neon number");
        }
        else{
            System.out.println(num +"is not a Neon number");
        }
    }
}