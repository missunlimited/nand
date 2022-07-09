package org.nand;

import java.util.ArrayList;

/**
 * 回路、構成部品生成クラス
 */
public class Circuit {
    private ArrayList<Boolean> input;
    private LinkedList nand1;
    private LinkedList nand2;
    private LinkedList nand3;
    private LinkedList nand4;

    public Circuit() {
        this.input = null;
        this.nand1 = null;
        this.nand2 = null;
        this.nand3 = null;
        this.nand4 = null;
    }

    public void CircuitExe(Boolean input1, Boolean input2) {
        // 部品生成
        nand1 = new Nand();
        nand2 = new Nand();
        nand3 = new Nand();
        nand4 = new Nand();

        // 既知の入力値をセット
        nand1.setInput(input1);
        nand1.setInput(input2);
        nand2.setInput(input1);
        nand3.setInput(input2);

        // 回路生成
        new LinkedListOpt(nand1)
                .addTail(nand2)
                .addTail(nand4)
                .insert(nand1, nand4, nand3);
    }
}
