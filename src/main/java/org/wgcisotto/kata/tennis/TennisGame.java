package org.wgcisotto.kata.tennis;

import org.wgcisotto.kata.tennis.models.Player;

import java.util.Map;

public class TennisGame {

    private final Player player1;
    private final Player player2;

    private Map<Integer, String> score = Map.ofEntries(
            Map.entry(0, "love"),
            Map.entry(1, "15"),
            Map.entry(2, "30"),
            Map.entry(3, "40")
    );

    public TennisGame(Player p1, Player p2){
        player1 = p1;
        player2 = p2;
    }

    public String score(Player player){
        if(player1.getScore() == 3 && player2.getScore() == 3) return "deuce";
        if(player1.getScore() >= 3 && player2.getScore() >= 3) {
            int abs = Math.abs(player1.getScore() - player2.getScore());
            if(abs > 1){
                if(player1.getScore() > player2.getScore()){
                    if(player.getId() == player1.getId()){
                        return "won";
                    }else {
                        return "lost";
                    }
                }else{
                    if(player.getId() == player2.getId()){
                        return "won";
                    }else {
                        return "lost";
                    }
                }
            }
            if(abs == 1){
                if(player1.getScore() > player2.getScore()){
                    if(player.getId() == player1.getId()){
                        return "advantage";
                    }else {
                        return "deuce";
                    }
                }else{
                    if(player.getId() == player2.getId()){
                        return "advantage";
                    }else {
                        return "deuce";
                    }
                }
            }
        }
        return score.get(player.getScore());
    }


}
