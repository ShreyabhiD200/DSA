class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<tokens.length; i++){
            String ch = tokens[i];

            try{
                stack.push(Integer.parseInt(ch));
            } catch(NumberFormatException e){
                int right = stack.pop();
                int left = stack.pop();

                int result = switch(ch){
                    case "+" -> left + right;
                    case "-" -> left - right;
                    case "*" -> left * right;
                    case "/" -> left / right;
                    default -> throw new IllegalArgumentException("Invalid operator");
                    };
                stack.push(result);
            }
        }
        return stack.peek();
    }
}