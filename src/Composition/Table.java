package Composition;

import java.util.ArrayList;

public class Table implements Billable
{
    private Integer width;
    private Integer length;
    private ArrayList<Leg> legs = new ArrayList<>();

    public Table(Integer width, Integer length) {
        this.width = width;
        this.length = length;
    }

    public Table(Integer width, Integer length, Integer legLength, int numLegs) {
        for(int i = 0; i < numLegs; i++) {
            legs.add(new Leg(25));
        }
    }

    @Override
    public Float getPrice() {
        return (float) (length*width*1.00);
    }
}