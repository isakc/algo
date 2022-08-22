package ch5_DFS_BFS;

import java.util.*;

class Node5_7 {

    private int index;
    private int distance;

    public Node5_7(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.print("(" + this.index + "," + this.distance + ") ");
    }
}

public class ex5_7 {

    // ��(Row)�� 3���� ���� ����Ʈ ǥ��
    public static ArrayList<ArrayList<Node5_7>> graph = new ArrayList<ArrayList<Node5_7>>();

    public static void main(String[] args) {
        // �׷��� �ʱ�ȭ
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<Node5_7>());
        }

        // ��� 0�� ����� ��� ���� ���� (���, �Ÿ�)
        graph.get(0).add(new Node5_7(1, 7));
        graph.get(0).add(new Node5_7(2, 5));

        // ��� 1�� ����� ��� ���� ���� (���, �Ÿ�)
        graph.get(1).add(new Node5_7(0, 7));

        // ��� 2�� ����� ��� ���� ���� (���, �Ÿ�)
        graph.get(2).add(new Node5_7(0, 5));

        // �׷��� ���
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
    }

}