package br.edu.unifei.hunterproject.Hunters;

public class President extends Hunter{
    private static President president = new President();
    private President () {}

    public static President getPresident() {
        return president;
    }
}   
