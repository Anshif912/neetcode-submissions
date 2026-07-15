class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map=new HashMap<>();

        ArrayList<Integer> ans=new ArrayList<>();
        

        for(int num:nums){

            if(!map.containsKey(num)){
                map.put(num,0);
            }

            map.put(num,map.get(num)+1);
        }

        ans.addAll(map.keySet());

        ans.sort((a,b) -> map.get(b) - map.get(a));

        
        int[] arr=new int[k];
        int index=0;

        for(int i=0;i<k;i++){
            arr[index++]=ans.get(i);
        }

        if(arr.length!=0 && arr!=null){
            return arr;
        }

        return nums;


        
    }
}
