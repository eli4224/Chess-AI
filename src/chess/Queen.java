/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import info.gridworld.grid.Location;

/**
 *
 * @author elicowa
 */
public class Queen extends WideMovingPiece {
    public static final int[] movableDirections = {Location.NORTH, Location.EAST, Location.SOUTH, Location.WEST, Location.NORTHEAST, Location.NORTHWEST, Location.SOUTHEAST, Location.SOUTHWEST};
    public Queen(PlayerColor c) {
        super(c);
    }
    @Override
    protected int[] getMovableDirections() {
        return movableDirections;
    }
}
