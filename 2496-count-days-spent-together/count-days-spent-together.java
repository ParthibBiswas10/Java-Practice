class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int []days={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int s=Math.max(DayCount(arriveAlice,days),DayCount(arriveBob,days));
        int e=Math.min(DayCount(leaveAlice,days),DayCount(leaveBob,days));
        return Math.max(0,e-s+1);
    }

    public int DayCount(String date,int[]days){
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));

        int total=day;
        for(int i=0;i<=month-2;i++){
            total+=days[i];
        }
        return total;
    }
}