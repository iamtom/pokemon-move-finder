package com.mycompany.pokemonmovefinder;

import java.util.List;


public class Result {
    
    private String pkmnName;
    //TODO add moves and versions etc so that the user can see which versions
    //the pokemon learns some or all of the moves in
    
    public Result(String pkmnName) {
        this.pkmnName = pkmnName;
    }

    public String getPkmnName() {
        return pkmnName;
    }
    
}
