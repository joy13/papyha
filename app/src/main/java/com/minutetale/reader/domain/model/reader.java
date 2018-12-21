package com.minutetale.reader.domain.model;

/**
 * Created by jbhattacharya on 15/03/17.
 */

public class reader {
    private enum mode {
        DAY,
        NIGHT
    }
    private int fontSize;

    public int getFontSize() { return fontSize; }

    public void setFontSize(int fontSize) { this.fontSize = fontSize; }
}
