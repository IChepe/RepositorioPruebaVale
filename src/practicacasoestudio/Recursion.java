package practicacasoestudio;

public class Recursion {




    public int SumaDivisores(int n, int i) {
        if (i > n) {
            return 0;
        }
        if (n % i == 0) {
            return i + SumaDivisores(n, i + 1);
        }
        return SumaDivisores(n, i + 1);
    }



    }


