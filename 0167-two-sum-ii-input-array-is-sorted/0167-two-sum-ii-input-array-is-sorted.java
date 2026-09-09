class Solution {
    public int[] twoSum(int[] a, int target) {
        // HashMap<Integer,Integer> hm=new HashMap<>();
        // int n=a.length;
        // int out[]=new int[2];
        // for(int i=0; i<n; i++){
        //     int cval=target-a[i];
        //     if(hm.containsKey;
        //         out[1]=i+1;break;
        //     }
        //     else{
        //         hm.put(a[i],i);
        //     }
        // }
        // return out;
        int left=0,right=a.length-1;
        int out[]=new int[2];
        while(left<right){
            if(a[left]+a[right]==target){out[0]=left+1;out[1]=right+1;break; }
            else if(a[left]+a[right]>target){right--;}
            else {left++;}
        }
        return out;
    }
}