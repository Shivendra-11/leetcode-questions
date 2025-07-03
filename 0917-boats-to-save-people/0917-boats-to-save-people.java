class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        int i=0;
        int j=people.length-1;
        Arrays.sort(people);
        while(i<=j){

            if(people[i]+people[j]<=limit && i!=j){
                i++;
                j--;

            }
            else{
                j--;
            }
            c++;
            if(i==j) {
                c++;
                break;
            }
     
        }
        return c;
    }
}

