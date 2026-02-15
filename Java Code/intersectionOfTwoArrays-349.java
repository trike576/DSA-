class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> resSet = new HashSet<>();

        for(int num : nums1){
            set.add(num);
        }

        for(int num : nums2){
            if(set.contains(num)){
                resSet.add(num);
            }
        }

        int[] res = new int[resSet.size()];
        int index = 0;

        for(int num : resSet){
            res[index++] = num;
        }

        return res;
    }
}
