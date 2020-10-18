import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime(); 
        /*new operator instantiates a class by dynamically allocating
         memory for a new object and returning a reference to that memory */
        this.hash = calculateHash();
    }
    
    public String calculateHash() {
        String claculatedhash = StringUtil.applySHA256(
                        previousHash +
                        Long.toString(timeStamp) +
                        data
                        );
        return claculatedhash;
    }   
}

