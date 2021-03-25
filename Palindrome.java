package basics.palindrome;

public class Palindrome {

    private StringBuffer sb;

    private StringBuffer palindrome;
    private  StringBuffer rest;


    public Palindrome(String str){
        this.sb = new StringBuffer(str);
        this.rest = new StringBuffer();
        buildPalindrome();
    }

    public boolean isPalindrome(){
        String s1 = sb.toString();
        String s2 = sb.reverse().toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }

    private void buildPalindrome(){
        if(isPalindrome()){
            palindrome = sb;
        } else {
            palindrome = sb;
            int size = sb.length();
            for (int i = 0; i < size / 2; i++) {
                boolean hasPair = false;
                char sign = sb.charAt(i);
                for (int j = i + 1; j < size; j++) {
                    if (sb.charAt(j) == sign) {
                        hasPair = true;
                    }
                }
                if (!hasPair) {
                    rest.append(palindrome.charAt(i));
                    palindrome.deleteCharAt(i);
                }
                if (isPalindrome()) {
                    break;
                }
            }
        }
    }

    public String getPalindrome(){
        return palindrome.toString();
    }
    public String getRest(){
        return rest.toString();
    }
}
