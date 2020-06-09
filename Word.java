public class Word extends MemberOfSentence {
    private Letter[] letters;
    public Word(String word) {
        int word_length = word.length();
        this.letters = new Letter[word_length];
        for (int i = 0; i < word_length; i++) {
            letters[i] = new Letter(word.charAt(i));
        }
    }
    public Letter[] getLetters() {
        return letters;
    }
    public void setLetters(Letter[] letters) {
        this.letters = letters;
    }
}
