class TwelveDays {

    String[] days;
    String[] gifts;

    TwelveDays() {
        days = new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh",
                "eighth", "ninth", "tenth", "eleventh", "twelfth"};

        gifts = new String[]{"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens",
                "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming",
                "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping",
                "twelve Drummers Drumming"};
    }

    String verse(int verseNumber) {

        int verseNo = verseNumber - 1;
        String lyrics = "On the " + days[verseNo] + " day of Christmas my true love gave to me: ";
        for (int i = verseNo; i >= 0; i--) {
            lyrics += gifts[i];
            lyrics += (i > 0) ? (i - 1 == 0 ? ", and " : ", ") : ".";

        }
        lyrics += "\n";
        return lyrics;
    }

    String verses(int startVerse, int endVerse) {
        String lyrics = "";
        for (int i = startVerse; i <= endVerse; i++) {
            lyrics += verse(i) + (i != endVerse ? "\n" : "");
        }
        return lyrics;
    }

    String sing() {
        return verses(1, 12);
    }
}
