public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    int binaryNum = 0;
    
    for(int i=0;i<32;i++) {
        binaryNum = binaryNum<<1;                   //multiply by 2
        binaryNum = binaryNum + (n&1);              //add last digit to binaryNum 
        n=n>>1;                                     //update n by removing last digit
    }
    
    return binaryNum ;
    
}
}