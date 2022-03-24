package Generics.practice_03_24_22;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] nums){

        this.nums = nums;

    }
    double average(){
        double sum = 0.0;
        for(int i  =0; i < nums.length;i++) sum += nums[i].doubleValue();
        return sum;
    }
}
