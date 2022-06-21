public class Candidate implements Comparable<Candidate> {
    private String fullName;
    private String sex;
    private String age;
    private int relevance;
    private int rating;

    public Candidate(String fullName, String sex, String age, int relevance, int rating) {
        this.fullName = fullName;
        this.sex = sex;
        this.age = age;
        this.relevance = relevance;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("%-45s %-20s %-5s", fullName, relevance, rating);
    }

    @Override
    public int compareTo(Candidate candidate) {
        if (this.relevance < candidate.relevance) {
            return 1;
        } else if (this.relevance > candidate.relevance) {
            return -1;
        } else if (this.relevance == candidate.relevance) {
            if (this.rating < candidate.rating) {
                return 1;
            } else if (this.rating > candidate.rating) {
                return -1;
            } else if (this.rating == candidate.rating) {
                return 0;
            }
        }
        return 0;
    }
}
