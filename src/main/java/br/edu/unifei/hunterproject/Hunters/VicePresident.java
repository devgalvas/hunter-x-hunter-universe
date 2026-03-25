package br.edu.unifei.hunterproject.Hunters;

public class VicePresident extends Hunter{
    private static VicePresident vicePresident = new VicePresident();
    private VicePresident() {}

    public static VicePresident getVicePresident() {
        return vicePresident;
    }
}
