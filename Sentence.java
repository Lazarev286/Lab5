public class Sentence {
    private MemberOfSentence[] membersOfSentence;
    public Sentence(String sentence) {
        String punctuation = ",.?!";
        String[] splitSentence = sentence.split("(?=[,.!?])|\\s");
        int amountOfSentenceMembers = splitSentence.length;
        membersOfSentence = new MemberOfSentence[amountOfSentenceMembers];
        for (int i = 0; i < amountOfSentenceMembers; i++) {
            if (punctuation.contains(splitSentence[i]))
                membersOfSentence[i] = new PunctuationMark(splitSentence[i].charAt(0));
            else {
                membersOfSentence[i] = new Word(splitSentence[i]);
            }
        }
    }
    public MemberOfSentence[] getMembersOfSentence() {
        return membersOfSentence;
    }
    public void setMembersOfSentence(MemberOfSentence[] membersOfSentence) {
        this.membersOfSentence = membersOfSentence;
    }
}
