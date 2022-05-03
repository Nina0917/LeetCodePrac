package ArraysAndStrings;

public class OneAway {

    public boolean isOneEditDistance(String s, String t) {
        if (s.length()==t.length()) {
            return isOneEditReplace(s,t);
        } else if (s.length() == t.length()-1) {
            return isOneEditRemove(s, t);
        } else if (s.length() == t.length() +1) {
            return isOneEditRemove(t,s);
        } else {
            return false;
        }

    }

    private boolean isOneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i=0;i<s1.length();i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    private boolean isOneEditRemove(String s1, String s2) {
        int k=0;
        for (int i=0;i<s1.length();i++) {
            if (s1.charAt(i)!=s2.charAt(i)){
                k=i;
                break;
            }
        }

        while (k<s1.length()){
            if (s1.charAt(k) != s2.charAt(k+1)){
                return false;
            }
            k++;
        }

        return true;
    }

    public static void main(String[] args) {
        OneAway demo = new OneAway();
        String s1 = "ab";
        String t1 = "acb";
        System.out.println(demo.isOneEditDistance(s1,t1)); //true

        String s2 = "apple";
        String t2 = "apble";
        System.out.println(demo.isOneEditDistance(s2,t2)); //true

        String s3 = "acb";
        String t3 = "ab";
        System.out.println(demo.isOneEditDistance(s3,t3)); //true

        String s4 = "app";
        String t4 = "abb";
        System.out.println(demo.isOneEditDistance(s4,t4)); //false
    }
}
