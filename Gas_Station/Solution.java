class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    	int tank, j;
        // find all indices where the amount of gas is greater than
        // or equal to the amount of gas needed to get to the next station
    	for(int i = 0; i < gas.length; i++) {
    		if(gas[i] >= cost[i]) {
    			tank = 0;
    			j = i;
    			while(true) {
    				tank += gas[j] - cost[j];
                    // cannot get to next gas station, exit while loop
    				if(tank < 0)
    					break;
    				// check if at the end of the List. If so, circle back to first index
    				if(j == gas.length-1)
    					j = 0;
    				else
    					j++;
    				// a full circle has been made and the solution has been found
    				if(j == i)
    					return j;
    			}
    		}
    	}
		return -1;
    }
}