public class _415_字符串相加 {
    public static void main(String[] args){
        String num1= "";
        String num2="0";
        String jg=addStrings(num1,num2);
        System.out.println(""+jg);
    }
    public static String addStrings(String num1, String num2) {
        int add=0;
        StringBuilder rs=new StringBuilder();
        int n_1=num1.length()-1;
        int n_2=num2.length()-1;

        while (n_1>=0&&n_2>=0){
            int number1=num1.charAt(n_1)-'0';
            int number2=num2.charAt(n_2)-'0';
            System.out.println("两数取得<"+number1+":"+number2+">");
            rs.append(((number1+number2+add)%10));
            add=(number1+number2+add)/10;
            n_1--;
            n_2--;
        }
        System.out.println("<"+n_1+":"+n_2+">");
        if (n_1!=-1){
            while (n_1>=0){
                int number1=num1.charAt(n_1)-'0';
                System.out.println("n_1一数取得<"+number1+">");
                rs.append(((number1+add)%10));
                add=(number1+add)/10;
                n_1--;
            }
        }
        if (n_2!=-1){
            while (n_2>=0){
                int number2=num2.charAt(n_2)-'0';
                System.out.println("n_2一数取得<"+number2+">");
                rs.append(((number2+add)%10));
                add=(number2+add)/10;
                n_2--;
            }
        }


        if (add!=0){
            rs.append(add);
        }

        return rs.reverse().toString();
    }
}
