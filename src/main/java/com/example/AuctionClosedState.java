package com.example;

public class AuctionClosedState implements AuctionState {

    @Override
    public void startAuction(Auction auction) {
        auction.setState(new AuctionStartedState());
        System.out.println("Cannot start an auction that is already closed.");
    }

    @Override
    public void closeAuction(Auction auction) {
        System.out.println("Auction is already closed.");
    }

    @Override
    public void placeBid() {
        System.out.println("Cannot place a bid on a closed auction.");
    }
}
