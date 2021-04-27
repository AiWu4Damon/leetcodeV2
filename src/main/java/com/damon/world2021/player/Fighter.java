package com.damon.world2021.player;

/**
 * @author damon
 */
public class Fighter extends AbstractPlayer {
    private final Integer basicAttack      = 8;
    private final Integer basicDefense     = 4;

    @Override
    public int attack() {
        return basicAttack;
    }

    @Override
    public int getDefense() {
        return basicDefense;
    }
}
