package visualizealgorithms.bll.algorithm.sorting;
import visualizealgorithms.bll.algorithm.AlgorithmType;
import visualizealgorithms.bll.algorithm.GenericAlgorithm;

/**
 * @author Søren Spangsberg
 */
public class TowerOfHanoi extends GenericAlgorithm {

    public TowerOfHanoi() {

        super("Tower of Hanoi", "O(2^n) exponential algorithm", AlgorithmType.MISC);
    }

    @Override
    public int doWork() {

        int[] numberOfDiscs = (int[]) super.getData();

        move(numberOfDiscs[0], 'A', 'B', 'C');
        return 0;
    }

    public void move(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            return;
        }
        move(n - 1, from_rod, aux_rod, to_rod);
        //System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        move(n - 1, aux_rod, to_rod, from_rod);
    }
}