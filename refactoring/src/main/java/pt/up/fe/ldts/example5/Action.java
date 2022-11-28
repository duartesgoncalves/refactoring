package pt.up.fe.ldts.example5;

public abstract class Action {
    Position position;

    public Action(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract Position execute();
}
