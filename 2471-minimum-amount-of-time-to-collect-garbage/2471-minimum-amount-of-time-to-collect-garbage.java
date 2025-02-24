class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int time1=0;
        int total=0;
        for(int i=0;i<garbage.length;i++){
            time1+=garbage[i].length();
        }
      
        int m_idx=-1;
        int p_idx=-1;
        int g_idx=-1;
        for(int i=0;i<garbage.length;i++){
            String str=garbage[i];
           for(int j=0;j<str.length();j++){
                 if(str.charAt(j)=='G'){
                    g_idx=i;
                 } if(str.charAt(j)=='P'){
                    p_idx=i;
                 } if(str.charAt(j)=='M'){
                    m_idx=i;
                 }
           }
        }
        for(int i=1;i<travel.length;i++){
            travel[i]=travel[i]+travel[i-1];
        }
        
        if(m_idx>0) total+=travel[m_idx-1];
        if(p_idx>0) total+=travel[p_idx-1];
        if(g_idx>0) total+=travel[g_idx-1]; 

        return total+time1;
    }
}