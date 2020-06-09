public class Main {
    public static void main(String[] args) {
        Text myText = new Text("Азбука, extends, абстракція!");
        StringBuilder text = new StringBuilder("");
        String punctuation = ",.?!";
        String Letter = "";
        for (Paragraph paragraph: myText.getParagraphs()) {
            for (Sentence sentence: paragraph.getSentences()) {
                for (MemberOfSentence memberOfSentence: sentence.getMembersOfSentence()) {

                    if (memberOfSentence instanceof Word) {
                        if (punctuation.contains(String.valueOf(((Word) memberOfSentence).getLetters()[0].gettask()))) {
                            Letter = String.valueOf(((Word) memberOfSentence).getLetters()[1].gettask());
                            text.append(((Word) memberOfSentence).getLetters()[0].gettask());
                            text.append(" ");
                        } else {
                            Letter = String.valueOf(((Word) memberOfSentence).getLetters()[0].gettask());
                        }
                        text.append(Letter);

                        for (int i = 0; i < ((Word) memberOfSentence).getLetters().length; i++) {
                            if ((!String.valueOf(((Word) memberOfSentence).getLetters()[i].gettask()).equalsIgnoreCase(Letter)) &
                                    (!punctuation.contains(String.valueOf(((Word) memberOfSentence).getLetters()[i].gettask())))) {
                                text.append(((Word) memberOfSentence).getLetters()[i].gettask());
                            }
                        }

                    } else if (memberOfSentence instanceof PunctuationMark) {
                        text.append(((PunctuationMark) memberOfSentence).gettask());
                        text.append(" ");
                    }
                }
            }
            text.append("\n");
        }
        System.out.println(text);
    }
}
