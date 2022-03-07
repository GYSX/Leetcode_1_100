public class _1_两数之和 {
    public static void main(String []args) {
        int x = 11;
        boolean rx=isPalindrome(x);
        System.out.print(rx);
    }
public static boolean isPalindrome(int x) {
    	if (x<0||x%10==0) {
			if(x==0)return true;
    		return false;
    	}
      int y=0,X=x;
      while(X>y) 
	  {
		  y=y*10;
      	y=(y+(X%10));
      	X=(X-(X%10));
		  X=X/10;
		  System.out.print(X+":"+y+"\n");
      }
      if (X==y||X==y/10) 
      	return true;
      else
        return false;
    }
}