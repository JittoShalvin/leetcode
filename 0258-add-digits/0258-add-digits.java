class Solution {
    public int addDigits(int num) {
        while (num >= 10) {
        num = a(num);
        }
        return num;
    }
    public int a(int num){
        int temp=0;
        int nor=0;
        while(num!=0){
            temp=num%10;
            nor+=temp;
            num=num/10;

        }
        return nor;

    }
}