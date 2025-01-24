/*
Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
  */


class Solution {
    public int largestAltitude(int[] gain) {
        int valley =0;
       ArrayList<Integer> result = new ArrayList<>();
       result.add(0);
        for(int i=0;i<gain.length;i++){
            valley+=gain[i];
            result.add(valley);
        }
        return Collections.max(result);
    }

}

------------------ Alternate solution ------------------------
class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0; 
    int maxAltitude = 0;

    for (int g : gain) {
        altitude += g; 
        maxAltitude = Math.max(maxAltitude, altitude); 
    }

    return maxAltitude;
    }

}
