class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer>st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top1=st.peek();
                 st.pop();
                int top2=st.peek();
                st.push(top1);
                st.push(top1+top2);
               
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.push(st.peek()*2);

            }
            else{
               int intr = Integer.parseInt(operations[i]);
                st.push(intr);
            }
        }
        int arr[]=new int[st.size()];
        int i=0;
while(!st.isEmpty()){
    arr[i]=st.pop();
    i++;
}       
int sum=0;
    for(int p=0;p<arr.length;p++){
        sum+=arr[p];
    }
return sum;
    }
}