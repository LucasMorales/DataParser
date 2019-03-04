public class ElectionResult {

    double votesDem;
    double votesGOP;
    double totalVotes;
    double percentDem;
    double percentGOP;
    double voteDiff;
    double votePercentDiff;
    String stateAbbr;
    String countryName;
    int fips;


    public ElectionResult(double votesDem, double votesGOP, double totalVotes, double percentDem, double percentGOP,
                          double voteDiff, double votePercentDiff, String stateAbbr, String countryName, int fips) {

    }


    public double getVotesDem() {
        return votesDem;
    }

    public void setVotesDem(double votesDem) {
        this.votesDem = votesDem;
    }

    public double getVotesGOP() {
        return votesGOP;
    }

    public void setVotesGOP(double votesGOP) {
        this.votesGOP = votesGOP;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }

    public double getPercentDem() {
        return percentDem;
    }

    public void setPercentDem(double percentDem) {
        this.percentDem = percentDem;
    }

    public double getPercentGOP() {
        return percentGOP;
    }

    public void setPercentGOP(double percentGOP) {
        this.percentGOP = percentGOP;
    }

    public double getVoteDiff() {
        return voteDiff;
    }

    public void setVoteDiff(double voteDiff) {
        this.voteDiff = voteDiff;
    }

    public double getVotePercentDiff() {
        return votePercentDiff;
    }

    public void setVotePercentDiff(double votePercentDiff) {
        this.votePercentDiff = votePercentDiff;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String stateAbbr) {
        this.stateAbbr = stateAbbr;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getFips() {
        return fips;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }
}
