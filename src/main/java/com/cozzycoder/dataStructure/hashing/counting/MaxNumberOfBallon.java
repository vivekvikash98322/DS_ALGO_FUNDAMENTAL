package com.cozzycoder.dataStructure.hashing.counting;

import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBallon {

    public static void main(String[] args) {

        String text= "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw";

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        String str= "balloon";

        for (char c : str.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : text.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (Map.Entry<Character, Integer> kv : map1.entrySet()) {

            if(kv.getValue() > map.getOrDefault(kv.getKey(), 0)){
                System.out.println(0);
                break;
            }

            if (kv.getValue() > 0) {
                ans = Math.min(ans, map.getOrDefault(kv.getKey(), 0) / kv.getValue());
            }
        }

        System.out.println(ans);
    }
}
