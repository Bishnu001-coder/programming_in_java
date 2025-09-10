package STRING;

public class _8_frequency_count {
    public static void main(String[] args) {
        String s="bishnu prasad maharana";
            s=s.replace(" ", "");
            int feq[]=new int[256];
            for(int i=0;i<s.length();i++){
                feq[s.charAt(i)]++;
            }
            for(int i=0;i<256;i++){
                if(feq[i]>0){
                    System.out.println((char)i +"->"+feq[i]);
                }
            }
    }
}
