class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    for (int num : arr) {
        maxHeap.offer(num);
    }
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < k; i++) {
        result.add(maxHeap.poll());
    }
    return result;
}
}