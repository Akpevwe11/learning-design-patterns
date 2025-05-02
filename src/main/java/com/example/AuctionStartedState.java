package com.example;

public class AuctionStartedState implements AuctionState {

    @Override
    public void startAuction(Auction auction) {
        System.out.println("Auction is already started.");
    }

    @Override
    public void closeAuction(Auction auction) {
        System.out.println("Closing the auction.");
        auction.setState(new AuctionClosedState());
    }

    @Override
    public void placeBid() {
        System.out.println("Placing a bid.");
    }
}
