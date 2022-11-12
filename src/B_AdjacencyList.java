package src;
import java.util.*;

public class B_AdjacencyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int A[] = new int[M];
        int B[] = new int[M];
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < N; i++) {
            ArrayList<Integer> ansPartList = new ArrayList<Integer>();
            ansList.add(ansPartList);
        }

        for (int i = 0; i < M; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
            ansList.get(A[i]-1).add(B[i]);
            ansList.get(B[i]-1).add(A[i]);
        }
        scanner.close();

        for (int i = 0; i < N; i++) {
            Collections.sort(ansList.get(i));
            System.out.println(ansList.get(i).size());
            for (int j = 0; j < ansList.get(i).size(); j++) {
                System.out.println(ansList.get(i).get(j));   
            }
        }
    }
}