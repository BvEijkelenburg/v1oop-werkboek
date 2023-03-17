package les09_10.opdrachten.twitter.model;

public class Tweet {
    private String bericht;

    public Tweet(String bericht) throws Exception {
        if (bericht.isEmpty()) {
            throw new Exception("Leeg bericht niet toegestaan!");
        }
        this.bericht = bericht;
    }

    public String getBericht() {
        return bericht;
    }
}
