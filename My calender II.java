/*You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a triple booking.

A triple booking happens when three events have some non-empty intersection (i.e., some moment is common to all the three events.).

The event can be represented as a pair of integers startTime and endTime that represents a booking on the half-open interval [startTime, endTime), the range of real numbers x such that startTime <= x < endTime.

Implement the MyCalendarTwo class:

MyCalendarTwo() Initializes the calendar object.
boolean book(int startTime, int endTime) Returns true if the event can be added to the calendar successfully without causing a triple booking. Otherwise, return false and do not add the event to the calendar.
 

Example 1:

Input
["MyCalendarTwo", "book", "book", "book", "book", "book", "book"]
[[], [10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]]
Output
[null, true, true, true, false, true, true] */

class MyCalendarTwo {
    private ArrayList<int[]> allbooks;
    private ArrayList<int[]> doublebooks;

    public MyCalendarTwo() {
        allbooks = new ArrayList<>();
        doublebooks = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for (int[] interval: doublebooks) {
            int start = interval[0];
            int end = interval[1];

            if (startTime < end && endTime > start) {
                return false;
            }
        }
        for (int[] interval: allbooks) {
            int start = interval[0];
            int end = interval[1];

            if (startTime < end && endTime > start) {
                int overlapStart = Math.max(start, startTime);
                int overlapEnd = Math.min(end, endTime);
                doublebooks.add(new int[] {overlapStart, overlapEnd});
            }
        }
        allbooks.add(new int[] {startTime, endTime});
        return true;
    }
}
/* book(start,end)

Loop through doublebooks

   if overlap
      return false


Loop through allbooks

   if overlap

      compute intersection

      add intersection to doublebooks


Add booking to allbooks

return true */

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */
