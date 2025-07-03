class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int c=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
            if(i==0||flowerbed[i-1]==0 && i==flowerbed.length||flowerbed[i+1]==0){
                flowerbed[i]=1;
                c++;
                if(n==c){
                    return true;
                }
                i++;

            }
        }
        
        }
        return n==c;
    }
}