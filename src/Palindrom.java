public class Palindrom {

    public static boolean isPalindrom(String palindrom){

        char[] chars = palindrom.toCharArray();

        for (int i = 0; i <= chars.length; i++) {
            if (chars[i] != chars[chars.length-i-1]){
                return false;
            } else{
                if (i == chars.length-1){
                    break;
                }else{
                    continue;
                }
            }
        }
        return true;
    }
}
