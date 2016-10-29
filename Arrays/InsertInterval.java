/*Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:
Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

Example 2:
Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].*/

/*
 * Logic:
 * This problem has many corner cases in terms of overlapping intervals.
 * We should check new interval with each of the given intervals and decide the position.
 * Below 3 if cases play crucial role
 */

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        
        for (Interval interval : intervals) {
            if (newInterval.end < interval.start) {
                result.add(newInterval);
                newInterval = interval;
            } else if (newInterval.start > interval.end) {
                result.add(interval);
            } else if (newInterval.start <= interval.end || newInterval.end >= interval.start) {
                newInterval = new Interval(Math.min(interval.start, newInterval.start), Math.max(interval.end, newInterval.end));
            }
        }
        result.add(newInterval);
        return result;    
    }
}
