package pt.up.fe.ldts.example5;

public class Forward extends Action {
    public Forward(Position position) {
        super(position);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') getPosition().setY(getPosition().getY() - 1);
        if (getPosition().getDirection() == 'S') getPosition().setY(getPosition().getY() + 1);
        if (getPosition().getDirection() == 'W') getPosition().setX(getPosition().getX() - 1);
        if (getPosition().getDirection() == 'E') getPosition().setX(getPosition().getX() + 1);
        return getPosition();
    }
}
