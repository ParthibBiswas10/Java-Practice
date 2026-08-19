class Solution {
    public int maxNumberOfFamilies(int n, int[][] res) {
        
        HashMap<Integer,Set<Integer>>map=new HashMap<>();
        for(int[] arr:res){
            int row=arr[0];
            int seat=arr[1];

            if(map.containsKey(row)){
                map.get(row).add(seat);
            }
            else{
                Set<Integer> set=new HashSet<>();
                set.add(seat);
                map.put(row,set);
            }

        }
        int empty=map.size();
        int result=(n-empty)*2;

        for(Map.Entry<Integer,Set<Integer>>entry:map.entrySet()){
            Set<Integer> booked=entry.getValue();
            boolean A=!booked.contains(2)&&!booked.contains(3)&&!booked.contains(4)&&!booked.contains(5);

            boolean B=!booked.contains(4)&&!booked.contains(5)&&!booked.contains(6)&&!booked.contains(7);

            boolean C=!booked.contains(6)&&!booked.contains(7)&!booked.contains(8)&&!booked.contains(9);

            if(A && C) result+=2;
            else if(A||B||C) result+=1;
        }
        return result;

    }
}