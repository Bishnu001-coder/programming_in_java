package _5_STRING;

public class _19_sort_a_string {
    public static void main(String[] args) {
        String s="aeroplane";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){

            for(int j=i+1;j<s.length();j++){
                if(ch[j]==' ')continue;
                if(ch[i]>ch[j]){
                    char temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }

            }
            System.out.print(ch[i]+" ");
        }
    }
}
