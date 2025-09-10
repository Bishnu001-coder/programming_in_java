package STRING;

public class _2_count_number_of_vowls {
    public static void main(String[] args) {
        String str="BiShnUPrasdAdMahArAna";
        int count_vowvel=0;
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch=='A' || ch=='a'||ch=='E' || ch=='e'||ch=='I' || ch=='i'||ch=='O' || ch=='o'||ch=='U' || ch=='u'){
                count_vowvel++;
            }
        }
        System.out.println(count_vowvel);
    }
}
