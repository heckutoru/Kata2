package kata2;

import java.util.*;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,1,2,0,0,1,3};
        histogram histo = new histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for(int key : histogr.keySet()){
            System.out.println(key + " --> " + histogr.get(key));
        }

    }
    
}
