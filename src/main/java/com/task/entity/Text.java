package com.task.entity;

import com.task.tool.ConstInput;

import java.util.Objects;

public class Text {
    private String text ;

    public void clear(){
      this.text = "";
    }

    public Text(String text) {
        if (text==null)throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text==null)throw new NullPointerException(ConstInput.NULL_POINTER_EXCEPTION + this.toString());
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        if ((this.text).equals(((Text) o).getText())){return true;}
        return Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(text);
        result = 31 * result + text.hashCode();
        return result;
    }
}
