import java.util.ArrayList;

public class TransactionDB
{
    ArrayList<Transaction> transactionDB = new ArrayList<Transaction>();
    ArrayList<String> transDB = new ArrayList<String>();

    TransactionDB(){
    }

    // Add newtr to collection 
    public void add(Transaction newtr){
        transactionDB.add(newtr);
        transDB.add(newtr.toString());
    }

    // Return string constisting of individual transactions
    public String toString(){
        String list = "";
        for(int i = 0; i < transDB.size(); i++){
            list += transDB.get(i) + "\n";
        }
        return list;
    }

    // Return number of transactions
    public int numTransactions(){
        return transactionDB.size();
    }

    // Get year and sales
    public int getYear(int year){
        return year;
    }
    public double getSales(double sales){
        return sales;
    }
    // Return average cost of transactions made in the most recent year
    public double avgRecentCost(){
        double avg = 0;
        int recentYear = 0;
        ArrayList<Transaction> recentTrans = new ArrayList<Transaction>();
        for(Transaction newtr: transactionDB){
            if(newtr.getYear() > recentYear){
                recentYear = newtr.getYear();
            }
        }
        for(Transaction newtr: transactionDB){
            if(newtr.getYear() == recentYear){
                recentTrans.add(newtr);
            }
        }
        for(Transaction newtr: recentTrans){
            avg = avg + newtr.getSales();
        }

        return avg/(recentTrans.size());
    }
}