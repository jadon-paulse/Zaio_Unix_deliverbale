
public class Dam implements Comparable<Dam>{
    
    private String name;
    private String FSC;
    private String percentFull;



    public Dam(String name,String FSC,String percentFull){

        this.name = name;
        this.FSC = FSC;
        this.percentFull = percentFull;
    }
    /**
     *@return Dam name
     */

    public String toString(){

        return ("Name: "+ this.name+", " +"FSC: " +this.FSC +", Percentage: " + this.percentFull);
    }
    public String getName(){

        return name;
    }

    /**
     *@return the name which is higher in alphabetical order
     */

    public int compareTo(Dam d){

        return (this.getName().compareTo(d.getName()));
    }

}