package org.wgcisotto.kata.data_munging;

import java.util.List;
import java.util.Map;

public class DataMunging {

    public static int smallestSpread(List<int[]> weather){
        int i = 0;
        int smallestSpread = 0;
        int smallestSpreadDay = 0;
        while (i < weather.size()){
           int mxT = weather.get(i)[1];
           int mnT = weather.get(i)[2];
           int spread = mxT - mnT;
           if(smallestSpreadDay==0){
               smallestSpread = spread;
               smallestSpreadDay = weather.get(i)[0];
           }else if(spread < smallestSpread){
               smallestSpread = spread;
               smallestSpreadDay = weather.get(i)[0];
           }
           i++;
        }
        return smallestSpreadDay;
    }

    public static String smallestDifferenceTeam(Map<String, int[]> teamScore){
        String teamName = "";
        int smallestDifference = 0;
        for (var entry: teamScore.entrySet()) {
            int teamFor = entry.getValue()[0];
            int teamAgainst = entry.getValue()[1];
            int difference = teamFor - teamAgainst;
            if(teamName.equals("") && smallestDifference==0){
                smallestDifference = difference;
            }else if(difference < smallestDifference){
                teamName = entry.getKey();
                smallestDifference = difference;
            }
        }
        return teamName;
    }

}
