class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {

        int[] smaller=num1.length>num2.length? num2:num1;
        int[] larger=num1.length>num2.length? num1:num2;
        int totallength=num1.length+num2.length;

    int low=0,high=smaller.length;

    while (low<=high){
        int partitionx =(low+high)/2;
        int partitiony=(totallength+1)/2-partitionx;


        int l1 = partitionx==0 ? Integer.MIN_VALUE : smaller[partitionx -1];
        int r1= partitionx == smaller.length ? Integer.MAX_VALUE : smaller[partitionx];
        


        int l2 = partitiony==0 ? Integer.MIN_VALUE : larger[partitiony -1];
        int r2= partitiony == larger.length ? Integer.MAX_VALUE : larger[partitiony];


        if (l1 <=r2 && l2<=r1)

          if((totallength)%2==0)
          return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;

          else
          return Math.max(l1,l2);

          if(l1>r2)
          high=partitionx-1;
          else
          low=partitionx+1;
            }        

            return 0;
    }
}