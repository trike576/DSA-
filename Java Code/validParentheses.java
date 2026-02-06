class Solution {
    public boolean isValid(String s) {
        Stack<Character> parenthesesStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == '(' || currChar == '[' || currChar == '{') {
                parenthesesStack.push(currChar);
            }
            if (currChar == ')' || currChar == ']' || currChar == '}') {
                if (parenthesesStack.isEmpty()) {
                    return false;
                }
                else if (currChar == ')' && parenthesesStack.peek() == '(') {
                    parenthesesStack.pop();
                } else if (currChar == ']' && parenthesesStack.peek() == '[') {
                    parenthesesStack.pop();
                } else if (currChar == '}' && parenthesesStack.peek() == '{') {
                    parenthesesStack.pop();
                } else {
                    return false;
                }
            }
        }
        if (parenthesesStack.isEmpty()) {
            return true;
        }
        return false;
    }
}
