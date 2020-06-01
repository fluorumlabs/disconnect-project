package com.github.fluorumlabs.disconnect;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Artem Godin on 5/29/2020.
 */
public class Tokenizer {
    private String value;

    public Tokenizer(String value) {
        this.value = StringUtils.defaultString(value);
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

    public boolean token(String... tokens) {
        for (String token : tokens) {
            if (value.startsWith(token)) {
                skip(token);
                return true;
            }
        }
        return false;
    }

    public boolean is(String... tokens) {
        for (String token : tokens) {
            if (value.startsWith(token)) {
                return true;
            }
        }
        return false;
    }

    public void trim() {
        value = StringUtils.stripStart(value, " \t\n");
    }

    public void skip(String... separators) {
        for (String separator : separators) {
            trim();
            value = StringUtils.removeStart(value, separator.trim());
        }
        trim();
    }

    public void unpop(String text) {
        value = text + value;
    }

    public String pop(String... separators) {
        String result = peek(separators);
        value = StringUtils.removeStart(value, result);
        skip(separators);
        return result;
    }

    public String popTo(String... separators) {
        String result = peek(separators);
        value = StringUtils.removeStart(value, result);
        trim();
        return result;
    }

    public String extractTo(String separator) {
        String result = StringUtils.substringBefore(value, separator);
        value = StringUtils.removeStart(value, result+separator);
        trim();
        return result;
    }

    public void removeOuterBrackets() {
        if (token("(")) {
            value = extractTo(")");
        }
    }

    public void remove(String regexp) {
        value = value.replaceAll(regexp, "");
    }

    public boolean endsWith(String... tokens) {
        for (String token : tokens) {
            if (value.trim().endsWith(token)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(String... tokens) {
        int braceAngular = 0;
        int braceSquare = 0;
        int braceFigure = 0;
        int braceRound = 0;

        for (int i = 0; i < value.length(); i++) {
            if (braceAngular + braceSquare + braceFigure + braceRound == 0) {
                for (String token : tokens) {
                    if (value.substring(i).startsWith(token)) {
                        return true;
                    }
                }
            }
            char c = value.charAt(i);
            if (c == '<') {
                braceAngular++;
            } else if (c == '>' && braceAngular > 0) {
                braceAngular--;
            } else if (c == '[') {
                braceSquare++;
            } else if (c == ']' && braceSquare > 0) {
                braceSquare--;
            } else if (c == '(') {
                braceRound++;
            } else if (c == ')' && braceRound > 0) {
                braceRound--;
            } else if (c == '{') {
                braceFigure++;
            } else if (c == '}' && braceFigure > 0) {
                braceFigure--;
            }
        }
        return false;
    }

    public boolean sequence(String... tokens) {
        int pos = -1;
        for (String token : tokens) {
            int tokenPos = value.indexOf(token);
            if (tokenPos < pos) {
                return false;
            }
            pos = tokenPos;
        }
        return true;
    }


    public String peek(String... separators) {
        int braceAngular = 0;
        int braceSquare = 0;
        int braceFigure = 0;
        int braceRound = 0;

        StringBuilder result = new StringBuilder();
        outer:
        for (int i = 0; i < value.length(); i++) {
            if (braceAngular + braceSquare + braceFigure + braceRound == 0) {
                for (String separator : separators) {
                    if (value.substring(i).startsWith(separator)) {
                        break outer;
                    }
                }
            }
            char c = value.charAt(i);
            if (c == '<') {
                braceAngular++;
            } else if (c == '>' && braceAngular > 0) {
                braceAngular--;
            } else if (c == '[') {
                braceSquare++;
            } else if (c == ']' && braceSquare > 0) {
                braceSquare--;
            } else if (c == '(') {
                braceRound++;
            } else if (c == ')' && braceRound > 0) {
                braceRound--;
            } else if (c == '{') {
                braceFigure++;
            } else if (c == '}' && braceFigure > 0) {
                braceFigure--;
            }
            result.append(c);
        }
        return result.toString().trim();
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return value;
    }

    public final Tokenizer copy() {
        return new Tokenizer(value);
    }
}
