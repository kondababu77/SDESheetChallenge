public class MergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1){
            return intervals;
        }

        Arrays.sort(intervals, (a,b)->{
            if(a[0] == b[0]) return Integer.compare(a[1],b[1]);
            else return Integer.compare(a[0],b[0]);
        });

        List<int []> result = new ArrayList<>();
        int newInterval[] = intervals[0];

        for(int interval[] : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }else{
                result.add(newInterval);
                newInterval = interval;
            }
        }
        result.add(newInterval);

        return result.toArray(new int[0][]);
    }
}