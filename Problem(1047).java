class Solution {
    public String removeDuplicates(String s) {
        Stack st=new Stack<Character>();
        StringBuilder ans=new StringBuilder(s.length());
        
        for(int i=0; i<s.length();i++){
            //if the top of the  stack is equal to the current character from the string, pop that element from the stack and remove the last character from ans.
            if(!st.isEmpty() && (char)st.peek() == s.charAt(i)){
                 st.pop();
                 ans.deleteCharAt(ans.length()-1);
            }else{
                //else add that charcater to the stack and alse append to ans
                st.add(s.charAt(i));
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}