package test0;

public class test {
    public static void main(String[] args) {
        byte[] info = null;
        info = new byte[2];
        int a = 26;
        System.out.println("result :"+ convertToTitle(a));
    }


    public static String convertToTitle(int columnNumber) {
        char cResult;
        String sResult = "";
        StringBuilder sbResult = new StringBuilder();
        if (columnNumber == 1) return "A";
        while ((columnNumber - 1) >= 0){
            cResult = (char) ((columnNumber - 1) % 26 + 'A');
            System.out.println("cResult == ["+ cResult + "]");
            sbResult.append(cResult);
            columnNumber = columnNumber / 26;
        }
        return sbResult.reverse().toString();
    }
}
