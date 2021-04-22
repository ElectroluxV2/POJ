package com.github.electroluxv2.laboratory.l7.exercise6;

import static com.github.electroluxv2.laboratory.l7.exercise6.StringTransformer.*;

public class Main {
    public static void main(final String[] args) {
        System.out.println(">>> removeSigns");
        System.out.println(removeSigns("123 Testo wanie", Sign.NUMBER));
        System.out.println(removeSigns("123 Testo wanie", Sign.SPACE));
        System.out.println(removeSigns("123 Testo wanie", Sign.VOWEL));
        System.out.println(removeSigns("123 Testo wanie", Sign.CONSONANT));
        System.out.println(">>> replaceSigns");
        System.out.println(replaceSigns("123 Testo wanie", Sign.NUMBER, "#"));
        System.out.println(replaceSigns("123 Testo wanie", Sign.SPACE, "#"));
        System.out.println(replaceSigns("123 Testo wanie", Sign.VOWEL, "#"));
        System.out.println(replaceSigns("123 Testo wanie", Sign.CONSONANT, "#"));
        System.out.println(">>> preserveSigns");
        System.out.println(preserveSigns("123 Testo wanie", Sign.NUMBER));
        System.out.println(preserveSigns("123 Testo wanie", Sign.SPACE));
        System.out.println(preserveSigns("123 Testo wanie", Sign.VOWEL));
        System.out.println(preserveSigns("123 Testo wanie", Sign.CONSONANT));
    }
}
