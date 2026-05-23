// time & space: O(n^2)

#include<stdio.h>

#define MAX 10
#define INF 9999

int main() {
    
    int n, source;
    int graph[MAX][MAX];
    int distance[MAX], visited[MAX] = {0};
    
    printf("Enter number of routers: ");
    scanf("%d", &n);
    
    printf("Enter %d routers: ", n);
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &graph[i][j]);
            if (graph[i][j] == 0 && i != j)
                graph[i][j] = INF;
        }
    }
    
    printf("Enter source: ");
    scanf("%d", &source);
    
    for (int i = 0; i < n; i++) {
        distance[i] = graph[source][i];
    }
    
    visited[source] = 1;
    distance[source] = 0;
    
    for (int  count = 1; count < n - 1; count++) {
       int min = INF, nextNode;
       for (int i = 0; i < n; i++) {
           if (!visited[i] && distance[i] < min) {
               min = distance[i];
               nextNode = i;
           }
       }
       visited[nextNode] = 1;
       
       for (int i = 0; i < n; i++) {
           if (!visited[i] && min + graph[nextNode][i] < distance[i])
            distance[i] = min + graph[nextNode][i];
       }
    }
    
    for (int i = 0; i < n; i++) {
        printf("To router %c -> %d\n", 65 + i, distance[i]);
    }
    
}

/* sample input
Enter number of routers: 4
Enter 4 routers: 0 2 5 0
2 0 1 4
5 1  0 3
0 4 3 0
Enter source: 0
  */
