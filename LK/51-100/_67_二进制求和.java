public class _67_二进制求和 {
        public String addStrings(String a, String b) {
            int add=0;
            StringBuilder rs=new StringBuilder();
            int n_1=a.length()-1;
            int n_2=b.length()-1;

            while (n_1>=0&&n_2>=0){
                int number1=a.charAt(n_1)-'0';
                int number2=b.charAt(n_2)-'0';
                rs.append(((number1+number2+add)%2));
                add=(number1+number2+add)/2;
                n_1--;
                n_2--;
            }
            if (n_1!=-1){
                while (n_1>=0){
                    int number1=a.charAt(n_1)-'0';
                    rs.append(((number1+add)%2));
                    add=(number1+add)/2;
                    n_1--;
                }
            }
            if (n_2!=-1){
                while (n_2>=0){
                    int number2=b.charAt(n_2)-'0';
                    rs.append(((number2+add)%2));
                    add=(number2+add)/2;
                    n_2--;
                }
            }
            if (add!=0){
                rs.append(add);
            }

            return rs.reverse().toString();
        }
}
