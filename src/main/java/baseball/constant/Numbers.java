package baseball.constant;

public enum Numbers {

    RANGE_MIN_NUMBER(1),
    RANGE_MAX_NUMBER(9);

    private final int number;

    Numbers(int number) {
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
}
