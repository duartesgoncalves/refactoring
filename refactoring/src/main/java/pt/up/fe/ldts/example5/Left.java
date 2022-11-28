package pt.up.fe.ldts.example5;

public class Left extends Action {
    public Left(Position position) {
        super(position);
    }

    @Override
    public Position execute() {
        if (getPosition().getDirection() == 'N') getPosition().setDirection('W');
        else if (getPosition().getDirection() == 'W') getPosition().setDirection('S');
        else if (getPosition().getDirection() == 'S') getPosition().setDirection('E');
        else if (getPosition().getDirection() == 'E') getPosition().setDirection('N');
        return getPosition();
    }
}
