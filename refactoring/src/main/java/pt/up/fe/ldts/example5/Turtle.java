package pt.up.fe.ldts.example5;

public class Turtle {
    private Position pos;

    public Turtle(int y, int x, char direction) {
        this.pos = new Position(y, x, direction);
    }

    public int getX() {
        return pos.getX();
    }

    public int getY() {
        return pos.getY();
    }

    public char getDirection() {
        return pos.getDirection();
    }

    public void setX(int x) {
        pos.setX(x);
    }

    public void setY(int y) {
        pos.setY(y);
    }

    public void setDirection(char direction) {
        pos.setDirection(direction);
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public void execute(char action) {
        if (action == 'L') { // ROTATE LEFT
            setPos(new Left(pos).execute());
        } else if (action == 'R') { // ROTATE RIGHT
            setPos(new Right(pos).execute());
        } else if (action == 'F'){ // MOVE FORWARD
            setPos(new Forward(pos).execute());
        }
    }
}