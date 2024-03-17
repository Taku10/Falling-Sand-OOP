
package objectorientedfallingsand;

/**
 *
 * @author tmadziwa
 */
public class Movement {
    private int rowChange;
    private int columnChange;
    
    public Movement(int inRowChange, int inColumnChange){
        rowChange = inRowChange ;
        columnChange = inColumnChange;
    }

    public int getRowChange() {
        return rowChange;
    }

    public int getColumnChange() {
        return columnChange;
    }
    
    
    
}


