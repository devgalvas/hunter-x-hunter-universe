package br.edu.unifei.hunterproject.LivingBeing;

import br.edu.unifei.hunterproject.nen.Nen;

public abstract class LivingBeing {
    private boolean live;
    private Nen nen;
    
    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public Nen getNen() {
        return nen;
    }

    public void setNen(Nen nen) {
        this.nen = nen;
    }
}
