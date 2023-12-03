package com.leal.cipm_testing;

public class ModeloSpInt {

    boolean PorSujeto,PorPreposición,PorObjeto,InterferenciaReflexiva,InterferenciaPasiva;
    double AvanceSpint,tdrSpint;
    int SpintCounter;

    public ModeloSpInt() {
    }

    public boolean isPorSujeto() {
        return PorSujeto;
    }

    public void setPorSujeto(boolean porSujeto) {
        PorSujeto = porSujeto;
    }

    public boolean isPorPreposición() {
        return PorPreposición;
    }

    public void setPorPreposición(boolean porPreposición) {
        PorPreposición = porPreposición;
    }

    public boolean isPorObjeto() {
        return PorObjeto;
    }

    public void setPorObjeto(boolean porObjeto) {
        PorObjeto = porObjeto;
    }

    public boolean isInterferenciaReflexiva() {
        return InterferenciaReflexiva;
    }

    public void setInterferenciaReflexiva(boolean interferenciaReflexiva) {
        InterferenciaReflexiva = interferenciaReflexiva;
    }

    public boolean isInterferenciaPasiva() {
        return InterferenciaPasiva;
    }

    public void setInterferenciaPasiva(boolean interferenciaPasiva) {
        InterferenciaPasiva = interferenciaPasiva;
    }

    public double getAvanceSpint() {
        return AvanceSpint;
    }

    public void setAvanceSpint(double avanceSpint) {
        AvanceSpint = avanceSpint;
    }

    public double getTdrSpint() {
        return tdrSpint;
    }

    public void setTdrSpint(double tdrSpint) {
        this.tdrSpint = tdrSpint;
    }

    public int getSpintCounter() {
        return SpintCounter;
    }

    public void setSpintCounter(int spintCounter) {
        SpintCounter = spintCounter;
    }
}
