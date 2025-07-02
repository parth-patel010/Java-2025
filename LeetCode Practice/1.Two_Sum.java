import java.util.HashMap // This line import the HashMap from Standard Java library, HashMap is like Dictonary(Python) because it contains key and Value pair.]

// Java is Fully Object Oriented Language every function will written inside Class and class name should match the file name.
class Two_Sum {

//public in Java show's Access Method 
// int[] is known as list of array which specifying here return type
// Two_sum is function name
// int[] nums and target is parameters
public int[] Two_sum(int[] nums, int target){

// Creating empty Hashmap
HashMap<Integer,Integer> map = new HashMap<>();

// Use For loop
//nums.length specify size of array same in c and c++ we use sizeof(arr)/sizeof(arr[0])
for(int i=0;i<nums.length;i++){
// We use complement method here
int complement = target - nums[i];
// For example nums[i] = 2 and target value is 9 so we will just do 9-2 which is 7 and find out 7 in list of array
if(map.containsKey(complement)){
    // If pair found it will return complement and its index
    return new int[] = {map.get(complement),i};
}
// If pair not found this will be continue
map.put(nums[i],i);
}
// If whole list have not any kind of pair then empty array will be return
return new int[] {};
}
}