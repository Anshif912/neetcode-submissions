class MinStack {

    Stack<Integer> st;

    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {

        if(!st.isEmpty()){
            int t=st.pop();
        }
        
    }
    
    public int top() {

        if(!st.isEmpty()){
            return st.peek();
        }

        return st.peek();
        
    }
    
    public int getMin() {

        Stack<Integer> temp=new Stack<>();

        int mini=st.peek();

        while(!st.isEmpty()){
            mini=Math.min(mini,st.peek());
            temp.push(st.pop()); 
        }

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }

        return mini;
        
    }
}
