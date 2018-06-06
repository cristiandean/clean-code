package br.com.cleancode;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class MultiplicaParImpar {

    private List<Integer> list;

    /**
     *
     * [1 2 3 4]
     *
     * ( 2 + 4 ) * ( 1 + 3 )
     *
     *     6    *     4
     *
     *          24
     *
     * Essa classe recebe como parâmetro uma lista de inteiros, soma todos os pares,
     * em seguida soma todos os impares
     * e logo depois multiplica o resultado da soma
     */
    public MultiplicaParImpar(List<Integer> list) {
        this.list = list;
    }

    public int getResultado() {
        return getResultado1();
    }


    /**
     * Solução 1
     */
    public int getResultado1() {
        Integer par;
        Integer impar;
        par = 0;
        impar = 0;

        if (this.list != null) {
            if (this.list.size() > 0) {
                for (int numero : this.list) {
                    if (numero % 2 == 0) {
                        par = par + numero;
                    }
                }

                for (int numero : this.list) {
                    if (numero % 2 != 0) {
                        impar = impar + numero;
                    }
                }
            }
        }

        int resultado = par * impar;
        return resultado;
    }


    /**
     * Solução 2
     */
    public int getResultado2() {
        Integer par = 0;
        Integer impar = 0;
        if (this.list == null || this.list.size() == 0)
            return 0;

        for (int numero : this.list) {
            if (numero % 2 == 0) {
                par = par + numero;
            }
            if (numero % 2 != 0) {
                impar = impar + numero;
            }
        }
        return par * impar;
    }


    /**
     * Solução 3
     */
    public int getResultado3() {
        if (this.list == null)
            return 0;

        return getSomaFiltros(n -> n % 2 == 0) * getSomaFiltros(n -> n % 2 != 0);
    }

    private int getSomaFiltros(Predicate<Integer> predicate) {
        return this.list.stream()
                .filter(Objects::nonNull)
                .filter(predicate)
                .mapToInt(n -> n)
                .sum();
    }


}
