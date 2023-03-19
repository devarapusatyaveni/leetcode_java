class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n = plants.length;
        int steps = 0;
        int cap = capacity;
        for(int i=0;i<n;i++){
            if(plants[i] <= cap){
                steps ++;
                cap -= plants[i];
            }else{
                cap = capacity;
                cap -= plants[i];
                steps += (2*i)+1;
            }
        }
        return steps;
    }
}
