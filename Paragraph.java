public class Paragraph {
    private Sentence[] sentences;
    public Paragraph(String paragraph) {
        paragraph = paragraph.replace(" ", "");
        String[] paragraphSplit = paragraph.split("(?<=[?!.])");

        int amountOfSentences = paragraphSplit.length;
        sentences = new Sentence[amountOfSentences];

        for (int i = 0; i < amountOfSentences; i++) {
            sentences[i] = new Sentence(paragraphSplit[i]);
        }
    }
    public Sentence[] getSentences() {
        return sentences;
    }
    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }
}
