/*
 * ============================================================================
 * A EXCECAO TAMBEM PROPAGA PELAS CHAMADAS
 * ============================================================================
 *
 *
 * QuantosAfrente tem alvo ausente em10->20->null:
 *   chamada10 espera1+resultado20
 *   chamada20 espera1+resultadoNull
 *   chamadaNull lanca NoSuchElementException
 *
 * A chamada20 NAO recebe0: recebe interrupcao por excecao. Sem catch, ela nao
 * conclui sua soma. A chamada10 tambem nao conclui. O chamador pode tratar em
 * catch, ou a excecao continua subindo.
 *
 * Isso evita confundir alvo ausente com alvo na posicao0.
 *
 *   throw new IllegalArgumentException("mensagem"); // dispara
 *   throws Exception                               // declara na assinatura
 *
 * Uma excecao lancada depois de modificar a estrutura nao desfaz alteracoes
 * automaticamente. Valide antes de mudar ou use estrategia de copia/restauracao.
 */
