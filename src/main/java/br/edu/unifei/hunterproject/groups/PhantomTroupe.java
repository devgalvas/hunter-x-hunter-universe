package br.edu.unifei.hunterproject.groups;

public class PhantomTroupe extends Group {
    private int spider_number;
    private static PhantomTroupe phantom_troupe;

    private PhantomTroupe() {}

    public static PhantomTroupe getPhantomTroupe() {
        if (phantom_troupe == null) {
            phantom_troupe = new PhantomTroupe();
        }
        return phantom_troupe;
    }


    public int getSpider_number() {
        return spider_number;
    }

    public void setSpider_number(int spider_number) {
        this.spider_number = spider_number;
    }
}
