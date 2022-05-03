package ArraysAndStrings;

public class RotateStr {
    public boolean rotateString(String s, String goal) {
        if (s.length()!=goal.length())
            return false;
        if (s.isEmpty() && goal.isEmpty())
            return true;

        String goalgoal = goal+goal;
        if (goalgoal.contains(s)) {
            return true;
        }
        return false;
    }
}
