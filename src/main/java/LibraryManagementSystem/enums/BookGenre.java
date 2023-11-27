package LibraryManagementSystem.enums;

public enum BookGenre {
    FANTASY("Fantasy"),
    SCIENCE_FICTION("Science Fiction"),
    PHILOSOPHY("Philosophy"),
    PSYCHOLOGY("Psychology"),
    POEMS("Poems"),
    ROMANTIC("Romantic"),
    COMPUTER_SCIENCE("Computer Science"),
    MATHEMATICS("Mathematics"),
    ASTRONOMY("Astronomy"),
    POLITICS("Politics"),
    PHYSICS("Physics"),
    OTHER("Other");

    private final String displayName;

    BookGenre(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
