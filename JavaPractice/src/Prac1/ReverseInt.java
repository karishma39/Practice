package Prac1;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solutioon s=new Solutioon();
		System.out.println(s.reverse(121));
//1534236469
	}

}

class Solutioon {
    public boolean reverse(int x) {
       long rev=0;
       int num=x;
       
       while(x>0)
       {
    	   
       rev=rev*10+ x%10;
       x=x/10;
       }
//       if(rev>=Integer.MAX_VALUE || rev<=Integer.MIN_VALUE)
//    	   return 0;
       
       //return (int) rev;
       
       if(num==rev)
    	   return true;
       else
    	   return false;
    }
}
