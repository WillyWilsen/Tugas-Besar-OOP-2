package com.aetherwars.model;

import java.util.HashMap;

public class CardLibrary {
    private HashMap<Integer, Card> library;

    public CardLibrary(){
        this.library = new HashMap<Integer,Card>();
    }

    public void addCard(Card c) throws Exception{
        if (this.library.containsKey(c.ID)){
            throw new Exception(); //masukan ID kartu salah
        }
        this.library.put(c.ID,c);
    }

    public Card getCardByID(int i){
        return this.library.get(i);
    }
}
