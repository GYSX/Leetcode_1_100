public class _43_字符串相乘 {
        public static void main(String[] args){
            String num1= "99";
            String num2="11";
            String jg=multiply(num1,num2);
            System.out.println(""+jg);
        }
        public static String multiply(String num1, String num2) {
            if (num1.equals("0") || num2.equals("0")) {
                return "0";
            }
            String rs="";
            int n_1=num1.length()-1;
            int n_2_length=num2.length()-1;

            while (n_1>=0){
                int number1=num1.charAt(n_1)-'0';
                int add=0;
                int n_2=n_2_length;
                StringBuilder product=new StringBuilder();
                for (int i=n_1;i<num1.length()-1;i++) {
                    product.append('0');
                }
                while (n_2>=0){
                    int number2=num2.charAt(n_2)-'0';
                    product.append(((number1*number2+add)%10));
                    add=(number1*number2+add)/10;
                    n_2--;
                }
                if (add!=0){
                    product.append(add);
                }
                rs=addStrings(rs,product.reverse().toString());
                System.out.println("乘积为；"+product.reverse().toString());
                System.out.println("当前和为；"+rs);

                n_1--;
            }
            return rs;
        }

    public static String addStrings(String num1, String num2) {
        int add=0;
        StringBuilder rs=new StringBuilder();
        int n_1=num1.length()-1;
        int n_2=num2.length()-1;
        while (n_1>=0&&n_2>=0){
            int number1=num1.charAt(n_1)-'0';
            int number2=num2.charAt(n_2)-'0';
            rs.append(((number1+number2+add)%10));
            add=(number1+number2+add)/10;
            n_1--;
            n_2--;
        }
        System.out.println("<"+n_1+":"+n_2+">");
        if (n_1!=-1){
            while (n_1>=0){
                int number1=num1.charAt(n_1)-'0';
                rs.append(((number1+add)%10));
                add=(number1+add)/10;
                n_1--;
            }
        }
        if (n_2!=-1){
            while (n_2>=0){
                int number2=num2.charAt(n_2)-'0';
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
