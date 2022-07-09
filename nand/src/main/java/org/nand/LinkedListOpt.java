package org.nand;

/**
 * リスト管理用クラス
 */
public class LinkedListOpt {
    private LinkedList element;
    private LinkedList head;
    private LinkedList tail;

    public LinkedListOpt(LinkedList element) {
        this.element = element;
    }

    public LinkedList getElement() {
        return element;
    }


    /**
     * 末尾に要素を追加
     * @param addElement
     * @return
     */
    public LinkedListOpt addTail(LinkedList addElement) {
        this.tail = getElement();

        while (tail.getNext().get(0) != null) {
            tail = tail.getNext().get(0);
        }
        tail.setNext(addElement);
        return this;
    }

    /**
     * 任意の部品間に挿入
     * @param element1 回路上流側の要素
     * @param element2 回路下流側の要素
     * @param component 挿入したい要素
     * @return
     */
    public LinkedListOpt insert(LinkedList element1, LinkedList element2, LinkedList component) {
        element1.setNext(component);
        element2.setPrev(component);
        return this;
    }

    /**
     * 先頭の要素を取得
     * @return
     */
    public LinkedList getHead() {
        this.head = getElement();

        while (head.getPrev().get(0) != null) {
            head = head.getPrev().get(0);
        }
        return head;
    }

    /**
     * 末尾の要素を取得
     * @return
     */
    public LinkedList getTail() {
        this.tail = getElement();

        while (tail.getNext().get(0) != null) {
            tail = tail.getNext().get(0);
        }
        return tail;
    }
}
