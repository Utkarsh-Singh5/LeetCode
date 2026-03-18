class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st= new Stack();
        char c[]= s.toCharArray();
        for(char ch:c)
        {
            if(!st.isEmpty() && st.peek()==ch)
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }

        StringBuilder sb= new StringBuilder("");

        for(char ch:st)
        {
            sb.append(ch);
        }
        return sb.toString();

        
    }
}