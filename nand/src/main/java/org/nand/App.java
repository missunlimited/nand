package org.nand;

/**
 * 論理回路をプログラムで作成し、A,Bの入力を与えてYを出力せよ。
 * コンソールでの入力は不要で、コード内で完結してよい。
 * 分岐も1つの論理回路として扱うこと。
 *
 * 回路を模するための連結リストは自作すること。
 * 以下の要素を持っていて、getPrev()で前の要素を取り出し、getNext()で次の要素を取り出す。
 * setPrev()/setNext()でそれぞれ連結状態を実現する。
 * 連結リストとして振る舞える基本クラスを作成したのち、それを基底クラスとして
 * NAND・分岐の機能を持たせたものを派生させる。
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.print("入力 : true , true  期待値 : false\n出力 : ");
        Circuit circuit1 = new Circuit();
        circuit1.CircuitExe(true, true);
        System.out.print("\n\n");

        System.out.print("入力 : true , false  期待値 : true\n出力 : ");
        Circuit circuit2 = new Circuit();
        circuit2.CircuitExe(true, false);
        System.out.print("\n\n");

        System.out.print("入力 : false , true  期待値 : true\n出力 : ");
        Circuit circuit3 = new Circuit();
        circuit3.CircuitExe(false, true);
        System.out.print("\n\n");

        System.out.print("入力 : false , false  期待値 : true\n出力 : ");
        Circuit circuit4 = new Circuit();
        circuit4.CircuitExe(false, false);
        System.out.print("\n\n");

    }
}
