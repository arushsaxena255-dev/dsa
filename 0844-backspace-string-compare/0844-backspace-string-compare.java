class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> st1 = new Stack<>();
        Stack <Character> st2 = new Stack<>();

        for (char ch : s.toCharArray()){
            if (ch != '#'){
                st1.push(ch);
            }
             else if (!st1.isEmpty()){
                st1.pop();
            }
        }
         for (char ch : t.toCharArray()){
            if (ch != '#'){
                st2.push(ch);
            }
            else if (!st2.isEmpty()){
                st2.pop();
            }
         }
            return st1.equals(st2);
    }
}