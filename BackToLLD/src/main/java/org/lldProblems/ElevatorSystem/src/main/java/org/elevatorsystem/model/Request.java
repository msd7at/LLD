package org.elevatorsystem.model;

public class Request {
    private final int sourceFloor;
    private final int targetFloor;
    private final Direction direction;
    private final RequestSource source;

    public Request(int sourceFloor, int targetFloor,  RequestSource source) {
        this.sourceFloor = sourceFloor;
        this.targetFloor = targetFloor;
        this.direction =  targetFloor > sourceFloor ? Direction.UP : Direction.DOWN;;
        this.source = source;
    }
    public int getSourceFloor() { return sourceFloor; }
    public int getTargetFloor() { return targetFloor; }
    public Direction getDirection() { return direction; }
}
