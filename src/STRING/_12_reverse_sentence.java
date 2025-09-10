package STRING;

public class _12_reverse_sentence {
    public static void main(String[] args) {
        String s="bishnu prasad maharana";
        int i=s.length()-1,j=s.length()-1;
        String res="";
        int k=0;
        while(j>=0){
            while(j>=0 && s.charAt(j) !=' ') j--;
             k=j+1;
            while(k<=i) {
                res += s.charAt(k);
                k++;
            }
            if(j>0) res+=" ";
            j--;
            i=j;
        }
        System.out.println(res);
        }
    }

