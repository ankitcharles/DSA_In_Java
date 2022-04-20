public class LengthOfLongestSubArray {
    public static void main(String[] args) {
        System.out.println(findLongestSubString("abcedfcsksk"));
    }
    static int findLongestSubString(String s){
                int count =0;
            char[] ch = new char[s.length()];
            for (int i=0;i<s.length()-1;i++){
                ch[i] = s.charAt(i);
            }
            for (int j=0;j<ch.length-1; j++){
                if (ch[j+1]!=ch[j]){
                    count++;
                }
            }
        return count;
    }
}

