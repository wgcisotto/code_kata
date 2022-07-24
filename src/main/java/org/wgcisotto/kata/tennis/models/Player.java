package org.wgcisotto.kata.tennis.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Player {
    int id;
    int score;
}
