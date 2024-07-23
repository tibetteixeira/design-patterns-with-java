package io.tibetteixeira.behavioral.strategy.person.strategy.transportation;

public class BikeStrategy implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I use a bike to go anywhere");
    }
}
