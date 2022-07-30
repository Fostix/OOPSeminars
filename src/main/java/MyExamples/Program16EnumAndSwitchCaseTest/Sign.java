package MyExamples.Program16EnumAndSwitchCaseTest;

public enum Sign {
    HELLO(6),
    HOW_ARE_YOU(1),
    I_AM_GOOD(2),
    LOL(3),
    TEST(4);

    int number;
    Sign(int i) {
        this.number = i;
    }
}
