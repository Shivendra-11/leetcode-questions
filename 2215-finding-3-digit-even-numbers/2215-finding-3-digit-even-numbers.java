class Solution {
    public int[] findEvenNumbers(int[] digits) {
    HashSet<Integer>li=new HashSet<>();
    for(int i=0;i<digits.length;i++){
        if(digits[i]==0) continue;
        for(int j=0;j<digits.length;j++){
            if(i==j ) continue;
            for(int k=0;k<digits.length;k++){
                if(j==k || i==k ) continue;
                 int num=digits[i]*100+digits[j]*10+digits[k];
                 if(num%2==0){
                    li.add(num);
                 }
            }
        }
    }
    List<Integer> list = new ArrayList<Integer>(li);
    Collections.sort(list);
     int arr[]=new int[list.size()];
     for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
     }
        return arr;
    }
}