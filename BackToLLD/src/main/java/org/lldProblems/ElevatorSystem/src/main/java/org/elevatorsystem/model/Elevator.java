package org.elevatorsystem.model;

import org.elevatorsystem.state.ElevatorState;
import org.elevatorsystem.state.IdleState;
import org.elevatorsystem.state.MovingDownState;
import org.elevatorsystem.state.MovingUpState;

import java.util.TreeSet;

public class Elevator implements  Runnable{

   public  int id;
    public int currentFloor;
    public int capacity;

    private final TreeSet<Integer> upRequests = new TreeSet<>();
    private final TreeSet<Integer> downRequests = new TreeSet<>();

    private  ElevatorState state = new IdleState();



    public Elevator(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public synchronized void  addRequest(Request request){
        if (request.getDirection() == Direction.UP){
            upRequests.add(request.getTargetFloor());
        }
        else{
            downRequests.add(request.getTargetFloor());
        }
    }

    public synchronized boolean hasRequests() {
        return !upRequests.isEmpty() || !downRequests.isEmpty();
    }

    public synchronized  ElevatorState getNextState(){
        if (!upRequests.isEmpty()){
            return new MovingUpState();
        }
        if (!downRequests.isEmpty()){
            return new MovingDownState();
        }
        return new IdleState();
    }

    public synchronized void setState(ElevatorState state) {
        this.state = state;
    }


    public synchronized void moveUp() {
        Integer next = upRequests.pollFirst();
        if (next != null) currentFloor = next;
    }

    public synchronized void moveDown() {
        Integer next = downRequests.pollLast();
        if (next != null) currentFloor = next;
    }

    public synchronized int getTotalRequests() {
        return upRequests.size() + downRequests.size();
    }

    public boolean isIdle() {
        return state instanceof IdleState;
    }
    public int getCurrentFloor() { return currentFloor; }
    @Override
    public void run() {
        while (true) {
            state.move(this);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }


}
