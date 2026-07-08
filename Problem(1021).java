class Solution {
    public String removeOuterParentheses(String s) {
        Stack st=new Stack<Character>();
        StringBuilder ans=new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(st.empty())
                st.push(s.charAt(i));
            else if(st.size()==1){
                if(s.charAt(i)=='('){
                    ans=ans.append(s.charAt(i));
                    st.push(s.charAt(i));
                }else
                    st.pop();
            }else{
                if(s.charAt(i)=='('){
                    ans=ans.append(s.charAt(i));
                    st.push(s.charAt(i));
                }else{
                    ans=ans.append(s.charAt(i));
                    st.pop();
                }
            }
        }
        return ans.toString();
    }
}