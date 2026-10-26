/*
 * ============================================================================
 * GABARITO COMENTADO C
 * ============================================================================
 *
 *
 * C1. This[1,2,3,4],nova[5,6,7]. Fim de this vira4;fim da nova e7;4.proximo=null;
 * S da nova aponta5. Mesmos nos de dados. Arquivo R08_DividirAoMeio.
 *
 * C2. Resultado[E,F,A,B,C,D]. F.proximo=A;D.proximo=null;S.proximo=E. Fim=D.
 * k0/kn nao muda; k>n lanca. Arquivo R07_Rotacionar.
 *
 * C3. 2.proximo=3;3.anterior=2;fimA=4. B precisa ficar S->null,fimB=S,tamanho0.
 * Caso contrario as duas estruturas compartilham a mesma cadeia e futuras
 * alteracoes podem corromper ambas. Arquivo R16_ConcatenarDupla.
 *
 * C4. Resultado[1,2,4a,4b,6,7]. <= escolhe esquerda no empate. Ordenar:
 * base0/1,dividir,ordenar this,ordenar direita,intercalar,adotar controles.
 * Arquivos R05_IntercalarOrdenadas e R23_OrdenarLista.
 *
 * C5. Metades prontas[1,4] e[2,3]. Compara1/2(pega1),4/2(pega2),4/3(pega3),
 * copia4 sobrando:3comparacoes. Heapsort iterativo garante O(nlogn)/O(1).
 * Particionar somente organiza os grupos em torno do pivo; grupos ainda precisam
 * ser ordenados. Nao misture particao Lomuto com limites de outra variante.
 */
