package QueueStackChapter;

import java.util.Stack;

//有效的括号
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效
public class Demo01 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (Character ch:chars){
            if (ch=='('){
                stack.push(')');
            } else if (ch=='{'){
                stack.push('}');
            } else if (ch=='['){
                stack.push(']');
            }else if (ch==']'||ch=='}'||ch==')'){
                if (stack.isEmpty())
                    return false;
                Character pop = stack.pop();
                if (pop!=ch)
                    return false;
            }else {
                return false;
            }
        }
        if(!stack.isEmpty()){return false;}
        return true;
    }
}
