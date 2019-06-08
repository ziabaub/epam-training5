package com.task.service.string;

import com.task.tool.ConstInput;

public class StringUtil {

    public StringUtil() {
    }

    public String replace(String data, String regex, String value) {
        if ((data == null) || (regex == null) || (value == null)) {
            throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        }
         return data.replaceAll(regex, value);
    }
    public String replaceOtoA(String data ){
        String[] words = data.split(" ");
        StringBuilder res = new StringBuilder();
        for ( String  i : words) {
             res.append(replaceWrongValue(i)+" ");
        }
        return  res.toString();
    }

    public String replaceWrongValue(String wrongText) {
        if (wrongText == null) {
            throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        }
        for (int i = 0; i < wrongText.length(); i++) {

            int position = wrongText.indexOf('p');
            if (position != -1) {
                wrongText = replaceCharAt(wrongText, position + 1, 'o');
            }

        }
        return wrongText;
    }


    private String replaceCharAt(String data, int pos, char c) {
        if ((data == null) || (c == '\0')) {
            throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        }

        return data.substring(0, pos) + c + data.substring(pos + 1);
    }

    public String costumeReplace(String data, int wordLength, String replacement) {
        if ((data == null) || (replacement == null) || (wordLength == ConstInput.NULL_INT)) {
            throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        }
        String regex = "\\b[a-zA-Z]{" + wordLength + "}\\b";
        data = data.replaceAll(regex, replacement);
        return data;
    }

    public String CostumeDelete(String data) {
        if (data == null) {
            throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        }
        String regex = "(?u)[^\\pL ]";
        data = data.replaceAll(regex, "");
        data =data.trim().replaceAll(" +", " ");
        return data;
    }

    public String  delete(String data, char firstLetter, int length) {
        if ((data == null) || (firstLetter == '\0') || (length == ConstInput.NULL_INT)) {
            throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        }
        String regex = "(["+firstLetter+"][a-zA-Z]{"+length+"}\\s*)+";

        data = data.replaceAll(regex, "");
        return data;
    }

    @Override
    public String toString() {
        return "StringUtil";
    }
}
