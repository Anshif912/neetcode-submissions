class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        // Loop through the string character by character
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // 1. If it's an opening bracket, push it to the stack
            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            } 
            // 2. If it's a closing bracket, validate it
            else {
                // If we see a closing bracket but the stack is empty, it's invalid
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop(); // Get the matching opening bracket

                // Check if the current closing bracket matches the popped opening bracket
                if (current == ')' && top != '(') return false;
                if (current == '}' && top != '{') return false;
                if (current == ']' && top != '[') return false;
            }
        }

        // If the stack is empty, all brackets were perfectly matched!
        return st.isEmpty();
    }
}