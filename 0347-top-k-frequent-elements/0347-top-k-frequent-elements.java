class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {  
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
               
            }
            else{
            hm.put(nums[i],1);
            }
        }
       
        int[] ans=new int[k];
        int repeat=0;
        for(int i=0; i<k; i++)
        { 
            int count=0;
        for(Map.Entry<Integer,Integer> pair:hm.entrySet())
        {                      
            if(pair.getValue()>count)
            {
                count=pair.getValue();
                 repeat=pair.getKey();
            }
           
        }
         ans[i]=repeat;
         hm.remove(repeat);
        }
        return ans;
    }
}