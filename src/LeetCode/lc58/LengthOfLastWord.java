package LeetCode.lc58;

public class LengthOfLastWord {

    public static void main(String[] args) {
        int ret = 0;
        String s = "b a  ";
        ret = lengthOfLastWord(s);
        System.out.println("ret:"+ret);
    }

    public static int lengthOfLastWord(String s) {
        int len = 0;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(s.length()-1-i) != ' '){
                flag = 1;
                len++;
            }
            if (s.charAt(s.length()-1-i) == ' '){
                if (flag == 0){
                    continue;
                }else {
                    break;
                }
            }
        }
        return len;
    }
}



//58. 最后一个单词的长度
//        给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
//
//        单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
//
//
//
//        示例 1：
//
//        输入：s = "Hello World"
//        输出：5
//        示例 2：
//
//        输入：s = " "
//        输出：0
//
//
//        提示：
//
//        1 <= s.length <= 104