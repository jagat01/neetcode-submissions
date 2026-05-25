class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> lookUp = new HashMap<>();
        lookUp.put(')','(');
        lookUp.put('}','{');
        lookUp.put(']','[');

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(lookUp.containsKey(c)){
                if(!stack.empty() && lookUp.get(c).equals(stack.peek())){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
             else{
                    stack.push(c);
                }
        }
        return stack.empty();



    }
}
