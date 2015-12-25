package org.bhi.q3;

/**
 *
 * @author carlo nino mabalatan
 */
public class Race {

    private int raceid;
    private String typeofrace;
    private int distance;

    public Race(int raceid, String typeofrace, int distance) {
        this.raceid = raceid;
        this.typeofrace = typeofrace;
        this.distance = distance;
    }

    public Race() {
    }

    public int getRaceid() {
        return raceid;
    }

    public void setRaceid(int raceid) {
        this.raceid = raceid;
    }

    public String getTypeofrace() {
        return typeofrace;
    }

    public void setTypeofrace(String typeofrace) {
        this.typeofrace = typeofrace;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
