public class Text {
    private Paragraph[] paragraphs;
    public Text(String text) {
        if (!text.equals("")) {
            String[] splitText = text.split("\n");
            int amounfOfParagraphs = splitText.length;
            paragraphs = new Paragraph[amounfOfParagraphs];

            for (int i = 0; i < amounfOfParagraphs; i++) {
                paragraphs[i] = new Paragraph(splitText[i]);
            }
        }
    }
    public Paragraph[] getParagraphs() {
        return paragraphs;
    }
    public void setParagraphs(Paragraph[] paragraphs) {
        this.paragraphs = paragraphs;
    }
}
