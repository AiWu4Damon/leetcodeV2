package com.damon.world2021.player;

/**
 * @author damon
 */
public interface Player {

    /**
     * 攻击
     * @return 伤害值
     */
    int attack();

    /**
     * 治愈
     * @return 回复血量
     */
    int cure();

    /**
     * 防御力
     * @return 防御力值
     */
    int getDefense();
}
