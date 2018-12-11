package cat.indiketa.degiro.model;

public enum DOrderAction {
    BUY(0, "B"),
    SELL(1, "S");

    private final int value;
    private final String strValue;

    private DOrderAction(int value, String strValue) {
        this.value = value;
        this.strValue = strValue;
    }

    public int getValue() {
        return value;
    }

    public String getStrValue() {
        return strValue;
    }

    public static DOrderAction getOrderByValue(int value) {
        DOrderAction type = null;
        int i = 0;
        DOrderAction[] values = DOrderAction.values();
        while (i < values.length && values[i].value != value) {
            i++;
        }
        if (i < values.length) {
            type = values[i];
        }

        return type;
    }

    public static DOrderAction getOrderByValue(String value) {
        DOrderAction type = null;
        int i = 0;
        DOrderAction[] values = DOrderAction.values();
        while (i < values.length && !values[i].strValue.equals(value)) {
            i++;
        }
        if (i < values.length) {
            type = values[i];
        }

        return type;
    }

}
