package com.utils.convert;

public class CharSequenceToString {
    public static String toString(CharSequence... charSequence) {
        final StringBuilder sb = new StringBuilder();
        for (CharSequence cs : charSequence) {
            sb.append(cs);
        }
        return sb.toString();
    }
}



