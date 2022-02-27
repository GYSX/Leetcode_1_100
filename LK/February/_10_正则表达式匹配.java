public class _10_正则表达式匹配 {

    public static void main(String[] asgr) {
        String s="ab";
        String p=".*..";


        boolean a= isMatch(s,p);
        System.out.println( a );
    }

    public static boolean isMatch(String s, String p) {
        if (p.length()==2&&p.charAt(0)==46&&p.charAt(1)==42) {
        return true;
        }
        int a=0;
        for (int i=0,j=0;j<p.length();i++,j++){

            char s_c=s.charAt(i);
            char p_c=p.charAt(j);
            System.out.println("<"+s_c+p_c+">");
            if (s_c!=p.charAt(j)){

                if (p_c>=97&&p_c<=122){
                    if ((j+1)<p.length()) {
                        if (p.charAt(j + 1) == 42) {
                            System.out.println("假a*");
                            j = j + 1;
                            i--;
                            a=1;
                            if (j>=p.length())return false;
                        } else {
                            System.out.println("<" + i + ":" + j + ">匹配错误");
                            return false;
                        }
                    }
                    else {
                        System.out.println("<" + i + ":" + j + ">匹配错误");
                        return false;
                    }
                }else {}

                if (p_c==46){
                }else {}

                if (p_c==42){
                    if (p.charAt(j - 1)==46) {
                        System.out.println(".*");
                        j--;
                    }
                    else {
                        if (s_c==p.charAt(j-1)){
                            System.out.println("a*");
                            j--;
                        }else {
                            if ((j+1)<p.length()) {
                                if (s_c == p.charAt(j + 1)||p.charAt(j + 1)==46) {
                                        j++;
                                } else {
                                    System.out.println("a*-");
                                    return false;
                                }
                            }else {
                                    System.out.println("a*-："+"j+1");
                                return false;
                            }
                        }
                    }
                }else {}
            }else {}

            if (i>=s.length()-1) {
                if (p.charAt(j)==42)j++;
                System.out.println("<"+i+":"+j+">"+"("+s_c+":"+(j + 2)+")");
                if (a==0&&p.length()>s.length()) {
                    if ((p.length()-j-1)<2 )return false;
                    for (int n=j+1;n<p.length();n=n+2){
                        if (p.charAt(n)!=42&&(n+1)<p.length()&&p.charAt(n+1)==42){

                        }
                        else {
                            System.out.println("结尾有其他a");
                                return false;
                        }
                    }
                    System.out.println("结尾无假a*");
                    return true;
                }

                if (p.length()-(j + 2)==1&&p.charAt(j+1)==42)
                {
                    if (s_c == p.charAt(j + 2)) {
                        return true;
                    } else {
                        return false;
                    }
                }else if (p.length()-(j + 2)==1&&p.charAt(j+1)!=42){
                    return false;
                }else {
                    if (s_c==p.charAt(j)||p.charAt(j)==46) {
                        System.out.println("a*结束");
                        return true;
                    }
                    else {
                        if (p_c==42)return true;
                        return false;
                    }
                }
            }
        }
        System.out.println("<"+"p结束"+">");
        return false;
    }
}
