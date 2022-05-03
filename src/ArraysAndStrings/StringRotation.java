package ArraysAndStrings;

public class StringRotation {
    public boolean isRotation(String s1,String s2){
        if (s1.length()!=s2.length() || s1.isEmpty() || s2.isEmpty())
            return false;
        String s2s2 = s2+s2;
        if (isSubstring(s1,s2s2))
            return true;
        return false;
    }

    private boolean isSubstring(String s1, String s2s2) {
        return false;
    }
}
