import java.util.ArrayList;
import java.util.List;

public class _68_文本左右对齐 {
    public static void main(String[] args) {
        String[] words=new String[]{
                "What","must","be","acknowledgment","shall","be"
        };
        //["This    is    an","example  of text","justification.  "]
        List<String> jg=fullJustify(words,16);
        System.out.println("结果：");
        for (String i:jg){
            System.out.println(i+"<"+i.length()+">");
        }

    }
    /*
    "Science  is  what we"
    "understand      well"
    "enough to explain to"
    "a  computer.  Art is"
    "everything  else  we"
    "do                  "
     */
    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> jg=new ArrayList<>();
        List<String> queue =new ArrayList<>();
        int s_length=0;
        for (int i=0;i<words.length;i++){
            s_length+=words[i].length();
            if (s_length>maxWidth-queue.size()){
                s_length-=words[i].length();
                System.out.println("s_length="+s_length);
                int kg=0,kgs=0;
                boolean dang=false;
                if (queue.size()!=1) {
                    kg = (maxWidth - s_length) / (queue.size() - 1);
                    kgs = (maxWidth - s_length) % (queue.size() - 1);
                }else {
                    kg = (maxWidth - s_length);
                    dang=true;
                }
                System.out.println("kg="+kg);
                String t="";
                for (int j = 0,length=queue.size(); j<length; j++){
                    t=t+ queue.get(0);
                    queue.remove(0);
                    if (j!=length-1||dang) {
                        for (int k = 0; k < kg; k++) {
                            t = t + " ";
                        }
                        if (kgs!=0){
                            t = t + " ";
                            kgs--;
                        }
                    }
                }
                jg.add(t);
                s_length=words[i].length();
                queue.add(words[i]);
            }else {
                queue.add(words[i]);
            }
        }
        if (!queue.isEmpty()){
            String t=queue.get(0);
            queue.remove(0);
            for (String i:queue) {
                t=t+" "+i;
            }
            int kg=(maxWidth-t.length());
            for (int k = 0; k < kg; k++) {
                t = t + " ";
            }
            jg.add(t);
        }
        return jg;
    }
}
