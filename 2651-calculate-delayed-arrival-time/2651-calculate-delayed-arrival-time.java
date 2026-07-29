class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime + delayedTime == 24){
            return 0;
        }
        int totalTime = 0;
        totalTime = arrivalTime + delayedTime;
        if(totalTime > 24){
            totalTime-=24;
        }
        
        return totalTime;
    }
}