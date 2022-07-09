package org.nand;

import java.util.ArrayList;

/**
 * ノード管理クラス
 */
public abstract class LinkedList {
    private ArrayList<Boolean> input = new ArrayList<>(); // 入力管理用
    private ArrayList<LinkedList> prev = new ArrayList<>(); // 前のノード
    private ArrayList<LinkedList> next = new ArrayList<>(); // 後のノード

    public LinkedList() {
        this.prev.add(null);
        this.next.add(null);
    }

    public ArrayList<Boolean> getInput() {
        return input;
    }

    public ArrayList<LinkedList> getPrev() {
        return prev;
    }

    public ArrayList<LinkedList> getNext() {
        return next;
    }

    /**
     * 出力演算
     * @param input
     * @return
     */
    public abstract boolean output(ArrayList<Boolean> input);

    /**
     * 論理回路に値を設定
     * @param input
     */
    public abstract void setInput(boolean input);

    /**
     * 次の要素に値を渡す
     */
    public void setToNextNode() {
        // 次の要素を取得
        LinkedList node = this.getNext().get(0);

        // 終端の処理
        if (node == null) {
            System.out.print(this.output(this.getInput()));
            return;
        }
        // 値をセット
        node.setInput(this.output(this.getInput()));
    }

    /**
     * 自身のprevに前の要素を紐付け
     * insert用
     * @param prev
     */
    public void setPrev(LinkedList prev) {
        if (getPrev().get(0) == null) { // prevがnullのとき
            getPrev().set(0, prev); // 引数prevをセット
        } else {
            getPrev().add(prev);
        }

        if (prev.getNext().get(0) == null) { // prevのnextに自身をセット
            prev.getNext().set(0, this);
        } else {
            prev.getNext().add(this);
        }
    }

    /**
     * 自身のnextに次の要素を紐付け
     * insert用
     * @param next
     */
    public void setNext(LinkedList next) { // setPrev()と同様
        if (getNext().get(0) == null) {
            getNext().set(0, next);
        } else {
            getNext().add(next);
        }

        if (next.getPrev().get(0) == null) {
            next.getPrev().set(0, this);
        } else {
            next.getPrev().add(this);
        }
    }
}
