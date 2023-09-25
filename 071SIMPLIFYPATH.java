class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        for (String s : path.split("/")) {
            if (s.equals("..") && !stack.isEmpty()) stack.pop();
            else if (!(s.equals("") || s.equals(".") || s.equals(".."))) stack.add(s);
        }

        String ans = "";
        for (String i : stack) {
            ans += "/" + i;
        }
        return ans.isEmpty() ? "/" : ans;
    }
}
