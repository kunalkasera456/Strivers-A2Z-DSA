/*
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeargeIntervals {

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        // 1 step sort the intervals based on starting point
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // initialize list of array to store the intervals
        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(intervals[i][1], end);   //updating end
            } else {
                ans.add(new int[] { start, end });
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // add last inteval 
        ans.add(new int[] { start, end });

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)[0]+"," +ans.get(i)[1]);

        }
    }
}
