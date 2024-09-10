public class Collector{
    private int colID;
    private String colName;
    private char category;

    public Collector(int colID, String colName, char category){
        this.colID = colID;
        this.colName = colName;
        this.category = category;
    }
    public String toString(){
        return "{" + colID + ", " + colName + ", " + category + "}";
    }
}