package Graph;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Graph {

	int vertices;
	int edges;
	int graph[][];
	static Set<Integer> u;
	static Set<Integer> v;

	public Graph(int vertex, int edges) {
		this.vertices = vertex;
		this.edges = edges;
		this.graph = new int[vertex][vertex];
		u = new HashSet<Integer>();
		v = new HashSet<Integer>();
	}

	public void fillGraph() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < this.edges; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int weight = s.nextInt();
			fillEdge(a, b, weight);

		}
	}

	public void fillEdge(int a, int b, int weight) {
		this.graph[a][b] = this.graph[b][a] = weight;
	}

	public void printGraph() {
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[0].length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}

	}

	public int dijsktraAlgo(int s, int e) {
		int n = this.vertices;
		// int parent[] = new int[n];
		int distance[] = new int[n];
		for (int i = 0; i < n; i++)
			distance[i] = Integer.MAX_VALUE;

		// parent[s] = 0;
		distance[s] = 0;

		u.add(s);
		firstDistanceFill(distance, graph, s);
		for (int i = 0; i < n; i++) {
			if (i != s)
				v.add(i);
		}
		while (!v.isEmpty()) {
			int vvert = getMinVertex(distance);
			updateAdjDistance(graph, distance, vvert);
			System.out.println(vvert + "->" + distance[vvert]);
			v.remove(vvert);
			u.add(vvert);
		}
		return distance[e];

	}

	public void firstDistanceFill(int dist[], int graph[][], int source) {
		for (int i = 0; i < dist.length; i++) {
			if (graph[source][i] != 0)
				dist[i] = graph[source][i];
		}
	}

	public int getMinVertex(int distance[]) {
		int minVertex = -1;
		int minVal = Integer.MAX_VALUE;
		for (int i = 0; i < distance.length; i++) {
			if (minVal >= distance[i] && !u.contains(i)) {
				minVal = distance[i];
				minVertex = i;
			}
		}
		return minVertex;

	}

	public void updateAdjDistance(int graph[][], int distance[], int v) {
		for (int j = 0; j < distance.length; j++) {
			if (graph[v][j] != 0 && !u.contains(j)) {

				int dist = distance[v] + graph[v][j];
				if (dist < distance[j]) {
					distance[j] = dist;
				}
			}
		}
	}
}
