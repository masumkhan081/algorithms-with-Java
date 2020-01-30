/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph_Algorithms;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Masum Khan
 */
public class DFS {

    static ArrayList<Integer> q;
    static int current_node, num_nodes;
    static boolean visited[];

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Number Of Nodes: ");
        //
        num_nodes = scn.nextInt();
        int arr[][] = new int[num_nodes][num_nodes];

        System.out.println("\nTaking Graph As Adjacency Matrix \n(1 means existence of edge; 0 otherwise)  ");
        try {
            for (int i = 0; i < num_nodes; i++) {
                for (int j = 0; j < num_nodes; j++) {
                    arr[i][j] = scn.nextInt();
                    if (arr[i][j] != 0 && arr[i][j] != 1) {
                        System.out.println("Screw Your Attention");
                        System.exit(0);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("you kidding !");
        }
        System.out.println("Define Starting Node Between: (" + 1 + "-" + num_nodes + ")");
        int start_node = scn.nextInt();
        if (start_node < 1 || start_node > num_nodes) {
            System.exit(0);
        }
        traverse(arr, start_node - 1);
    }

    static void traverse(int arr[][], int start_node) {
        boolean node_unvisited_exist;
        visited = new boolean[num_nodes];
        ArrayList<Integer> output = new ArrayList();
        q = new ArrayList();
        output.add(start_node);
        q.add(start_node);
        visited[start_node] = true;
        int pop = 0;
        while (!q.isEmpty()) {
            current_node = q.get(q.size() - 1);
            //  System.out.println("? " + current_node);

            node_unvisited_exist = false;
            for (int i = 0; i < num_nodes; i++) {
                if (arr[current_node][i] == 1 && visited[i] != true) {
                    q.add(i);
                    visited[i] = true;
                    output.add(q.get(q.size() - 1));
                    node_unvisited_exist = true;
                    // System.out.println("::" + i);
                    break;
                }
            }
            if (node_unvisited_exist == false) {
                q.remove(q.get(q.size() - 1));
            }
            pop++;
        }
        System.out.println("output sequence: ");
        for (int i = 0; i < num_nodes; i++) {
            System.out.println("Node-" + (output.get(i) + 1));
        }
    }
}
