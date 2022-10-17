package graph;

import java.util.ArrayList;

public class Main {
    static class Edge {
        int src;  // source of the edge.
        int nbr; // neighbor of the source.
        int wt; // weight of the edge

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String[] args) throws Exception{
        int vces = 7; // 0,1,2,3,4,5,6
        ArrayList<Edge> [] graph = new ArrayList[7];
        for (int i=0;i<vces;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,3,40));
        graph[0].add(new Edge(0,1,10));
        graph[1].add(new Edge(0,3,40));
        graph[1].add(new Edge(0,1,10));
        graph[2].add(new Edge(0,3,40));
        graph[2].add(new Edge(0,1,10));
        graph[3].add(new Edge(0,3,40));
        graph[3].add(new Edge(0,1,10));
        graph[4].add(new Edge(0,3,40));
        graph[4].add(new Edge(0,1,10));
        graph[5].add(new Edge(0,3,40));
        graph[5].add(new Edge(0,1,10));
        graph[6].add(new Edge(0,3,40));
        graph[6].add(new Edge(0,1,10));

    }
}
