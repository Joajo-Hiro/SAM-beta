package com.example.sam_beta;

public class Card {
    int id;
    int economicV;
    int socialV;
    int ambientalV;
    String imageV;

    public Card(){

    }

    public Card(int i, int ev, int sv, int av, String iv){
        this.id = i;
        this.economicV = ev;
        this.socialV = sv;
        this.ambientalV = av;
        this.imageV = iv;
    }

}
