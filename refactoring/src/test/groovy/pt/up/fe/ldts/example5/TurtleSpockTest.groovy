package pt.up.fe.ldts.example5

import spock.lang.Specification

class TurtleSpockTest extends Specification {

    def 'Rotate Left'() {
        given:
            def turtle = new Turtle(5, 5, 'N' as char);

        when:
            turtle.execute('L' as char);

        then:
            'W' == turtle.getDirection()

        and:
            turtle.execute('L' as char);

        then:
            'S' == turtle.getDirection()

        and:
            turtle.execute('L' as char);

        then:
            'E' == turtle.getDirection()

        and:
            turtle.execute('L' as char);

        then:
            'N' == turtle.getDirection()

        and:
            5 == turtle.getY()
            5 == turtle.getX()
    }

    def 'Rotate Right'() {
        given:
            def turtle = new Turtle(5, 5, 'N' as char);

        when:
            turtle.execute('R' as char);

        then:
            'E' == turtle.getDirection()

        and:
            turtle.execute('R' as char);

        then:
            'S' == turtle.getDirection()

        and:
            turtle.execute('R' as char);

        then:
            'W' == turtle.getDirection()

        and:
            turtle.execute('R' as char);

        then:
            'N' == turtle.getDirection()

        and:
            5 == turtle.getY()
            5 == turtle.getX()
    }

    def 'Forward'() {
        given:
            def turtleN = new Turtle(5, 5, 'N' as char)
            def turtleW = new Turtle(5, 5, 'W' as char);
            def turtleS = new Turtle(5, 5, 'S' as char);
            def turtleE = new Turtle(5, 5, 'E' as char);

        when:
            turtleN.execute('F' as char)
            turtleW.execute('F' as char);
            turtleS.execute('F' as char);
            turtleE.execute('F' as char);

        then:
            4 == turtleN.getY()
            5 == turtleN.getX()

        and:
            5 == turtleW.getY()
            4 == turtleW.getX()

        and:
            6 == turtleS.getY()
            5 == turtleS.getX()

        and:
            5 == turtleE.getY()
            6 == turtleE.getX()
    }
}
