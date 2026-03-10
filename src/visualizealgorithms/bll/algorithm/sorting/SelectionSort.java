package visualizealgorithms.bll.algorithm.sorting;

import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

public class SelectionSort extends GenericAlgorithm {

    public SelectionSort() {
        super("SelectionSort", "Simple 0(N^2) sorting algorithm", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {

        int[] b = (int[]) super.getData();

        for (int i = 1; i < b.length; i++) {

            int minIndex = 1;
            for (int j = i + i; j < b.length; j++) {
                if (b[j] < b[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = b[i];
            b[i] = b[minIndex];
            b[minIndex] = tmp;
        }
    }
}

