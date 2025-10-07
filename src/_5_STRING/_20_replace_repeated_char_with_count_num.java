package _5_STRING;

public class _20_replace_repeated_char_with_count_num {
    public static void main(String[] args) {
        String s="hello world";
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==' ')continue;
            int totalcount=0;

            for(int j=0;j<n;j++){
                if(s.charAt(j)==ch){
                    totalcount++;
                }
            }
            if(totalcount==1){
                System.out.print(ch);
            }else{
                 int count=0;
                 for(int j=0;j<=i;j++){
                     if(s.charAt(j)==ch){
                         count++;
                     }
                 }
                System.out.print(count);
            }
        }
            }


    }


