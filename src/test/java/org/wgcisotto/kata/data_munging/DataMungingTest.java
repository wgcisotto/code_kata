package org.wgcisotto.kata.data_munging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.wgcisotto.kata.data_munging.DataMunging.smallestDifferenceTeam;
import static org.wgcisotto.kata.data_munging.DataMunging.smallestSpread;

class DataMungingTest {
    private List<int[]> weatherData = new ArrayList<>();
    private HashMap<String, int[]> footballScore = new HashMap<>();

    @BeforeEach
    void setUp() {
        weatherData.add(new int[]{2, 79, 63});
        weatherData.add(new int[]{1, 88, 59});
        weatherData.add(new int[]{3, 77, 55});
        weatherData.add(new int[]{4, 77, 59});
        weatherData.add(new int[]{5, 90, 66});
        weatherData.add(new int[]{6, 81, 61});
        weatherData.add(new int[]{7, 73, 57});
        weatherData.add(new int[]{8, 75, 54});
        weatherData.add(new int[]{9, 86, 32});
        weatherData.add(new int[]{10, 84, 64});
        weatherData.add(new int[]{11, 91, 59});
        weatherData.add(new int[]{12, 88, 73});
        weatherData.add(new int[]{13, 70, 59});
        weatherData.add(new int[]{14, 61, 59});
        weatherData.add(new int[]{15, 64, 55});
        weatherData.add(new int[]{16, 79, 59});
        weatherData.add(new int[]{17, 81, 57});
        weatherData.add(new int[]{18, 82, 52});
        weatherData.add(new int[]{19, 81, 61});
        weatherData.add(new int[]{20, 84, 57});
        weatherData.add(new int[]{21, 86, 59});
        weatherData.add(new int[]{22, 90, 64});
        weatherData.add(new int[]{23, 90, 68});
        weatherData.add(new int[]{24, 90, 77});
        weatherData.add(new int[]{25, 90, 72});
        weatherData.add(new int[]{26, 97, 64});
        weatherData.add(new int[]{27, 91, 72});
        weatherData.add(new int[]{28, 84, 68});
        weatherData.add(new int[]{29, 88, 66});
        weatherData.add(new int[]{30, 90, 45});

        footballScore.put("Arsenal",new int[]{79,36});
        footballScore.put("Liverpool",new int[]{67,30});
        footballScore.put("Manchester_U",new int[]{87,45});
        footballScore.put("Newcastle",new int[]{74,52});
        footballScore.put("Leeds",new int[]{53,37});
        footballScore.put("Chelsea",new int[]{66,38});
        footballScore.put("West_Ham",new int[]{48,57});
        footballScore.put("Aston_Villa",new int[]{46,47});
        footballScore.put("Tottenham",new int[]{49,53});
        footballScore.put("Blackburn",new int[]{55,51});
        footballScore.put("Southampton",new int[]{46,54});
        footballScore.put("Middlesbrough",new int[]{35,47});
        footballScore.put("Fulham",new int[]{36,44});
        footballScore.put("Charlton",new int[]{38,49});
        footballScore.put("Everton",new int[]{45,57});
        footballScore.put("Bolton",new int[]{44,62});
        footballScore.put("Sunderland",new int[]{29,51});
        footballScore.put("Ipswich",new int[]{41,64});
        footballScore.put("Derby",new int[]{33,63});
        footballScore.put("Leicester",new int[]{30,64});


    }

    @Test
    void smallestSpreadTest() {
        assertEquals(14, smallestSpread(weatherData));
        weatherData.add(new int[]{31, 90, 89});
        assertEquals(31, smallestSpread(weatherData));
    }

    @Test
    void smallestDifferenceTeamTest() {
        assertEquals("Leicester", smallestDifferenceTeam(footballScore));
        footballScore.put("Palmeiras", new int[]{0, 100});
        assertEquals("Palmeiras", smallestDifferenceTeam(footballScore));
    }
}