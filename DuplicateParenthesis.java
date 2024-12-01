 public boolean hasDuplicateParenthesis(String expr){
        Stack<Character> stack = new Stack<>();
        for(char ch: expr.toCharArray()){
            if(ch==')'){
                int elementsInside = 0;
                while(stack.peek() != '('){
                    stack.pop();
                    elementsInside++;
                }
                stack.pop();

                if(elementsInside<1){
                    return true;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return false;
    }
