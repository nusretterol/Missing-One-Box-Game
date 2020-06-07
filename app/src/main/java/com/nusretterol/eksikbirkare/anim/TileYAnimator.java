package com.nusretterol.eksikbirkare.anim;

import com.nusretterol.eksikbirkare.Tile;

public class TileYAnimator extends TileAnimator {

    public TileYAnimator(Tile target) {
        super(target);
    }

    @Override
    protected void update(Tile target, float value) {
        target.setCanvasY(value);
    }

}
