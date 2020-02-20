public class player {
    private String player;
    private double batavg;

    public player(String player, double batavg) {
        this.player = player;
        this.batavg = batavg;
    }



    public String getPlayer() {
        return player;
    }

    public double getBatavg() {
        return batavg;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setBatavg(double batavg) {
        this.batavg = batavg;
    }

    @Override
    public String toString() {
        return
                "player=" + player +
                "batavg=" + batavg ;
    }

}

