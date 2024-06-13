class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int summ=0;
        for(int i=0;i<students.length;i++){
            summ +=Math.abs(students[i]-seats[i]);
        }
        return summ;
    }
}