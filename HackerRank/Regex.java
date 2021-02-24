String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

/*
1) \\d{1,2} acepra números tanto de 1 dígito como 2 (0-99)

2) (0|1)\\d{2} acepta números de 3 dígitos, que empiecen o por o por 2 (100-299)

3) 2[0-4]\\d acepta número de 3 cifras empezando con 2 y como segundo dígito del 0 a 4 (200-249)

4) 25[0-5] número de tres cifras que empiece por 25 y el último dígito entre 0 y 5 (250-255)

\d representa dígitos en una expresión regular, es lo mismo que decir [0-9]
*/

