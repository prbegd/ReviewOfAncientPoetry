package com.xingab612.reviewofancientpoetry.beans;

/**
 * 表示汉字的类
 */
public class Kanji {
    private char kanji;
    private String pinyin;

    public Kanji() {
    }

    public Kanji(char kanji, String pinyin) {
        this.kanji = kanji;
        this.pinyin = pinyin;
    }
    public Kanji(char kanji) {
        this.kanji = kanji;
    }

    /**
     * 获取
     * @return kanji
     */
    public char getKanji() {
        return kanji;
    }

    /**
     * 设置
     * @param kanji
     */
    public void setKanji(char kanji) {
        this.kanji = kanji;
    }

    /**
     * 获取
     * @return pinyin
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * 设置
     * @param pinyin
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String toString() {
        return "Kanji{kanji = " + kanji + ", pinyin = " + pinyin + "}";
    }
}
