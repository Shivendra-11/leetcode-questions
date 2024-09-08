class Solution {
    public String convertDateToBinary(String date) {
        
    String[] parts=date.split("-");
     int year = Integer.parseInt(parts[0]);
     int months = Integer.parseInt(parts[1]); 
     int day = Integer.parseInt(parts[2]);

     String yearBinary = Integer.toBinaryString(year);
     String monthsBinary = Integer.toBinaryString(months);
     String dayBinary = Integer.toBinaryString(day); 

     String result=yearBinary+"-"+monthsBinary+"-"+dayBinary;

     return result;
    }
}