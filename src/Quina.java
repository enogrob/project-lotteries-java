import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quina {
    List<Integer> quina;

    public Quina(){
        int r;
        int n = 5;

        quina = new ArrayList();
        for(int i=0;i<n; i++) {
            r = (int) Math.round(Math.random() * 80 + 1);
            if (!quina.contains(i))
                quina.add(r);
        }
        Collections.sort(quina);
    }

    public int sum(){
        int sum = 0;
        for (int i : quina)
            sum += i;
        return sum;
    }
}