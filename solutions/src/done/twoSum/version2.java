package done.twoSum;

import java.util.HashMap;
import java.util.Map;

/*Nessa versão utilizamos a efeciência de pecorrer somente uma vez o array com hashMap.
Pois quando guardamos como chaves o valor e não sua posição, assim que realizamos a busca pela key se torna imediata*/
public class version2 {
    public int [] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complemento = target - nums[i];

            if(map.containsKey(complemento)){
                return new int[] { map.get(complemento), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
