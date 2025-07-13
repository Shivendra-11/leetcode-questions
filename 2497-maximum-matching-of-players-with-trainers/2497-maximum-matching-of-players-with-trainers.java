class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);


        int i = 0;
        int j = 0;
        int n = players.length;
        int p = trainers.length;
        int c = 0;

        while (i < n && j < p) {
            if (players[i] <= trainers[j]) {
                i++;
                c++;
            }
            j++;

        }

        return c;

    }
}