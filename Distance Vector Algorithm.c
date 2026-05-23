// time: O(n^3)
// space: O(n^2)

#include<stdio.h>

#define MAX 10
#define INF 9999

int main() {
    int cost[MAX][MAX], dist[MAX][MAX], n;
    
    printf("Enter number of routers: ");
    scanf("%d", &n);
    
    printf("Enter matrix: ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            scanf("%d", &cost[i][j]);
            dist[i][j] = cost[i][j];
        }
    }
    
    for (int k = 0; k < n; k++) {
        for (int i = 0; i  < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] > cost[i][k] + dist[k][j]) {
                    dist[i][j] = cost[i][k] + dist[k][j];
                }
            }
        }
    }
     printf("\n");
     
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            printf("%4d", dist[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}

/* 
Enter number of routers: 4
Enter matrix: 0 2 5 9999
2 0 1 4
5 1 0 3
9999 4 3 0
*/
