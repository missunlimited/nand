package org.nand;

import java.util.ArrayList;

/**
 * NAND
 */
public class Nand extends LinkedList {

    @Override
    public boolean output(ArrayList<Boolean> input) {
        return !(input.get(0) & input.get(1));
    }

    @Override
    public void setInput(boolean input) {
        if (getInput().isEmpty()) {
            getInput().add(input);
        } else {
            getInput().add(input);
            setToNextNode();
        }
    }
}
