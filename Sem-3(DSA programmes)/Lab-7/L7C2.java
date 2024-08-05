import java.util.*;

 class Interval {
    int start;
    int end;
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class L7C2 {

    public static Interval[] merge(Interval[] intervals) {
        if (intervals.length <= 1)
            return intervals;
        // Sort the intervals by their start time
        Arrays.sort(intervals, Comparator.comparingInt(i -> i.start));

        Stack<Interval> stack = new Stack<>();
        stack.push(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            Interval top = stack.peek();
            Interval current = intervals[i];

            if (top.end >= current.start) {
                // Overlapping intervals, merge them
                top.end = Math.max(top.end, current.end);
            } else {
                // Non-overlapping interval, push to stack
                stack.push(current);
            }
        }
        // Convert stack to array
        Interval[] mergedIntervals = new Interval[stack.size()];
        for (int i = mergedIntervals.length - 1; i >= 0; i--) {
            mergedIntervals[i] = stack.pop();
        }
        return mergedIntervals;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No . Intervals you want");
        int n=sc.nextInt();
        Interval[] arr = new Interval[n];
        for(int i=0;i<n;i++){
            System.out.print("\n Enter interval-"+(i+1)+" Start: ");
            int start=sc.nextInt();
            System.out.print("\n Enter interval-"+(i+1)+" End: ");
            int end=sc.nextInt(); 
            arr[i]=new Interval(start, end);
        }
        sc.close();
        Interval[] mergedIntervals = merge(arr);
        System.out.println("Merged Intervals:");
        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
