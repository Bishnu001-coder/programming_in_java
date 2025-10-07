package _5_STRING;

public class __22_string_convert__BOSSSS_BOS$S$ {
    public static void main(String[] args) {
        String s="BOSSSSSS";
        int[] occ= new int[256];
        char[] ch= s.toCharArray();
for(int i=0;i<s.length();i++){
    char c=ch[i];
    occ[c]++;
    if(occ[c]%2==0){
        ch[i]='$';
    }
}
        System.out.println(ch);
    }
}
