
public class bowler extends batsman {
    private int innings;
    private int over;
    private int wicket;
    private int type;

    public bowler() {
    }

    public bowler(int runs, int century, int half_century, int innings, int over, int wicket, int type) {
        super(runs, century, half_century);
        this.innings = innings;
        this.over = over;
        this.wicket = wicket;
        this.type = type;
    }

    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "bowler{" +
                "innings=" + innings +
                ", over=" + over +
                ", wicket=" + wicket +
                ", type=" + type +
                '}';
    }
}
