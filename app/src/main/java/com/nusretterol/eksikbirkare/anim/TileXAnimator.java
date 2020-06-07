package com.nusretterol.eksikbirkare.anim;

import com.nusretterol.eksikbirkare.Tile;

public class TileXAnimator extends TileAnimator {

    public TileXAnimator(Tile target) {
        super(target);
    }

    @Override
    protected void update(Tile target, float value) {
        target.setCanvasX(value);
    }

}
