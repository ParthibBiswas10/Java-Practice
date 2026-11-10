class Solution {
    public int findKthLargest(int[] arr, int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
		for(int num:arr){
		    pq.add(num);
		}
		
		for(int i=0;i<k-1;i++){
		    pq.poll();
		}
		return pq.poll();
    }
}