package ArraysAndStrings;

public class StringCompression {

    public String compressBad(String str) {
        StringBuilder sb = new StringBuilder();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            // starting count once enter the loop
            count++;
            if (i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)) {
                sb.append(str.charAt(i)).append(count);
                count = 0;
            }
        }
        return sb.length()<str.length() ? sb.toString() : str;

    }

    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        String result1 = sc.compressBad("a");
        System.out.println(result1);
    }
}
