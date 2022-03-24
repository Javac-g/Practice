package Generics.practice_03_24_22;

class Stats<T extends Number >  {
    T[] nums;

    Stats(T[] nums){

        this.nums = nums;


    }


    public double average(){
        double sum = 0.0;
        for(int i  = 0; i < nums.length;i++) sum += nums[i].doubleValue();
        return sum / nums.length;

    }

    boolean sameAVG(Stats<?> nums){
        if(average() == nums.average()){
            return true;
        }
        return false;
    }
    boolean isAVG(Stats<T> nums){
        if(average() == nums.average()){
            return true;
        }
        return false;
    }


}
