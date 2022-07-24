package org.wgcisotto.kata.tennis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.wgcisotto.kata.tennis.models.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisGameTest {

    private Player p1;
    private Player p2;

    private TennisGame tennisGame;

    @BeforeEach
    void before(){
        p1 = Player.builder()
                .id(0)
                .score(0)
                .build();

        p2 = Player.builder()
                .id(2)
                .score(0)
                .build();

        tennisGame = new TennisGame(p1, p2);
    }

    @Test
    void checkScoreBeforeStart(){
        assertEquals("love", tennisGame.score(p1));
        assertEquals("love", tennisGame.score(p2));
    }

    @Test
    void gameInDeuce(){
        Player p1 = Player.builder()
                .id(0)
                .score(3)
                .build();

        Player p2 = Player.builder()
                .id(2)
                .score(3)
                .build();
        TennisGame tennisGame = new TennisGame(p1, p2);
        assertEquals("deuce", tennisGame.score(p1));
        assertEquals("deuce", tennisGame.score(p2));
    }

    @Test
    void playerInAdvantage(){
        Player p1 = Player.builder()
                .id(0)
                .score(3)
                .build();

        Player p2 = Player.builder()
                .id(2)
                .score(4)
                .build();
        TennisGame tennisGame = new TennisGame(p1, p2);
        assertEquals("deuce", tennisGame.score(p1));
        assertEquals("advantage", tennisGame.score(p2));
    }

    @Test
    void playerInLost(){
        Player p1 = Player.builder()
                .id(0)
                .score(3)
                .build();

        Player p2 = Player.builder()
                .id(2)
                .score(5)
                .build();
        TennisGame tennisGame = new TennisGame(p1, p2);
        assertEquals("lost", tennisGame.score(p1));
        assertEquals("won", tennisGame.score(p2));
    }

}