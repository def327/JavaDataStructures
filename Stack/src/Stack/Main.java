package Stack;

public class Main {

    public static void main(String[] args)
    {
        Stack st = new Stack();
        st.push(2);
        st.push(7);
        st.showStack();
        st.pop();
        st.pop();
        st.pop();
        st.push(4);
        st.showStack();
        st.pop();
        st.findKey(4);
    }
}
