/*
 * GUIA MESTRE AED II - ARQUIVO UNICO JAVA - VERSAO AMPLIADA 2
 * FILA | PILHA | LISTA | RECURSAO | ORDENACAO | FUNCTION | PREDICATE | APP
 *
 * ABRA ESTE UNICO ARQUIVO NO VS CODE. Nao precisa abrir links, PDF ou navegador.
 * Ctrl+F / Command+F: procure um tema, metodo, ID da questao ou palavra-chave.
 * Ctrl+G: informe o numero da linha indicado no indice abaixo.
 * Todas as explicacoes, fichas, exemplos, fontes e testes do ZIP anterior estao
 * reunidos aqui. Os novos capitulos V2 estao separados dos enunciados originais.
 *
 * COMO O ARQUIVO UNICO FOI MONTADO
 * - Cada arquivo anterior recebe uma secao [Fnnn], com seu caminho original.
 * - Guias/comentarios permanecem legiveis. Codigo permanece codigo Java.
 * - Packages foram reunidos em classes agrupadoras Biblioteca.Base, Revisao etc.
 * - Imports internos foram substituidos por nomes qualificados; classes externas
 *   viraram classes static internas. Nao sao alteracoes no algoritmo do exercicio.
 * - Os 190 arquivos originais permanecem byte a byte no ZIP ampliado.
 * - Biblioteca.Base.Fila equivale a aed.base.Fila do projeto em pastas.
 * - Na prova copie apenas os metodos necessarios e adapte os nomes ao template;
 *   nao acrescente Biblioteca nem as embalagens das fichas ao template original.
 *
 * IMPORTANTE: o retorno e o comportamento dependem do contrato, nao so do nome.
 * Antes de usar, confirme: preservar/consumir, ordem, sentinela, quantidade,
 * retorno, assinatura, uso de auxiliares e se novas celulas sao permitidas.
 * Itens E copiados normalmente compartilham referencias; nao ha clone profundo.
 * Isto e repertorio autoral de estudo, nao gabarito oficial nem garantia de prova.
 * Use material de consulta conforme as regras da avaliacao.
 *
 * EXECUCAO OPCIONAL, SEM DEPENDENCIAS EXTERNAS
 * javac -encoding UTF-8 GUIA_MESTRE_AEDII.java
 * java GUIA_MESTRE_AEDII
 * java GUIA_MESTRE_AEDII testes
 * java GUIA_MESTRE_AEDII recursao
 * java GUIA_MESTRE_AEDII app
 * O arquivo inteiro e compativel com Java 8; nao e necessario executar para ler.
 *
 * INDICE COMPLETO - linhas referem-se a ESTE arquivo, nao aos arquivos originais.
 * [F001] linha 000270 | 10_AMPLIACAO_V2/GUIA_V2_00_COMECE_PELO_ENUNCIADO.java
 * [F002] linha 000376 | 10_AMPLIACAO_V2/GUIA_V2_01_CONTRATOS_E_ESCOLHAS.java
 * [F003] linha 000438 | 10_AMPLIACAO_V2/GUIA_V2_02_DICIONARIO_DE_METODOS.java
 * [F004] linha 000872 | 10_AMPLIACAO_V2/GUIA_V2_03_ADOTAR_CABECA_E_SENTINELA.java
 * [F005] linha 000941 | 10_AMPLIACAO_V2/GUIA_V2_04_RECURSAO_LINHA_POR_LINHA.java
 * [F006] linha 001034 | 10_AMPLIACAO_V2/GUIA_V2_05_TABELA_CASOS_BASE.java
 * [F007] linha 001085 | 10_AMPLIACAO_V2/GUIA_V2_06_APP_FILA_PARAMETROS.java
 * [F008] linha 001159 | 10_AMPLIACAO_V2/GUIA_V2_07_FUNCTION_PREDICATE_COMPARATOR.java
 * [F009] linha 001243 | 10_AMPLIACAO_V2/GUIA_V2_08_IGUALDADE_GENERICS_CONSTRUTORES.java
 * [F010] linha 001306 | 10_AMPLIACAO_V2/GUIA_V2_09_INVERTER_VARIACOES.java
 * [F011] linha 001377 | 10_AMPLIACAO_V2/GUIA_V2_10_REMOVER_VARIACOES.java
 * [F012] linha 001442 | 10_AMPLIACAO_V2/GUIA_V2_11_ERROS_E_DIAGNOSTICO.java
 * [F013] linha 001533 | 10_AMPLIACAO_V2/GUIA_V2_12_ORDENACAO_COMPARACOES.java
 * [F014] linha 001602 | 10_AMPLIACAO_V2/GUIA_V2_13_CUSTOS_E_COMPLEXIDADE.java
 * [F015] linha 001658 | 10_AMPLIACAO_V2/GUIA_V2_14_TESTE_DE_MESA_E_INVARIANTES.java
 * [F016] linha 001720 | 10_AMPLIACAO_V2/GUIA_V2_15_ADAPTAR_SEM_METODO_PRONTO.java
 * [F017] linha 001780 | 10_AMPLIACAO_V2/GUIA_V2_16_MATRIZ_VARIACOES.java
 * [F018] linha 001846 | 10_AMPLIACAO_V2/GUIA_V2_17_EXERCICIOS_EXTRAS_COM_DIRECAO.java
 * [F019] linha 001922 | 10_AMPLIACAO_V2/GUIA_V2_18_FONTES_VALIDACAO.java
 * [F020] linha 001990 | 10_AMPLIACAO_V2/GUIA_V2_19_SAIDAS_PRONTAS_SEM_EXECUTAR.java
 * [F021] linha 002076 | 00_COMECE_AQUI/00_LEIA_PRIMEIRO.java
 * [F022] linha 002141 | 00_COMECE_AQUI/01_BUSQUE_PELO_ENUNCIADO.java
 * [F023] linha 002210 | 00_COMECE_AQUI/02_CONSULTA_RAPIDA.java
 * [F024] linha 002268 | 00_COMECE_AQUI/03_COMO_COMPILAR_SE_HOUVER_JDK.java
 * [F025] linha 002319 | 00_COMECE_AQUI/04_MAPA_COMPLETO.java
 * [F026] linha 002652 | 00_COMECE_AQUI/05_COMO_ADAPTAR.java
 * [F027] linha 002687 | 00_COMECE_AQUI/06_MAPA_DE_METODOS.java
 * [F028] linha 002966 | 01_FUNDAMENTOS/00_INDICE.java
 * [F029] linha 002996 | 01_FUNDAMENTOS/G01_Variavel_Objeto_Referencia.java
 * [F030] linha 003044 | 01_FUNDAMENTOS/G02_Item_Versus_Proximo.java
 * [F031] linha 003086 | 01_FUNDAMENTOS/G03_Sentinelas.java
 * [F032] linha 003129 | 01_FUNDAMENTOS/G04_Fila_Pilha_Lista.java
 * [F033] linha 003171 | 01_FUNDAMENTOS/G05_Generics_E_Tipos.java
 * [F034] linha 003213 | 01_FUNDAMENTOS/G06_Construtores_Sobrecarga.java
 * [F035] linha 003256 | 01_FUNDAMENTOS/G07_Equals_Comparable.java
 * [F036] linha 003294 | 01_FUNDAMENTOS/G08_Tipos_De_Return.java
 * [F037] linha 003333 | 01_FUNDAMENTOS/G09_Copia_Transferencia_Preservacao.java
 * [F038] linha 003373 | 01_FUNDAMENTOS/G10_Lista_Simples.java
 * [F039] linha 003412 | 01_FUNDAMENTOS/G11_Lista_Dupla.java
 * [F040] linha 003447 | 01_FUNDAMENTOS/G12_Vetor_Circular.java
 * [F041] linha 003485 | 01_FUNDAMENTOS/G13_Complexidade.java
 * [F042] linha 003526 | 01_FUNDAMENTOS/G14_Erros_Do_Seu_Codigo.java
 * [F043] linha 003566 | 01_FUNDAMENTOS/G15_Convencoes_Dos_PDFs.java
 * [F044] linha 003607 | 02_RECURSAO/00_INDICE.java
 * [F045] linha 003632 | 02_RECURSAO/R00_LEIA_PRIMEIRO.java
 * [F046] linha 003668 | 02_RECURSAO/R01_Chamadas_Passo_A_Passo.java
 * [F047] linha 003719 | 02_RECURSAO/R02_Return_1_Mais.java
 * [F048] linha 003756 | 02_RECURSAO/R03_Return_Boolean.java
 * [F049] linha 003789 | 02_RECURSAO/R04_Return_E_Objeto.java
 * [F050] linha 003824 | 02_RECURSAO/R05_Void_Ida_Volta.java
 * [F051] linha 003868 | 02_RECURSAO/R06_Casos_Base.java
 * [F052] linha 003904 | 02_RECURSAO/R07_Excecao_Nao_E_Return.java
 * [F053] linha 003933 | 02_RECURSAO/R08_Retornar_Cabeca.java
 * [F054] linha 003966 | 02_RECURSAO/R09_Recursao_Ordenacao.java
 * [F055] linha 003997 | 03_PADROES_REUTILIZAVEIS/00_INDICE.java
 * [F056] linha 004027 | 03_PADROES_REUTILIZAVEIS/P01_ContarSe.java
 * [F057] linha 004083 | 03_PADROES_REUTILIZAVEIS/P02_SomarFunction.java
 * [F058] linha 004141 | 03_PADROES_REUTILIZAVEIS/P03_Algum.java
 * [F059] linha 004197 | 03_PADROES_REUTILIZAVEIS/P04_Todos.java
 * [F060] linha 004253 | 03_PADROES_REUTILIZAVEIS/P05_IndiceOuMenosUm.java
 * [F061] linha 004310 | 03_PADROES_REUTILIZAVEIS/P06_UltimoIndice.java
 * [F062] linha 004367 | 03_PADROES_REUTILIZAVEIS/P07_CopiarNos.java
 * [F063] linha 004422 | 03_PADROES_REUTILIZAVEIS/P08_FiltrarNos.java
 * [F064] linha 004480 | 03_PADROES_REUTILIZAVEIS/P09_RemoverNos.java
 * [F065] linha 004537 | 03_PADROES_REUTILIZAVEIS/P10_CopiarNaVolta.java
 * [F066] linha 004597 | 03_PADROES_REUTILIZAVEIS/P11_CopiarComFuncao.java
 * [F067] linha 004655 | 03_PADROES_REUTILIZAVEIS/P12_InverterSemAnterior.java
 * [F068] linha 004761 | 03_PADROES_REUTILIZAVEIS/P13_CopiarAntes.java
 * [F069] linha 004866 | 03_PADROES_REUTILIZAVEIS/P14_CopiarDepois.java
 * [F070] linha 004976 | 03_PADROES_REUTILIZAVEIS/P15_SubPilha.java
 * [F071] linha 005074 | 03_PADROES_REUTILIZAVEIS/P16_MaiorPorExtrator.java
 * [F072] linha 005181 | 04_EXERCICIOS_DOS_PDFS/00_INDICE.java
 * [F073] linha 005263 | 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/00_INDICE.java
 * [F074] linha 005290 | 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF01_Concatenar.java
 * [F075] linha 005396 | 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF02_Contar.java
 * [F076] linha 005496 | 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF03_Existe.java
 * [F077] linha 005599 | 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF04_QuantosAfrente.java
 * [F078] linha 005704 | 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF05_Copiar.java
 * [F079] linha 005803 | 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF06_Dividir.java
 * [F080] linha 005916 | 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/00_INDICE.java
 * [F081] linha 005943 | 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL01_InserirFinal.java
 * [F082] linha 006010 | 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL02_RemoverInicio.java
 * [F083] linha 006105 | 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL03_RemoverValor.java
 * [F084] linha 006195 | 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL04_Contar.java
 * [F085] linha 006267 | 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL05_Localizar.java
 * [F086] linha 006341 | 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL06_Trocar.java
 * [F087] linha 006428 | 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/00_INDICE.java
 * [F088] linha 006451 | 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP01_Concatenar.java
 * [F089] linha 006566 | 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP02_Contar.java
 * [F090] linha 006646 | 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP03_Inverter.java
 * [F091] linha 006757 | 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP04_Palindromo.java
 * [F092] linha 006821 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/00_INDICE.java
 * [F093] linha 006858 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF01_ConstrutorFilasOrdenadas.java
 * [F094] linha 006954 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF02_UnirPilha.java
 * [F095] linha 007030 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF03_ContarOcorrencias.java
 * [F096] linha 007105 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF04_Contem.java
 * [F097] linha 007180 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF05_Mesclar.java
 * [F098] linha 007260 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF06_CopiaInvertida.java
 * [F099] linha 007344 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF07_Inverter.java
 * [F100] linha 007422 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF08_MesclarInvertidas.java
 * [F101] linha 007525 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF09_Clone.java
 * [F102] linha 007598 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF10_InserirEmOrdem.java
 * [F103] linha 007663 | 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF11_RemoverTodos.java
 * [F104] linha 007745 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/00_INDICE.java
 * [F105] linha 007788 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF01_ConstrutorArray.java
 * [F106] linha 007881 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF02_ConstrutorPilha.java
 * [F107] linha 007974 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF03_Unir.java
 * [F108] linha 008085 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF04_ContagemRecursiva.java
 * [F109] linha 008185 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF05_ContemRecursivo.java
 * [F110] linha 008286 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF06_InverterRecebida.java
 * [F111] linha 008398 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF07_CopiaInvertida.java
 * [F112] linha 008511 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF08_Mesclar.java
 * [F113] linha 008617 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF09_Inverter.java
 * [F114] linha 008759 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF10_QuantosAfrente.java
 * [F115] linha 008863 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF11_DoisArraysOrdenados.java
 * [F116] linha 008943 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF12_Copiar.java
 * [F117] linha 009041 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF13_Dividir.java
 * [F118] linha 009154 | 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF14_PseudoPilha.java
 * [F119] linha 009228 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/00_INDICE.java
 * [F120] linha 009289 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R01_ObterItem.java
 * [F121] linha 009377 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R02_ExtrairMenores.java
 * [F122] linha 009474 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R03_PseudoFila.java
 * [F123] linha 009538 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R04_CorrigirTras.java
 * [F124] linha 009641 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R05_IntercalarOrdenadas.java
 * [F125] linha 009751 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R06_MaiorRecursivo.java
 * [F126] linha 009860 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R07_Rotacionar.java
 * [F127] linha 009966 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R08_DividirAoMeio.java
 * [F128] linha 010075 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R09_TrocarPrimeiros.java
 * [F129] linha 010179 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R10_CustosSimplesDupla.java
 * [F130] linha 010219 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R11_RemoverFimDupla.java
 * [F131] linha 010315 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R12_InserirDupla.java
 * [F132] linha 010403 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R13_InverterDupla.java
 * [F133] linha 010504 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R14_RemoverTodosDupla.java
 * [F134] linha 010612 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R15_PalindromoDupla.java
 * [F135] linha 010709 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R16_ConcatenarDupla.java
 * [F136] linha 010808 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R17_ConstrutorDuplaFila.java
 * [F137] linha 010896 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R18_MergeSort.java
 * [F138] linha 010962 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R19_HeapSort.java
 * [F139] linha 011031 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R20_QuickSort.java
 * [F140] linha 011102 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R21_EscolherAlgoritmo.java
 * [F141] linha 011139 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R22_Lomuto.java
 * [F142] linha 011206 | 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R23_OrdenarLista.java
 * [F143] linha 011337 | 05_CLASSICOS_PESQUISADOS/00_INDICE.java
 * [F144] linha 011391 | 05_CLASSICOS_PESQUISADOS/C01_Delimitadores.java
 * [F145] linha 011457 | 05_CLASSICOS_PESQUISADOS/C02_Posfixa.java
 * [F146] linha 011530 | 05_CLASSICOS_PESQUISADOS/C03_Binario.java
 * [F147] linha 011591 | 05_CLASSICOS_PESQUISADOS/C04_Palindromo.java
 * [F148] linha 011655 | 05_CLASSICOS_PESQUISADOS/C05_InverterCadeia.java
 * [F149] linha 011723 | 05_CLASSICOS_PESQUISADOS/C06_DetectarCiclo.java
 * [F150] linha 011783 | 05_CLASSICOS_PESQUISADOS/C07_InicioDoCiclo.java
 * [F151] linha 011847 | 05_CLASSICOS_PESQUISADOS/C08_Meio.java
 * [F152] linha 011907 | 05_CLASSICOS_PESQUISADOS/C09_KDoFim.java
 * [F153] linha 011970 | 05_CLASSICOS_PESQUISADOS/C10_RemoverKDoFim.java
 * [F154] linha 012033 | 05_CLASSICOS_PESQUISADOS/C11_MergeNos.java
 * [F155] linha 012096 | 05_CLASSICOS_PESQUISADOS/C12_DuplicadosOrdenados.java
 * [F156] linha 012156 | 05_CLASSICOS_PESQUISADOS/C13_DuplicadosNaoOrdenados.java
 * [F157] linha 012218 | 05_CLASSICOS_PESQUISADOS/C14_ParticaoEstavel.java
 * [F158] linha 012280 | 05_CLASSICOS_PESQUISADOS/C15_InverterPrefixo.java
 * [F159] linha 012340 | 05_CLASSICOS_PESQUISADOS/C16_Josephus.java
 * [F160] linha 012404 | 05_CLASSICOS_PESQUISADOS/C17_ProximoMaior.java
 * [F161] linha 012465 | 05_CLASSICOS_PESQUISADOS/C18_SaidaDePilha.java
 * [F162] linha 012526 | 05_CLASSICOS_PESQUISADOS/C19_PilhaMinima.java
 * [F163] linha 012593 | 05_CLASSICOS_PESQUISADOS/C20_FilaDuasPilhas.java
 * [F164] linha 012655 | 06_APP_FUNCTION_PREDICATE/00_GUIA.java
 * [F165] linha 012692 | 06_APP_FUNCTION_PREDICATE/A01_AppCompleta.java
 * [F166] linha 012798 | 06_APP_FUNCTION_PREDICATE/A02_MediaFunction.java
 * [F167] linha 012919 | 06_APP_FUNCTION_PREDICATE/A03_FiltroPredicate.java
 * [F168] linha 013034 | 06_APP_FUNCTION_PREDICATE/A04_ContarPredicate.java
 * [F169] linha 013147 | 06_APP_FUNCTION_PREDICATE/A05_ModeloPedido.java
 * [F170] linha 013216 | 06_APP_FUNCTION_PREDICATE/A06_RecursaoConsole.java
 * [F171] linha 013287 | 07_RASTROS_ORDENACAO/00_INDICE.java
 * [F172] linha 013308 | 07_RASTROS_ORDENACAO/R04_EstadoDaFila.java
 * [F173] linha 013339 | 07_RASTROS_ORDENACAO/R09_TrocaPrimeiros.java
 * [F174] linha 013370 | 07_RASTROS_ORDENACAO/R18_MergeSort.java
 * [F175] linha 013458 | 07_RASTROS_ORDENACAO/R19_HeapSort.java
 * [F176] linha 013594 | 07_RASTROS_ORDENACAO/R20_QuickSort.java
 * [F177] linha 013703 | 07_RASTROS_ORDENACAO/R22_Lomuto.java
 * [F178] linha 013730 | 08_SIMULADOS/00_COMO_TREINAR.java
 * [F179] linha 013760 | 08_SIMULADOS/A_ENUNCIADOS.java
 * [F180] linha 013791 | 08_SIMULADOS/A_GABARITO.java
 * [F181] linha 013821 | 08_SIMULADOS/B_ENUNCIADOS.java
 * [F182] linha 013853 | 08_SIMULADOS/B_GABARITO.java
 * [F183] linha 013883 | 08_SIMULADOS/C_ENUNCIADOS.java
 * [F184] linha 013912 | 08_SIMULADOS/C_GABARITO.java
 * [F185] linha 013943 | 09_FONTES_E_VALIDACAO/00_INDICE.java
 * [F186] linha 013959 | 09_FONTES_E_VALIDACAO/FONTES.java
 * [F187] linha 014031 | 09_FONTES_E_VALIDACAO/VALIDACAO.java
 * [F188] linha 016105 | src/aed/ampliacoes/AmpliacoesV2.java
 * [F189] linha 016760 | src/aed/ampliacoes/AppExplicita.java
 * [F190] linha 016835 | src/aed/ampliacoes/DequeDuasSentinelas.java
 * [F191] linha 016922 | src/aed/ampliacoes/ListaCircular.java
 * [F192] linha 017015 | src/aed/ampliacoes/RecursaoRastreada.java
 * [F193] linha 017100 | src/aed/ampliacoes/TestesAmpliacoesV2.java
 * [F194] linha 015380 | src/aed/app/AppPedidos.java
 * [F195] linha 015441 | src/aed/app/PedidoDemo.java
 * [F196] linha 015464 | src/aed/app/RecursaoPassoAPasso.java
 * [F197] linha 014098 | src/aed/base/Celula.java
 * [F198] linha 014118 | src/aed/base/CelulaDupla.java
 * [F199] linha 014136 | src/aed/base/Fila.java
 * [F200] linha 014429 | src/aed/base/Lista.java
 * [F201] linha 014599 | src/aed/base/ListaDupla.java
 * [F202] linha 014717 | src/aed/base/Pilha.java
 * [F203] linha 014835 | src/aed/base/PseudoFila.java
 * [F204] linha 014853 | src/aed/base/PseudoPilha.java
 * [F205] linha 015848 | src/aed/classicos/Classicos.java
 * [F206] linha 016056 | src/aed/classicos/PilhaMinima.java
 * [F207] linha 016080 | src/aed/flexiveis/ListaOrdenada.java
 * [F208] linha 015273 | src/aed/ordenacao/Ordenacoes.java
 * [F209] linha 014884 | src/aed/revisao/Fila.java
 * [F210] linha 014962 | src/aed/revisao/Lista.java
 * [F211] linha 015494 | src/aed/testes/Testes.java
 * [F212] linha 015107 | src/aed/variacoes/FilaCircular.java
 * [F213] linha 015134 | src/aed/variacoes/FilaSemSentinela.java
 * [F214] linha 015155 | src/aed/variacoes/ModelosRecursivos.java
 * [F215] linha 015231 | src/aed/variacoes/PilhaSemSentinela.java
 * [F216] linha 015247 | src/aed/variacoes/PilhaVetor.java
 *
 * FIM DO INDICE GERAL. Comece pelos GUIA_V2, depois localize a ficha desejada.
 */
import java.lang.reflect.Field;
import java.text.Normalizer;
import java.util.Comparator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public final class GUIA_MESTRE_AEDII {
    private GUIA_MESTRE_AEDII() { }
    // ============================================================================
    // region [F001] 10_AMPLIACAO_V2/GUIA_V2_00_COMECE_PELO_ENUNCIADO.java
    // BUSCA: GUIA V2 00 COMECE PELO ENUNCIADO
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_00_COMECE_PELO_ENUNCIADO.java
    // ============================================================================
    /*
     * GUIA V2 00 - COMECE PELO ENUNCIADO, NAO PELO NOME DO ALGORITMO
     * ORIGEM: organizacao e explicacoes autorais adicionadas ao acervo anterior.
     *
     * O QUE FOI REUNIDO
     * O arquivo GUIA_MESTRE_AEDII.java contem todas as 190 entradas do ZIP anterior,
     * mais os novos guias e implementacoes V2. Os arquivos anteriores continuam no ZIP,
     * sem alteracao de bytes. Dentro do mestre, so a organizacao de classes/imports
     * muda para permitir que tudo compile em UM arquivo, sem buscar outro .java.
     *
     * COMO LOCALIZAR
     * 1. Leia o verbo do enunciado: contar, buscar, copiar, remover, inverter, ordenar.
     * 2. Leia o objeto: item, celula, fila, pilha, lista, lista dupla, vetor.
     * 3. Leia o contrato: modifica? preserva? cria novos nos? usa so API publica?
     * 4. Procure no indice de palavras abaixo e va ao marcador do caso correspondente.
     * 5. Confirme a assinatura EXATA e os auxiliares presentes no template.
     * 6. Releia a parte CASOS DE BORDA; rode mentalmente vazio e um item.
     *
     * MAPA POR PALAVRA DO ENUNCIADO
     * contar todos / numero de itens        -> FF04, BF02, BL04, BP02, V2_01
     * contar ocorrencias / iguais ao alvo   -> LF03, contarQtos
     * contar aprovados / contarSe           -> P01, A04, Predicate
     * existe / contem / pertence            -> FF05, LF04, BF03
     * quantos antes / quantos a frente      -> FF10, BF04, quantosAfrente
     * posicao / obter item / indice         -> R01, BL05, V2_03, V2_04, V2_05
     * ultima ocorrencia / ultimo indice     -> V2_04, V2_13, V2_20
     * maior / minimo / criterio             -> R06, P16, V2_06, encontrarMaior
     * somar / media / extrair numero        -> A02, P02, somarValores
     * media somente aprovados              -> V2_34, mediaFiltrada
     * filtrar / selecionar / condicional   -> A03, P08, Predicate
     * primeiros k APROVADOS                 -> V2_26
     * primeiros k EXAMINADOS                -> filtrar, calcularValorMedio
     * mapear / transformar / outro tipo     -> V2_32, Function<E,R>
     * reduzir / acumular / combinar         -> V2_33, BinaryOperator
     * copiar / clone / nao modificar        -> BF05, FF12, LF09, V2_07
     * copiar trecho / sublista / intervalo  -> V2_09
     * antes do alvo / prefixo               -> P13, itensAntes
     * depois do alvo / sufixo               -> P14, V2_20
     * entre dois alvos                     -> V2_19
     * copiar topo / subPilha                -> P15, subPilha
     * concatenar / anexar                   -> BF01, BP01, R16
     * unir preservando / nova fila          -> FF03, unir
     * mesclar / alternar                   -> LF05, FF08, V2_27
     * intercalar ordenadas / merge          -> LF01, R05, V2_15
     * reaproveitar celulas / sem new        -> R07, R08, R13, R16, V2_10, V2_12
     * remover por item                     -> BL03
     * remover todas as ocorrencias          -> LF11, R14, P09, V2_08
     * remover ultima ocorrencia             -> V2_13
     * remover k do fim                      -> C09, C10
     * remover cada k                       -> V2_24
     * extrair menores / remover aprovados   -> R02, V2_22
     * dividir posicoes pares impares        -> BF06, FF13
     * dividir ao meio                      -> R08
     * inverter original                    -> BF/Fila.inverter, LF07, FF09, BP03
     * copia invertida                      -> LF06, FF07, P10
     * inverter sem anterior                -> P12, inverterSemAnterior
     * inverter entre posicoes               -> V2_10
     * inverter blocos de k                  -> V2_11
     * inverter so com recursao              -> V2_29, inverterRecursivamente
     * rotacionar / mover primeiros para fim -> R07, V2_25
     * mover celula de posicao para final    -> V2_14
     * trocar itens / trocar nos             -> BL06, R09, V2_12
     * comparar identidade de celulas        -> V2_17
     * fim em O(1) / anterior / dupla        -> R11, ListaDupla
     * palindromo                           -> BP04, R15, C04
     * pilha usando filas                    -> FF14, PseudoPilha
     * fila usando pilhas                    -> R03, C20, PseudoFila
     * parenteses / colchetes / chaves        -> C01
     * posfixa / expressao / operadores       -> C02
     * binario / conversao de base           -> C03
     * ciclo / anel / circular               -> C06, C07, V2_38
     * meio / lento rapido                   -> C08
     * duplicados / repetidos                -> C12, C13
     * particionar / separar estavelmente    -> C14, V2_21
     * Josephus / eliminacao circular        -> C16
     * proximo maior / pilha monotona         -> C17
     * sequencia possivel de desempilhar     -> C18
     * minimo de pilha em O(1)               -> C19
     * inserir no fundo / remover fundo      -> V2_28, V2_30
     * duplicar topo / trocar topo           -> V2_36
     * ordenar pilha                        -> V2_31
     * ordenar fila por preco                -> V2_35
     * mergesort lista / dividir intercalar  -> R23, V2_16
     * mergesort vetor / rastro              -> R18, mergeSort
     * quicksort / pivo / particao           -> R20, R22, quickSort
     * heapsort / max-heap / base um         -> R19, heapSortBaseUm
     * insertion / selection / bubble        -> Ordenacoes
     * sobrecarga / construtor              -> FF01, FF02, FF11, LF01, R17
     * Function / apply / extrator           -> A02, V2_39, mostrarMediaPedidos
     * Predicate / test / condicao           -> A03, V2_39, mostrarPedidosFiltrados
     * filaPedidos / static / escopo         -> GUIA_V2_06, AppExplicita
     * chamada / volta / return 1 +          -> GUIA_V2_04, V2_40
     * erro / excecao / null / nao compila   -> GUIA_V2_11
     *
     * PADRAO DE LEITURA DAS FICHAS
     * Objetivo -> contrato -> exemplo -> codigo -> caso-base -> retorno -> custo.
     * Um numero de questao sem prefixo e ambiguo: FF04 nao e R04 e nao e LF04.
     * BF/BL/BP sao as listas iniciais. LF/FF sao as folhas flexiveis. R e a revisao.
     * V2 e sempre complemento autoral; nao atribua seu enunciado a professora.
     */
    // endregion [F001]
    // ============================================================================
    // region [F002] 10_AMPLIACAO_V2/GUIA_V2_01_CONTRATOS_E_ESCOLHAS.java
    // BUSCA: GUIA V2 01 CONTRATOS E ESCOLHAS
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_01_CONTRATOS_E_ESCOLHAS.java
    // ============================================================================
    /*
     * GUIA V2 01 - A MESMA PALAVRA PODE SIGNIFICAR OPERACOES DIFERENTES
     * BUSCA: contrato copiar consumir preservar reaproveitar assinatura invariantes.
     *
     * ANTES DE ESCREVER O CODIGO, PREENCHA ESTE ROTEIRO
     * Estrutura atual: Fila, Pilha, Lista simples, Lista dupla ou vetor?
     * Representacao: sentinela fixa, sem sentinela, duas sentinelas ou circular?
     * Metodo pertence a: classe da estrutura ou App?
     * Pode acessar campos private? Somente de dentro da classe correspondente.
     * Entrada: E item, Celula<E> atual, int pos, outra estrutura ou uma funcao?
     * Saida: int, boolean, E, Celula<E>, Fila<E>, Pilha<E>, Lista<E> ou void?
     * Sentinela entra na contagem? Nao nos modelos de uma sentinela do material.
     * Pode modificar this? Pode modificar a estrutura parametro?
     * Pode criar celulas? Pode usar estruturas auxiliares? Recursao e obrigatoria?
     * Comparacao: equals ou compareTo? Nao substitua quando a exigencia e expressa.
     * Assinatura fixa? Nao acrescente contador, acumulador ou boolean ao recursivo.
     * Ordem: entrada, saida, topo->fundo, crescente, decrescente ou alternada?
     * Quantidade: primeiros k examinados, k aprovados, tamanho final ou posicao?
     * Repetidos: primeira ocorrencia, ultima ocorrencia ou todas?
     * Ausencia: devolver false, -1, null, estrutura vazia ou lancar excecao?
     *
     * COPIAR != CONSUMIR != TRANSFERIR
     * Copiar nos: cria celulas novas. Os itens podem continuar sendo os mesmos objetos.
     * Consumir: retira da origem. Ex.: while(!origem.vazia()) destino.enfileirar(...).
     * Transferir celulas: religa os NOS existentes e esvazia/reduz a origem.
     * Alias: destino = origem apenas faz duas referencias acessarem o MESMO objeto.
     *
     * PRESERVAR A FILA TEM DOIS NIVEIS
     * Nivel 1: mesmos itens e mesma ordem observavel depois de terminar.
     * Nivel 2: tambem as MESMAS CELULAS e os mesmos objetos internos.
     * Percorrer com aux preserva ambos. Desenfileirar/reenfileirar pode preservar
     * somente o nivel 1, porque enfileirar normalmente cria outra celula.
     *
     * PRESERVAR ITEM TEM DOIS NIVEIS
     * Copiar referencia: copia.getItem() == original.getItem() pode ser true.
     * Copia profunda: voce precisa saber como copiar E; new Celula<>(item) nao faz isso.
     * Function<E,E> copiador e uma possibilidade, mas so se o contrato permitir.
     *
     * QUANTIDADE ZERO
     * Somar zero itens -> 0 e natural. Filtrar zero itens -> fila vazia e natural.
     * Media de zero itens -> nao existe media aritmetica desse conjunto: definir erro.
     * Obter posicao 0 -> primeiro DADO; nao significa estrutura vazia.
     * Inverter prefixo de tamanho 0 -> normalmente nenhuma alteracao.
     * Essas sao escolhas de API, e o enunciado pode exigir outra convencao.
     *
     * COMPARAR CELULA VS ITEM
     * atual == outraCelula : mesmo objeto celula?
     * atual.getItem().equals(item) : dados equivalentes pelo criterio da classe?
     * atual.getItem().compareTo(item) : antes/igual/depois segundo ordem?
     * Dois nos com o numero 20 nao sao necessariamente a mesma celula.
     *
     * ARGUMENTOS VS PARAMETROS
     * Declaracao: public int quantosAfrente(Celula<E> atual, E item)
     * Chamada: quantosAfrente(frente.getProximo(), procurado)
     * Nao escreva "int quantidade" dentro da chamada: o tipo vai na declaracao.
     */
    // endregion [F002]
    // ============================================================================
    // region [F003] 10_AMPLIACAO_V2/GUIA_V2_02_DICIONARIO_DE_METODOS.java
    // BUSCA: GUIA V2 02 DICIONARIO DE METODOS
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_02_DICIONARIO_DE_METODOS.java
    // ============================================================================
    /*
     * GUIA V2 02 - DICIONARIO DE METODOS E ASSINATURAS
     * BUSCA: nome exato parametro retorno classe implementacao auxiliar.
     * Este indice e gerado das classes completas; as fichas por questao seguem
     * separadas no mestre. private indica helper: copie junto se for necessario.
     * Nao presuma que uma API desta biblioteca existe no template da professora.
     *
     * ============================================================================
     * src/aed/ampliacoes/AmpliacoesV2.java
     * ============================================================================
     * private AmpliacoesV2()
     * private static void exigir(Object obj, String mensagem)
     * public static <E> int tamanhoRecursivo(Celula<E> atual)
     * public static <E> Celula<E> buscarCelulaRecursiva(Celula<E> atual, E alvo)
     * public static <E> int primeiroIndice(Celula<E> atual, E alvo)
     * public static <E> int ultimoIndice(Celula<E> atual, E alvo)
     * public static <E> E obterPosicao(Celula<E> atual, int posicao)
     * public static <E> E maiorRecursivo(Celula<E> atual, Comparator<E> ordem)
     * public static <E> Celula<E> copiarCadeia(Celula<E> atual)
     * public static <E> Celula<E> removerSeRecursivo( Celula<E> atual, Predicate<E> condicao)
     * private static <E> int comprimento(Celula<E> cabeca)
     * private static <E> Celula<E> celulaEm(Celula<E> cabeca, int posicao)
     * private static void validarIntervalo(int inicio, int fimExclusivo, int tamanho)
     * public static <E> Fila<E> copiarIntervalo( Celula<E> cabeca, int inicio, int fimExclusivo)
     * public static <E> Celula<E> inverterIntervalo( Celula<E> cabeca, int inicio, int fimExclusivo)
     * public static <E> Celula<E> inverterGrupos(Celula<E> cabeca, int k)
     * public static <E> Celula<E> trocarNos(Celula<E> cabeca, int i, int j)
     * public static <E> Celula<E> removerUltimaOcorrencia(Celula<E> cabeca, E alvo)
     * public static <E> Celula<E> moverParaFinal(Celula<E> cabeca, int posicao)
     * public static <E> Celula<E> intercalarNos( Celula<E> a, Celula<E> b, Comparator<E> ordem)
     * public static <E> Celula<E> mergeSortNos(Celula<E> cabeca, Comparator<E> ordem)
     * public static <E> Celula<E> intersecaoPorIdentidade(Celula<E> a, Celula<E> b)
     * public static <E> boolean estaOrdenada(Celula<E> atual, Comparator<E> ordem)
     * public static <E> Fila<E> copiarEntreAlvos( Celula<E> cabeca, E alvoInicio, E alvoFim)
     * public static <E> Fila<E> copiarDepoisUltimo(Celula<E> cabeca, E alvo)
     * public static <E> Particao<E> separarPreservando(Fila<E> fonte, Predicate<E> condicao)
     * public static <E> Fila<E> extrairSe(Fila<E> fonte, Predicate<E> condicao)
     * public static <E> Fila<E> copiarPrimeirosViaAPI(Fila<E> fonte, int quantidade)
     * public static <E> Fila<E> removerCadaK(Fila<E> fonte, int k)
     * public static <E> void rotacionarFila(Fila<E> fila, int k)
     * public static <E> Fila<E> primeirosKAprovados( Fila<E> fonte, Predicate<E> condicao, int quantidade)
     * public static <E> Fila<E> mesclarEmBlocos(Fila<E> a, Fila<E> b, int k)
     * public static <E> void inserirNoFundo(Pilha<E> pilha, E item)
     * public static <E> void inverterPilhaRecursiva(Pilha<E> pilha)
     * public static <E> E removerFundo(Pilha<E> pilha)
     * public static <E> void ordenarPilha(Pilha<E> pilha, Comparator<E> ordem)
     * private static <E> void inserirNaPilhaOrdenada(Pilha<E> pilha, E item, Comparator<E> ordem)
     * public static <E, R> Fila<R> mapear(Fila<E> fonte, Function<E, R> funcao)
     * public static <E> E reduzir(Fila<E> fonte, E identidade, BinaryOperator<E> operacao)
     * public static <E> double mediaFiltrada(Fila<E> fonte, Predicate<E> condicao, Function<E, Double> extrator, int quantidade)
     * public static <E> Fila<E> ordenarFila(Fila<E> fonte, Comparator<E> ordem)
     * public static <E> void duplicarTopo(Pilha<E> pilha)
     * public static <E> void trocarDoisDoTopo(Pilha<E> pilha)
     *
     * ============================================================================
     * src/aed/ampliacoes/AppExplicita.java
     * ============================================================================
     * public PedidoExemplo(int id, double valor)
     * public double valorFinal()
     * public int getId()
     * public static void finalizarPedido(PedidoExemplo pedido)
     * public static double mostrarMediaPedidos(int quantidade)
     * public static void mostrarPedidosFiltrados(int quantidade, double minimo)
     * public static void mostrarOrdenadosPorValor()
     * public static void main(String[] args)
     *
     * ============================================================================
     * src/aed/ampliacoes/DequeDuasSentinelas.java
     * ============================================================================
     * public DequeDuasSentinelas()
     * public boolean vazia()
     * public int tamanho()
     * private void inserirAntes(CelulaDupla<E> posterior, E item)
     * public void inserirInicio(E item)
     * public void inserirFim(E item)
     * private E retirar(CelulaDupla<E> celula)
     * public E removerInicio()
     * public E removerFim()
     * public Object[] toArray()
     * public boolean estruturaValida()
     *
     * ============================================================================
     * src/aed/ampliacoes/ListaCircular.java
     * ============================================================================
     * public boolean vazia()
     * public int tamanho()
     * public void inserirInicio(E item)
     * public void inserirFim(E item)
     * public E removerInicio()
     * public void rotacionar(int k)
     * public boolean contem(E item)
     * public Object[] toArray()
     * public boolean estruturaValida()
     *
     * ============================================================================
     * src/aed/ampliacoes/RecursaoRastreada.java
     * ============================================================================
     * private static String recuo(int nivel)
     * private static String nome(Celula<Integer> atual)
     * public static int contar(Celula<Integer> atual, int nivel)
     * public static boolean contem(Celula<Integer> atual, Integer alvo, int nivel)
     * public static Integer obter(Celula<Integer> atual, int pos, int nivel)
     * public static void idaEVolta(Celula<Integer> atual, int nivel)
     * public static void main(String[] args)
     *
     * ============================================================================
     * src/aed/app/AppPedidos.java
     * ============================================================================
     * private AppPedidos()
     * public static void finalizarPedido(PedidoDemo pedido)
     * public static void mostrarMediaPedidos(int quantidade)
     * public static void mostrarPedidosFiltrados(int quantidade, double minimo)
     * public static void demonstrar()
     * public static void main(String[] args)
     *
     * ============================================================================
     * src/aed/app/PedidoDemo.java
     * ============================================================================
     * public PedidoDemo(int id, double valor)
     * public int getId()
     * public double valorFinal()
     *
     * ============================================================================
     * src/aed/app/RecursaoPassoAPasso.java
     * ============================================================================
     * private RecursaoPassoAPasso()
     * public static int contar(Celula<Integer> atual, String margem)
     * public static void main(String[] args)
     *
     * ============================================================================
     * src/aed/base/Celula.java
     * ============================================================================
     * public Celula()
     * public Celula(E item)
     * public Celula(E item, Celula<E> proximo)
     * public E getItem()
     * public Celula<E> getProximo()
     * public void setProximo(Celula<E> proximo)
     *
     * ============================================================================
     * src/aed/base/CelulaDupla.java
     * ============================================================================
     * public CelulaDupla()
     * public CelulaDupla(E item)
     * public E getItem()
     * public void setItem(E item)
     * public CelulaDupla<E> getAnterior()
     * public void setAnterior(CelulaDupla<E> anterior)
     * public CelulaDupla<E> getProximo()
     * public void setProximo(CelulaDupla<E> proximo)
     *
     * ============================================================================
     * src/aed/base/Fila.java
     * ============================================================================
     * public Fila()
     * public Fila(E[] itens)
     * public Fila(Pilha<E> pilha)
     * public boolean vazia()
     * public void enfileirar(E item)
     * public E consultarInicio()
     * public E desenfileirar()
     * public int tamanho()
     * public int obterNumeroItens()
     * public int obterNumeroItens(Celula<E> aux)
     * public boolean verificarExistencia(E item)
     * public boolean contem(E item)
     * public boolean contem(E item, Celula<E> aux)
     * public int quantosAfrente(E item)
     * public int quantosAfrente(Celula<E> atual, E item)
     * public int obterNumItensAFrente(E item) throws Exception
     * public E obterItem(int pos)
     * public E obterItem(Celula<E> aux, int pos)
     * public Fila<E> copiar()
     * public void concatenar(Fila<E> outra)
     * public Fila<E> unir(Fila<E> outra)
     * public void mesclar(Fila<E> outra)
     * public void inverter()
     * public void inverterSemAnterior()
     * public Fila<E> invertida()
     * public Fila<E> inverterOutra(Fila<E> outra)
     * public void inverterPorPilha()
     * public void inverterRecursivamente()
     * public Fila<E> dividir()
     * private void validarQuantidade(int quantidade)
     * public Fila<E> filtrar(Predicate<E> condicao, int quantidade)
     * public double somarValores(Function<E, Double> extrator, int quantidade)
     * public double calcularValorMedio(Function<E, Double> extrator, int quantidade)
     * public int contarSe(Predicate<E> condicao, int quantidade)
     * public E encontrarMaior(Function<E, Double> extrator)
     * public Fila<E> itensDepoisDoAlvo(E alvo)
     * private void buscarECopiar(E alvo, Celula<E> atual, Fila<E> nova)
     * private void copiarRestante(Celula<E> atual, Fila<E> nova)
     * public Fila<E> itensAntesDoAlvo(E alvo)
     * private void copiarAntes(E alvo, Celula<E> atual, Fila<E> nova)
     * public Object[] toArray()
     * public boolean estruturaValida()
     *
     * ============================================================================
     * src/aed/base/Lista.java
     * ============================================================================
     * public Lista()
     * public boolean vazia()
     * public int tamanho()
     * public void inserirFinal(E item)
     * public void inserir(E item, int pos)
     * public E remover(int pos)
     * public E removerInicio()
     * public E remover(E itemProcurado)
     * public E localizar(int pos)
     * public int obterNumeroItens()
     * public int contarQtos(E item)
     * public int contarQtos(E item, Celula<E> aux)
     * public boolean contem(E item)
     * public boolean contem(E item, Celula<E> aux)
     * public boolean removerTodos(E item)
     * public void inverter()
     * public Lista<E> invertida()
     * public void mesclar(Lista<E> outra)
     * public Lista<E> mesclarInvertidas(Lista<E> outra)
     * public void unir(Pilha<E> pilha)
     * public void trocar(E xItem, E yItem)
     * public Object[] toArray()
     * public boolean estruturaValida()
     *
     * ============================================================================
     * src/aed/base/ListaDupla.java
     * ============================================================================
     * public ListaDupla()
     * public ListaDupla(Fila<E> fila)
     * public boolean vazia()
     * public int tamanho()
     * public void inserirFim(E item)
     * public void inserir(E item, int posicao)
     * public E removerFim()
     * private E desligar(CelulaDupla<E> atual)
     * public E remover(int pos)
     * public boolean removerTodos(E item)
     * public void inverter()
     * public boolean ehPalindromo()
     * public void concatenar(ListaDupla<E> outra)
     * public Object[] toArray()
     * public Object[] reversoArray()
     * public boolean estruturaValida()
     *
     * ============================================================================
     * src/aed/base/Pilha.java
     * ============================================================================
     * public Pilha()
     * public boolean vazia()
     * public void empilhar(E item)
     * public E consultarTopo()
     * public E desempilhar()
     * public int obterNumeroItens()
     * public int contarRecursivo()
     * private int contarRecursivo(Celula<E> atual)
     * public Pilha<E> subPilha(int numItens)
     * public Pilha<E> copiar()
     * public void inverter()
     * public void concatenar(Pilha<E> outra)
     * public void inverterRecursivamente()
     * private void inserirFundo(E item)
     * public Object[] toArray()
     * public boolean estruturaValida()
     *
     * ============================================================================
     * src/aed/base/PseudoFila.java
     * ============================================================================
     * public boolean vazia()
     * public void enfileirar(E item)
     * private void prepararSaida()
     * public E desenfileirar()
     * public E consultarInicio()
     *
     * ============================================================================
     * src/aed/base/PseudoPilha.java
     * ============================================================================
     * public boolean vazia()
     * public void empilhar(E item)
     * public E desempilhar()
     * public E consultarTopo()
     *
     * ============================================================================
     * src/aed/classicos/Classicos.java
     * ============================================================================
     * private Classicos()
     * public static boolean delimitadoresBalanceados(String texto)
     * public static double avaliarPosfixa(String expressao)
     * public static String binario(int n)
     * public static boolean palindromo(String texto)
     * public static <E> Celula<E> inverterLigacoes(Celula<E> atual)
     * public static <E> Celula<E> inverterLigacoesRec(Celula<E> atual)
     * public static <E> boolean temCiclo(Celula<E> inicio)
     * public static <E> Celula<E> inicioDoCiclo(Celula<E> inicio)
     * public static <E> Celula<E> meio(Celula<E> inicio)
     * public static <E> E kEsimoDoFim(Celula<E> inicio, int k)
     * public static <E> Celula<E> removerKEsimoDoFim(Celula<E> inicio, int k)
     * public static <E extends Comparable<E>> Celula<E> intercalarNos(Celula<E> a, Celula<E> b)
     * public static <E> Celula<E> removerDuplicadosOrdenados(Celula<E> inicio)
     * public static <E> Celula<E> removerDuplicados(Celula<E> inicio)
     * public static <E extends Comparable<E>> Celula<E> particionarEstavel(Celula<E> inicio, E limite)
     * public static <E> void inverterPrimeiros(Fila<E> fila, int k)
     * public static int josephus(int n, int m)
     * public static int[] proximosMaiores(int[] a)
     * public static boolean sequenciaDesempilhavel(int[] entrada, int[] saida)
     *
     * ============================================================================
     * src/aed/classicos/PilhaMinima.java
     * ============================================================================
     * public boolean vazia()
     * public void empilhar(E item)
     * public E desempilhar()
     * public E consultarTopo()
     * public E minimo()
     *
     * ============================================================================
     * src/aed/flexiveis/ListaOrdenada.java
     * ============================================================================
     * public void inserirEmOrdem(E item)
     * public Object[] toArray()
     *
     * ============================================================================
     * src/aed/ordenacao/Ordenacoes.java
     * ============================================================================
     * private Ordenacoes()
     * public static void trocar(int[] a, int i, int j)
     * public static void mergeSort(int[] a)
     * private static void mergeSort(int[] a, int[] aux, int esq, int dir)
     * public static void quickSortCentro(int[] a)
     * public static void quickSortUltimo(int[] a)
     * private static void quick(int[] a, int esq, int dir, boolean ultimo)
     * public static int particionar(int[] a, int esq, int dir)
     * public static void quickSortLomuto(int[] a)
     * private static void lomuto(int[] a, int e, int d)
     * public static void quickSortTresVias(int[] a)
     * private static void tresVias(int[] a, int e, int d)
     * public static void heapSort(int[] a)
     * private static void descer(int[] a, int pai, int n)
     * public static void heapSortBaseUm(int[] a)
     * private static void descerBaseUm(int[] a, int pai, int n)
     * public static void insertionSort(int[] a)
     * public static void selectionSort(int[] a)
     * public static void bubbleSort(int[] a)
     *
     * ============================================================================
     * src/aed/revisao/Fila.java
     * ============================================================================
     * public Fila()
     * public Fila(E[] a, E[] b)
     * public boolean vazia()
     * public void enfileirar(E item)
     * public E consultarInicio()
     * public E desenfileirar()
     * public E obterItem(int pos)
     * public E obterItem(Celula<E> aux, int pos)
     * public Fila<E> extrairMenores(E limite)
     * public Object[] toArray()
     * public boolean estruturaValida()
     *
     * ============================================================================
     * src/aed/revisao/Lista.java
     * ============================================================================
     * public Lista()
     * public Lista(aed.base.Fila<E> a, aed.base.Fila<E> b)
     * private aed.base.Fila<E> copiarPorAPI(aed.base.Fila<E> fila)
     * public boolean vazia()
     * public int tamanho()
     * public void inserirFinal(E novo)
     * public void inserir(E novo, int posicao)
     * public E remover(int posicao)
     * public Lista<E> intercalarOrdenadas(Lista<E> outra)
     * public E obterMaior()
     * public E obterMaior(Celula<E> aux)
     * public void rotacionar(int k)
     * public Lista<E> dividirAoMeio()
     * public void trocarDoisPrimeiros()
     * public void ordenar()
     * public void inserirEmOrdem(E item)
     * public Object[] toArray()
     * public boolean estruturaValida()
     *
     * ============================================================================
     * src/aed/variacoes/FilaCircular.java
     * ============================================================================
     * public FilaCircular(int capacidade)
     * public boolean vazia()
     * public boolean cheia()
     * public int tamanho()
     * public void enfileirar(E item)
     *
     * ============================================================================
     * src/aed/variacoes/FilaSemSentinela.java
     * ============================================================================
     * public boolean vazia()
     * public void enfileirar(E e)
     * public E desenfileirar()
     *
     * ============================================================================
     * src/aed/variacoes/ModelosRecursivos.java
     * ============================================================================
     * private ModelosRecursivos()
     * public static <E> int contarSe(Celula<E> atual, Predicate<E> condicao)
     * public static <E> double somar(Celula<E> atual, Function<E, Double> extrator)
     * public static <E> boolean algum(Celula<E> atual, Predicate<E> condicao)
     * public static <E> boolean todos(Celula<E> atual, Predicate<E> condicao)
     * public static <E> int indiceOuMenosUm(Celula<E> atual, E alvo)
     * public static <E> int ultimoIndice(Celula<E> atual, E alvo)
     * public static <E> Celula<E> copiarNos(Celula<E> atual)
     * public static <E> Celula<E> filtrarNos(Celula<E> atual, Predicate<E> condicao)
     * public static <E> Celula<E> removerTodosNos(Celula<E> atual, E alvo)
     * public static <E> Fila<E> copiarInvertido(Celula<E> atual)
     * private static <E> void copiarNaVolta(Celula<E> atual, Fila<E> nova)
     * public static <E> Celula<E> copiarComFuncao(Celula<E> atual, Function<E, E> copiador)
     *
     * ============================================================================
     * src/aed/variacoes/PilhaSemSentinela.java
     * ============================================================================
     * public boolean vazia()
     * public void empilhar(E item)
     * public E consultarTopo()
     * public E desempilhar()
     *
     * ============================================================================
     * src/aed/variacoes/PilhaVetor.java
     * ============================================================================
     * public PilhaVetor(int capacidade)
     * public boolean vazia()
     * public void empilhar(E e)
     */
    // endregion [F003]
    // ============================================================================
    // region [F004] 10_AMPLIACAO_V2/GUIA_V2_03_ADOTAR_CABECA_E_SENTINELA.java
    // BUSCA: GUIA V2 03 ADOTAR CABECA E SENTINELA
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_03_ADOTAR_CABECA_E_SENTINELA.java
    // ============================================================================
    /*
     * GUIA V2 03 - ADOTAR A CABECA RETORNADA, ATUALIZAR FIM E TAMANHO
     * BUSCA: return Celula cabeca referencia inicio fim tras primeiro ultimo sentinela.
     *
     * RETORNAR UMA CELULA NAO ALTERA AUTOMATICAMENTE O CAMPO INICIO
     * Celula<E> novaCabeca = removerSeRecursivo(inicio.getProximo(), condicao);
     * inicio.setProximo(novaCabeca);
     *
     * A primeira linha obtem uma referencia. A segunda instala essa referencia na
     * sentinela. Se ignorar o retorno, a lista pode continuar apontando para um no
     * removido ou para o antigo primeiro de uma cadeia que ja foi invertida.
     *
     * ESQUEMA PARA LISTA COM SENTINELA FIXA E CONTADOR TAMANHO
     * // Codigo para colocar DENTRO da classe Lista<E>, adaptando os nomes:
     * inicio.setProximo(novaCabeca);
     * fim = inicio;
     * tamanho = 0;
     * Celula<E> aux = inicio.getProximo();
     * while (aux != null) {
     *     fim = aux;
     *     tamanho++;
     *     aux = aux.getProximo();
     * }
     *
     * Na lista vazia, o laco nao entra. fim permanece na sentinela, tamanho vale 0.
     * Isso custa O(n); nao use esse recálculo se o enunciado exige operacao O(1).
     * Para cumprir O(1), atualize fim/tamanho incrementalmente com informacao ja conhecida.
     *
     * FILA COM UMA SENTINELA FIXA
     * frente -> [S] -> [10] -> [20] <- tras
     * Remover 10: frente.proximo recebe a referencia de 20; frente continua em S.
     * Remover o unico dado: tras = frente; frente.proximo = null.
     * Inverter: antigo primeiro vira tras; novo primeiro entra em frente.proximo.
     *
     * LISTA SIMPLES COM UMA SENTINELA FIXA
     * primeiro/inicio -> [S] -> dados -> ultimo/fim
     * Ao remover no meio: anterior.proximo = removida.proximo.
     * Ao remover o ultimo: ultimo = anterior.
     * Ao inserir no fim: ultimo.proximo = nova; ultimo = nova.
     * Se item e final, trocar ordem significa religar celulas, nao atribuir item.
     *
     * PILHA COM SENTINELA NO FUNDO
     * [topo] -> dados -> [S] <- fundo
     * Contagem para em aux == fundo, nao em aux == null, para nao contar S.
     * Empilhar: nova.proximo = topo; topo = nova.
     * Desempilhar: guardar topo.item; topo = topo.proximo; devolver item.
     * Sem sentinela: vazio e topo == null; os casos-base devem mudar.
     *
     * DEQUE DE DUAS SENTINELAS - COMPLEMENTO, NAO O PADRAO DA PROFESSORA
     * [Sinicio] <-> dados <-> [Sfim]
     * As duas sentinelas sao objetos distintos. vazio: Sinicio.proximo == Sfim.
     * Nunca interprete inicio == fim como vazio nessa variante.
     *
     * LISTA CIRCULAR - COMPLEMENTO
     * Nao vazia: ultimo.proximo aponta para primeiro; o percurso nao termina em null.
     * Pare quando voltar a primeira celula ou apos exatamente tamanho passos.
     * Um while(aux != null) em uma cadeia circular valida nao termina.
     *
     * REGRA PARA TROCAR CABECAS ENTRE ESTRUTURAS
     * Nao copie uma sentinela como se fosse dado. Nao deixe this.fim apontando para
     * celula que foi transferida para outra. Se outra foi consumida, ela deve terminar
     * vazia e VALIDA, capaz de receber uma nova insercao.
     */
    // endregion [F004]
    // ============================================================================
    // region [F005] 10_AMPLIACAO_V2/GUIA_V2_04_RECURSAO_LINHA_POR_LINHA.java
    // BUSCA: GUIA V2 04 RECURSAO LINHA POR LINHA
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_04_RECURSAO_LINHA_POR_LINHA.java
    // ============================================================================
    /*
     * GUIA V2 04 - RECURSAO SEM PULAR A LINHA DA CHAMADA
     * BUSCA: retorno return 1 + espera chamada int boolean E Celula void parametros.
     * ORIGEM: explicacao autoral aplicada aos metodos FF04, FF05, FF10, LF03, R01, R06.
     *
     * LEIA ESTAS DUAS LINHAS COMO UM PEDIDO E UMA RESPOSTA
     * int resposta = contar(atual.getProximo());
     * return 1 + resposta;
     *
     * A primeira linha nao termina ate contar(proxima) devolver um int.
     * A chamada atual fica suspensa; depois retoma NA MESMA atribuicao, nao no inicio.
     * Cada chamada tem seu proprio atual e sua propria resposta.
     * A proxima chamada nao troca o atual da chamada anterior.
     *
     * CADEIA DE DADOS: 10 -> 20 -> null. O METODO CONTA TODOS.
     * A: atual=celula10. Preciso preencher resposta; chamo B com celula20.
     * B: atual=celula20. Preciso preencher resposta; chamo C com null.
     * C: atual=null. Caso-base retorna 0. C termina.
     * B: a chamada de C vale 0. resposta_B=0. return 1+0 devolve 1. B termina.
     * A: a chamada de B vale 1. resposta_A=1. return 1+1 devolve 2. A termina.
     * Chamador externo: int total = 2.
     *
     * FORMA CURTA E FORMA EXPANDIDA
     * return 1 + contar(atual.getProximo());
     * Equivale a: int resposta=contar(atual.getProximo()); return 1+resposta;
     * O return avalia a expressao inteira antes de devolver seu valor.
     *
     * SEM SOMA
     * return contem(item, atual.getProximo());
     * Equivale a: boolean resposta=contem(item,atual.getProximo()); return resposta;
     * Achou -> true. Todas as chamadas pendentes repassam o mesmo boolean.
     * Nao achou -> null devolve false. Todas repassam false.
     *
     * ITEM, NAO CONTAGEM
     * return obterItem(atual.getProximo(), pos - 1);
     * O pos-1 modifica o ARGUMENTO da proxima chamada; nao e o valor do retorno.
     * A base pos==0 retorna atual.getItem(), que pode ser Pedido, nao numero.
     * As chamadas anteriores repassam a referencia desse item E.
     *
     * CELULA, NAO ITEM
     * return buscarCelulaRecursiva(atual.getProximo(), alvo);
     * Retorno Celula<E>: referencia para um no. Retorno E: referencia para o item.
     * return null pode significar ausencia em uma API que adote essa convencao.
     *
     * VOID E ACOES
     * void imprimir(atual):
     *     se atual==null: return;
     *     imprimir item atual;
     *     imprimir(atual.proximo);
     * Saida: 10,20.
     *
     * void imprimirInvertido(atual):
     *     se atual==null: return;
     *     imprimirInvertido(atual.proximo);
     *     imprimir item atual;
     * Saida: 20,10. Nao inverteu os nos; mudou apenas a ordem de impressao.
     *
     * RETORNO NAO DEPENDE SOMENTE DO TIPO
     * Um int pode ser repassado sem soma. Um boolean pode ser combinado com &&/||.
     * Um E pode ser comparado com outro para escolher o maior.
     * O tipo diz o que pode sair; o algoritmo decide como combinar os resultados.
     *
     * CASO-BASE NAO PRECISA SER ZERO
     * Contar: null -> 0. Contem: null -> false. Todos: null -> true.
     * Copiar cadeia: null -> null. Maior: ultima celula -> seu proprio item.
     * Buscar posicao: pos==0 -> item. Alvo ausente: excecao, se assim pedido.
     * Pilhas com sentinela: aux==fundo marca o fim dos dados.
     *
     * ERROS QUE VOLTAM NAS QUESTOES
     * Chamar com frente.getProximo() dentro do recursivo -> reinicia a busca.
     * Chamar com atual sem avancar -> nao diminui o problema.
     * Escrever chamadaRecursiva(...) sem return em metodo nao void -> descarta retorno.
     * return 1 + (-1) em busca -> transforma ausencia em um indice falso.
     * Somar atual.getItem() quando a pergunta pede quantidade -> soma dados, nao nos.
     * Desempilhar para consultar recursivamente -> modifica a estrutura.
     * Chamar duas vezes o mesmo subproblema -> pode repetir muito trabalho.
     *
     * STACK E HEAP NAO SAO A MESMA COISA
     * Cada chamada pendente ocupa estado de execucao. A estrutura Pilha<E> do exercicio
     * nao e criada automaticamente por uma chamada recursiva. As duas seguem LIFO,
     * mas sao mecanismos/objetos diferentes.
     *
     * PARA VER A SAIDA REAL, NAO APENAS UMA EXPLICACAO
     * Execute: java GUIA_MESTRE_AEDII recursao
     * Tambem existe a classe RecursaoRastreada, com println antes e depois das chamadas.
     * O parametro nivel e so para o rastro. Nao o acrescente a assinatura fixa da prova.
     */
    // endregion [F005]
    // ============================================================================
    // region [F006] 10_AMPLIACAO_V2/GUIA_V2_05_TABELA_CASOS_BASE.java
    // BUSCA: GUIA V2 05 TABELA CASOS BASE
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_05_TABELA_CASOS_BASE.java
    // ============================================================================
    /*
     * GUIA V2 05 - CASOS-BASE E RETORNOS POR OBJETIVO
     * BUSCA: base parar vazio null retorno sem laco recursao.
     *
     * OBJETIVO                  BASE                         COMBINACAO
     * contar todos              aux==null -> 0               1 + f(proximo)
     * contar iguais             aux==null -> 0               (igual?1:0)+f(proximo)
     * somar valores             aux==null -> 0.0             valorAtual+f(proximo)
     * produto de valores        aux==null -> 1               valorAtual*f(proximo)
     * existe algum              aux==null -> false           testeAtual || f(proximo)
     * todos satisfazem          aux==null -> true            testeAtual && f(proximo)
     * obter posicao             pos==0 -> item               f(proximo,pos-1)
     * primeiro indice           achou -> 0; null -> -1       propagar -1; senao 1+r
     * ultimo indice             null -> -1                   procurar no sufixo primeiro
     * quantos antes             achou -> 0; null -> erro     1+f(proximo)
     * maior item                ultimo dado -> item          max(itemAtual,maiorResto)
     * copiar nos                null -> null                 new Celula(item,copiaResto)
     * remover nos               null -> null                 noAtual ou resto
     * imprimir                  null -> return;              acao e chamada
     * mergesort                 0/1 item -> return           ordenar metades, intercalar
     * quicksort intervalo       esq>=dir -> return           ordenar intervalos menores
     *
     * ATENCAO A ORDEM DOS IFs
     * if (aux == null) ...       antes de aux.getItem() ou aux.getProximo().
     * if (pos < 0) ...           antes de procurar uma posicao impossivel.
     * if (pos == 0) ...          somente depois de garantir que aux existe.
     * if (topo == fundo) ...     antes de tentar remover sentinela de pilha vazia.
     *
     * VAZIO NAO TEM UM RETORNO UNIVERSAL
     * Contagem vazia faz sentido como zero.
     * Consulta do primeiro numa estrutura vazia nao tem um E valido: lancar excecao
     * ou retornar null somente se a assinatura/contrato aceitar esse significado.
     * Maior vazio nao deve inventar 0 nem Integer.MIN_VALUE em uma classe generica.
     * Media vazia nao tem valor aritmetico. Nao divida por zero silenciosamente.
     *
     * DUAS CELULAS TERMINAIS DIFERENTES
     * Fila/lista com sentinela no inicio: ultimo DADO.proximo == null.
     * Pilha com sentinela no fundo: ultimo DADO.proximo == fundo.
     * Nao aplique o mesmo aux==null cegamente as duas implementacoes.
     *
     * QUANDO A EXCECAO SOBE
     * Se f(proximo) lanca e ninguem captura, a atribuicao que aguardava nao e completada.
     * Nao ha retorno 0/false implicito. As chamadas pendentes tambem terminam por erro.
     * Por isso validar antes de modificar ajuda a evitar uma estrutura meio alterada.
     */
    // endregion [F006]
    // ============================================================================
    // region [F007] 10_AMPLIACAO_V2/GUIA_V2_06_APP_FILA_PARAMETROS.java
    // BUSCA: GUIA V2 06 APP FILA PARAMETROS
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_06_APP_FILA_PARAMETROS.java
    // ============================================================================
    /*
     * GUIA V2 06 - ONDE COLOCAR CADA COISA: APP, FILA, PEDIDO, CELULA
     * BUSCA: filaPedidos static global local instancia declaracao parametro argumento.
     *
     * CELULA<E>
     * Guarda E item e Celula<E> proximo. Ela nao calcula media de todos os pedidos.
     * getItem retorna o item; getProximo retorna outra referencia de celula.
     *
     * FILA<E>
     * Guarda referencias de controle frente/tras e implementa enfileirar/desenfileirar.
     * filtrar recebe Predicate<E>; calcularValorMedio recebe Function<E,Double>.
     * Esses metodos percorrem a estrutura e aplicam o comportamento que receberam.
     * A classe generica nao conhece diretamente Pedido.valorFinal().
     *
     * PEDIDO
     * Guarda os dados do dominio e sabe calcular seu valorFinal().
     * No codigo original enviado, getItensDoPedido() retorna um vetor de capacidade 10.
     * Seu length e CAPACIDADE, nao a quantidade ocupada. Posicoes vazias podem ser null.
     *
     * APP
     * Cria a fila, recebe/cria pedidos, define lambdas e chama os metodos da fila.
     * Use a MESMA fila em finalizar e consultar. Nunca recrie a fila ao mostrar a media.
     *
     * EXEMPLO COM ATRIBUTO COMPARTILHADO
     * public class App {
     *     static Fila<Pedido> filaPedidos = new Fila<>();
     *
     *     public static void finalizarPedido(Pedido pedido) {
     *         if (pedido == null) throw new IllegalArgumentException();
     *         filaPedidos.enfileirar(pedido);
     *     }
     *
     *     public static void mostrarMediaPedidos(int quantidade) {
     *         Function<Pedido,Double> extrator = p -> p.valorFinal();
     *         double media = filaPedidos.calcularValorMedio(extrator, quantidade);
     *         System.out.println(media);
     *     }
     * }
     *
     * ONDE ESSA FILA FOI DECLARADA?
     * Na linha static Fila<Pedido> filaPedidos = new Fila<>(), FORA dos metodos.
     * Se voce escrever new Fila<>() dentro de mostrarMedia, criara outra fila vazia.
     * O nome filaPedidos nao e palavra do Java nem variavel criada pela Fila.
     *
     * ALTERNATIVA SEM ATRIBUTO STATIC
     * main cria Fila<Pedido> fila = new Fila<>();
     * main chama mostrarMedia(fila, quantidade).
     * mostrarMedia recebe Fila<Pedido> pedidos como PARAMETRO.
     * A referencia e copiada; ambos acessam o mesmo objeto fila.
     * Esta alternativa e valida, mas precisa passar a fila em todas as chamadas.
     *
     * STATIC NAO SIGNIFICA QUE OBJETOS LOCAIS MORREM AUTOMATICAMENTE
     * Escopo decide onde um nome de variavel pode ser usado.
     * Alcancabilidade de referencias decide se um objeto continua acessivel.
     * Um objeto criado localmente pode continuar existindo se for retornado/armazenado.
     * O problema da fila local vazia e NAO SER a fila em que os pedidos foram guardados.
     *
     * PADRAO DO MENU SEM INVENTAR HELPERS
     * Se seu projeto tem lerOpcao(String, Class<T>), use esse nome com Integer.class.
     * Nao chame lerInteiro() sem implementar esse metodo na App.
     * Se listarProdutosPedidosRecentes recebe int, a chamada deve fornecer um int.
     * Nao escreva subPilha(int numItens); escreva subPilha(numItens).
     *
     * EXEMPLO EXECUTAVEL SEM CLASSES EXTERNAS DO PROJETO
     * Procure V2_39 / AppExplicita. Usa PedidoExemplo, declarado no mesmo exemplo.
     * Esse modelo e independente, nao afirma reproduzir o cadastro completo original.
     * Execute: java GUIA_MESTRE_AEDII app
     */
    // endregion [F007]
    // ============================================================================
    // region [F008] 10_AMPLIACAO_V2/GUIA_V2_07_FUNCTION_PREDICATE_COMPARATOR.java
    // BUSCA: GUIA V2 07 FUNCTION PREDICATE COMPARATOR
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_07_FUNCTION_PREDICATE_COMPARATOR.java
    // ============================================================================
    /*
     * GUIA V2 07 - FUNCTION PREDICATE COMPARATOR: DEFINIR, PASSAR, EXECUTAR
     * BUSCA: lambda -> apply test compare extrator condicional preco valorFinal.
     * BASE EXTERNA: contratos oficiais Oracle; os exemplos e ligacoes sao autorais.
     *
     * RESUMO DOS CONTRATOS
     * Function<T,R>: recebe T, retorna R, executa com apply.
     * Predicate<T>: recebe T, retorna boolean, executa com test.
     * Comparator<T>: compara dois T; compare retorna negativo, zero ou positivo.
     * Fontes: Function.html, Predicate.html, Comparator.html, em java.util.function
     * ou java.util, listadas em GUIA_V2_18_FONTES_VALIDACAO.
     *
     * NA APP: DEFINIR A REGRA
     * Function<Pedido,Double> extrator = p -> p.valorFinal();
     * Predicate<Pedido> condicao = p -> p.valorFinal() >= minimo;
     * Comparator<Pedido> ordem = (a,b) -> Double.compare(a.valorFinal(),b.valorFinal());
     *
     * A esquerda da seta nomeia os PARAMETROS da lambda.
     * A direita da seta e o corpo executado quando alguem chama apply/test/compare.
     * O nome extrator nao escolhe automaticamente um atributo chamado preco.
     * O codigo p.valorFinal() e que diz exatamente qual operacao executar.
     *
     * NA APP: PASSAR
     * filaPedidos.calcularValorMedio(extrator, quantidade);
     * filaPedidos.filtrar(condicao, quantidade);
     *
     * NA FILA: RECEBER E EXECUTAR
     * E item = aux.getItem();
     * double numero = extrator.apply(item);
     * boolean aprovado = condicional.test(item);
     *
     * CAMINHO DAS REFERENCIAS
     * filaPedidos -> objeto Fila -> sentinela -> celula -> objeto Pedido
     * aux aponta para celula; aux.getItem() devolve Pedido; apply recebe Pedido.
     * O valor da Function e numerico porque a lambda devolve valorFinal(), nao porque
     * a celula teria um atributo preco. Celula normalmente so tem item e proximo.
     *
     * VARIAVEL INTERMEDIARIA E OPCIONAL
     * E item = aux.getItem();
     * double numero = extrator.apply(item);
     * Equivale a: double numero = extrator.apply(aux.getItem());
     * Nao equivale a apply(aux): aux e Celula<E>, mas a funcao espera E.
     *
     * CODIGO NAO E EXECUTADO NO MOMENTO DA DECLARACAO DA LAMBDA
     * Function<Pedido,Double> f = p -> p.valorFinal();
     * Aqui definimos o comportamento, sem escolher um pedido especifico.
     * f.apply(pedido1) executa em pedido1. f.apply(pedido2) executa em pedido2.
     *
     * REGRA FIXA VS USUARIO
     * Programador define >=, <, equals, entre limites etc.
     * Usuario pode fornecer minimo, maximo, quantidade e uma opcao do menu.
     * Ex.: double minimo = valorLido; Predicate<Pedido> c = p -> p.valorFinal()>=minimo;
     * Variavel local capturada deve ser final ou efetivamente final: nao a reatribua.
     *
     * COMBINAR CONDICOES
     * Predicate<Pedido> caro = p -> p.valorFinal() >= 100;
     * Predicate<Pedido> abaixoTeto = p -> p.valorFinal() <= 500;
     * Predicate<Pedido> faixa = caro.and(abaixoTeto);
     * Predicate<Pedido> fora = faixa.negate();
     * Tambem pode escrever uma unica lambda usando && e ||.
     *
     * DOUBLE VS double
     * Function usa Double porque genericos recebem tipos de referencia.
     * Na soma, ocorre conversao de Double para double. Se veio null, a conversao falha.
     * Se o contrato exigir, valide o resultado antes de somar.
     *
     * RETORNOS SAO DIFERENTES
     * filtrar -> Fila<E>. A chamada devolve REFERENCIA de uma nova fila.
     * calcularValorMedio -> double. A chamada devolve UM numero.
     * comparador.compare -> int com sinal, nao quantidade de elementos nem preco.
     *
     * VARIANTES NOVAS
     * V2_26: parar quando encontrar k aprovados.
     * V2_32: mapear todos os itens em outro tipo R.
     * V2_33: combinar todos em um acumulador.
     * V2_34: media so dos aprovados entre k examinados.
     * V2_35: ordenar a fila pelo criterio recebido.
     */
    // endregion [F008]
    // ============================================================================
    // region [F009] 10_AMPLIACAO_V2/GUIA_V2_08_IGUALDADE_GENERICS_CONSTRUTORES.java
    // BUSCA: GUIA V2 08 IGUALDADE GENERICS CONSTRUTORES
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_08_IGUALDADE_GENERICS_CONSTRUTORES.java
    // ============================================================================
    /*
     * GUIA V2 08 - IGUALDADE, GENERICS, SOBRECARREGAR E COMPARAR
     * BUSCA: equals == Comparable compareTo Comparator E T extends implements this.
     *
     * TIPOS E OBJETOS
     * Celula<Pedido> aux: referencia para CELULA que armazena um Pedido.
     * Pedido pedido = aux.getItem(): referencia para OBJETO Pedido.
     * Fila<Pedido> fila: referencia para OBJETO Fila que controla varias celulas.
     * Nomes parecidos nao tornam as variaveis iguais; tipos definem operacoes validas.
     *
     * == ENTRE REFERENCIAS
     * aux == frente compara se sao a mesma celula (identidade).
     * item == outroItem nao compara automaticamente os atributos dos objetos.
     * Em Integer, caches podem fazer alguns testes com == parecerem funcionar. Para
     * igualdade de elementos genericos, use equals conforme os enunciados.
     *
     * EQUALS
     * No curso, item.equals(procurado) usa o criterio da classe do item.
     * Se os itens podem ser null, proteja antes de chamar equals.
     * Objetos iguais devem ter hashCode igual; hashCode igual nao garante igualdade.
     * No Pedido enviado, hashCode retorna ID, mas nao generalize para toda classe.
     *
     * COMPARABLE
     * class Pedido implements Comparable<Pedido>
     * public int compareTo(Pedido outro) { ... }
     * E extends Comparable<E> autoriza usar item.compareTo(outro) genericamente.
     * compareTo < 0, ==0, >0 representam ordem. Nao exija exatamente -1 ou 1.
     *
     * COMPARATOR
     * Define criterio externo: Comparator<Pedido> porPreco = (a,b)->...;
     * Usa porPreco.compare(a,b), nao a.compareTo(b).
     * Se a questao exige compareTo, mantenha Comparable; Comparator e variacao extra.
     * Use Integer.compare/Double.compare, nao subtracao que possa transbordar/truncar.
     *
     * SOBRECARGA
     * Celula()                  -> sentinela/item null, conforme o construtor.
     * Celula(E item)            -> nova celula com item, sem sucessor.
     * Celula(E item,Celula<E> p)-> item e referencia de proximo.
     * Mesmo nome; parametros diferentes. Trocar so nome do parametro nao sobrecarrega.
     *
     * CHAMADA DE OUTRO CONSTRUTOR
     * public Fila(E[] itens) {
     *     this();
     *     // agora sentinela ja foi inicializada; percorra o vetor e enfileire.
     * }
     * Na sintaxe Java 8 deste acervo, this() e a primeira instrucao do construtor.
     *
     * STATIC E E
     * Um metodo static nao pode usar o E de instancia da classe diretamente.
     * Pode declarar seu proprio parametro: public static <E> int contar(Celula<E> p).
     * Dentro de Fila<E>, um metodo de instancia pode ser public int contar(...).
     *
     * FINAL
     * final Celula<E> frente impede reatribuir frente, mas nao impede mudar seu proximo.
     * final E item impede reatribuir item naquela celula, nao torna E imutavel.
     * No fixo com item final, nao resolva trocar elementos inventando setItem.
     */
    // endregion [F009]
    // ============================================================================
    // region [F010] 10_AMPLIACAO_V2/GUIA_V2_09_INVERTER_VARIACOES.java
    // BUSCA: GUIA V2 09 INVERTER VARIACOES
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_09_INVERTER_VARIACOES.java
    // ============================================================================
    /*
     * GUIA V2 09 - TODAS AS PERGUNTAS QUE PARECEM "INVERTER"
     * BUSCA: inverter reverse recursivo anterior prefixo intervalo grupos copiar ordem.
     *
     * PERGUNTAS DIFERENTES, ALGORITMOS DIFERENTES
     * 1. Inverter a estrutura atual, mudando suas referencias.
     * 2. Retornar uma copia invertida, sem alterar a original.
     * 3. Apenas imprimir do fim para o inicio.
     * 4. Inverter somente os k primeiros.
     * 5. Inverter de i ate j.
     * 6. Inverter grupos de k; ultimo incompleto pode ou nao ser invertido.
     * 7. Inverter pilha com API publica; inverter fila com uma pilha auxiliar.
     * 8. Proibir variavel anterior, proibir estruturas auxiliares ou exigir recursao.
     *
     * MODELO ITERATIVO DE RELIGACAO
     * Celula<E> anterior = null;
     * Celula<E> atual = primeiraCelula;
     * while (atual != null) {
     *     Celula<E> seguinte = atual.getProximo();
     *     atual.setProximo(anterior);
     *     anterior = atual;
     *     atual = seguinte;
     * }
     * A nova cabeca e anterior. O antigo primeiro agora e o ultimo.
     * Sem salvar seguinte antes, voce perde o acesso ao restante ao inverter a seta.
     *
     * SEM UMA VARIAVEL CHAMADA ANTERIOR
     * Inserir cada celula removida no comeco de uma cadeia auxiliar de referencias
     * inverte a ordem. Veja P12. Ainda ha necessidade de preservar a referencia seguinte.
     * "Sem anterior" nao quer dizer "sem nenhuma referencia auxiliar".
     *
     * RECURSAO E SO IMPRESSAO
     * imprimir(proximo); imprimir(itemAtual) produz ordem inversa na saida.
     * Nenhum setProximo foi feito; nenhuma ordem interna mudou.
     *
     * PILHA AUXILIAR
     * Fila -> desempilhar? Nao: fila.desenfileirar retorna primeiro.
     * Cada item vai para pilha.empilhar. Depois pilha.desempilhar alimenta a nova fila.
     * Isso inverte a ordem e consome a fila original, a menos que use uma copia.
     *
     * INVERTER FILA SO COM RECURSAO
     * Se vazia, retorna. Retira primeiro; inverte o resto; enfileira o retirado.
     * Ex.: [1,2,3] -> retira1, retira2, retira3; volta enfileirando3,2,1.
     * Custo O(n) chamadas, mas usa O(n) pilha de execucao.
     *
     * INVERTER PILHA SO COM RECURSAO
     * Retira topo; inverte resto; insere antigo topo no FUNDO dos dados.
     * Inserir no fundo custa O(n); a inversao total custa O(n^2). Veja V2_28/V2_29.
     * Nao confunda com inverter fila por recursao, que tem outro custo.
     *
     * INTERVALOS E BLOCOS
     * V2_10: [inicio,fimExclusivo), preserva fora do intervalo.
     * V2_11: inverte SOMENTE grupos completos de k.
     * C15: inverte prefixo de fila, conforme contrato da ficha.
     * V2_09: copia trecho; nao inverte nada.
     *
     * DUPLAMENTE ENCADEADA
     * Nao basta trocar proximo se anterior tambem existe.
     * R13 exige inverter por referencias e manter a sentinela como primeira celula.
     * Ajuste inicio.proximo, primeiroDado.anterior, fim e fim.proximo.
     *
     * TESTES MINIMOS
     * Vazia; um dado; dois dados; numero impar; repetidos; intervalo vazio;
     * inicio0; fim n; k1; k maior que tamanho; inverter duas vezes volta a original.
     */
    // endregion [F010]
    // ============================================================================
    // region [F011] 10_AMPLIACAO_V2/GUIA_V2_10_REMOVER_VARIACOES.java
    // BUSCA: GUIA V2 10 REMOVER VARIACOES
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_10_REMOVER_VARIACOES.java
    // ============================================================================
    /*
     * GUIA V2 10 - REMOVER SEM PERDER REFERENCIAS
     * BUSCA: removerTodos anterior atual ultimo fim tamanho duplicados extrair.
     *
     * REMOVER O PRIMEIRO DADO COM SENTINELA
     * removida = inicio.getProximo();
     * inicio.setProximo(removida.getProximo());
     * Se removida==fim, fim=inicio. Se ha tamanho, tamanho--.
     * Guarde removida.getItem() para retornar E.
     *
     * REMOVER DO MEIO
     * anterior.setProximo(atual.getProximo());
     * A celula anterior passa a pular a removida.
     * Nao precisa mover fisicamente objetos na memoria.
     *
     * REMOVER TODAS AS OCORRENCIAS
     * O caso perigoso e remover dois alvos seguidos.
     * Se removeu atual, anterior NAO avanca. Ele continua antes da proxima candidata.
     * Se nao removeu, anterior=atual.
     * Sempre salve seguinte=atual.getProximo() antes de desligar atual.
     *
     * EXEMPLO
     * S -> 7 -> 7 -> 2, alvo7.
     * anterior=S; remove primeiro7, S aponta segundo7; anterior continua S.
     * remove segundo7; S aponta2. Avancar anterior apos remover pularia ocorrencia.
     *
     * ULTIMA OCORRENCIA
     * Percorra guardando ultima e antesDaUltima. So remova depois do percurso.
     * Isso evita retirar a primeira por engano. Veja V2_13.
     *
     * REMOVER POR PREDICATE
     * condicao.test(item) decide; codigo religa/remove.
     * V2_08 devolve a cabeca filtrada por REAPROVEITAMENTO.
     * V2_22 usa desenfileirar/enfileirar; recria celulas atraves das APIs.
     * Mesma sequencia final nao significa mesma identidade dos nos.
     *
     * RETIRAR E DEVOLVER OUTRA ESTRUTURA
     * extrairMenores altera a fila original e devolve os retirados.
     * filtrar preserva a fila original e devolve os aprovados em outra estrutura.
     * Nao intercambie esses metodos, mesmo que comparem o mesmo limite.
     *
     * OPERACAO ATOMICA QUANTO A QUANTIDADE
     * Antes de remover k elementos, confira k>=0 e que ha pelo menos k dados.
     * Se descobrir insuficiencia no meio, a fila ja pode estar parcialmente destruida.
     * Percorrer com aux para validar e depois remover e uma estrategia simples.
     * Falhas por falta de memoria/funcao arbitraria exigem garantias adicionais que
     * nao sao prometidas automaticamente por essas validacoes.
     *
     * DEPOIS DA ULTIMA REMOCAO
     * Fila com sentinela: frente==tras e frente.proximo==null.
     * Lista com sentinela: inicio==fim, tamanho==0, inicio.proximo==null.
     * Pilha com sentinela: topo==fundo.
     * Sem sentinela: referencias de dados devem voltar a null conforme a classe.
     *
     * CUIDADO COM ALIAS
     * Se outra==this, percorrer outra enquanto acrescenta em this pode nunca terminar.
     * Copie a fonte antes de concatenar consigo mesmo, ou rejeite explicitamente.
     * Transferir celulas entre estruturas que ja compartilham nos pode formar ciclos.
     */
    // endregion [F011]
    // ============================================================================
    // region [F012] 10_AMPLIACAO_V2/GUIA_V2_11_ERROS_E_DIAGNOSTICO.java
    // BUSCA: GUIA V2 11 ERROS E DIAGNOSTICO
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_11_ERROS_E_DIAGNOSTICO.java
    // ============================================================================
    /*
     * GUIA V2 11 - BUSCA POR MENSAGEM DE ERRO E SINTOMA
     * BUSCA: cannot find symbol incompatible types missing return unreachable static.
     *
     * CANNOT FIND SYMBOL: filaPedidos
     * Declare o atributo no App, ou receba a fila como parametro.
     * Nome de uma classe Fila nao cria uma variavel chamada filaPedidos.
     *
     * METHOD ... CANNOT BE APPLIED TO GIVEN TYPES
     * Confira quantidade, ordem e tipo dos argumentos.
     * Ex.: subPilha(int n) e declaracao; subPilha(n) e chamada.
     * Ex.: desenfileirar() nao recebe qual item retirar.
     * Ex.: listarRecentes(int n) nao pode ser chamado sem n.
     *
     * INCOMPATIBLE TYPES
     * Celula<E> e E sao tipos diferentes. aux nao e aux.getItem().
     * Predicate<E> precisa de test(E), nao test(Celula<E>).
     * Metodo retorna Celula<E>, mas return 1+... produz int: contrato incoerente.
     *
     * MISSING RETURN STATEMENT
     * Metodo com retorno nao void precisa devolver em todos os caminhos normais.
     * Depois de montar Fila<E> nova, faltou return nova.
     * Depois da recursao, use return recursiva(...) se precisa repassar o resultado.
     *
     * UNREACHABLE STATEMENT
     * throw new Excecao(); encerra o caminho normal.
     * Se esqueceu de fechar o if, o codigo logo depois do throw nao pode executar.
     * return tambem encerra a chamada; codigo incondicional logo depois e inalcançavel.
     *
     * THROW VS THROWS
     * throw new IllegalArgumentException("mensagem"); e uma instrucao.
     * throws Exception fica na assinatura de um metodo que pode propagar a excecao.
     * Nao escreva throws IllegalArgumentException(...) dentro do if.
     *
     * NON-STATIC VARIABLE ... CANNOT BE REFERENCED
     * main e static. Nao acessa diretamente campo de instancia sem objeto.
     * Ou use um objeto App, ou campo static, ou parametro. Nao duplique atributos.
     *
     * NULLPOINTEREXCEPTION EM tras.setProximo
     * Voce inicializou tras=null mas escreveu enfileirar para uma fila COM sentinela.
     * Crie new Celula<>() e faça frente=sentinela; tras=sentinela.
     *
     * NULLPOINTEREXCEPTION EM aux.getItem
     * aux ja chegou ao final ou a fila estava vazia.
     * Verifique aux==null ANTES de usar getItem. Checar frente==tras nao verifica
     * se aux ja ultrapassou os dados ao percorrer uma fila nao vazia.
     *
     * SO PROCESSA O PRIMEIRO ITEM
     * aux=frente.getProximo() esta DENTRO do while; cada repeticao reinicia o percurso.
     * Declare/inicialize antes do while, avance dentro dele.
     *
     * LOOP NAO TERMINA
     * contador nao aumenta; aux nao avanca; recursao recebe a mesma celula;
     * reenfileira dentro de while(!fila.vazia()) sem limitar n originais;
     * ultima celula aponta para si; ou a estrutura e circular e a base e null.
     *
     * PULA ELEMENTOS
     * desenfileirar/desempilhar ja atualizaram referencias internas.
     * Fazer topo=topo.getProximo() novamente remove/pula mais uma celula.
     * Ao remover todos, avançar anterior depois de remover pode pular consecutivos.
     *
     * SAIDA INVERTIDA SEM QUERER
     * Transferir uma pilha para outra por pop/push inverte a ordem.
     * Duas inversoes restauram a ordem. Ordem de insercao e o oposto da de retirada.
     *
     * MEDIA ERRADA
     * return soma em vez de soma/quantidade.
     * Divisao inteira int/int antes de guardar em double.
     * Dividir por examinados quando queria media dos aprovados.
     * Executar extrator.apply(item) e descartar o numero, sem soma += resultado.
     *
     * VARIAVEL LOCAL REFERENCIADA POR LAMBDA DEVE SER FINAL
     * O minimo capturado precisa ser final ou efetivamente final.
     * Leia e atribua uma vez; nao o reatribua depois. Outra opcao e passar o valor ao
     * metodo que cria a lambda, como mostrarPedidosFiltrados(quantidade,minimo).
     *
     * ARRAYINDEXOUTOFBOUNDSEXCEPTION
     * for(i=0; i<vetor.length; i++), nao <=.
     * Vetor de ItemDePedido pode ter posicoes null: teste antes de chamar getProduto.
     *
     * STACKOVERFLOWERROR
     * Nao e erro de indice. Recursao nao diminui problema ou profundidade e muito alta.
     * Mesmo recursao correta pode exceder a pilha para uma lista muito longa.
     * Use iteracao quando permitido; nao finja que recursao de cauda e sempre otimizada.
     */
    // endregion [F012]
    // ============================================================================
    // region [F013] 10_AMPLIACAO_V2/GUIA_V2_12_ORDENACAO_COMPARACOES.java
    // BUSCA: GUIA V2 12 ORDENACAO COMPARACOES
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_12_ORDENACAO_COMPARACOES.java
    // ============================================================================
    /*
     * GUIA V2 12 - ORDENACAO: QUAL MODELO COPIAR E O QUE NAO MISTURAR
     * BUSCA: mergesort quicksort heapsort estabilidade particao indice base0 base1.
     *
     * FONTES DO CURSO NO ACERVO
     * R18: Mergesort em vetor, desenho das divisoes/intercalacoes.
     * R19: Heapsort com vetor tratado a partir de 1; construir de n/2 ate 1.
     * R20: Quicksort com i/j, dois criterios de pivo e contagem de comparacoes.
     * R22: particionar com pivo final e i/esq-1, variante Lomuto.
     * R23: ordenar lista usando dividirAoMeio e intercalarOrdenadas.
     * As variantes abaixo nao substituem essas escolhas quando elas sao exigidas.
     *
     * MERGESORT
     * Vetor: dividir intervalo, ordenar esquerda/direita, intercalar com auxiliar.
     * Lista: dividir cadeia, ordenar cadeias, intercalar andando por referencias.
     * Base: 0 ou 1 item. Cada metade precisa ser MENOR que a original.
     * Empate: escolher lado esquerdo primeiro conserva estabilidade.
     * Tempo O(n log n) no pior caso nas implementacoes usuais deste acervo.
     * Vetor usa O(n) auxiliar; versao V2_16 religa nos e usa O(log n) stack.
     * R23 do acervo faz as copias exigidas pela combinacao de auxiliares usada ali;
     * nao confunda a alocacao dessa versao com a variante sem criar celulas.
     *
     * QUICKSORT I/J - R20
     * Pivo e um VALOR escolhido; particionamento avanca i e recua j.
     * Depois da troca, i++ e j-- sao importantes mesmo quando valores sao iguais.
     * Recursao usa [esq,j] e [i,dir] na implementacao dada.
     * Nao use automaticamente p-1/p+1, que pertencem a outra interface de particao.
     * Melhor/esperado sob condicoes adequadas O(n log n); pior O(n^2).
     * Escolher melhor pivo ajuda, mas mediana de tres nao elimina TODO pior caso possivel.
     *
     * QUICKSORT LOMUTO - R22
     * Particionar devolve a POSICAO FINAL do pivo.
     * Recursao usa [esq,p-1] e [p+1,dir].
     * Com pivo final, entrada crescente pode produzir partes muito desbalanceadas.
     * O codigo de R22 usa <=: repetidos podem influenciar trocas/particoes.
     *
     * HEAPSORT
     * Primeiro construir max-heap; depois mover maior para final e reduzir regiao ativa.
     * Max-heap nao significa vetor completamente ordenado.
     * Vetor base0: filhos 2*i+1 e 2*i+2; ultimo pai n/2-1.
     * Vetor base1: filhos 2*i e 2*i+1; ultimo pai n/2; ignore indice0.
     * Construir bottom-up custa O(n); ordenar custa O(n log n).
     * Versao com descer iterativo usa O(1) memoria auxiliar; nao e estavel em geral.
     * Heap da ordenacao nao e Pilha<E> e nao e a regiao de alocacao de objetos do Java.
     *
     * INSERTION / SELECTION / BUBBLE
     * Insertion: inserir elemento na parte ja ordenada; bom para vetor quase ordenado.
     * Selection: achar menor na parte restante e trocar; O(n^2) comparacoes.
     * Bubble: comparar vizinhos; flag trocou permite parar em vetor ja ordenado.
     * Estabilidade depende de como trata empates e troca; veja implementacoes completas.
     *
     * OBJETOS DE PEDIDO
     * Por valor: Comparator<Pedido> c=(a,b)->Double.compare(a.valorFinal(),b.valorFinal());
     * Por criterio natural: Pedido implements Comparable<Pedido>, usa compareTo.
     * No Pedido original, criterio por ID nao e automaticamente criterio por preco.
     * Function extrai chave; Comparator compara duas chaves/objetos; algoritmo rearranja.
     * Predicate filtra; ele nao organiza os aprovados em ordem crescente por conta propria.
     *
     * COMPARACOES EM RASTROS
     * Conte exatamente o que o enunciado define: teste entre item e pivo ou qualquer if?
     * Comparacao que termina while tambem foi executada e deve ser contada quando
     * entra na definicao. Teste de indice nao e comparacao de chaves por padrao.
     */
    // endregion [F013]
    // ============================================================================
    // region [F014] 10_AMPLIACAO_V2/GUIA_V2_13_CUSTOS_E_COMPLEXIDADE.java
    // BUSCA: GUIA V2 13 CUSTOS E COMPLEXIDADE
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_13_CUSTOS_E_COMPLEXIDADE.java
    // ============================================================================
    /*
     * GUIA V2 13 - CUSTOS: O QUE MUDA COM A REPRESENTACAO
     * BUSCA: O(1) O(n) O(n log n) O(n^2) memoria auxiliar stack amortizado.
     *
     * HIPOTESE: comparar itens / executar Predicate / extrator custa O(1).
     * Se valorFinal percorre produtos, acrescente esse custo; nao o ignore por ser metodo.
     *
     * ESTRUTURA / OPERACAO                       TEMPO TIPICO NESTAS VERSOES
     * Pilha empilhar/desempilhar/consultar       O(1)
     * Fila enfileirar/desenfileirar              O(1) com frente/tras corretos
     * Lista simples inserir no fim              O(1) com ultimo/fim
     * Lista simples remover ultimo              O(n) para achar anterior
     * Lista dupla remover ultimo                O(1) com fim/anterior
     * Consulta por posicao encadeada             O(n) pior caso
     * Percurso/contagem sem campo tamanho        O(n)
     * Consulta de campo tamanho atualizado      O(1)
     * Filtro/soma de k itens via referencias     O(k)
     * Filtro com validarQuantidade antes         O(k) + O(k) = O(k)
     * Copia n itens                              O(n) tempo e novas celulas
     * Inversao iterativa de ligacoes             O(n) tempo e O(1) extra
     * Inversao recursiva de cadeia               O(n) tempo e O(n) stack
     * Pilha invertida via inserir no fundo       O(n^2) tempo e O(n) stack
     * V2_16 mergesort de nos                     O(n log n) e O(log n) stack
     * Busca recursiva linear                     O(n) tempo e O(n) stack
     * Fila por duas pilhas                       amortizado O(1); uma retirada O(n)
     *
     * AMORTIZADO NAO E "MEDIA DE SORTE"
     * Em uma fila por duas pilhas, cada elemento entra/sai de cada pilha um numero
     * limitado de vezes ao longo de muitas operacoes. Uma chamada pode custar O(n),
     * mas uma sequencia de m operacoes tem custo total O(m), sob o modelo usual.
     *
     * ARMADILHA DO TAMANHO NO WHILE
     * while(i < fila.tamanho()) e caro se tamanho() percorre toda a fila a cada teste.
     * Guarde int n=fila.tamanho() uma vez se quer processar n originais.
     * Se tamanho muda com remocoes, reavaliar ainda pode mudar a quantidade processada.
     *
     * ARMADILHA DA INSERCAO POR POSICAO
     * Criar lista ordenada por inserir(item,pos) pode custar O(n) a cada insercao.
     * Uma intercalacao que parece O(n+m) pode virar O((n+m)^2) se sempre percorre
     * para localizar o final. Use referencia fim/inserirFim O(1) se permitido.
     *
     * ARMADILHA DA RECURSAO DUPLICADA
     * if (maior(proximo).compareTo(item) > 0) return maior(proximo);
     * Chama maior duas vezes no mesmo trecho. Guarde E maiorResto=maior(proximo).
     *
     * MEMORIA DE SAIDA VS MEMORIA AUXILIAR
     * Copiar uma fila necessariamente cria O(n) nos de saida.
     * Recursao pode adicionar O(n) memoria de chamadas mesmo sem criar outra estrutura.
     * Dizer "nao usa pilha auxiliar" nao elimina a pilha de chamadas da recursao.
     */
    // endregion [F014]
    // ============================================================================
    // region [F015] 10_AMPLIACAO_V2/GUIA_V2_14_TESTE_DE_MESA_E_INVARIANTES.java
    // BUSCA: GUIA V2 14 TESTE DE MESA E INVARIANTES
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_14_TESTE_DE_MESA_E_INVARIANTES.java
    // ============================================================================
    /*
     * GUIA V2 14 - COMO TESTAR UMA SOLUCAO NA PROVA SEM FERRAMENTA EXTRA
     * BUSCA: teste de mesa vazio unitario dois repetidos inicio fim ciclo.
     *
     * CARTAO DE TESTES PARA TODO METODO
     * A) Estrutura vazia.
     * B) Um item que satisfaz a regra.
     * C) Um item que nao satisfaz.
     * D) Dois itens, atingindo o primeiro.
     * E) Dois itens, atingindo o ultimo.
     * F) Alvos consecutivos: [7,7,1].
     * G) Todos aprovados / todos removidos.
     * H) Nenhum aprovado / alvo ausente.
     * I) Posicao -1, 0, n-1, n; quantidade 0, n, n+1.
     * J) Ordenados, invertidos, todos iguais, valores negativos.
     * K) Mesma estrutura passada como parametro (this==outra).
     * L) Chamar de novo depois de esvaziar e inserir novo item.
     *
     * INVARIANTES DA FILA COM UMA SENTINELA
     * frente nunca e null; tras nunca e null.
     * frente==tras quando nao ha dados.
     * tras.getProximo()==null.
     * Partindo de frente.getProximo(), o ultimo dado e tras se nao vazia.
     * Sentinela nao aparece como item valido; nao deve ser enfileirada na copia.
     *
     * INVARIANTES DA LISTA SIMPLES
     * Tudo acima, com inicio/fim ou primeiro/ultimo.
     * Numero de dados alcancaveis == tamanho se esse campo existir.
     * Todos os dados restantes permanecem alcancaveis, sem ciclo acidental.
     *
     * INVARIANTES DA LISTA DUPLA
     * Se A.proximo == B, entao B.anterior == A, para vizinhos existentes.
     * Primeiro dado.anterior == sentinela; sentinela.anterior == null.
     * Ultimo dado.proximo == null; fim referencia esse dado (ou sentinela se vazio).
     *
     * INVARIANTES DA PILHA COM FUNDO SENTINELA
     * topo leva ao fundo seguindo proximo.
     * fundo continua a mesma sentinela durante push/pop normais.
     * Quando vazia topo==fundo. Nao conte a sentinela como dado.
     *
     * COMO DESENHAR ANTES DE ALTERAR
     * Anote separadamente as variaveis: anterior, atual, seguinte, inicio, fim.
     * Desenhe OBJETOS, nao so valores: A(item7) e B(item7) sao nos diferentes.
     * Risque uma seta antiga somente depois de salvar a referencia que ainda precisa.
     * No fim marque cabeca, cauda e quantidade; confirme o ultimo.proximo.
     *
     * COMO TESTAR PRESERVACAO
     * Fotografe em texto a ordem original. Execute. Compare ordem e numero de dados.
     * Para enunciado sem novas celulas, teste tambem identidade (==) dos nos.
     * Comparar so toArray confirma valores, mas nao prova reaproveitamento de celulas.
     *
     * COMO TESTAR RECURSAO
     * Para cada chamada, escreva: aux, pos/alvo, resultado aguardado e return final.
     * Pare no caso-base. Resolva as expressoes pendentes do mais interno para o externo.
     * Nao altere o parametro da chamada anterior no papel quando cria a proxima.
     */
    // endregion [F015]
    // ============================================================================
    // region [F016] 10_AMPLIACAO_V2/GUIA_V2_15_ADAPTAR_SEM_METODO_PRONTO.java
    // BUSCA: GUIA V2 15 ADAPTAR SEM METODO PRONTO
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_15_ADAPTAR_SEM_METODO_PRONTO.java
    // ============================================================================
    /*
     * GUIA V2 15 - E SE O TEMPLATE NAO TIVER O METODO AUXILIAR?
     * BUSCA: apenas metodos apresentados restricoes sem tamanho sem copiar sem array.
     *
     * NAO INVENTE DEPENDENCIAS
     * Uma solucao que chama tamanho(), copiar() ou inserirFim() so compila se esses
     * metodos existirem ou se voce os implementar e o enunciado permitir.
     * As fichas do acervo mostram base/auxiliares necessarios separadamente.
     *
     * SEM tamanho(), DENTRO DA FILA
     * Pode percorrer com aux=frente.getProximo() e contar ate null.
     * Se questao exige recursao, use FF04; se proibe parametro contador, some na volta.
     * Se ha campo tamanho mantido corretamente, leia o campo em O(1).
     *
     * SEM copiar(), DENTRO DA ESTRUTURA
     * Crie outra fila e percorra as celulas chamando nova.enfileirar(aux.getItem()).
     * Isso preserva os nos originais e copia referencias de itens.
     *
     * SEM ACESSO AS CELULAS, SOMENTE API PUBLICA
     * Uma fila auxiliar pode guardar os removidos e depois restaura-los.
     * Para processar exatamente os originais por rotacao, precisa saber n ou ter uma
     * estrategia de delimitacao valida. Nao compare so VALORES para marcar fim se ha
     * repetidos: pode parar cedo. Nao enfileire null como marcador se a API o proibe.
     *
     * SEM setItem / ITEM FINAL
     * Use religacao de celulas. Trocar valores nao e permitido.
     * Em lista dupla, atualize anterior E proximo de vizinhos.
     *
     * SEM NOVAS CELULAS
     * Nao use enfileirar/inserir se esses metodos fazem new Celula.
     * Desligue e anexe o proprio no. Ajuste referencias das DUAS estruturas.
     * R08 e R16 sao exemplos do material com restricoes de reaproveitamento.
     *
     * SEM ANTERIOR
     * Se o desafio e inverter, ha insercao na cabeca (P12) ou recursao, conforme regras.
     * Se e remover um no simples dado somente ele, nao ha solucao geral O(1) para
     * remover o ultimo sem conhecer o anterior. Truque de copiar sucessor falha no fim
     * e nao e permitido com item final; nao o venda como solucao geral.
     *
     * SEM LACOS
     * Use caso-base + chamada no proximo; preserve assinatura solicitada.
     * Para dois subproblemas, use duas chamadas (como mergesort), nao um while oculto.
     * Um helper pode iniciar a recursao na primeira celula valida.
     *
     * SEM MODIFICAR A ORIGINAL
     * Nao chame pop/dequeue nela se o requisito inclui preservacao durante a operacao.
     * Se requisito so fala estado final, retirar e restaurar pode ser aceito; a ficha
     * precisa explicitar essa escolha. Para garantir identidade de nos, percorra aux.
     *
     * SEM TROCAR A ASSINATURA
     * Recursivo com (Celula<E> aux,E item) nao pode virar (aux,item,contador).
     * Use 1+retorno; para boolean use propagacao; para maior guarde maiorResto local.
     * Criar um overload auxiliar publico e permitido somente conforme enunciado.
     */
    // endregion [F016]
    // ============================================================================
    // region [F017] 10_AMPLIACAO_V2/GUIA_V2_16_MATRIZ_VARIACOES.java
    // BUSCA: GUIA V2 16 MATRIZ VARIACOES
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_16_MATRIZ_VARIACOES.java
    // ============================================================================
    /*
     * GUIA V2 16 - MATRIZ DE VARIACOES PARA ENUNCIADOS NOVOS
     * BUSCA: variacao caso diferente adaptar antes depois entre faixa primeira ultima.
     *
     * EIXO 1 - O QUE ACONTECE COM A ORIGEM
     * preservar -> percorrer aux; criar nos de saida.
     * consumir -> desenfileirar/desempilhar e transferir itens.
     * reaproveitar -> religar nos; nao usar operacoes que alocam novas celulas.
     *
     * EIXO 2 - O QUE VAI PARA A SAIDA
     * todos -> copiar/concatenar.
     * aprovados -> Predicate.test.
     * rejeitados -> !Predicate.test.
     * chaves -> Function.apply.
     * um resultado -> contador/soma/maior/reducao.
     *
     * EIXO 3 - ONDE PARAR
     * null -> fim de cadeia simples.
     * fundo -> sentinela terminal de pilha.
     * contador==k -> quantidade processada.
     * aprovados==k -> quantidade SELECIONADA.
     * item.equals(alvo) -> primeira ocorrencia do alvo.
     * voltar a inicio -> estrutura circular.
     * ultima ocorrencia -> precisa olhar o restante ou guardar a ultima encontrada.
     *
     * EIXO 4 - QUAL ORDEM
     * mesma -> enfileirar na ordem do percurso.
     * inversa -> empilhar, inserir no inicio ou agir na volta da recursao.
     * ordem de insercao de pilha -> oposta ao percurso topo->fundo.
     * ordenada -> comparar e inserir/intercalar/ordenar.
     * alternada -> um de cada fonte, com tratamento de sobras.
     * em blocos -> k de cada fonte (V2_27).
     *
     * EIXO 5 - INCLUIR O ALVO?
     * Antes, exclusivo: pare ANTES de enfileirar o alvo.
     * Antes, inclusivo: enfileire alvo e depois pare.
     * Depois, exclusivo: comece em alvo.getProximo().
     * Depois, inclusivo: comece na propria celula do alvo.
     * Entre, exclusivo: pula primeiro alvo e para antes do segundo.
     * Intervalo [i,j): inclui i, exclui j; quantidade j-i.
     * Intervalo [i,j]: inclui ambos; quantidade j-i+1.
     *
     * COMBINACOES EXEMPLARES
     * "Copiar invertidos todos depois do alvo": localizar alvo; percorrer sufixo;
     * enfileirar na volta da recursao ou usar pilha auxiliar. Nao copiar alvo por acidente.
     * "Extrair primeiros k pares": k e aprovados? Leia a frase completa; pode ser
     * "pares dentre os k primeiros". Sao resultados diferentes.
     * "Trocar duas celulas mantendo item final": V2_12, nao setItem.
     * "Ordenar aprovados por preco": filtrar -> Comparator -> mergesort da copia.
     * "Contar antes do ultimo alvo": ultimoIndice, nao quantosAfrente da primeira.
     * "Separar posicoes pares": use indice, nao valor%2.
     * "Dividir metade maior primeiro": n/2 + n%2, quando n impar.
     *
     * TEMPLATE MENTAL PARA CRIAR A SOLUCAO
     * VALIDAR -> INICIALIZAR -> PERCORRER -> DECIDIR -> AGIR -> AVANCAR -> RETORNAR.
     * Na recursao: BASE -> DECISAO LOCAL -> CHAMADA MENOR -> COMBINACAO -> RETURN.
     *
     * NAO EXISTE UM UNICO METODO QUE SEJA TODAS AS VARIACOES AO MESMO TEMPO.
     * Escolha os eixos e mantenha o contrato escrito junto do codigo.
     */
    // endregion [F017]
    // ============================================================================
    // region [F018] 10_AMPLIACAO_V2/GUIA_V2_17_EXERCICIOS_EXTRAS_COM_DIRECAO.java
    // BUSCA: GUIA V2 17 EXERCICIOS EXTRAS COM DIRECAO
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_17_EXERCICIOS_EXTRAS_COM_DIRECAO.java
    // ============================================================================
    /*
     * GUIA V2 17 - NOVOS EXERCICIOS AUTORAIS COM LOCALIZACAO DO MODELO
     * Nao sao questoes adicionais dos PDFs nem previsoes da avaliacao.
     *
     * X01 - COPIAR ENTRE DOIS VALORES
     * Receba inicio e fim, exclua os alvos, preserve a fonte e a ordem.
     * Ex.: [4,8,1,2,9,3], inicio8/fim9 -> [1,2]. Direcao: V2_19.
     * Variacoes: incluir bordas; alvos repetidos; ultimo inicio antes do primeiro fim.
     *
     * X02 - INVERTER SOMENTE UM INTERVALO
     * Receba inicio/fimExclusivo, religue sem criar nos.
     * Ex.: [1,2,3,4,5], [1,4) -> [1,4,3,2,5]. Direcao: V2_10.
     * Testes: vazio, intervalo unitario, inicio0, ate n, fora dos limites.
     *
     * X03 - INVERTER BLOCOS
     * k=3 em [1,2,3,4,5,6,7] -> [3,2,1,6,5,4,7]. Direcao: V2_11.
     * Variacao que NAO e a mesma: inverter tambem o ultimo bloco incompleto.
     *
     * X04 - TROCAR DUAS POSICOES SEM SETITEM
     * [8,2,9,4], trocar0/2 -> [9,2,8,4]. Direcao: V2_12.
     * Teste adjacentes, cabeca, cauda, iguais, ordem de indices invertida.
     *
     * X05 - REMOVER A ULTIMA OCORRENCIA
     * [3,7,3,9], alvo3 -> [3,7,9]. Direcao: V2_13.
     * Defina se ausente retorna false, nao faz nada ou lanca; aqui preserva sem erro.
     *
     * X06 - MESMOS NOS OU MESMOS VALORES?
     * Duas cadeias tem valores [1,2] e [1,2], mas nos distintos: nao se intersectam.
     * Duas cadeias diferentes chegam ao mesmo no C: ha intersecao. Direcao: V2_17.
     *
     * X07 - K PRIMEIROS APROVADOS
     * [1,2,3,4], condicao par, k2 -> [2,4]. Direcao: V2_26.
     * Compare com filtrar(condicao,2), que analisa so [1,2] e retorna [2].
     *
     * X08 - MEDIA FILTRADA
     * [80,250,120,500], examinar3 e aceitar>=100 -> (250+120)/2=185.
     * Direcao: V2_34. Nao divida por3 e nao inclua500.
     *
     * X09 - PILHA ORDENADA PELO MENOR NO TOPO
     * topo->[3,1,2] -> topo->[1,2,3]. Direcao: V2_31.
     * Nao confundir com ordenar por ordem de chegada.
     *
     * X10 - FILA EM DUAS PARTES
     * Separar positivos/nao positivos sem mudar a original. Direcao: V2_21.
     * Variacao consumir original: V2_22 com condicao.
     *
     * X11 - REMOVER CADA TERCEIRO
     * [10,20,30,40,50,60,70] -> retirados [30,60], restantes [10,20,40,50,70].
     * Direcao: V2_24. Indices/contagem devem estar definidos; nao e Josephus.
     *
     * X12 - DEQUE COM DUAS SENTINELAS
     * Insira1 no inicio,2 no fim; remova fim e inicio; insira3 novamente.
     * Direcao: V2_37. Verifique todas as ligacoes anterior/proximo e vazio.
     *
     * X13 - LISTA CIRCULAR
     * [1,2,3], rotacionar4 -> [2,3,1]. Direcao: V2_38.
     * Mostre por que um percurso ate null falharia.
     *
     * X14 - SUBSTITUIR ITERACAO POR RECURSAO
     * Contar, existe, indice, obter item, copiar, remover aprovados.
     * Direcao: V2_01 a V2_08. Escreva caso-base e return antes do resto.
     *
     * X15 - CONECTAR APP E ESTRUTURA
     * Uma fila de pedidos deve filtrar pelo minimo digitado e calcular media dos k
     * primeiros. Direcao: GUIA_V2_06/07 e AppExplicita. Nao crie fila vazia ao consultar.
     *
     * X16 - EXPOR ERRO DE QUANTIDADE
     * Estrutura com2 itens; solicitar3. Garanta que a falha nao remova itens antes de
     * ser detectada. Direcao: validacao previa + contador de processados.
     */
    // endregion [F018]
    // ============================================================================
    // region [F019] 10_AMPLIACAO_V2/GUIA_V2_18_FONTES_VALIDACAO.java
    // BUSCA: GUIA V2 18 FONTES VALIDACAO
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_18_FONTES_VALIDACAO.java
    // ============================================================================
    /*
     * GUIA V2 18 - FONTES, COBERTURA E LIMITES DA VERSAO AMPLIADA
     *
     * ORIGEM DAS PARTES
     * A) Repertorio anterior: 190 arquivos Java do ZIP entregue nesta conversa.
     *    Todos foram conservados byte a byte na arvore do ZIP ampliado.
     * B) Conteudo baseado nos PDFs: mantido nas pastas BF/BL/BP/LF/FF/R e nos guias.
     *    As solucoes sao autorais; nao sao gabaritos oficiais da professora.
     * C) Codigo/duvidas do chat: App, Pedido, Function, Predicate, referencias,
     *    recursao e sentinelas, como ja identificados nos materiais anteriores.
     * D) Ampliacao V2: 40 blocos novos de referencia (V2_01..V2_40), guias e testes.
     *    Sao VARIANTES AUTORAIS; nao foram apresentados como questoes dos PDFs.
     *
     * FONTES PRIMARIAS CONSULTADAS PARA CONFERIR CONCEITOS COMPLEMENTARES
     * Consultadas em 25/10/2026. Os links sao referencias, nao dependencias para ler.
     *
     * Function: entrada/saida e apply
     * https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
     * Predicate: teste booleano, test, and/or/negate
     * https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
     * Comparator: criterio externo e sinal do retorno de compare
     * https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
     * Avaliacao de return e termino de chamada
     * https://docs.oracle.com/javase/specs/jls/se8/html/jls-14.html#jls-14.17
     * Argumentos e referencias passadas por valor
     * https://docs.oracle.com/javase/tutorial/java/javaOO/arguments.html
     * Exercicios classicos de pilha/fila (duplicar, trocar topo, reversao)
     * https://algs4.cs.princeton.edu/13stacks/
     * Exercicios de cadeias, contagem, maior e versoes recursivas
     * https://www.cs.princeton.edu/courses/archive/spr03/cs126/exercises/link.html
     *
     * Os novos algoritmos, textos, exemplos e testes foram escritos para este material.
     * Fontes externas confirmam conceitos; nao garantem que esses exercicios cairao.
     * As variantes mais longas sao extensoes do raciocinio, nao copias de editoriais.
     *
     * TESTES EXECUTADOS NESTA EDICAO
     * Compilacao do acervo anterior: javac --release 8 -encoding UTF-8.
     * Suite anterior reexecutada: 348458 verificacoes passaram.
     * Suite nova TestesAmpliacoesV2: 1464521 verificacoes passaram.
     * Total de verificacoes dessas duas suites: 1812979.
     * Uma verificacao e uma assercao, nao um exercicio diferente.
     *
     * O QUE OS TESTES NOVOS EXERCITAM
     * Intervalos, todos os pares de troca em cadeias pequenas aleatorias, grupos k,
     * remocao da ultima ocorrencia, ordem de pilhas, preservacao da origem,
     * identidade de celulas nas operacoes sem novas alocacoes, empates estaveis,
     * limites invalidos, callbacks nulos, sem aprovados, duas sentinelas e circular.
     * Sementes aleatorias fixas para permitir repetir os resultados.
     *
     * O QUE NAO SE DEVE CONCLUIR DOS TESTES
     * Nao provam corretude para todo programa, toda entrada ou todo contrato possivel.
     * Nao afirmam que qualquer algoritmo recursivo suporta profundidade ilimitada.
     * Nao verificam integracao com classes Produto/ItemDePedido que nao foram entregues
     * como projeto completo compilavel. AppExplicita usa modelo independente declarado.
     * Nao conferem regras de consulta da avaliacao; siga as regras da professora.
     *
     * ARQUIVO UNICO
     * O mestre incorpora cada arquivo do acervo, com indice e secao por origem.
     * Imports/packages internos mudam de forma mecanica para classes agrupadoras.
     * As suites anteriores e novas tambem sao executadas nessa versao consolidada,
     * para verificar que a reorganizacao nao mudou os resultados testados.
     */
    // endregion [F019]
    // ============================================================================
    // region [F020] 10_AMPLIACAO_V2/GUIA_V2_19_SAIDAS_PRONTAS_SEM_EXECUTAR.java
    // BUSCA: GUIA V2 19 SAIDAS PRONTAS SEM EXECUTAR
    // ORIGEM_NO_ACERVO: 10_AMPLIACAO_V2/GUIA_V2_19_SAIDAS_PRONTAS_SEM_EXECUTAR.java
    // ============================================================================
    /*
     * GUIA V2 19 - SAIDAS REAIS JA EXECUTADAS, PARA LER SEM JDK
     * BUSCA: rastro resultado println chamadas esperando retorno App media filtro.
     * ORIGEM: saidas capturadas das demonstracoes autorais V2 nesta geracao.
     *
     * APP EXPLICITA
     * Fonte: AppExplicita. Pedidos na ordem 80,250,120,500.
     * Media dos tres primeiros = (80+250+120)/3 = 150.
     * Filtro >=100 entre os tres primeiros = pedidos 2 e 3, nao pedido4.
     * Ordenacao consulta todos e produz 80,120,250,500.
     * A fila original permanece com quatro pedidos.
     *
     * Media dos primeiros 3: 150.0
     * Filtrados entre os 3 primeiros; minimo 100:
     * Pedido 2 / valor 250.0
     * Pedido 3 / valor 120.0
     * Todos ordenados por valor:
     * Pedido 1 / valor 80.0
     * Pedido 3 / valor 120.0
     * Pedido 2 / valor 250.0
     * Pedido 4 / valor 500.0
     * Original continua com 4 pedidos.
     *
     * RECURSAO RASTREADA
     * Fonte: RecursaoRastreada. Cadeia 10 -> 20 -> 30 -> null.
     * Os recuos indicam chamadas diferentes, cada uma com seus parametros.
     * ENTRA nao significa que a chamada anterior terminou.
     * RETOMA so aparece depois que a chamada filha devolve o resultado.
     *
     * === CONTAR: 1 + resultado ===
     * ENTRA contar(celula 10)
     * ESPERA: resposta = contar(proxima)
     *   ENTRA contar(celula 20)
     *   ESPERA: resposta = contar(proxima)
     *     ENTRA contar(celula 30)
     *     ESPERA: resposta = contar(proxima)
     *       ENTRA contar(null)
     *       BASE: devolve 0 e termina ESTA chamada
     *     RETOMA celula 30: resposta = 0
     *     DEVOLVE 1 + 0 = 1
     *   RETOMA celula 20: resposta = 1
     *   DEVOLVE 1 + 1 = 2
     * RETOMA celula 10: resposta = 2
     * DEVOLVE 1 + 2 = 3
     * FINAL: 3
     * === CONTER: repassar boolean ===
     * ENTRA contem(celula 10, 30)
     *   ENTRA contem(celula 20, 30)
     *     ENTRA contem(celula 30, 30)
     *     ACHOU: true
     *   REPASSE em celula 20: true
     * REPASSE em celula 10: true
     * FINAL: true
     * === OBTER: repassar item ===
     * ENTRA obter(celula 10, pos=2)
     *   ENTRA obter(celula 20, pos=1)
     *     ENTRA obter(celula 30, pos=0)
     *     ENCONTROU: devolve ITEM 30
     *   REPASSE do ITEM 30 por celula 20
     * REPASSE do ITEM 30 por celula 10
     * FINAL: 30
     * === VOID: acao antes e depois ===
     * ANTES da chamada: 10
     *   ANTES da chamada: 20
     *     ANTES da chamada: 30
     *       BASE void: return; sem numero
     *     DEPOIS da chamada: 30
     *   DEPOIS da chamada: 20
     * DEPOIS da chamada: 10
     *
     * LEITURA DE UMA LINHA
     * RETOMA celula 20: resposta = 1
     * Significa: a chamada que estava com atual=20 recebeu 1 da chamada de 30.
     * Ela ainda precisa executar o seu proprio return 1+resposta, devolvendo 2.
     *
     * A CONTAGEM CONTA CELULAS, NAO SOMA 10+20+30.
     * O OBTER DEVOLVE O ITEM 30, NAO A QUANTIDADE 3.
     * O CONTEM DEVOLVE TRUE, NAO UMA FILA COM OS APROVADOS.
     * O VOID IMPRIME NA IDA E NA VOLTA, MAS NAO DEVOLVE UM NUMERO.
     */
    // endregion [F020]
    // ============================================================================
    // region [F021] 00_COMECE_AQUI/00_LEIA_PRIMEIRO.java
    // BUSCA: 00 LEIA PRIMEIRO
    // ORIGEM_NO_ACERVO: 00_COMECE_AQUI/00_LEIA_PRIMEIRO.java
    // ============================================================================
    /*
     * ============================================================================
     * COMECE AQUI - CONSULTA 100% JAVA NO VS CODE
     * ============================================================================
     *
     *
     * ESTE ZIP FOI ORGANIZADO PARA SER LIDO SOMENTE NO VS CODE.
     * Nao ha HTML, PDF, Markdown, JSON, JAR, imagens ou scripts a abrir. Os guias,
     * indices, fontes, rastros e simulados tambem estao dentro de arquivos.java.
     *
     * COMO USAR SEM EXECUTAR NADA
     * 1. Descompacte a pasta antes da prova e abra a PASTA INTEIRA no VS Code.
     * 2. Deixe o explorador de arquivos aberto do lado esquerdo.
     * 3. Pastas numeradas separam os assuntos. Cada pasta tem um indice00.
     * 4. Ctrl+P: digite parte do nome, como FF10, R23 ou Predicate.
     * 5. Ctrl+Shift+F: busque no conteudo da pasta inteira, como removerTodos ou
     *    caso-base. Ctrl+F busca apenas no arquivo atual.
     * 6. Dentro de uma ficha, procure SOLUCAO_PEDIDA_AQUI para ir direto aos metodos.
     * No Mac os atalhos usuais equivalentes usam Command em vez de Ctrl.
     *
     * NAO PRECISA INSTALAR EXTENSAO, JDK OU OUTRO PROGRAMA PARA LER ESTES ARQUIVOS.
     * Para compilar/executar os exemplos, ai sim precisa de Java/JDK ja disponivel.
     * A consulta nao depende de executar nada: rastros e resultados estao escritos.
     *
     * PASTAS
     * 00_COMECE_AQUI              indices, consulta rapida, comandos e busca
     * 01_FUNDAMENTOS              referencias, generics, sentinelas, estruturas
     * 02_RECURSAO                 chamadas, espera, return, casos-base e rastros
     * 03_PADROES_REUTILIZAVEIS    16 modelos para adaptar problemas novos
     * 04_EXERCICIOS_DOS_PDFS      64 fichas, uma para cada questao
     * 05_CLASSICOS_PESQUISADOS    20 classicos/variacoes complementares
     * 06_APP_FUNCTION_PREDICATE   ligacao entre App e Fila, demo completa
     * 07_RASTROS_ORDENACAO        todas as etapas de R18/R19/R20/R22 e bugs R04/R09
     * 08_SIMULADOS                3 simulados, com enunciados/gabaritos separados
     * 09_FONTES_E_VALIDACAO       creditos e relato dos testes realizados
     * src/aed                    classes reutilizaveis e exemplos executaveis
     *
     * DOIS TIPOS DE ARQUIVO JAVA
     * - Guias: somente comentarios. Sao feitos para leitura, nao tem main.
     * - Implementacoes/fichas: explicacao no cabecalho e codigo Java de verdade.
     *   As fichas usam uma classe externa com nome da questao e uma classe interna
     *   Fila/Lista/Pilha para evitar conflitos e permitir compilar tudo junto.
     *   O codigo reutilizavel normal esta em src/aed, com packages.
     *
     * PARA COPIAR PARA O TEMPLATE
     * Nao cole o arquivo inteiro por cima da classe da professora. Copie o metodo
     * pedido e os auxiliares necessarios, adapte os nomes dos campos e preserve as
     * restricoes. A embalagem public static class Fila da ficha nao faz parte da
     * assinatura que voce precisa inserir na classe Fila real.
     *
     * Nao troque frente/tras por inicio/fim pela metade. Nao adicione parametros a
     * recursivo com assinatura fixa. Nao use setItem quando item e final. Nao crie
     * celulas quando a questao exige reaproveitamento. Veja05_COMO_ADAPTAR.java.
     *
     * IMPORTANTE
     * Guarde a pasta LOCALMENTE: subir ao GitHub nao garante acesso offline.
     * Use na avaliacao apenas dentro das regras de consulta autorizadas.
     * Este material e de estudo, nao um gabarito oficial ou previsao da prova.
     */
    // endregion [F021]
    // ============================================================================
    // region [F022] 00_COMECE_AQUI/01_BUSQUE_PELO_ENUNCIADO.java
    // BUSCA: 01 BUSQUE PELO ENUNCIADO
    // ORIGEM_NO_ACERVO: 00_COMECE_AQUI/01_BUSQUE_PELO_ENUNCIADO.java
    // ============================================================================
    /*
     * ============================================================================
     * QUAL ARQUIVO ABRIR PARA CADA PEDIDO
     * ============================================================================
     *
     *
     * PEDIDO DO ENUNCIADO                         ARQUIVOS PARA BUSCAR COM CTRL+P
     *
     * Contar todos os itens                      FF04, BF02, BL04, BP02
     * Contar repeticoes de um item               LF03
     * Verificar se existe                       FF05, LF04, BF03
     * Quantos elementos estao antes              FF10, BF04
     * Consultar posicao recursivamente           R01_ObterItem
     * Maior item recursivo                       R06_MaiorRecursivo
     * Copiar fila                               BF05, FF12
     * Copiar lista                              LF09_Clone
     * Copiar k primeiros da pilha                P15_SubPilha
     * Copiar itens antes/depois do alvo          P13, P14
     * Inverter fila atual                       FF09_Inverter
     * Inverter sem anterior                     P12_InverterSemAnterior
     * Retornar copia invertida                  FF07, LF06
     * Inverter pilha                            BP03_Inverter
     * Inverter dupla sem setItem/sem new         R13_InverterDupla
     * Mesclar alternadamente                    FF08, LF05
     * Mesclar duas invertidas                   LF08_MesclarInvertidas
     * Concatenar preservando origem             BF01, BP01
     * Concatenar dupla em O(1), consumir outra   R16_ConcatenarDupla
     * Dividir por POSICOES pares/impares         FF13, BF06
     * Dividir ao meio reaproveitando nos         R08_DividirAoMeio
     * Mover prefixo ao final/rotacionar          R07_Rotacionar
     * Retirar menores e preservar ordem         R02_ExtrairMenores
     * Remover primeira ocorrencia               BL03_RemoverValor
     * Remover todas na simples                  LF11_RemoverTodos
     * Remover todas na dupla                    R14_RemoverTodosDupla
     * Remover fim da dupla                      R11_RemoverFimDupla
     * Inserir em posicao da dupla               R12_InserirDupla
     * Trocar dois primeiros                     R09_TrocarPrimeiros
     * Trocar duas ocorrencias                   BL06_Trocar
     * Construtor por array                      FF01_ConstrutorArray
     * Construtor por pilha                      FF02_ConstrutorPilha
     * Merge de dois arrays ordenados            FF11_DoisArraysOrdenados
     * Lista a partir de filas ordenadas         LF01_ConstrutorFilasOrdenadas
     * Dupla a partir de fila preservada         R17_ConstrutorDuplaFila
     * Inserir ordenadamente                     LF10_InserirEmOrdem
     * Merge de listas com copia                 R05_IntercalarOrdenadas
     * Merge reaproveitando nos                  C11_MergeNos
     * Fila usando duas pilhas                   R03_PseudoFila, C20
     * Pilha usando duas filas                   FF14_PseudoPilha
     * Palindromo de frase                       BP04, C04
     * Palindromo da lista dupla                 R15_PalindromoDupla
     * Media com Function                        A02_MediaFunction
     * Filtrar com Predicate                     A03_FiltroPredicate
     * App onde declara e chama as funcoes       A01_AppCompleta
     * Mergesort em lista                        R23_OrdenarLista
     * Rastro de ordenacao                       pasta07 e R18/R19/R20/R22
     * Escolher algoritmo e justificar           R21_EscolherAlgoritmo
     * Ciclo, meio, k-esimo do fim                C06, C07, C08, C09, C10
     * Proximo maior/pilha monotona              C17_ProximoMaior
     * Minimo em pilha                           C19_PilhaMinima
     *
     * Se nao encontrar igual: primeiro identifique o verbo (consultar,copiar,remover,
     * transferir,ordenar), o retorno e a restricao. Combine modelos da pasta03.
     */
    // endregion [F022]
    // ============================================================================
    // region [F023] 00_COMECE_AQUI/02_CONSULTA_RAPIDA.java
    // BUSCA: 02 CONSULTA RAPIDA
    // ORIGEM_NO_ACERVO: 00_COMECE_AQUI/02_CONSULTA_RAPIDA.java
    // ============================================================================
    /*
     * ============================================================================
     * LEMBRETES ANTES DE ESCREVER O CODIGO
     * ============================================================================
     *
     *
     * TIPOS: aux e Celula<E>; aux.getItem() e E; aux.getProximo() e Celula<E>.
     * Atribuir uma referencia nao cria acompanhamento automatico entre variaveis.
     *
     * FILA: frente e S, primeiro dado frente.proximo, ultimo tras, vazio frente==tras.
     * PILHA dos slides: primeiro dado topo, fim sentinela fundo, vazio topo==fundo.
     * LISTA: primeiro/inicio e S; ultimo/fim e ultimo dado; pos0 depois de S.
     * DUPLA: S.anterior=null;fim.proximo=null;primeiroDado.anterior=S.
     *
     * PERDAS DE REFERENCIA
     * Antes de religar atual.proximo, salve o proximo original se ainda vai usa-lo.
     * Ao remover todos, anterior nao avanca no ramo que remove.
     * Ao remover unico, restaure extremo final para S.
     * Ao inverter, antigo primeiro vira ultimo.
     *
     * RECURSAO
     * contar:null->0;return1+rec(proximo).
     * contem:null->false;achou->true;senao return rec(proximo).
     * quantos antes:achou->0;null->excecao;return1+rec(proximo).
     * obter pos:pos0->item;rec(proximo,pos-1);invalida->excecao.
     * maior:ultima celula->item;compare atual com maiorResto.
     * Acao antes da chamada:ordem original;depois:ordem reversa.
     *
     * Nao ha uma 'referencia que volta': a pilha de chamadas guarda execucoes pendentes.
     * return1+f(...) espera f devolver, soma1 e termina a chamada atual.
     * return f(...) espera e repassa. f(...);return0 descarta o filho e devolve0.
     *
     * COMPARAR
     * == entre celulas testa identidade. equals testa igualdade dos itens.
     * compareTo<0/==0/>0 testa ordem. Resultado nao precisa ser exatamente-1/1.
     * new Fila cria estrutura NOVA E VAZIA. Passar fila como argumento nao a clona.
     *
     * FUNCTION/PREDICATE
     * App define:p->p.valorFinal() ou p->p.valorFinal()>=minimo.
     * Fila aplica:extrator.apply(item),condicao.test(item).
     * Quantidade no filtro deste acervo=EXAMINADOS,nao APROVADOS.
     * Media exige quantidade>0. Soma precisa usar o retorno de apply.
     *
     * TESTES MINIMOS
     * Vazio;um;dois;muitos;primeiro;ultimo;ausente;repetidos juntos;todosiguais;
     * k0;kexato;kinvalido;outra==this;origem preservada;inserir apos esvaziar.
     *
     * LEIA O CONTRATO
     * Pode usar laco? Pode criar no? Pode destruir entrada? Precisa ser estavel?
     * Pode acrescentar parametro? Qual assinatura? Existe helper que voce quer chamar?
     * Sair com valores certos mas violar uma dessas restricoes ainda pode estar errado.
     */
    // endregion [F023]
    // ============================================================================
    // region [F024] 00_COMECE_AQUI/03_COMO_COMPILAR_SE_HOUVER_JDK.java
    // BUSCA: 03 COMO COMPILAR SE HOUVER JDK
    // ORIGEM_NO_ACERVO: 00_COMECE_AQUI/03_COMO_COMPILAR_SE_HOUVER_JDK.java
    // ============================================================================
    /*
     * ============================================================================
     * LER NAO EXIGE EXECUTAR
     * ============================================================================
     *
     *
     * Para CONSULTAR: abra os arquivos no VS Code. Nada precisa ser instalado.
     * Guias que contem somente comentarios nao possuem main e nao precisam executar.
     *
     * Para EXECUTAR, quando houver JDK:
     *   java -version
     *   javac -version
     * O acervo usa sintaxe/APIs compativeis com Java8 ou superior.
     *
     * Windows PowerShell, no terminal da PASTA RAIZ:
     *   $fontes = Get-ChildItem -Recurse -Filter *.java | ForEach-Object FullName
     *   javac -encoding UTF-8 -d out $fontes
     *   java -cp out aed.testes.Testes
     *
     * macOS/Linux, na PASTA RAIZ:
     *   find . -name '*.java' > fontes.txt
     *   javac -encoding UTF-8 -d out @fontes.txt
     *   java -cp out aed.testes.Testes
     *
     * Esses comandos geram temporariamente fontes.txt/out no seu computador. O ZIP
     * entregue contem APENAS.java. Nao precisa fazer isso para ler durante a prova.
     *
     * DEMOS:
     *   java -cp out aed.app.AppPedidos
     *   java -cp out aed.app.AppPedidos --interativo
     *   java -cp out aed.app.RecursaoPassoAPasso
     *
     * O fonte central tem package e fica em src/aed. Preserve suas pastas. As fichas
     * fora de src usam nomes unicos e classes internas, para compilar tudo junto.
     * Nao coloque Fila de aed.base e Fila de aed.revisao no mesmo pacote: sao variantes.
     *
     * Se extensao Java do VS Code nao reconhecer automaticamente as pastas como um
     * projeto, isso nao impede ler os arquivos. A compilacao direta pelos comandos
     * acima considera todos os fontes, sem Maven, Gradle ou extensoes extras.
     *
     * javac nao encontrado = JDK/PATH do ambiente, nao erro do seu algoritmo.
     * Could not find main class = classpath/pacote errado ou compilacao nao feita.
     * cannot find symbol = nome/import/helper ausente.
     * StackOverflowError = recursao sem progresso ou profunda demais.
     */
    // endregion [F024]
    // ============================================================================
    // region [F025] 00_COMECE_AQUI/04_MAPA_COMPLETO.java
    // BUSCA: 04 MAPA COMPLETO
    // ORIGEM_NO_ACERVO: 00_COMECE_AQUI/04_MAPA_COMPLETO.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE DE TODAS AS FICHAS
     * ============================================================================
     *
     * 64 QUESTOES DOS PDFs
     *
     * BF01 - Concatenar duas filas
     *   04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF01_Concatenar.java
     *
     * BF02 - Quantidade de itens da fila
     *   04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF02_Contar.java
     *
     * BF03 - Existencia por igualdade
     *   04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF03_Existe.java
     *
     * BF04 - Contar anteriores ao alvo
     *   04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF04_QuantosAfrente.java
     *
     * BF05 - Copia estrutural da fila
     *   04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF05_Copiar.java
     *
     * BF06 - Separar posicoes pares e impares
     *   04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF06_Dividir.java
     *
     * BL01 - Inserir no final
     *   04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL01_InserirFinal.java
     *
     * BL02 - Retirar primeiro dado
     *   04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL02_RemoverInicio.java
     *
     * BL03 - Retirar primeira ocorrencia
     *   04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL03_RemoverValor.java
     *
     * BL04 - Contar lista sem incluir sentinela
     *   04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL04_Contar.java
     *
     * BL05 - Consultar posicao
     *   04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL05_Localizar.java
     *
     * BL06 - Trocar dois itens de lugar
     *   04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL06_Trocar.java
     *
     * BP01 - Concatenar pilhas com ordem declarada
     *   04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP01_Concatenar.java
     *
     * BP02 - Contar pilha com fundo sentinela
     *   04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP02_Contar.java
     *
     * BP03 - Inverter pilha por links ou recursao
     *   04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP03_Inverter.java
     *
     * BP04 - String palindromo usando pilha de celulas
     *   04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP04_Palindromo.java
     *
     * LF01 - Construtor com duas filas ordenadas
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF01_ConstrutorFilasOrdenadas.java
     *
     * LF02 - Unir lista e pilha na ordem de insercao
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF02_UnirPilha.java
     *
     * LF03 - Contar ocorrencias recursivas
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF03_ContarOcorrencias.java
     *
     * LF04 - Contem recursivo
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF04_Contem.java
     *
     * LF05 - Mesclar listas alternadas
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF05_Mesclar.java
     *
     * LF06 - Nova lista invertida preservando origem
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF06_CopiaInvertida.java
     *
     * LF07 - Inverter lista atual
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF07_Inverter.java
     *
     * LF08 - Intercalar duas listas invertidas
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF08_MesclarInvertidas.java
     *
     * LF09 - Clone estrutural
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF09_Clone.java
     *
     * LF10 - Insercao em lista ordenada
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF10_InserirEmOrdem.java
     *
     * LF11 - Remover todas as ocorrencias
     *   04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF11_RemoverTodos.java
     *
     * FF01 - Construtor de fila por array
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF01_ConstrutorArray.java
     *
     * FF02 - Construtor por pilha preservada
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF02_ConstrutorPilha.java
     *
     * FF03 - Uniao preservando fila atual
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF03_Unir.java
     *
     * FF04 - Contar dados com recursao
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF04_ContagemRecursiva.java
     *
     * FF05 - Pesquisa booleana recursiva
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF05_ContemRecursivo.java
     *
     * FF06 - Inverter a fila recebida
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF06_InverterRecebida.java
     *
     * FF07 - Devolver fila invertida sem destruir this
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF07_CopiaInvertida.java
     *
     * FF08 - Alternar duas filas
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF08_Mesclar.java
     *
     * FF09 - Inverter fila em quatro versoes
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF09_Inverter.java
     *
     * FF10 - Quantos antes do alvo com retorno int
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF10_QuantosAfrente.java
     *
     * FF11 - Construtor com merge de dois arrays
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF11_DoisArraysOrdenados.java
     *
     * FF12 - Criar copia exata da fila
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF12_Copiar.java
     *
     * FF13 - Dividir pelos indices originais
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF13_Dividir.java
     *
     * FF14 - Pilha usando filas
     *   04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF14_PseudoPilha.java
     *
     * R01 - Obter posicao recursivamente
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R01_ObterItem.java
     *
     * R02 - Separar menores mantendo ordem
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R02_ExtrairMenores.java
     *
     * R03 - Fila com duas pilhas e custo amortizado
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R03_PseudoFila.java
     *
     * R04 - Desenfileirar com tras incorreto
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R04_CorrigirTras.java
     *
     * R05 - Merge copiador e estavel
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R05_IntercalarOrdenadas.java
     *
     * R06 - Maior item sem parametro extra
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R06_MaiorRecursivo.java
     *
     * R07 - Mover prefixo sem copiar celulas
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R07_Rotacionar.java
     *
     * R08 - Partir cadeia reaproveitando nos
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R08_DividirAoMeio.java
     *
     * R09 - Trocar dois primeiros e corrigir fim
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R09_TrocarPrimeiros.java
     *
     * R10 - Tabela de custos simples versus dupla
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R10_CustosSimplesDupla.java
     *
     * R11 - Remover ultimo da dupla
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R11_RemoverFimDupla.java
     *
     * R12 - Inserir em posicao na dupla
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R12_InserirDupla.java
     *
     * R13 - Inverter dupla preservando sentinela
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R13_InverterDupla.java
     *
     * R14 - Remover ocorrencias na dupla
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R14_RemoverTodosDupla.java
     *
     * R15 - Comparar extremos da dupla
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R15_PalindromoDupla.java
     *
     * R16 - Transferir outra dupla em O(1)
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R16_ConcatenarDupla.java
     *
     * R17 - Dupla por fila preservando ordem
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R17_ConstrutorDuplaFila.java
     *
     * R18 - Arvore e ultima intercalacao do Mergesort
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R18_MergeSort.java
     *
     * R19 - Heapsort base um e trocas
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R19_HeapSort.java
     *
     * R20 - Quick pivo final versus central
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R20_QuickSort.java
     *
     * R21 - Escolha justificada de ordenacao
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R21_EscolherAlgoritmo.java
     *
     * R22 - Particionar nao e ordenar
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R22_Lomuto.java
     *
     * R23 - Mergesort recursivo da lista
     *   04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R23_OrdenarLista.java
     *
     * CLASSICOS, MODELOS E INTEGRACAO
     *
     * C01 - Balanceamento de parenteses/chaves/colchetes
     *   05_CLASSICOS_PESQUISADOS/C01_Delimitadores.java
     *
     * C02 - Avaliar expressao posfixa
     *   05_CLASSICOS_PESQUISADOS/C02_Posfixa.java
     *
     * C03 - Converter inteiro para binario
     *   05_CLASSICOS_PESQUISADOS/C03_Binario.java
     *
     * C04 - Frase palindromo com fila e pilha
     *   05_CLASSICOS_PESQUISADOS/C04_Palindromo.java
     *
     * C05 - Reverse Linked List iterativo e recursivo
     *   05_CLASSICOS_PESQUISADOS/C05_InverterCadeia.java
     *
     * C06 - Linked List Cycle
     *   05_CLASSICOS_PESQUISADOS/C06_DetectarCiclo.java
     *
     * C07 - Encontrar entrada do ciclo
     *   05_CLASSICOS_PESQUISADOS/C07_InicioDoCiclo.java
     *
     * C08 - Encontrar meio com dois cursores
     *   05_CLASSICOS_PESQUISADOS/C08_Meio.java
     *
     * C09 - Consultar k-esimo do fim
     *   05_CLASSICOS_PESQUISADOS/C09_KDoFim.java
     *
     * C10 - Remover n-esimo a partir do final
     *   05_CLASSICOS_PESQUISADOS/C10_RemoverKDoFim.java
     *
     * C11 - Intercalar cadeias reaproveitando nos
     *   05_CLASSICOS_PESQUISADOS/C11_MergeNos.java
     *
     * C12 - Eliminar duplicados consecutivos
     *   05_CLASSICOS_PESQUISADOS/C12_DuplicadosOrdenados.java
     *
     * C13 - Eliminar repetidos sem ordenar
     *   05_CLASSICOS_PESQUISADOS/C13_DuplicadosNaoOrdenados.java
     *
     * C14 - Particionar lista mantendo ordem interna
     *   05_CLASSICOS_PESQUISADOS/C14_ParticaoEstavel.java
     *
     * C15 - Inverter somente os primeiros k da fila
     *   05_CLASSICOS_PESQUISADOS/C15_InverterPrefixo.java
     *
     * C16 - Josephus com fila
     *   05_CLASSICOS_PESQUISADOS/C16_Josephus.java
     *
     * C17 - Proximo maior com pilha monotona
     *   05_CLASSICOS_PESQUISADOS/C17_ProximoMaior.java
     *
     * C18 - Validar sequencia de desempilhamento
     *   05_CLASSICOS_PESQUISADOS/C18_SaidaDePilha.java
     *
     * C19 - Minimo em tempo constante
     *   05_CLASSICOS_PESQUISADOS/C19_PilhaMinima.java
     *
     * C20 - Fila por duas pilhas
     *   05_CLASSICOS_PESQUISADOS/C20_FilaDuasPilhas.java
     *
     * P01 - Contagem por Predicate
     *   03_PADROES_REUTILIZAVEIS/P01_ContarSe.java
     *
     * P02 - Soma recursiva por Function
     *   03_PADROES_REUTILIZAVEIS/P02_SomarFunction.java
     *
     * P03 - Pelo menos um satisfaz
     *   03_PADROES_REUTILIZAVEIS/P03_Algum.java
     *
     * P04 - Todos satisfazem
     *   03_PADROES_REUTILIZAVEIS/P04_Todos.java
     *
     * P05 - Ausencia com marcador -1
     *   03_PADROES_REUTILIZAVEIS/P05_IndiceOuMenosUm.java
     *
     * P06 - Ultima ocorrencia recursiva
     *   03_PADROES_REUTILIZAVEIS/P06_UltimoIndice.java
     *
     * P07 - Copiar cadeia devolvendo cabeca
     *   03_PADROES_REUTILIZAVEIS/P07_CopiarNos.java
     *
     * P08 - Filtro recursivo preservando ordem
     *   03_PADROES_REUTILIZAVEIS/P08_FiltrarNos.java
     *
     * P09 - Remocao recursiva devolvendo cabeca
     *   03_PADROES_REUTILIZAVEIS/P09_RemoverNos.java
     *
     * P10 - Montar resultado na volta
     *   03_PADROES_REUTILIZAVEIS/P10_CopiarNaVolta.java
     *
     * P11 - Copiador dos objetos E
     *   03_PADROES_REUTILIZAVEIS/P11_CopiarComFuncao.java
     *
     * P12 - Inverter fila sem variavel anterior
     *   03_PADROES_REUTILIZAVEIS/P12_InverterSemAnterior.java
     *
     * P13 - Copiar anteriores ao alvo
     *   03_PADROES_REUTILIZAVEIS/P13_CopiarAntes.java
     *
     * P14 - Copiar posteriores ao alvo
     *   03_PADROES_REUTILIZAVEIS/P14_CopiarDepois.java
     *
     * P15 - Subpilha mantendo ordem e original
     *   03_PADROES_REUTILIZAVEIS/P15_SubPilha.java
     *
     * P16 - Devolver objeto com maior valor extraido
     *   03_PADROES_REUTILIZAVEIS/P16_MaiorPorExtrator.java
     *
     * A01 - App executavel com Function e Predicate
     *   06_APP_FUNCTION_PREDICATE/A01_AppCompleta.java
     *
     * A02 - Function extrai o valor, Fila percorre
     *   06_APP_FUNCTION_PREDICATE/A02_MediaFunction.java
     *
     * A03 - Predicate escolhe quem entra na copia
     *   06_APP_FUNCTION_PREDICATE/A03_FiltroPredicate.java
     *
     * A04 - Contar aprovados sem criar outra fila
     *   06_APP_FUNCTION_PREDICATE/A04_ContarPredicate.java
     *
     * A05 - PedidoDemo, equals e compareTo
     *   06_APP_FUNCTION_PREDICATE/A05_ModeloPedido.java
     *
     * A06 - Programa para observar as chamadas
     *   06_APP_FUNCTION_PREDICATE/A06_RecursaoConsole.java
     */
    // endregion [F025]
    // ============================================================================
    // region [F026] 00_COMECE_AQUI/05_COMO_ADAPTAR.java
    // BUSCA: 05 COMO ADAPTAR
    // ORIGEM_NO_ACERVO: 00_COMECE_AQUI/05_COMO_ADAPTAR.java
    // ============================================================================
    /*
     * ============================================================================
     * TRANSPLANTAR METODO SEM QUEBRAR O TEMPLATE
     * ============================================================================
     *
     *
     * 1. Compare campos: frente/tras ou inicio/fim? Pilha tem fundo ou apenas topo?
     * 2. Confira a celula: item final? Existe setItem? Proximo e null no ultimo?
     * 3. Copie a assinatura exigida, inclusive ordem de parametros e retorno.
     * 4. Localize SOLUCAO_PEDIDA_AQUI na ficha e copie o corpo relevante.
     * 5. Confira auxiliares chamados. Inclua somente os permitidos, com corpo real.
     * 6. Se a classe real nao possui tamanho, nao cole tamanho++ sem adaptar.
     * 7. Se compareTo e necessario, confirme E extends Comparable<E> ou criterio dado.
     * 8. Nao copie a embalagem externa BFxx/Rxx nem a declaracao static da classe
     *    interna para dentro da classe real da professora.
     * 9. Se a restricao e usar somente API publica, nao acesse private de outra classe.
     *    Uma classe pode acessar private de OUTRA instancia da MESMA classe; a App
     *    nao pode acessar private da Fila.
     * 10. Teste vazio/unico e reutilizacao depois de esvaziar antes de testar entradas grandes.
     *
     * Acervo possui metodos extras como toArray e estruturaValida para demonstracao.
     * Eles NAO foram fornecidos necessariamente na prova. Os testes tambem usam
     * reflexao para conferir identidade dos nos; nao use isso como solucao do exercicio.
     *
     * As fichas teoricas e rastros sao comentarios. As fichas com implementacao trazem
     * Java ativo com os helpers necessarios, e todos os arquivos foram compilados
     * juntos. Isso nao significa que qualquer fragmento colado sozinho tenha todos
     * os campos/imports necessarios.
     */
    // endregion [F026]
    // ============================================================================
    // region [F027] 00_COMECE_AQUI/06_MAPA_DE_METODOS.java
    // BUSCA: 06 MAPA DE METODOS
    // ORIGEM_NO_ACERVO: 00_COMECE_AQUI/06_MAPA_DE_METODOS.java
    // ============================================================================
    /*
     * ============================================================================
     * ASSINATURAS DO CODIGO CENTRAL
     * ============================================================================
     *
     * src/aed/app/AppPedidos.java
     *   public static void finalizarPedido(PedidoDemo pedido)
     *   public static void mostrarMediaPedidos(int quantidade)
     *   public static void mostrarPedidosFiltrados(int quantidade, double minimo)
     *   public static void demonstrar()
     *   public static void main(String[] args)
     *
     * src/aed/app/PedidoDemo.java
     *   public PedidoDemo(int id, double valor)
     *   public int getId()
     *   public double valorFinal()
     *   @Override public int compareTo(PedidoDemo outro)
     *   @Override public boolean equals(Object o)
     *   @Override public int hashCode()
     *   @Override public String toString()
     *
     * src/aed/app/RecursaoPassoAPasso.java
     *   public static int contar(Celula<Integer> atual, String margem)
     *   public static void main(String[] args)
     *
     * src/aed/base/Celula.java
     *   public Celula()
     *   public Celula(E item)
     *   public Celula(E item, Celula<E> proximo)
     *   public E getItem()
     *   public Celula<E> getProximo()
     *   public void setProximo(Celula<E> proximo)
     *
     * src/aed/base/CelulaDupla.java
     *   public CelulaDupla()
     *   public CelulaDupla(E item)
     *   public E getItem()
     *   public void setItem(E item)
     *   public CelulaDupla<E> getAnterior()
     *   public void setAnterior(CelulaDupla<E> anterior)
     *   public CelulaDupla<E> getProximo()
     *   public void setProximo(CelulaDupla<E> proximo)
     *
     * src/aed/base/Fila.java
     *   public Fila()
     *   public Fila(E[] itens)
     *   public Fila(Pilha<E> pilha)
     *   public boolean vazia()
     *   public void enfileirar(E item)
     *   public E consultarInicio()
     *   public E desenfileirar()
     *   public int tamanho()
     *   public int obterNumeroItens()
     *   public int obterNumeroItens(Celula<E> aux)
     *   public boolean verificarExistencia(E item)
     *   public boolean contem(E item)
     *   public boolean contem(E item, Celula<E> aux)
     *   public int quantosAfrente(E item)
     *   public int quantosAfrente(Celula<E> atual, E item)
     *   public int obterNumItensAFrente(E item) throws Exception
     *   public E obterItem(int pos)
     *   public E obterItem(Celula<E> aux, int pos)
     *   public Fila<E> copiar()
     *   public void concatenar(Fila<E> outra)
     *   public Fila<E> unir(Fila<E> outra)
     *   public void mesclar(Fila<E> outra)
     *   public void inverter()
     *   public void inverterSemAnterior()
     *   public Fila<E> invertida()
     *   public Fila<E> inverterOutra(Fila<E> outra)
     *   public void inverterPorPilha()
     *   public void inverterRecursivamente()
     *   public Fila<E> dividir()
     *   public Fila<E> filtrar(Predicate<E> condicao, int quantidade)
     *   public double somarValores(Function<E, Double> extrator, int quantidade)
     *   public double calcularValorMedio(Function<E, Double> extrator, int quantidade)
     *   public int contarSe(Predicate<E> condicao, int quantidade)
     *   public E encontrarMaior(Function<E, Double> extrator)
     *   public Fila<E> itensDepoisDoAlvo(E alvo)
     *   public Fila<E> itensAntesDoAlvo(E alvo)
     *   public Object[] toArray()
     *   public boolean estruturaValida()
     *
     * src/aed/base/Lista.java
     *   public Lista()
     *   public boolean vazia()
     *   public int tamanho()
     *   public void inserirFinal(E item)
     *   public void inserir(E item, int pos)
     *   public E remover(int pos)
     *   public E removerInicio()
     *   public E remover(E itemProcurado)
     *   public E localizar(int pos)
     *   public int obterNumeroItens()
     *   public int contarQtos(E item)
     *   public int contarQtos(E item, Celula<E> aux)
     *   public boolean contem(E item)
     *   public boolean contem(E item, Celula<E> aux)
     *   public boolean removerTodos(E item)
     *   public void inverter()
     *   public Lista<E> invertida()
     *   @Override public Lista<E> clone()
     *   public void mesclar(Lista<E> outra)
     *   public Lista<E> mesclarInvertidas(Lista<E> outra)
     *   public void unir(Pilha<E> pilha)
     *   public void trocar(E xItem, E yItem)
     *   public Object[] toArray()
     *   public boolean estruturaValida()
     *
     * src/aed/base/ListaDupla.java
     *   public ListaDupla()
     *   public ListaDupla(Fila<E> fila)
     *   public boolean vazia()
     *   public int tamanho()
     *   public void inserirFim(E item)
     *   public void inserir(E item, int posicao)
     *   public E removerFim()
     *   public E remover(int pos)
     *   public boolean removerTodos(E item)
     *   public void inverter()
     *   public boolean ehPalindromo()
     *   public void concatenar(ListaDupla<E> outra)
     *   public Object[] toArray()
     *   public Object[] reversoArray()
     *   public boolean estruturaValida()
     *
     * src/aed/base/Pilha.java
     *   public Pilha()
     *   public boolean vazia()
     *   public void empilhar(E item)
     *   public E consultarTopo()
     *   public E desempilhar()
     *   public int obterNumeroItens()
     *   public int contarRecursivo()
     *   public Pilha<E> subPilha(int numItens)
     *   public Pilha<E> copiar()
     *   public void inverter()
     *   public void concatenar(Pilha<E> outra)
     *   public void inverterRecursivamente()
     *   public Object[] toArray()
     *   public boolean estruturaValida()
     *
     * src/aed/base/PseudoFila.java
     *   public boolean vazia()
     *   public void enfileirar(E item)
     *   public E desenfileirar()
     *   public E consultarInicio()
     *
     * src/aed/base/PseudoPilha.java
     *   public boolean vazia()
     *   public void empilhar(E item)
     *   public E desempilhar()
     *   public E consultarTopo()
     *
     * src/aed/classicos/Classicos.java
     *   public static boolean delimitadoresBalanceados(String texto)
     *   public static double avaliarPosfixa(String expressao)
     *   public static String binario(int n)
     *   public static boolean palindromo(String texto)
     *   public static <E> Celula<E> inverterLigacoes(Celula<E> atual)
     *   public static <E> Celula<E> inverterLigacoesRec(Celula<E> atual)
     *   public static <E> boolean temCiclo(Celula<E> inicio)
     *   public static <E> Celula<E> inicioDoCiclo(Celula<E> inicio)
     *   public static <E> Celula<E> meio(Celula<E> inicio)
     *   public static <E> E kEsimoDoFim(Celula<E> inicio, int k)
     *   public static <E> Celula<E> removerKEsimoDoFim(Celula<E> inicio, int k)
     *   public static <E extends Comparable<E>> Celula<E> intercalarNos(Celula<E> a, Celula<E> b)
     *   public static <E> Celula<E> removerDuplicadosOrdenados(Celula<E> inicio)
     *   public static <E> Celula<E> removerDuplicados(Celula<E> inicio)
     *   public static <E extends Comparable<E>> Celula<E> particionarEstavel(Celula<E> inicio, E limite)
     *   public static <E> void inverterPrimeiros(Fila<E> fila, int k)
     *   public static int josephus(int n, int m)
     *   public static int[] proximosMaiores(int[] a)
     *   public static boolean sequenciaDesempilhavel(int[] entrada, int[] saida)
     *
     * src/aed/classicos/PilhaMinima.java
     *   public boolean vazia()
     *   public void empilhar(E item)
     *   public E desempilhar()
     *   public E consultarTopo()
     *   public E minimo()
     *
     * src/aed/flexiveis/ListaOrdenada.java
     *   public void inserirEmOrdem(E item)
     *   public Object[] toArray()
     *
     * src/aed/ordenacao/Ordenacoes.java
     *   public static void trocar(int[] a, int i, int j)
     *   public static void mergeSort(int[] a)
     *   public static void quickSortCentro(int[] a)
     *   public static void quickSortUltimo(int[] a)
     *   public static int particionar(int[] a, int esq, int dir)
     *   public static void quickSortLomuto(int[] a)
     *   public static void quickSortTresVias(int[] a)
     *   public static void heapSort(int[] a)
     *   public static void heapSortBaseUm(int[] a)
     *   public static void insertionSort(int[] a)
     *   public static void selectionSort(int[] a)
     *   public static void bubbleSort(int[] a)
     *
     * src/aed/revisao/Fila.java
     *   public Fila()
     *   public Fila(E[] a, E[] b)
     *   public boolean vazia()
     *   public void enfileirar(E item)
     *   public E consultarInicio()
     *   public E desenfileirar()
     *   public E obterItem(int pos)
     *   public E obterItem(Celula<E> aux, int pos)
     *   public Fila<E> extrairMenores(E limite)
     *   public Object[] toArray()
     *   public boolean estruturaValida()
     *
     * src/aed/revisao/Lista.java
     *   public Lista()
     *   public Lista(aed.base.Fila<E> a, aed.base.Fila<E> b)
     *   public boolean vazia()
     *   public int tamanho()
     *   public void inserirFinal(E novo)
     *   public void inserir(E novo, int posicao)
     *   public E remover(int posicao)
     *   public Lista<E> intercalarOrdenadas(Lista<E> outra)
     *   public E obterMaior()
     *   public E obterMaior(Celula<E> aux)
     *   public void rotacionar(int k)
     *   public Lista<E> dividirAoMeio()
     *   public void trocarDoisPrimeiros()
     *   public void ordenar()
     *   public void inserirEmOrdem(E item)
     *   public Object[] toArray()
     *   public boolean estruturaValida()
     *
     * src/aed/testes/Testes.java
     *   public static void main(String[] args) throws Exception
     *
     * src/aed/variacoes/FilaCircular.java
     *   public FilaCircular(int capacidade)
     *   public boolean vazia()
     *   public boolean cheia()
     *   public int tamanho()
     *   public void enfileirar(E item)
     *   @SuppressWarnings("unchecked") public E desenfileirar()
     *
     * src/aed/variacoes/FilaSemSentinela.java
     *   public boolean vazia()
     *   public void enfileirar(E e)
     *   public E desenfileirar()
     *
     * src/aed/variacoes/ModelosRecursivos.java
     *   public static <E> int contarSe(Celula<E> atual, Predicate<E> condicao)
     *   public static <E> double somar(Celula<E> atual, Function<E, Double> extrator)
     *   public static <E> boolean algum(Celula<E> atual, Predicate<E> condicao)
     *   public static <E> boolean todos(Celula<E> atual, Predicate<E> condicao)
     *   public static <E> int indiceOuMenosUm(Celula<E> atual, E alvo)
     *   public static <E> int ultimoIndice(Celula<E> atual, E alvo)
     *   public static <E> Celula<E> copiarNos(Celula<E> atual)
     *   public static <E> Celula<E> filtrarNos(Celula<E> atual, Predicate<E> condicao)
     *   public static <E> Celula<E> removerTodosNos(Celula<E> atual, E alvo)
     *   public static <E> Fila<E> copiarInvertido(Celula<E> atual)
     *   public static <E> Celula<E> copiarComFuncao(Celula<E> atual, Function<E, E> copiador)
     *
     * src/aed/variacoes/PilhaSemSentinela.java
     *   public boolean vazia()
     *   public void empilhar(E item)
     *   public E consultarTopo()
     *   public E desempilhar()
     *
     * src/aed/variacoes/PilhaVetor.java
     *   public PilhaVetor(int capacidade)
     *   public boolean vazia()
     *   public void empilhar(E e)
     *   @SuppressWarnings("unchecked") public E desempilhar()
     */
    // endregion [F027]
    // ============================================================================
    // region [F028] 01_FUNDAMENTOS/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE - 01_FUNDAMENTOS
     * ============================================================================
     *
     * G01_Variavel_Objeto_Referencia.java
     * G02_Item_Versus_Proximo.java
     * G03_Sentinelas.java
     * G04_Fila_Pilha_Lista.java
     * G05_Generics_E_Tipos.java
     * G06_Construtores_Sobrecarga.java
     * G07_Equals_Comparable.java
     * G08_Tipos_De_Return.java
     * G09_Copia_Transferencia_Preservacao.java
     * G10_Lista_Simples.java
     * G11_Lista_Dupla.java
     * G12_Vetor_Circular.java
     * G13_Complexidade.java
     * G14_Erros_Do_Seu_Codigo.java
     * G15_Convencoes_Dos_PDFs.java
     *
     * Guias em comentarios Java. Exemplos completos em src/aed.
     * Nos arquivos dos PDFs, busque SOLUCAO_PEDIDA_AQUI.
     */
    // endregion [F028]
    // ============================================================================
    // region [F029] 01_FUNDAMENTOS/G01_Variavel_Objeto_Referencia.java
    // BUSCA: G01 Variavel Objeto Referencia
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G01_Variavel_Objeto_Referencia.java
    // ============================================================================
    /*
     * ============================================================================
     * VARIAVEL, OBJETO E REFERENCIA
     * ============================================================================
     *
     *
     * ABRA QUANDO: nao souber se topo e uma variavel ou uma celula.
     *
     * Celula<Integer> topo; declara uma variavel. Ela guarda uma referencia, nao um
     * numero da pilha. new Celula<>(30) cria um objeto. topo = esseObjeto faz topo
     * referenciar aquela celula. O campo item da celula guarda o Integer30.
     *
     *   topo ---------> CELULA A
     *                   item ------------> Integer 30
     *                   proximo ---------> CELULA B
     *
     * Duas variaveis podem conter a mesma referencia:
     *   Celula<Integer> aux = topo;
     *
     * Nao foi criada uma segunda celula. aux e topo passam a referenciar A.
     * Agora execute:
     *   aux = aux.getProximo();
     *
     * Somente aux passa a referenciar B. topo continua em A. A atribuicao COPIA um
     * valor de referencia; nao cria um vinculo permanente entre os nomes.
     *
     * Compare:
     *   aux = nova;                 // muda o valor da variavel local aux
     *   topo = nova;                // muda a referencia do atributo topo
     *   aux.setProximo(nova);       // altera um campo do objeto referenciado por aux
     *   E item = aux.getItem();     // le o item; nao remove nem anda na estrutura
     *
     * Java passa argumentos por valor. Para objetos, esse valor e a referencia.
     * Reatribuir um parametro nao reatribui a variavel de quem chamou. Modificar um
     * objeto atraves dessa referencia pode ser observado por outros que o referenciam.
     *
     * Null NAO e uma celula vazia. Null significa ausencia de referencia. Uma
     * sentinela criada por new Celula<>() existe mesmo tendo item null.
     *
     * TESTE: a aponta para celula10; b=a; a=new Celula<>(20).
     * Resultado: b continua na celula10. Nao acompanha a nova atribuicao a a.
     */
    // endregion [F029]
    // ============================================================================
    // region [F030] 01_FUNDAMENTOS/G02_Item_Versus_Proximo.java
    // BUSCA: G02 Item Versus Proximo
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G02_Item_Versus_Proximo.java
    // ============================================================================
    /*
     * ============================================================================
     * O CAMPO ITEM E O CAMPO PROXIMO
     * ============================================================================
     *
     *
     * ABRA QUANDO: confundir aux, aux.getItem() e aux.getProximo().
     *
     *   tipo de aux                 Celula<E>
     *   tipo de aux.getItem()       E
     *   tipo de aux.getProximo()    Celula<E>
     *
     * Se E=Pedido, item referencia um Pedido. Proximo referencia OUTRA celula,
     * nao outro Pedido diretamente. O Pedido pode possuir preco, data e produtos;
     * nenhuma dessas informacoes e descoberta automaticamente pela celula.
     *
     *   Celula<Pedido> aux = frente.getProximo();
     *   Pedido pedido = aux.getItem();
     *   double valor = pedido.valorFinal();
     *
     * Navegar nao e alterar:
     *   aux.getProximo();           // calcula/devolve a referencia; ignora resultado
     *   aux = aux.getProximo();     // guarda essa referencia em aux; agora anda
     *
     * Insercao no topo:
     *   Celula<E> nova = new Celula<>(item, topo);
     *   topo = nova;
     *
     * O construtor recebe a referencia da CELULA que topo apontava. Nao recebe um
     * endereco especial da variavel topo. nova.proximo conserva a referencia antiga
     * mesmo depois de topo ser reatribuido.
     *
     * Se item e final, nao pode ser substituido depois da construcao. Isso nao torna
     * necessariamente o objeto E imutavel: um Pedido pode continuar permitindo
     * alteracoes em seus proprios campos.
     */
    // endregion [F030]
    // ============================================================================
    // region [F031] 01_FUNDAMENTOS/G03_Sentinelas.java
    // BUSCA: G03 Sentinelas
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G03_Sentinelas.java
    // ============================================================================
    /*
     * ============================================================================
     * SENTINELA E ESTADO VAZIO
     * ============================================================================
     *
     *
     *   FILA: frente -> [S] -> [10] -> [20] -> null
     *                                   ^ tras
     *   LISTA: primeiro -> [S] -> [10] -> [20] -> null
     *                                       ^ ultimo
     *   PILHA: topo -> [30] -> [20] -> [S] -> null
     *                                   ^ fundo
     *
     * Cada uma dessas estruturas possui UMA sentinela. Vazia significa que os dois
     * controles referenciam a MESMA sentinela, nao que existam duas sentinelas.
     *
     *   Fila vazia: frente==tras. Primeiro dado: frente.getProximo().
     *   Lista vazia: primeiro==ultimo. Primeiro dado: primeiro.getProximo().
     *   Pilha vazia dos slides: topo==fundo. Primeiro dado: topo.
     *
     * Pilha dos slides deve parar seu percurso em fundo, nao em null, para nao
     * contar a sentinela. Fila/lista com sentinela inicial pulam S e param em null.
     *
     * Ultimo no de dados aponta para null em fila/lista. Na pilha com sentinela
     * inferior, ultimo dado aponta para fundo. A sentinela nao armazena item valido.
     *
     * REMOVER O UNICO ITEM DA FILA:
     *   antes: S->10, frente=S, tras=10
     *   depois: S->null, frente=S, tras=S
     * Se tras continuar no10 removido, a proxima insercao se liga numa cadeia
     * inacessivel a partir de S.
     *
     * VARIANTES: existem fila sem sentinela e fila com sentinela movel. Nao combine
     * construtor de uma convencao com retirar de outra. A revisao mostra Pilha apenas
     * com topo, sem revelar corpo do construtor. O acervo oferece variante SEM
     * sentinela, mas nao afirma que conhece a implementacao omitida da professora.
     */
    // endregion [F031]
    // ============================================================================
    // region [F032] 01_FUNDAMENTOS/G04_Fila_Pilha_Lista.java
    // BUSCA: G04 Fila Pilha Lista
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G04_Fila_Pilha_Lista.java
    // ============================================================================
    /*
     * ============================================================================
     * QUEM ENTRA, QUEM SAI E QUEM MUDA
     * ============================================================================
     *
     *
     * FILA (FIFO): enfileira no final, desenfileira do inicio. Chegou10,20,30: sai10.
     * PILHA (LIFO): insere e remove no topo. Empilhou10,20,30: sai30.
     * LISTA: permite inserir/remover/consultar em posicoes diversas.
     *
     * Vetor tem acesso direto por indice; lista encadeada precisa seguir links.
     * O numero10 guardado nao e necessariamente posicao10: o primeiro dado tem pos0.
     *
     * ENFILEIRAR:
     *   nova = new Celula<>(item);
     *   tras.setProximo(nova);
     *   tras = nova;
     * A sentinela permanece a mesma. Quando vazia, tras era a propria sentinela.
     *
     * DESENFILEIRAR (apos verificar vazio):
     *   removida = frente.getProximo();
     *   frente.setProximo(removida.getProximo());
     *   if (removida == tras) tras = frente;
     *   return removida.getItem();
     *
     * DESEMPILHAR (apos verificar vazio):
     *   E item = topo.getItem();
     *   topo = topo.getProximo();
     *   return item;
     *
     * Se chamou desempilhar/desenfileirar, a referencia JA foi ajustada pelo metodo.
     * Avancar topo/frente de novo faz pular um elemento. getItem sozinho nao remove.
     *
     * Consulta deve preservar estrutura; retirada modifica. Copiar e transferir sao
     * contratos diferentes, mesmo que os valores impressos parecam iguais.
     */
    // endregion [F032]
    // ============================================================================
    // region [F033] 01_FUNDAMENTOS/G05_Generics_E_Tipos.java
    // BUSCA: G05 Generics E Tipos
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G05_Generics_E_Tipos.java
    // ============================================================================
    /*
     * ============================================================================
     * E, T, PEDIDO, CELULA<E> E FILA<E>
     * ============================================================================
     *
     *
     * E e um parametro de tipo, nao uma variavel de objeto.
     *   Fila<Pedido> pedidos = new Fila<>();
     * Nessa instancia, E corresponde a Pedido. Enfileirar recebe Pedido e retirar
     * devolve Pedido. A fila usa Celula<Pedido> internamente para armazenar links.
     *
     *   E                         um item do tipo configurado
     *   Celula<E>                 um no que guarda E e proximo
     *   Fila<E>                   o objeto estrutura, com frente/tras
     *   Predicate<E>              recebe E e devolve boolean
     *   Function<E, Double>        recebe E e devolve Double
     *
     * Nao use int como argumento generico: Fila<Integer>, nao Fila<int>.
     * A conversao automatica entre int e Integer se chama boxing/unboxing.
     * Desempacotar um Integer/Double null causa NullPointerException.
     *
     * E nao garante compareTo. Para ordenar pela ordem natural:
     *   public class Lista<E extends Comparable<E>> { ... }
     *
     * Equals existe em Object, portanto igualdade por equals nao exige Comparable.
     * Pode haver outra variante com Comparator<E> recebido como argumento; nao e
     * necessario alterar compareTo da classe para cada criterio de ordenacao.
     *
     * Um metodo static da App nao pode usar E da instancia de outra classe:
     *   static Fila<Pedido> filaPedidos = new Fila<>();
     * Um metodo static generico pode declarar seu proprio tipo:
     *   public static <T> void mostrar(T item) { ... }
     *
     * Nao crie new E() nem new E[10] diretamente. As variantes sequenciais usam
     * Object[] com cast controlado na leitura. Evite raw types como Fila sem <...>.
     */
    // endregion [F033]
    // ============================================================================
    // region [F034] 01_FUNDAMENTOS/G06_Construtores_Sobrecarga.java
    // BUSCA: G06 Construtores Sobrecarga
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G06_Construtores_Sobrecarga.java
    // ============================================================================
    /*
     * ============================================================================
     * CONSTRUTOR, THIS E SOBRECARGA
     * ============================================================================
     *
     *
     * Construtor tem nome da classe e NAO tem retorno nem void. Inicializa o objeto
     * que acabou de ser criado com new.
     *
     *   public Celula() { this(null, null); }
     *   public Celula(E item) { this(item, null); }
     *   public Celula(E item, Celula<E> proximo) {
     *       this.item = item;
     *       this.proximo = proximo;
     *   }
     *
     * Sobrecarga: nomes iguais, parametros diferentes em quantidade/tipos/ordem.
     * Trocar apenas o nome do parametro de item para valor nao cria outra assinatura.
     *
     *   new Celula<>()               seleciona construtor sem parametros
     *   new Celula<>(10)             seleciona construtor com item
     *   new Celula<>(10, topo)       seleciona construtor item+proximo
     *
     * this.item e o atributo do objeto; item e o parametro. this(...) chama outro
     * construtor da MESMA classe; nesta base Java8 precisa ser a primeira instrucao.
     *
     * Fila(E[] itens) chama this() para criar sentinela e depois enfileira os dados.
     * Isso nao cria uma segunda instancia de Fila; inicializa a mesma instancia.
     *
     * ARQUIVOS PARA PRATICAR: FF01, FF02, FF11, LF01 e R17.
     *
     * PEGADINHA de sobrecarga:
     *   lista.remover(2)                     // remover(int): POSICAO2
     *   lista.remover(Integer.valueOf(2))    // remover(E): VALOR2
     * Isso importa quando E e Integer. Em projetos livres, nomes diferentes evitam
     * ambiguidade; na prova, respeite as assinaturas fornecidas.
     */
    // endregion [F034]
    // ============================================================================
    // region [F035] 01_FUNDAMENTOS/G07_Equals_Comparable.java
    // BUSCA: G07 Equals Comparable
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G07_Equals_Comparable.java
    // ============================================================================
    /*
     * ============================================================================
     * IGUALDADE LOGICA, IDENTIDADE E ORDENACAO
     * ============================================================================
     *
     *
     *   aux == fim                    Mesma celula? Identidade.
     *   item.equals(procurado)        Iguais conforme contrato da classe?
     *   item.compareTo(outro) < 0     Vem antes na ordem natural?
     *   item.compareTo(outro) == 0    Empate para essa ordenacao?
     *   item.compareTo(outro) > 0     Vem depois?
     *
     * CompareTo pode devolver qualquer negativo/positivo, nao apenas-1/1.
     * Use o sinal, nao compare ==1 para significar maior.
     *
     * Em inteiros use Integer.compare(a,b), nao a-b, que pode sofrer overflow.
     * Equals/hashCode: iguais por equals precisam ter mesmo hashCode; hashCodes
     * iguais nao provam igualdade. O projeto de comercio usava ID como hashCode:
     * isso e uma convencao daquele projeto, nao um algoritmo universal de busca.
     *
     * Se Pedido.compareTo compara ID, ordenar Pedido ordena por ID, nao por preco.
     * O criterio de um Predicate/Function nao altera o compareTo da classe.
     *
     * O acervo principal rejeita null como DADO. Assim, depois de pular S e testar
     * aux!=null, aux.getItem().equals(alvo) nao tenta chamar equals na sentinela.
     * Permitir null requer contrato diferente e comparacao protegida.
     *
     * ESTABILIDADE: empatados conservam a ordem relativa anterior. No merge, escolher
     * a metade esquerda no empate com <= mantem estabilidade. Heap/Quick comuns
     * nao sao estaveis. Ordenar notas estavelmente conserva nomes ja ordenados nos
     * empates, como em R21.
     */
    // endregion [F035]
    // ============================================================================
    // region [F036] 01_FUNDAMENTOS/G08_Tipos_De_Return.java
    // BUSCA: G08 Tipos De Return
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G08_Tipos_De_Return.java
    // ============================================================================
    /*
     * ============================================================================
     * RETORNO, RESULTADO E EFEITO COLATERAL
     * ============================================================================
     *
     *
     *   int           numero de itens/indice/contagem
     *   boolean       true ou false
     *   double        numero de ponto flutuante
     *   E             referencia ao item armazenado
     *   Celula<E>     referencia ao no, com item e ligacao
     *   Fila<E>       referencia ao objeto fila
     *   void          sem valor devolvido
     *
     * O tipo de retorno NAO define sozinho o padrao de recursao. int pode repassar
     * sem somar; boolean pode combinar com &&/||; E pode selecionar o maior.
     *
     *   return 0;               encerra AGORA devolvendo0
     *   return rec(proximo);     executa filho, espera, repassa resultado
     *   return 1+rec(proximo);   executa filho, espera, soma1, devolve
     *   rec(proximo); return0;   executa filho, DESCARTA resultado e devolve0
     *   return atual;           devolve Celula<E>
     *   return atual.getItem();  devolve E
     *   return;                 encerra sem valor, num metodo void
     *
     * Retornar uma fila nao a copia automaticamente. Novas celulas precisam ter
     * sido criadas pelo metodo. Passar uma fila como parametro tambem nao a copia.
     *
     * O return sai da CHAMADA atual, nao necessariamente do programa inteiro. No
     * recursivo, ele entrega uma resposta a chamada anterior que estava esperando.
     * Throw abandona o fluxo normal com excecao. Uma soma pendente nao e concluida
     * se a chamada filha lanca e a excecao nao e tratada ali.
     */
    // endregion [F036]
    // ============================================================================
    // region [F037] 01_FUNDAMENTOS/G09_Copia_Transferencia_Preservacao.java
    // BUSCA: G09 Copia Transferencia Preservacao
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G09_Copia_Transferencia_Preservacao.java
    // ============================================================================
    /*
     * ============================================================================
     * COPIAR, CONSUMIR, REAPROVEITAR E RESTAURAR
     * ============================================================================
     *
     *
     * COPIA RASA DA ESTRUTURA: novos nos, mesmos objetosE. Tirar da copia nao retira
     * da original, mas modificar um Pedido compartilhado pode aparecer nas duas.
     * COPIA PROFUNDA: exige copiar tambem os itens, conforme regra propria.
     * TRANSFERIR NOS: religar celulas existentes e retirar sua propriedade da origem.
     * RESTAURAR POR API: retirar/reinserir pode restaurar itens/ordem, nao identidade
     * de todas as celulas internas.
     *
     * Uma fila auxiliar mantem a ordem. Uma transferencia entre pilhas inverte;
     * duas transferencias restauram. Fila->pilha->fila inverte.
     *
     * AUTOALIAS: outra==this e possivel. Concatenar na mesma fila enquanto a percorre
     * pode criar laco infinito porque o fim cresce. Use snapshot ou rejeite conforme
     * contrato. Concatenacao estrutural O(1) de uma lista nela mesma criaria ciclo.
     *
     * FALHA PARCIAL: subPilha que desempilha antes de descobrir que k excede tamanho
     * pode perder itens ao lancar excecao. A versao do acervo le por cursor; a origem
     * permanece intacta mesmo quando falta quantidade.
     *
     * CONTRATOS REAIS DOS PDFs:
     *   R05: nova lista, preservar ambas.
     *   R07: religar, sem novos nos.
     *   R08: reutilizar nos da segunda metade.
     *   R13: inverter dupla sem novos nos e sem setItem.
     *   R16: transferir em O(1) e esvaziar outra.
     *
     * Uma sequencia impressa corretamente nao prova que os links estao corretos.
     * Depois da operacao, insira/retire de novo e confira os extremos.
     */
    // endregion [F037]
    // ============================================================================
    // region [F038] 01_FUNDAMENTOS/G10_Lista_Simples.java
    // BUSCA: G10 Lista Simples
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G10_Lista_Simples.java
    // ============================================================================
    /*
     * ============================================================================
     * INSERIR, RETIRAR, LOCALIZAR E CORRIGIR EXTREMOS
     * ============================================================================
     *
     *
     * Intervalo para inserir em n itens:0..n. Intervalo para consultar/remover:0..n-1.
     * A sentinela nao ocupa posicao de dados. Pos0 e primeiro.getProximo().
     *
     * INSERIR DEPOIS DE anterior:
     *   nova.proximo = anterior.proximo;
     *   anterior.proximo = nova;
     *   if (anterior == ultimo) ultimo = nova;
     * Nao troque as duas primeiras linhas sem guardar o antigo sucessor: pode criar
     * um enlace nova->nova ou perder o restante.
     *
     * REMOVER O SUCESSOR:
     *   removida = anterior.proximo;
     *   anterior.proximo = removida.proximo;
     *   if (removida == ultimo) ultimo = anterior;
     *
     * REMOVER TODAS: se remove, anterior fica parado. Seu NOVO sucessor ainda precisa
     * ser testado. Se nao remove, anterior avanca. Isso evita pular repetidos juntos.
     *
     * Consultar por indice percorre O(pos) links. Um for chamando localizar(i) para
     * cada i pode virar O(n^2); uma caminhada de cursor e O(n).
     *
     * Item final impede setItem, mas nao impede trocar ordem de celulas. Para trocar
     * dois nos, trate adjacencia nas duas ordens, identidade e ultimo. Veja BL06.
     *
     * Se template nao tem tamanho, valide posicao durante percurso. Se tem tamanho,
     * atualize-o exatamente uma vez por no inserido/removido.
     */
    // endregion [F038]
    // ============================================================================
    // region [F039] 01_FUNDAMENTOS/G11_Lista_Dupla.java
    // BUSCA: G11 Lista Dupla
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G11_Lista_Dupla.java
    // ============================================================================
    /*
     * ============================================================================
     * DUAS SETAS, UMA SENTINELA INICIAL
     * ============================================================================
     *
     *
     *   inicio->[S]<->[A]<->[B]<->[C]<-fim
     *   S.anterior=null              C.proximo=null
     *
     * Inserir entre anterior e seguinte muda quatro ligacoes:
     *   nova.anterior=anterior; nova.proximo=seguinte;
     *   anterior.proximo=nova; se seguinte existe, seguinte.anterior=nova.
     * Se nao existe seguinte, atualize fim. Tamanho sobe1.
     *
     * Retirar no conhecido e O(1): o no conhece seu anterior. Atualize a seta do
     * predecessor e a do sucessor. Se nao ha sucessor, predecessor vira fim.
     * Retirar ultimo na simples e O(n) porque nao ha acesso direto ao predecessor.
     *
     * Inverter R13 nao pode incluir a sentinela na inversao nem alterar os itens.
     * Guarde antigoPrimeiro/antigoFim e o proximo original a cada passo. Vire os
     * links dos dados, depois S.proximo=antigoFim e fim=antigoPrimeiro.
     *
     * Palindromo: compare primeiro/ultimo e avance para o centro. Fazer tamanho/2
     * comparacoes funciona para pares/impares. Lista vazia e palindromo no enunciado.
     *
     * Concatenar R16: fimA.proximo=primeiroB; primeiroB.anterior=fimA; adote fimB.
     * Esvazie os controles de B. Deixar B ainda ligada a seus dados cria duas listas
     * compartilhando a mesma cadeia e pode causar corrupcao futura.
     */
    // endregion [F039]
    // ============================================================================
    // region [F040] 01_FUNDAMENTOS/G12_Vetor_Circular.java
    // BUSCA: G12 Vetor Circular
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G12_Vetor_Circular.java
    // ============================================================================
    /*
     * ============================================================================
     * PILHA SEQUENCIAL E FILA CIRCULAR
     * ============================================================================
     *
     *
     * PILHA EM VETOR: topo e a primeira posicao livre nesta convencao.
     *   vazio: topo==0
     *   cheio: topo==capacidade
     *   push: itens[topo++]=item
     *   pop: item=itens[--topo]
     * Outra convencao usa topo=-1; nao misture as formulas.
     *
     * FILA CIRCULAR DOS SLIDES reserva uma posicao vazia no vetor:
     *   vazia: frente==tras
     *   cheia: (tras+1)%comprimento==frente
     *   quantidade: (tras-frente+comprimento)%comprimento
     *   enfileirar escreve em tras e avanca tras com modulo
     *   desenfileirar le em frente e avanca frente com modulo
     *
     * Vetor de comprimentoM armazena M-1 dados nessa convencao. Nao confunda esse
     * espaco reservado com uma celula sentinela criada por new Celula.
     *
     * Comprimento4/capacidade3: inserir1,2,3; retirar1; inserir4. A escrita pode voltar
     * ao indice0, mas a ordem logica continua2,3,4. Nao se desloca todo o vetor.
     *
     * Generic arrays: nao usar new E[n]. O exemplo usa Object[] e um cast controlado
     * na retirada. O cast e seguro enquanto a API tipada for respeitada.
     *
     * Teste cheio, vazio, wrap-around repetido, unidade e capacidade minima. Zero
     * pode ser dado valido; quem indica ocupado/vazio sao os controles.
     */
    // endregion [F040]
    // ============================================================================
    // region [F041] 01_FUNDAMENTOS/G13_Complexidade.java
    // BUSCA: G13 Complexidade
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G13_Complexidade.java
    // ============================================================================
    /*
     * ============================================================================
     * CUSTOS PARA JUSTIFICAR E NAO SO DECORAR
     * ============================================================================
     *
     *
     * Suposicao: comparar dois itens tem custoO(1). Textos/objetos grandes podem
     * acrescentar o custo de equals/compareTo.
     *
     *   push/pop e enqueue/dequeue com controles: O(1)
     *   buscar/contar sem contador armazenado: O(n)
     *   localizar indice na encadeada: O(pos+1)
     *   inverter ligacoes: O(n) tempo/O(1) auxiliar
     *   copiar n celulas: O(n) tempo/O(n) resultado
     *   remover todos em uma passagem: O(n)/O(1)
     *   intercalar duas ordenadas: O(n+m)
     *   remover final simples: O(n); dupla:O(1)
     *   concatenar dupla transferindo nos:O(1)
     *
     * Recursao conta memoria: n chamadas pendentes custam O(n) stack. Nao ter
     * new Pilha no codigo nao significa O(1) de memoria auxiliar.
     *
     * PseudoFila: um dequeue pode transferir n itens e custar O(n). Em muitas
     * operacoes, cada item e transferido uma vez: custo amortizado O(1). Isso nao
     * significa que toda chamada isolada seja constante.
     *
     * MergeSort O(nlogn) garantido. HeapSort iterativo O(nlogn) garantido/O(1) extra.
     * QuickSort pode O(n^2) e stackO(n); particoes equilibradas daoO(nlogn).
     * Insertion quase ordenado custaO(n+I),I=numero de inversoes; piorO(n^2).
     * Selection sempre percorre comparacoes quadraticas. Bubble com parada cedo e
     * linear na entrada ja ordenada, mas quadratico no pior caso.
     *
     * A revisao R23 usa merge que copia nos: alocacoes TOTAIS O(nlogn), enquanto
     * memoria viva auxiliar pode ser O(n), alem de stackO(logn).
     */
    // endregion [F041]
    // ============================================================================
    // region [F042] 01_FUNDAMENTOS/G14_Erros_Do_Seu_Codigo.java
    // BUSCA: G14 Erros Do Seu Codigo
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G14_Erros_Do_Seu_Codigo.java
    // ============================================================================
    /*
     * ============================================================================
     * DIAGNOSTICO DOS ERROS MAIS IMPORTANTES
     * ============================================================================
     *
     *
     * 1) throws IllegalArgumentException(...) no corpo: errado. Use throw new ...;
     *    throws declara excecoes na assinatura, nao dispara uma excecao.
     * 2) Codigo depois de throw no mesmo ramo: inalcancavel; feche o if antes.
     * 3) Constructor com frente=tras=null e enfileirar que usa tras.setProximo:
     *    mistura fila sem sentinela com operacao que espera sentinela.
     * 4) Declarar Pilha<Pedido> nova dentro de finalizarPedido: cria pilha vazia nova
     *    a cada finalizacao; use a estrutura compartilhada ou recebida por parametro.
     * 5) Declarar o mesmo atributo pilhaPedidos duas vezes: nome duplicado na classe.
     * 6) subPilha(int numItens) dentro da CHAMADA: errado; chamada usa subPilha(numItens).
     * 7) for i<=itens.length: ultimo indice e length-1; use i<length.
     * 8) Vetor de pedidos parcialmente ocupado: verificar itens[i]!=null antes de usar.
     * 9) aux=frente.proximo dentro do while: reinicia todo passo. Declare antes.
     * 10) Nao incrementar contador ou aux: laco infinito.
     * 11) Chamar desempilhar(item): a sua assinatura desempilhar() nao recebe item.
     * 12) Desempilhar e depois topo=topo.proximo: pula dois nos.
     * 13) apply(item) sem guardar resultado: numero foi calculado e descartado.
     * 14) Retornar soma em metodo de media: faltou dividir por quantidade valida.
     * 15) return1+... em metodo Celula<E>: resultado numerico nao combina com referencia.
     * 16) Recursao usando frente.proximo sempre: nao progride; use atual.proximo.
     * 17) Remover ultimo sem atualizar tras/fim/ultimo: proxima insercao corrompe cadeia.
     * 18) private frente acessado pela App: visibilidade errada. Use metodos publicos.
     * 19) Metodo declarado com parametro chamado sem argumento: assinatura nao bate.
     * 20) Usar helper que nao foi fornecido/implementado: cannot find symbol.
     *
     * Classifique: erro de COMPILACAO, EXCECAO de execucao, LOGICA ou CONTRATO.
     * Uma solucao pode produzir o vetor certo e ainda violar a proibicao de lacos,
     * colecoes prontas ou novos nos. Leia as restricoes antes de escolher algoritmo.
     */
    // endregion [F042]
    // ============================================================================
    // region [F043] 01_FUNDAMENTOS/G15_Convencoes_Dos_PDFs.java
    // BUSCA: G15 Convencoes Dos PDFs
    // ORIGEM_NO_ACERVO: 01_FUNDAMENTOS/G15_Convencoes_Dos_PDFs.java
    // ============================================================================
    /*
     * ============================================================================
     * DIFERENCAS ENTRE OS TEMPLATES
     * ============================================================================
     *
     *
     * Os nove PDFs nao mostram exatamente a mesma classe.
     *
     * Slides: fila frente/tras; lista primeiro/ultimo; pilha topo/fundo sentinela.
     * Revisao: fila/lista inicio/fim; lista tem tamanho. R04 usa frente/tras novamente.
     * Pilha da revisao mostra so topo e corpos omitidos: nao supor automaticamente a
     * mesma sentinela dos slides. O acervo oferece as duas variantes separadas.
     *
     * Item de Celula e final na revisao. BL06 sugere retirar final para trocar itens.
     * Nossa solucao principal troca nos por religacao e nao depende de setItem.
     *
     * FF10 fixa quantosAfrente(Celula<E> atual,E item), nesta ordem. R01 fixa
     * obterItem(Celula<E> aux,int pos) e pede wrapper obterItem(int pos).
     *
     * Algumas questoes deixam ordem/preservacao ambiguas. As fichas declaram escolhas:
     * BP01 final=sequencia topo->fundo; FF02 fila segue topo->fundo e restaura pilha;
     * FF06 altera a fila recebida; FF07 retorna copia invertida; LF08 segue o exemplo
     * de alternancia this invertida/outra invertida.
     *
     * Tamanho aparece dentro do desenho de CelulaDupla e tambem da ListaDupla na
     * revisao. A contagem usada nas solucoes pertence a lista; nao depende de tamanho
     * em cada celula. Um template inicial de Lista Flexivel usa nome desenfileirar
     * para remover por posicao; adapte para o nome realmente presente no arquivo.
     *
     * Contratos null/quantidade que nao aparecem no recorte foram escolhidos e
     * identificados. Nao atribua essas escolhas como regra universal da professora.
     *
     * Os algoritmos nao usam ArrayList, LinkedList, java.util.Stack ou Collections.sort.
     * Function/Predicate, excecoes, Scanner e Random dos testes nao sao colecoes.
     */
    // endregion [F043]
    // ============================================================================
    // region [F044] 02_RECURSAO/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 02_RECURSAO/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE - 02_RECURSAO
     * ============================================================================
     *
     * R00_LEIA_PRIMEIRO.java
     * R01_Chamadas_Passo_A_Passo.java
     * R02_Return_1_Mais.java
     * R03_Return_Boolean.java
     * R04_Return_E_Objeto.java
     * R05_Void_Ida_Volta.java
     * R06_Casos_Base.java
     * R07_Excecao_Nao_E_Return.java
     * R08_Retornar_Cabeca.java
     * R09_Recursao_Ordenacao.java
     *
     * Guias em comentarios Java. Exemplos completos em src/aed.
     * Nos arquivos dos PDFs, busque SOLUCAO_PEDIDA_AQUI.
     */
    // endregion [F044]
    // ============================================================================
    // region [F045] 02_RECURSAO/R00_LEIA_PRIMEIRO.java
    // BUSCA: R00 LEIA PRIMEIRO
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R00_LEIA_PRIMEIRO.java
    // ============================================================================
    /*
     * ============================================================================
     * RECURSAO EM QUATRO PERGUNTAS
     * ============================================================================
     *
     *
     * 1. Qual e o significado do retorno desta chamada?
     * 2. Qual e o menor caso que consigo responder sem chamar de novo?
     * 3. Como a proxima chamada recebe um problema MENOR?
     * 4. O que faco com o resultado que ela devolve?
     *
     * Exemplo: contar a partir de aux.
     *   Significado: numero de dados deste trecho.
     *   Base: trecho vazio(null) tem0.
     *   Reducao: aux.getProximo().
     *   Combinacao:1+numero do trecho seguinte.
     *
     * Chamar outro metodo NAO encerra o atual. A chamada atual aguarda o resultado
     * para terminar sua expressao e executar o que vem depois. O return encerra
     * somente essa execucao. Isso tambem acontece entre metodos diferentes, como
     * A chamando B; a recursao apenas usa o mesmo codigo com novos parametros.
     *
     * Nao imagine que a referencia proximo aponta para tras na volta. A volta esta
     * na PILHA DE EXECUCAO: locais e ponto de retomada foram guardados pela JVM.
     * Cada chamada tem seu proprio aux. Mudar o parametro da proxima nao substitui
     * o parametro da anterior.
     *
     * Ordem de estudo: R01_Chamadas -> R02_1Mais -> R03_Boolean -> R04_Objeto ->
     * R05_Void -> R06_CasosBase. Depois abra FF04, FF05, FF10, LF03 e R06 dos PDFs.
     */
    // endregion [F045]
    // ============================================================================
    // region [F046] 02_RECURSAO/R01_Chamadas_Passo_A_Passo.java
    // BUSCA: R01 Chamadas Passo A Passo
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R01_Chamadas_Passo_A_Passo.java
    // ============================================================================
    /*
     * ============================================================================
     * ONDE CHAMA, ONDE ESPERA E ONDE RECEBE
     * ============================================================================
     *
     *
     * Codigo simplificado DENTRO da classe apropriada:
     *
     *   int contar(Celula<E> aux) {
     *       if (aux == null) return 0;
     *       int resposta = contar(aux.getProximo());
     *       return 1 + resposta;
     *   }
     *
     * Cadeia10->20->null. Os numeros abaixo identificam CELULAS; o argumento nao e
     * um int, e uma referencia Celula<E>.
     *
     * CHAMADA A: aux referencia10
     *   chegou a: int resposta = contar(celula20);
     *   resposta de A ainda nao foi atribuida. A espera.
     *
     *     CHAMADA B: aux referencia20
     *       chegou a: int resposta = contar(null);
     *       resposta de B tambem espera.
     *
     *         CHAMADA C: aux=null
     *           if e verdadeiro. return0 encerra C.
     *
     *     B recebe o0 que C devolveu:
     *       sua linha termina como int resposta=0;
     *       agora executa return1+0, devolve1 e encerra B.
     *
     * A recebe o1 que B devolveu:
     *   sua linha termina como int resposta=1;
     *   agora executa return1+1, devolve2 e encerra A.
     *
     * QUEM CHAMOU A recebe2.
     *
     * Nao sao tres variaveis aux sincronizadas. Sao tres execucoes independentes,
     * cada uma com parametros e locais. A nao reinicia do comeco quando B retorna:
     * retoma precisamente o ponto em que esperava.
     *
     * EXEMPLO EXECUTAVEL: src/aed/app/RecursaoPassoAPasso.java.
     * Nao precisa executa-lo para consultar: este rastro mostra todas as etapas.
     */
    // endregion [F046]
    // ============================================================================
    // region [F047] 02_RECURSAO/R02_Return_1_Mais.java
    // BUSCA: R02 Return 1 Mais
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R02_Return_1_Mais.java
    // ============================================================================
    /*
     * ============================================================================
     * 1+ NAO E UMA INSTRUCAO ESPECIAL DE RECURSAO
     * ============================================================================
     *
     *
     *   return 1 + contar(atual.getProximo());
     *
     * E equivalente a:
     *   int resto = contar(atual.getProximo());
     *   return 1 + resto;
     *
     * O1 e a contribuicao da celula atual. A chamada seguinte produz o numero do
     * resto. A soma e concluida so depois que esse numero existe.
     *
     * QuantosAfrente em10->20->30, buscando30:
     *   30 retorna0: o alvo nao conta.
     *   20 recebe0 e devolve1+0=1.
     *   10 recebe1 e devolve1+1=2.
     *
     * Se usar return rec(proximo), todos apenas repassam o0. Resultado0.
     * Se usar return5+rec(proximo), duas celulas anteriores somam5+5, resultado10.
     * Se chamar rec(proximo);return1;, as chamadas acontecem mas o resultado do filho
     * e descartado; a resposta da chamada inicial sera1, nao a quantidade de nos.
     *
     * A contribuicao poderia ser o valor de um extrator, e nao1:
     *   return extrator.apply(atual.getItem()) + soma(proximo);
     *
     * Cuidado com ausencia=-1. Se somar1 em cima de-1, vira0 e parece que encontrou
     * na primeira posicao. Propague o marcador sem somar ou use excecao conforme pedido.
     */
    // endregion [F047]
    // ============================================================================
    // region [F048] 02_RECURSAO/R03_Return_Boolean.java
    // BUSCA: R03 Return Boolean
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R03_Return_Boolean.java
    // ============================================================================
    /*
     * ============================================================================
     * RETORNANDO TRUE/FALSE
     * ============================================================================
     *
     *
     *   boolean contem(E alvo,Celula<E> atual) {
     *       if (atual==null) return false;
     *       if (atual.getItem().equals(alvo)) return true;
     *       return contem(alvo,atual.getProximo());
     *   }
     *
     * 10 chama20;20 chama30;30 acha o alvo e retorna true.
     * 20 estava esperando o resultado de contem(30): recebeu true e repassa true.
     * 10 recebe true da chamada20 e repassa true a App. Nao soma numeros.
     *
     * BOOLEAN PODE COMBINAR:
     *   algum: testeAtual || algum(resto)
     *   todos: testeAtual && todos(resto)
     *
     * Caso vazio de algum=false; de todos=true (nao existe contraexemplo). O curto
     * circuito pode evitar visitar o resto: || para no primeiro true, && no primeiro
     * false. Essas escolhas devem seguir o contrato solicitado.
     *
     * Nao escrever return1+contem(...): boolean nao participa dessa soma.
     * A recursividade vem de chamar o mesmo metodo, nao da presenca de1+.
     */
    // endregion [F048]
    // ============================================================================
    // region [F049] 02_RECURSAO/R04_Return_E_Objeto.java
    // BUSCA: R04 Return E Objeto
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R04_Return_E_Objeto.java
    // ============================================================================
    /*
     * ============================================================================
     * RETORNANDO O ITEM OU O MAIOR
     * ============================================================================
     *
     *
     * OBTER ITEM POR POSICAO:
     *   base pos0 -> retorna atual.getItem()
     *   passo -> retorna obterItem(atual.getProximo(),pos-1)
     *
     * (A,2)->(B,1)->(C,0). C devolve seu item. B e A repassam esse MESMO item.
     * Se E=Pedido, devolvem uma referencia para Pedido, nao o preco e nao a Celula.
     *
     * MAIOR:
     *   base ultima celula -> item dessa celula
     *   maiorResto = obterMaior(atual.getProximo())
     *   compare atual.item com maiorResto
     *   devolva o maior dos dois
     *
     * Exemplo[10,40,20]:20 retorna20;40 ganha e retorna40;10 perde e retorna40.
     * Exemplo[-8,-3,-10]:resposta-3. Inicializar maior com0 estaria errado, pois0 nao
     * esta na lista e e maior que todos os dados.
     *
     * compareTo devolve int que representa a COMPARACAO. O metodo obterMaior deve
     * retornar E, portanto retorna item atual ou maiorResto, nao o int do compareTo.
     *
     * Wrapper sem parametros verifica lista vazia e comeca no primeiro dado. Isso
     * permite manter a assinatura recursiva restrita a uma Celula<E>.
     */
    // endregion [F049]
    // ============================================================================
    // region [F050] 02_RECURSAO/R05_Void_Ida_Volta.java
    // BUSCA: R05 Void Ida Volta
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R05_Void_Ida_Volta.java
    // ============================================================================
    /*
     * ============================================================================
     * ACAO ANTES E DEPOIS DA CHAMADA
     * ============================================================================
     *
     *
     *   void mostrar(Celula<E> atual) {
     *       if (atual==null) return;
     *       println("ENTRA "+atual.getItem());
     *       mostrar(atual.getProximo());
     *       println("SAI "+atual.getItem());
     *   }
     *
     * Cadeia10,20,30 produz:
     *   ENTRA10
     *   ENTRA20
     *   ENTRA30
     *   SAI30
     *   SAI20
     *   SAI10
     *
     * A instrucao anterior a chamada acontece na ida. A posterior espera o resto
     * terminar e acontece na volta. Cada execucao conserva sua referencia atual.
     *
     * Para copiar na ordem original:
     *   destino.enfileirar(atual.getItem());
     *   copiar(proximo,destino);
     *
     * Para copiar em ordem inversa:
     *   copiar(proximo,destino);
     *   destino.enfileirar(atual.getItem());
     *
     * Passar destino como argumento em cada chamada nao cria novas filas. Cada
     * parametro recebe uma copia da referencia para o MESMO objeto destino.
     *
     * return; encerra a chamada void sem devolver valor. Ainda assim quem a chamou
     * continua apos ela terminar. Nao confunda 'nao devolver valor' com 'nao voltar'.
     */
    // endregion [F050]
    // ============================================================================
    // region [F051] 02_RECURSAO/R06_Casos_Base.java
    // BUSCA: R06 Casos Base
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R06_Casos_Base.java
    // ============================================================================
    /*
     * ============================================================================
     * TABELA DE CASOS-BASE E COMBINACOES
     * ============================================================================
     *
     *
     * CONTAR TODOS    null ->0                 1+resultadoDoResto
     * CONTAR IGUAIS   null ->0                 (igual?1:0)+resto
     * EXISTE          null->false/achou->true  repassar resultado
     * QUANTOS ANTES   null->erro/achou->0      1+resto
     * POSICAO         pos0->item              proximo,pos-1; erro se fora
     * MAIOR           ultima celula->item     comparar atual com maiorResto
     * SOMA            null->0.0               valorAtual+somaResto
     * ALGUM           null->false             testeAtual || algumResto
     * TODOS           null->true              testeAtual && todosResto
     * COPIA DE NOS    null->null              new Celula(item,copiaResto)
     * ACAO REVERSA    null->return            rec(proximo); processarAtual
     * MERGESORT       tamanho<=1->return      ordenar metades;intercalar
     *
     * Valor neutro depende da operacao. Soma usa0, produto usa1, maior nao usa0
     * arbitrariamente. Lista vazia em uma consulta de maior normalmente gera erro.
     *
     * COMO PROVAR QUE TERMINA: em uma cadeia ACICLICA, passar proximo reduz numero de
     * nos restantes. No indice, pos diminui. No Merge Sort, metades sao menores.
     * Chamar sempre frente.proximo nao reduz problema. Uma cadeia com ciclo viola a
     * precondicao e pode causar recursao infinita.
     *
     * Recursao profunda pode causar StackOverflowError. Nao presuma otimizacao de
     * recursao de cauda em Java. Nao ha um tamanho universal seguro: depende do ambiente.
     */
    // endregion [F051]
    // ============================================================================
    // region [F052] 02_RECURSAO/R07_Excecao_Nao_E_Return.java
    // BUSCA: R07 Excecao Nao E Return
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R07_Excecao_Nao_E_Return.java
    // ============================================================================
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
    // endregion [F052]
    // ============================================================================
    // region [F053] 02_RECURSAO/R08_Retornar_Cabeca.java
    // BUSCA: R08 Retornar Cabeca
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R08_Retornar_Cabeca.java
    // ============================================================================
    /*
     * ============================================================================
     * QUANDO A RECURSAO DEVOLVE UMA CELULA
     * ============================================================================
     *
     *
     *   Celula<E> copiar(Celula<E> atual) {
     *       if (atual==null) return null;
     *       Celula<E> resto=copiar(atual.getProximo());
     *       return new Celula<>(atual.getItem(),resto);
     *   }
     *
     * A ultima chamada devolve null. A anterior cria o ultimo no novo. A anterior
     * cria no ligado a esse ultimo. O retorno final e a cabeca da cadeia nova.
     *
     * Remover todos por recursao pode devolver OUTRA cabeca:
     *   resto=removerTodos(atual.proximo,alvo)
     *   se atual combina: devolva resto
     *   senao: atual.proximo=resto; devolva atual
     *
     * O wrapper da estrutura precisa guardar essa cabeca:
     *   sentinela.setProximo(retorno);
     * E atualizar tamanho/fim. O retorno isolado nao muda automaticamente os campos
     * do objeto Lista que o chamou. Ignorar retorno pode manter a cabeca removida.
     *
     * Codigos compilaveis: src/aed/variacoes/ModelosRecursivos.java.
     */
    // endregion [F053]
    // ============================================================================
    // region [F054] 02_RECURSAO/R09_Recursao_Ordenacao.java
    // BUSCA: R09 Recursao Ordenacao
    // ORIGEM_NO_ACERVO: 02_RECURSAO/R09_Recursao_Ordenacao.java
    // ============================================================================
    /*
     * ============================================================================
     * QUANDO HA DUAS CHAMADAS RECURSIVAS
     * ============================================================================
     *
     *
     * Merge Sort nao visita somente proximo: divide em duas partes menores.
     *   if (tamanho<=1) return;
     *   direita=dividirAoMeio();
     *   this.ordenar();
     *   direita.ordenar();
     *   resultado=intercalarOrdenadas(direita);
     *
     * A chamada da esquerda termina inteira antes de comecar a da direita nessa
     * ordem de codigo. Somente depois das DUAS prontas a intercalacao acontece.
     * Nao ha execucao paralela automatica.
     *
     * Quick Sort primeiro particiona e depois chama os subintervalos. Lomuto retorna
     * indice final do pivo e usa esq..p-1,p+1..dir. A versao de dois cursores do PDF
     * usa esq..j e i..dir. Os esquemas nao sao intercambiaveis.
     *
     * Heap Sort nao precisa ser inteiro recursivo. A reorganizacao do heap pode ser
     * implementada iterativamente (como no acervo) ou recursivamente. Pilha de chamadas
     * nao e a estrutura heap: stack e heap sao conceitos diferentes.
     */
    // endregion [F054]
    // ============================================================================
    // region [F055] 03_PADROES_REUTILIZAVEIS/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * 16 PADROES PARA ADAPTAR
     * ============================================================================
     *
     * P01_ContarSe.java - Contagem por Predicate
     * P02_SomarFunction.java - Soma recursiva por Function
     * P03_Algum.java - Pelo menos um satisfaz
     * P04_Todos.java - Todos satisfazem
     * P05_IndiceOuMenosUm.java - Ausencia com marcador -1
     * P06_UltimoIndice.java - Ultima ocorrencia recursiva
     * P07_CopiarNos.java - Copiar cadeia devolvendo cabeca
     * P08_FiltrarNos.java - Filtro recursivo preservando ordem
     * P09_RemoverNos.java - Remocao recursiva devolvendo cabeca
     * P10_CopiarNaVolta.java - Montar resultado na volta
     * P11_CopiarComFuncao.java - Copiador dos objetos E
     * P12_InverterSemAnterior.java - Inverter fila sem variavel anterior
     * P13_CopiarAntes.java - Copiar anteriores ao alvo
     * P14_CopiarDepois.java - Copiar posteriores ao alvo
     * P15_SubPilha.java - Subpilha mantendo ordem e original
     * P16_MaiorPorExtrator.java - Devolver objeto com maior valor extraido
     *
     * Veja tambem os casos-base em02_RECURSAO e as convencoes em01_FUNDAMENTOS.
     */
    // endregion [F055]
    // ============================================================================
    // region [F056] 03_PADROES_REUTILIZAVEIS/P01_ContarSe.java
    // BUSCA: P01 Contar Se
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P01_ContarSe.java
    // ============================================================================
    /*
     * ============================================================================
     * P01 - Contagem por Predicate
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Cada chamada contribui0/1 mais o resto. Null contribui0.
     *
     * EXEMPLO / TESTE DE MESA
     * [1,2,3,2],par ->2.
     *
     * CASOS DE BORDA
     * Vazio;nenhum;todos.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P01_ContarSe {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> int contarSe(Biblioteca.Base.Celula<E> atual, Predicate<E> condicao) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    if (atual == null) return 0;
                    return (condicao.test(atual.getItem()) ? 1 : 0) + contarSe(atual.getProximo(), condicao);
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F056]
    // ============================================================================
    // region [F057] 03_PADROES_REUTILIZAVEIS/P02_SomarFunction.java
    // BUSCA: P02 Somar Function
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P02_SomarFunction.java
    // ============================================================================
    /*
     * ============================================================================
     * P02 - Soma recursiva por Function
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Use apply(item) como contribuicao, nao1. Base0.0.
     *
     * EXEMPLO / TESTE DE MESA
     * 80+250+120 ->450.
     *
     * CASOS DE BORDA
     * Extratornull;retornonull;vazio.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P02_SomarFunction {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> double somar(Biblioteca.Base.Celula<E> atual, Function<E, Double> extrator) {
                    if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
                    if (atual == null) return 0;
                    Double valor = extrator.apply(atual.getItem());
                    if (valor == null) throw new IllegalArgumentException("Resultado nulo");
                    return valor + somar(atual.getProximo(), extrator);
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F057]
    // ============================================================================
    // region [F058] 03_PADROES_REUTILIZAVEIS/P03_Algum.java
    // BUSCA: P03 Algum
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P03_Algum.java
    // ============================================================================
    /*
     * ============================================================================
     * P03 - Pelo menos um satisfaz
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Basefalse. True encerra cedo por curto circuito.
     *
     * EXEMPLO / TESTE DE MESA
     * [2,3],par ->true.
     *
     * CASOS DE BORDA
     * Vaziofalse;primeiroaprovado;nenhum.
     *
     * CUSTO E EFEITOS
     * O(n) pior/stack.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P03_Algum {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> boolean algum(Biblioteca.Base.Celula<E> atual, Predicate<E> condicao) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    if (atual == null) return false;
                    return condicao.test(atual.getItem()) || algum(atual.getProximo(), condicao);
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F058]
    // ============================================================================
    // region [F059] 03_PADROES_REUTILIZAVEIS/P04_Todos.java
    // BUSCA: P04 Todos
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P04_Todos.java
    // ============================================================================
    /*
     * ============================================================================
     * P04 - Todos satisfazem
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Basetrue porque nao ha contraexemplo. False encerra cedo.
     *
     * EXEMPLO / TESTE DE MESA
     * [2,3],par ->false.
     *
     * CASOS DE BORDA
     * Vaziotrue;todos;umreprovado.
     *
     * CUSTO E EFEITOS
     * O(n) pior/stack.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P04_Todos {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> boolean todos(Biblioteca.Base.Celula<E> atual, Predicate<E> condicao) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    if (atual == null) return true;
                    return condicao.test(atual.getItem()) && todos(atual.getProximo(), condicao);
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F059]
    // ============================================================================
    // region [F060] 03_PADROES_REUTILIZAVEIS/P05_IndiceOuMenosUm.java
    // BUSCA: P05 Indice Ou Menos Um
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P05_IndiceOuMenosUm.java
    // ============================================================================
    /*
     * ============================================================================
     * P05 - Ausencia com marcador -1
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Nao somar1 ao marcador-1: propague ausencia intacta.
     *
     * EXEMPLO / TESTE DE MESA
     * [1,2,3],alvo9 ->-1.
     *
     * CASOS DE BORDA
     * Vazio;primeiro;ultimo;ausente.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P05_IndiceOuMenosUm {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> int indiceOuMenosUm(Biblioteca.Base.Celula<E> atual, E alvo) {
                    if (atual == null) return -1;
                    if (atual.getItem().equals(alvo)) return 0;
                    int resto = indiceOuMenosUm(atual.getProximo(), alvo);
                    return resto < 0 ? -1 : 1 + resto;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F060]
    // ============================================================================
    // region [F061] 03_PADROES_REUTILIZAVEIS/P06_UltimoIndice.java
    // BUSCA: P06 Ultimo Indice
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P06_UltimoIndice.java
    // ============================================================================
    /*
     * ============================================================================
     * P06 - Ultima ocorrencia recursiva
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Priorize a resposta do resto; so use atual se nao houve outra.
     *
     * EXEMPLO / TESTE DE MESA
     * [1,2,1],alvo1 ->2.
     *
     * CASOS DE BORDA
     * Unidade;repetidos;ausente.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P06_UltimoIndice {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> int ultimoIndice(Biblioteca.Base.Celula<E> atual, E alvo) {
                    if (atual == null) return -1;
                    int resto = ultimoIndice(atual.getProximo(), alvo);
                    if (resto >= 0) return 1 + resto;
                    return atual.getItem().equals(alvo) ? 0 : -1;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F061]
    // ============================================================================
    // region [F062] 03_PADROES_REUTILIZAVEIS/P07_CopiarNos.java
    // BUSCA: P07 Copiar Nos
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P07_CopiarNos.java
    // ============================================================================
    /*
     * ============================================================================
     * P07 - Copiar cadeia devolvendo cabeca
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Null devolve null. Cada chamada cria um no antes da copia do resto.
     *
     * EXEMPLO / TESTE DE MESA
     * A->B->null vira Anovo->Bnovo->null.
     *
     * CASOS DE BORDA
     * Nos diferentes;itens compartilhados;vazio.
     *
     * CUSTO E EFEITOS
     * O(n) novas celulas e chamadas.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P07_CopiarNos {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> Biblioteca.Base.Celula<E> copiarNos(Biblioteca.Base.Celula<E> atual) {
                    if (atual == null) return null;
                    return new Biblioteca.Base.Celula<>(atual.getItem(), copiarNos(atual.getProximo()));
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F062]
    // ============================================================================
    // region [F063] 03_PADROES_REUTILIZAVEIS/P08_FiltrarNos.java
    // BUSCA: P08 Filtrar Nos
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P08_FiltrarNos.java
    // ============================================================================
    /*
     * ============================================================================
     * P08 - Filtro recursivo preservando ordem
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Se aprova, novo no antes do resto; se nao, repassa resto filtrado.
     *
     * EXEMPLO / TESTE DE MESA
     * [1,2,3,4],par ->[2,4].
     *
     * CASOS DE BORDA
     * Nenhum;todos;vazio.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack;O(k) dados copiados.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P08_FiltrarNos {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> Biblioteca.Base.Celula<E> filtrarNos(Biblioteca.Base.Celula<E> atual, Predicate<E> condicao) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    if (atual == null) return null;
                    boolean incluir = condicao.test(atual.getItem());
                    Biblioteca.Base.Celula<E> resto = filtrarNos(atual.getProximo(), condicao);
                    return incluir ? new Biblioteca.Base.Celula<>(atual.getItem(), resto) : resto;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F063]
    // ============================================================================
    // region [F064] 03_PADROES_REUTILIZAVEIS/P09_RemoverNos.java
    // BUSCA: P09 Remover Nos
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P09_RemoverNos.java
    // ============================================================================
    /*
     * ============================================================================
     * P09 - Remocao recursiva devolvendo cabeca
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Se remover atual, devolva resto; senao religue e devolva atual.
     *
     * EXEMPLO / TESTE DE MESA
     * [2,1,2,3],alvo2 ->[1,3].
     *
     * CASOS DE BORDA
     * Cabeca removida;todos;fim.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack;modifica links.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P09_RemoverNos {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> Biblioteca.Base.Celula<E> removerTodosNos(Biblioteca.Base.Celula<E> atual, E alvo) {
                    if (atual == null) return null;
                    Biblioteca.Base.Celula<E> resto = removerTodosNos(atual.getProximo(), alvo);
                    if (atual.getItem().equals(alvo)) { atual.setProximo(null); return resto; }
                    atual.setProximo(resto); return atual;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F064]
    // ============================================================================
    // region [F065] 03_PADROES_REUTILIZAVEIS/P10_CopiarNaVolta.java
    // BUSCA: P10 Copiar Na Volta
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P10_CopiarNaVolta.java
    // ============================================================================
    /*
     * ============================================================================
     * P10 - Montar resultado na volta
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Recursao primeiro, enfileirar depois. A fila destino e compartilhada.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30] ->[30,20,10].
     *
     * CASOS DE BORDA
     * Vazio;unitario;origem intacta.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack/celulas.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P10_CopiarNaVolta {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> Biblioteca.Base.Fila<E> copiarInvertido(Biblioteca.Base.Celula<E> atual) {
                    Biblioteca.Base.Fila<E> nova = new Biblioteca.Base.Fila<>(); copiarNaVolta(atual, nova); return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }

            private static <E> void copiarNaVolta(Biblioteca.Base.Celula<E> atual, Biblioteca.Base.Fila<E> nova) {
                    if (atual == null) return;
                    copiarNaVolta(atual.getProximo(), nova);
                    nova.enfileirar(atual.getItem());
                }
        }
    }
    // endregion [F065]
    // ============================================================================
    // region [F066] 03_PADROES_REUTILIZAVEIS/P11_CopiarComFuncao.java
    // BUSCA: P11 Copiar Com Funcao
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P11_CopiarComFuncao.java
    // ============================================================================
    /*
     * ============================================================================
     * P11 - Copiador dos objetos E
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Novo no e item produzido pelo copiador. Profundidade depende da lambda.
     *
     * EXEMPLO / TESTE DE MESA
     * Copiar uma Caixa com new Caixa(valor) separa o objeto mutavel.
     *
     * CASOS DE BORDA
     * Copiadornull;retornonull;campos internos de E.
     *
     * CUSTO E EFEITOS
     * O(n) mais custo dos copiadores.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/variacoes/ModelosRecursivos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P11_CopiarComFuncao {
        public static final class ModelosRecursivos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> Biblioteca.Base.Celula<E> copiarComFuncao(Biblioteca.Base.Celula<E> atual, Function<E, E> copiador) {
                    if (copiador == null) throw new IllegalArgumentException("Copiador nulo");
                    if (atual == null) return null;
                    E novo = copiador.apply(atual.getItem());
                    if (novo == null) throw new IllegalArgumentException("Copia nula");
                    return new Biblioteca.Base.Celula<>(novo, copiarComFuncao(atual.getProximo(), copiador));
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private ModelosRecursivos() { }
        }
    }
    // endregion [F066]
    // ============================================================================
    // region [F067] 03_PADROES_REUTILIZAVEIS/P12_InverterSemAnterior.java
    // BUSCA: P12 Inverter Sem Anterior
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P12_InverterSemAnterior.java
    // ============================================================================
    /*
     * ============================================================================
     * P12 - Inverter fila sem variavel anterior
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Retire cada no do trecho original e ligue na frente da parte invertida.
     *
     * EXEMPLO / TESTE DE MESA
     * resto[10,20,30],destino[] ->destino[30,20,10].
     *
     * CASOS DE BORDA
     * Guardar seguinte;atualizar tras;vazio.
     *
     * CUSTO E EFEITOS
     * O(n)/O(1),sem novas celulas.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P12_InverterSemAnterior {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Variante para quem prefere nao usar uma variavel chamada anterior. */
                public void inverterSemAnterior() {
                    Biblioteca.Base.Celula<E> antigoPrimeiro = frente.getProximo();
                    Biblioteca.Base.Celula<E> atual = antigoPrimeiro;
                    frente.setProximo(null);
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(frente.getProximo());
                        frente.setProximo(atual);
                        atual = seguinte;
                    }
                    tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F067]
    // ============================================================================
    // region [F068] 03_PADROES_REUTILIZAVEIS/P13_CopiarAntes.java
    // BUSCA: P13 Copiar Antes
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P13_CopiarAntes.java
    // ============================================================================
    /*
     * ============================================================================
     * P13 - Copiar anteriores ao alvo
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Enfileire na ida ate achar alvo. Alvo nao entra. Ausente lanca.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30,40],alvo30 ->[10,20].
     *
     * CASOS DE BORDA
     * Primeirogera vazio;ausencia;repetidosprimeiro.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack/copias.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P13_CopiarAntes {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila<E> itensAntesDoAlvo(E alvo) {
                    Fila<E> nova = new Fila<>();
                    copiarAntes(alvo, frente.getProximo(), nova);
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            private void copiarAntes(E alvo, Biblioteca.Base.Celula<E> atual, Fila<E> nova) {
                    if (atual == null) throw new NoSuchElementException("Alvo ausente");
                    if (atual.getItem().equals(alvo)) return;
                    nova.enfileirar(atual.getItem());
                    copiarAntes(alvo, atual.getProximo(), nova);
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F068]
    // ============================================================================
    // region [F069] 03_PADROES_REUTILIZAVEIS/P14_CopiarDepois.java
    // BUSCA: P14 Copiar Depois
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P14_CopiarDepois.java
    // ============================================================================
    /*
     * ============================================================================
     * P14 - Copiar posteriores ao alvo
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Primeiro busque. Ao achar, comece a copiar no proximo, nao no alvo.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30,40],alvo20 ->[30,40].
     *
     * CASOS DE BORDA
     * Ultimogera vazio;ausencia;primeiraocorrencia.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack/copias.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P14_CopiarDepois {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila<E> itensDepoisDoAlvo(E alvo) {
                    Fila<E> nova = new Fila<>();
                    buscarECopiar(alvo, frente.getProximo(), nova);
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            private void buscarECopiar(E alvo, Biblioteca.Base.Celula<E> atual, Fila<E> nova) {
                    if (atual == null) throw new NoSuchElementException("Alvo ausente");
                    if (atual.getItem().equals(alvo)) { copiarRestante(atual.getProximo(), nova); return; }
                    buscarECopiar(alvo, atual.getProximo(), nova);
                }

            private void copiarRestante(Biblioteca.Base.Celula<E> atual, Fila<E> nova) {
                    if (atual == null) return;
                    nova.enfileirar(atual.getItem());
                    copiarRestante(atual.getProximo(), nova);
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F069]
    // ============================================================================
    // region [F070] 03_PADROES_REUTILIZAVEIS/P15_SubPilha.java
    // BUSCA: P15 Sub Pilha
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P15_SubPilha.java
    // ============================================================================
    /*
     * ============================================================================
     * P15 - Subpilha mantendo ordem e original
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Leitura por cursor preserva original; duas transferencias conservam ordem.
     *
     * EXEMPLO / TESTE DE MESA
     * topo[30,20,10],k2 ->topo[30,20].
     *
     * CASOS DE BORDA
     * k0;negativo;insuficiente sem perder dados.
     *
     * CUSTO E EFEITOS
     * O(k) tempo/memoria.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Pilha.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P15_SubPilha {
        public static class Pilha<E> {
            private Biblioteca.Base.Celula<E> topo;
            private final Biblioteca.Base.Celula<E> fundo;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Copia celulas; nao clona profundamente os objetos E. Preserva this. */
                public Pilha<E> subPilha(int numItens) {
                    if (numItens < 0) throw new IllegalArgumentException("Quantidade negativa");
                    Biblioteca.Base.Celula<E> aux = topo;
                    Pilha<E> inversa = new Pilha<>();
                    for (int i = 0; i < numItens; i++) {
                        if (aux == fundo) throw new IllegalArgumentException("Itens insuficientes");
                        inversa.empilhar(aux.getItem());
                        aux = aux.getProximo();
                    }
                    Pilha<E> resultado = new Pilha<>();
                    while (!inversa.vazia()) resultado.empilhar(inversa.desempilhar());
                    return resultado;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Pilha() { fundo = new Biblioteca.Base.Celula<>(); topo = fundo; }

            public boolean vazia() { return topo == fundo; }

            public void empilhar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    topo = new Biblioteca.Base.Celula<>(item, topo);
                }

            public E consultarTopo() {
                    if (vazia()) throw new NoSuchElementException("Pilha vazia");
                    return topo.getItem();
                }

            public E desempilhar() {
                    E removido = consultarTopo();
                    topo = topo.getProximo();
                    return removido;
                }

            public int obterNumeroItens() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = topo; p != fundo; p = p.getProximo()) n++;
                    return n;
                }

            /** Conveniencia do acervo para testes; nao assumir que existe no template. */
                public Object[] toArray() {
                    Object[] a = new Object[obterNumeroItens()];
                    int i = 0;
                    for (Biblioteca.Base.Celula<E> p = topo; p != fundo; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F070]
    // ============================================================================
    // region [F071] 03_PADROES_REUTILIZAVEIS/P16_MaiorPorExtrator.java
    // BUSCA: P16 Maior Por Extrator
    // ORIGEM_NO_ACERVO: 03_PADROES_REUTILIZAVEIS/P16_MaiorPorExtrator.java
    // ============================================================================
    /*
     * ============================================================================
     * P16 - Devolver objeto com maior valor extraido
     *
     * BASE: Extensao autoral dos padroes da disciplina.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Guarde o MELHOR E e a chave Double, atualizando juntos.
     *
     * EXEMPLO / TESTE DE MESA
     * Pedidos80,250,120 ->devolve Pedido250, nao apenas250.
     *
     * CASOS DE BORDA
     * Vazia;empateprimeiro;retornonull.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar.
     *
     * COMO ADAPTAR
     * Confirme a assinatura permitida. Estes metodos extras nao substituem assinaturas fixas dos PDFs.
     *
     * ATENCAO AO CONTRATO
     * Modelos de cadeia recebem primeiro DADO, nao sentinela. Retorno de cabeca exige atualizar controles da estrutura no wrapper.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class P16_MaiorPorExtrator {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public E encontrarMaior(Function<E, Double> extrator) {
                    if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
                    if (vazia()) throw new NoSuchElementException("Fila vazia");
                    Biblioteca.Base.Celula<E> p = frente.getProximo();
                    E melhor = p.getItem();
                    Double maior = extrator.apply(melhor);
                    if (maior == null) throw new IllegalArgumentException("Resultado nulo");
                    for (p = p.getProximo(); p != null; p = p.getProximo()) {
                        Double valor = extrator.apply(p.getItem());
                        if (valor == null) throw new IllegalArgumentException("Resultado nulo");
                        if (Double.compare(valor, maior) > 0) { melhor = p.getItem(); maior = valor; }
                    }
                    return melhor;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F071]
    // ============================================================================
    // region [F072] 04_EXERCICIOS_DOS_PDFS/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE - 04_EXERCICIOS_DOS_PDFS
     * ============================================================================
     *
     * 01_FILAS_BF/00_INDICE.java
     * 01_FILAS_BF/BF01_Concatenar.java
     * 01_FILAS_BF/BF02_Contar.java
     * 01_FILAS_BF/BF03_Existe.java
     * 01_FILAS_BF/BF04_QuantosAfrente.java
     * 01_FILAS_BF/BF05_Copiar.java
     * 01_FILAS_BF/BF06_Dividir.java
     * 02_LISTAS_BL/00_INDICE.java
     * 02_LISTAS_BL/BL01_InserirFinal.java
     * 02_LISTAS_BL/BL02_RemoverInicio.java
     * 02_LISTAS_BL/BL03_RemoverValor.java
     * 02_LISTAS_BL/BL04_Contar.java
     * 02_LISTAS_BL/BL05_Localizar.java
     * 02_LISTAS_BL/BL06_Trocar.java
     * 03_PILHAS_BP/00_INDICE.java
     * 03_PILHAS_BP/BP01_Concatenar.java
     * 03_PILHAS_BP/BP02_Contar.java
     * 03_PILHAS_BP/BP03_Inverter.java
     * 03_PILHAS_BP/BP04_Palindromo.java
     * 04_LISTA_FLEXIVEL_LF/00_INDICE.java
     * 04_LISTA_FLEXIVEL_LF/LF01_ConstrutorFilasOrdenadas.java
     * 04_LISTA_FLEXIVEL_LF/LF02_UnirPilha.java
     * 04_LISTA_FLEXIVEL_LF/LF03_ContarOcorrencias.java
     * 04_LISTA_FLEXIVEL_LF/LF04_Contem.java
     * 04_LISTA_FLEXIVEL_LF/LF05_Mesclar.java
     * 04_LISTA_FLEXIVEL_LF/LF06_CopiaInvertida.java
     * 04_LISTA_FLEXIVEL_LF/LF07_Inverter.java
     * 04_LISTA_FLEXIVEL_LF/LF08_MesclarInvertidas.java
     * 04_LISTA_FLEXIVEL_LF/LF09_Clone.java
     * 04_LISTA_FLEXIVEL_LF/LF10_InserirEmOrdem.java
     * 04_LISTA_FLEXIVEL_LF/LF11_RemoverTodos.java
     * 05_FILA_FLEXIVEL_FF/00_INDICE.java
     * 05_FILA_FLEXIVEL_FF/FF01_ConstrutorArray.java
     * 05_FILA_FLEXIVEL_FF/FF02_ConstrutorPilha.java
     * 05_FILA_FLEXIVEL_FF/FF03_Unir.java
     * 05_FILA_FLEXIVEL_FF/FF04_ContagemRecursiva.java
     * 05_FILA_FLEXIVEL_FF/FF05_ContemRecursivo.java
     * 05_FILA_FLEXIVEL_FF/FF06_InverterRecebida.java
     * 05_FILA_FLEXIVEL_FF/FF07_CopiaInvertida.java
     * 05_FILA_FLEXIVEL_FF/FF08_Mesclar.java
     * 05_FILA_FLEXIVEL_FF/FF09_Inverter.java
     * 05_FILA_FLEXIVEL_FF/FF10_QuantosAfrente.java
     * 05_FILA_FLEXIVEL_FF/FF11_DoisArraysOrdenados.java
     * 05_FILA_FLEXIVEL_FF/FF12_Copiar.java
     * 05_FILA_FLEXIVEL_FF/FF13_Dividir.java
     * 05_FILA_FLEXIVEL_FF/FF14_PseudoPilha.java
     * 06_REVISAO_R/00_INDICE.java
     * 06_REVISAO_R/R01_ObterItem.java
     * 06_REVISAO_R/R02_ExtrairMenores.java
     * 06_REVISAO_R/R03_PseudoFila.java
     * 06_REVISAO_R/R04_CorrigirTras.java
     * 06_REVISAO_R/R05_IntercalarOrdenadas.java
     * 06_REVISAO_R/R06_MaiorRecursivo.java
     * 06_REVISAO_R/R07_Rotacionar.java
     * 06_REVISAO_R/R08_DividirAoMeio.java
     * 06_REVISAO_R/R09_TrocarPrimeiros.java
     * 06_REVISAO_R/R10_CustosSimplesDupla.java
     * 06_REVISAO_R/R11_RemoverFimDupla.java
     * 06_REVISAO_R/R12_InserirDupla.java
     * 06_REVISAO_R/R13_InverterDupla.java
     * 06_REVISAO_R/R14_RemoverTodosDupla.java
     * 06_REVISAO_R/R15_PalindromoDupla.java
     * 06_REVISAO_R/R16_ConcatenarDupla.java
     * 06_REVISAO_R/R17_ConstrutorDuplaFila.java
     * 06_REVISAO_R/R18_MergeSort.java
     * 06_REVISAO_R/R19_HeapSort.java
     * 06_REVISAO_R/R20_QuickSort.java
     * 06_REVISAO_R/R21_EscolherAlgoritmo.java
     * 06_REVISAO_R/R22_Lomuto.java
     * 06_REVISAO_R/R23_OrdenarLista.java
     */
    // endregion [F072]
    // ============================================================================
    // region [F073] 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE - Filas - AEDs II.pdf
     * ============================================================================
     *
     * BF01_Concatenar.java
     *   Concatenar duas filas
     * BF02_Contar.java
     *   Quantidade de itens da fila
     * BF03_Existe.java
     *   Existencia por igualdade
     * BF04_QuantosAfrente.java
     *   Contar anteriores ao alvo
     * BF05_Copiar.java
     *   Copia estrutural da fila
     * BF06_Dividir.java
     *   Separar posicoes pares e impares
     *
     * Procure SOLUCAO_PEDIDA_AQUI dentro de cada ficha.
     * As explicacoes ficam em comentarios; os metodos estao em codigo Java real.
     */
    // endregion [F073]
    // ============================================================================
    // region [F074] 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF01_Concatenar.java
    // BUSCA: BF01 Concatenar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF01_Concatenar.java
    // ============================================================================
    /*
     * ============================================================================
     * BF01 - Concatenar duas filas
     *
     * BASE: Filas - AEDs II.pdf, questao 1, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Anexe os dados de outra no final de this. Percorra com cursor, enfileirando no destino.
     * Se outra==this, copie primeiro para nao percorrer uma fila que cresce indefinidamente.
     *
     * EXEMPLO / TESTE DE MESA
     * A=[10,20], B=[30,40] -> A=[10,20,30,40], B preservada.
     * A.concatenar(A) duplica a sequencia original uma vez.
     *
     * CASOS DE BORDA
     * A/B vazias; unidade; outra==this; origem null rejeitada.
     *
     * CUSTO E EFEITOS
     * O(m) tempo. O(m) novas celulas no destino; auxiliar O(1), ou O(m) em autoalias.
     *
     * COMO ADAPTAR
     * Religar e consumir origem pode ser O(1), mas viola preservacao quando exigida.
     *
     * ATENCAO AO CONTRATO
     * O PDF nao fixa se a segunda fila deve ser destruida. Aqui ela e preservada.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BF01_Concatenar {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void concatenar(Fila<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Fila nula");
                    Fila<E> fonte = outra == this ? outra.copiar() : outra;
                    for (Biblioteca.Base.Celula<E> p = fonte.frente.getProximo(); p != null; p = p.getProximo()) enfileirar(p.getItem());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Fila<E> copiar() {
                    Fila<E> nova = new Fila<>();
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) nova.enfileirar(p.getItem());
                    return nova;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F074]
    // ============================================================================
    // region [F075] 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF02_Contar.java
    // BUSCA: BF02 Contar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF02_Contar.java
    // ============================================================================
    /*
     * ============================================================================
     * BF02 - Quantidade de itens da fila
     *
     * BASE: Filas - AEDs II.pdf, questao 2, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * A sentinela nao conta. A versao iterativa percorre desde frente.proximo.
     * A recursiva atribui 1 a cada dado e 0 ao trecho vazio.
     *
     * EXEMPLO / TESTE DE MESA
     * S->10->20->30->null: 1+(1+(1+0))=3.
     *
     * CASOS DE BORDA
     * Vazia=0; uma celula=1; repetidos contam separadamente.
     *
     * CUSTO E EFEITOS
     * Iterativa O(n)/O(1); recursiva O(n) tempo e chamadas.
     *
     * COMO ADAPTAR
     * Se existir tamanho armazenado e mantido corretamente, consulta pode custar O(1).
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BF02_Contar {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public int obterNumeroItens() { return obterNumeroItens(frente.getProximo()); }

            public int obterNumeroItens(Biblioteca.Base.Celula<E> aux) {
                    if (aux == null) return 0;
                    return 1 + obterNumeroItens(aux.getProximo());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F075]
    // ============================================================================
    // region [F076] 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF03_Existe.java
    // BUSCA: BF03 Existe
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF03_Existe.java
    // ============================================================================
    /*
     * ============================================================================
     * BF03 - Existencia por igualdade
     *
     * BASE: Filas - AEDs II.pdf, questao 3, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * null encerra com false. Encontrar equals verdadeiro encerra com true.
     * Se nao encontrou nesta celula, retorne o resultado da proxima.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30], alvo20 -> true; alvo99 -> false.
     *
     * CASOS DE BORDA
     * Vazia; primeiro; ultimo; ausente; repetidos.
     *
     * CUSTO E EFEITOS
     * O(n) pior; esta versao usa O(n) pilha de chamadas e nao altera a fila.
     *
     * COMO ADAPTAR
     * Um while sem return antecipado pode ser usado se recursao nao for obrigatoria.
     *
     * ATENCAO AO CONTRATO
     * A folha fala em criterio de comparacao do item. Escolhemos equals para igualdade.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BF03_Existe {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public boolean verificarExistencia(E item) { return contem(item); }

            public boolean contem(E item) { return contem(item, frente.getProximo()); }

            public boolean contem(E item, Biblioteca.Base.Celula<E> aux) {
                    if (aux == null) return false;
                    if (aux.getItem().equals(item)) return true;
                    return contem(item, aux.getProximo());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F076]
    // ============================================================================
    // region [F077] 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF04_QuantosAfrente.java
    // BUSCA: BF04 Quantos Afrente
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF04_QuantosAfrente.java
    // ============================================================================
    /*
     * ============================================================================
     * BF04 - Contar anteriores ao alvo
     *
     * BASE: Filas - AEDs II.pdf, questao 4, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ao encontrar o alvo, retorne 0. Cada chamada anterior soma 1.
     * Se chegar a null sem encontrar, lance excecao. O alvo nao entra na contagem.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30], alvo30: 30 devolve0; 20 devolve1; 10 devolve2.
     *
     * CASOS DE BORDA
     * Primeiro=0; ultimo=n-1; ausencia/vazio=excecao.
     *
     * CUSTO E EFEITOS
     * O(n) tempo e stack; preserva fila.
     *
     * COMO ADAPTAR
     * Se ausencia fosse -1, propague -1 sem somar. Nao use essa variante quando o PDF pede excecao.
     *
     * ATENCAO AO CONTRATO
     * Alias obterNumItensAFrente declara throws Exception como o PDF. FF10 usa celula primeiro.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BF04_QuantosAfrente {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public int quantosAfrente(E item) { return quantosAfrente(frente.getProximo(), item); }

            /** FF10 exige esta ordem: celula primeiro, item segundo. */
                public int quantosAfrente(Biblioteca.Base.Celula<E> atual, E item) {
                    if (atual == null) throw new NoSuchElementException("Item nao encontrado");
                    if (atual.getItem().equals(item)) return 0;
                    return 1 + quantosAfrente(atual.getProximo(), item);
                }

            /** Assinatura literal da folha BF04, incluindo throws Exception. */
                public int obterNumItensAFrente(E item) throws Exception { return quantosAfrente(item); }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F077]
    // ============================================================================
    // region [F078] 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF05_Copiar.java
    // BUSCA: BF05 Copiar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF05_Copiar.java
    // ============================================================================
    /*
     * ============================================================================
     * BF05 - Copia estrutural da fila
     *
     * BASE: Filas - AEDs II.pdf, questao 5, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Crie outra fila e enfileire os itens vistos pelo cursor. Nao desenfileire this.
     * As celulas sao novas; os objetos E continuam compartilhados.
     *
     * EXEMPLO / TESTE DE MESA
     * A=[10,20,30]; B=A.copiar(); retirar de B nao retira de A.
     *
     * CASOS DE BORDA
     * Vazia devolve fila vazia, nao null; unidade; objetos mutaveis.
     *
     * CUSTO E EFEITOS
     * O(n) tempo e O(n) celulas.
     *
     * COMO ADAPTAR
     * Copia profunda precisa de uma regra adicional para copiar E; new Fila nao a faz sozinho.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BF05_Copiar {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila<E> copiar() {
                    Fila<E> nova = new Fila<>();
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) nova.enfileirar(p.getItem());
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F078]
    // ============================================================================
    // region [F079] 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF06_Dividir.java
    // BUSCA: BF06 Dividir
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/01_FILAS_BF/BF06_Dividir.java
    // ============================================================================
    /*
     * ============================================================================
     * BF06 - Separar posicoes pares e impares
     *
     * BASE: Filas - AEDs II.pdf, questao 6, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Percorra contando posicoes ORIGINAIS. Destaque pares e anexe no resultado;
     * impares ficam em this. Guarde seguinte antes de religar.
     *
     * EXEMPLO / TESTE DE MESA
     * [A,B,C,D,E] -> this[B,D], retorno[A,C,E]. Posicao inicial=0.
     *
     * CASOS DE BORDA
     * n=0,1,2; par/impar; retirar todos; conferir tras das duas filas.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar alem de nova sentinela; reutiliza dados.
     *
     * COMO ADAPTAR
     * Trocar o destino inverte quem recebe pares. Testar valor%2 nao resolve posicao par.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BF06_Dividir {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Pares das POSICOES originais vao para retorno; impares ficam em this. */
                public Fila<E> dividir() {
                    Fila<E> pares = new Fila<>();
                    Biblioteca.Base.Celula<E> anterior = frente, atual = frente.getProximo();
                    int pos = 0;
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        if (pos % 2 == 0) {
                            anterior.setProximo(seguinte);
                            if (atual == tras) tras = anterior;
                            atual.setProximo(null);
                            pares.tras.setProximo(atual);
                            pares.tras = atual;
                        } else anterior = atual;
                        atual = seguinte;
                        pos++;
                    }
                    return pares;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F079]
    // ============================================================================
    // region [F080] 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE - Listas encadeadas - AEDs II.pdf
     * ============================================================================
     *
     * BL01_InserirFinal.java
     *   Inserir no final
     * BL02_RemoverInicio.java
     *   Retirar primeiro dado
     * BL03_RemoverValor.java
     *   Retirar primeira ocorrencia
     * BL04_Contar.java
     *   Contar lista sem incluir sentinela
     * BL05_Localizar.java
     *   Consultar posicao
     * BL06_Trocar.java
     *   Trocar dois itens de lugar
     *
     * Procure SOLUCAO_PEDIDA_AQUI dentro de cada ficha.
     * As explicacoes ficam em comentarios; os metodos estao em codigo Java real.
     */
    // endregion [F080]
    // ============================================================================
    // region [F081] 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL01_InserirFinal.java
    // BUSCA: BL01 Inserir Final
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL01_InserirFinal.java
    // ============================================================================
    /*
     * ============================================================================
     * BL01 - Inserir no final
     *
     * BASE: Listas encadeadas - AEDs II.pdf, questao 1, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Crie nova com proximo null, ligue ultimo.proximo nela e atualize ultimo.
     * Na vazia, ultimo e a sentinela: o mesmo codigo funciona.
     *
     * EXEMPLO / TESTE DE MESA
     * S->10; inserir20 -> S->10->20, ultimo=20.
     *
     * CASOS DE BORDA
     * Vazia/unidade; inserir apos esvaziar; null conforme contrato.
     *
     * CUSTO E EFEITOS
     * O(1), uma celula nova.
     *
     * COMO ADAPTAR
     * Sem ultimo, buscar o final torna a insercao O(n).
     *
     * ATENCAO AO CONTRATO
     * O acervo possui tamanho. Se seu template nao o tiver, nao copie tamanho++ sem adaptar.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BL01_InserirFinal {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F081]
    // ============================================================================
    // region [F082] 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL02_RemoverInicio.java
    // BUSCA: BL02 Remover Inicio
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL02_RemoverInicio.java
    // ============================================================================
    /*
     * ============================================================================
     * BL02 - Retirar primeiro dado
     *
     * BASE: Listas encadeadas - AEDs II.pdf, questao 2, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * O predecessor do primeiro dado e S. S passa a apontar ao sucessor do removido.
     * Se era ultimo, ultimo=S. O helper remover(0) executa esse movimento.
     *
     * EXEMPLO / TESTE DE MESA
     * S->10->20; retorna10 e sobra S->20. Tirar20 deixa primeiro==ultimo.
     *
     * CASOS DE BORDA
     * Vazia lanca; unico exige restaurar ultimo; reinserir depois.
     *
     * CUSTO E EFEITOS
     * O(1) para inicio; helper por posicao custa O(pos).
     *
     * COMO ADAPTAR
     * Se nao existir remover(int), escreva diretamente o corpo com predecessor=primeiro.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BL02_RemoverInicio {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public E remover(int pos) {
                    if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                    Biblioteca.Base.Celula<E> anterior = primeiro;
                    for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
                    Biblioteca.Base.Celula<E> r = anterior.getProximo();
                    anterior.setProximo(r.getProximo());
                    if (r == ultimo) ultimo = anterior;
                    r.setProximo(null); tamanho--;
                    return r.getItem();
                }

            public E removerInicio() {
                    if (vazia()) throw new NoSuchElementException("Lista vazia");
                    return remover(0);
                }

            /** Com E=Integer: remover(2) escolhe posicao; remover(Integer.valueOf(2)) escolhe valor. */
                public E remover(E itemProcurado) {
                    Biblioteca.Base.Celula<E> anterior = primeiro;
                    while (anterior.getProximo() != null && !anterior.getProximo().getItem().equals(itemProcurado)) anterior = anterior.getProximo();
                    if (anterior.getProximo() == null) throw new NoSuchElementException("Item ausente");
                    Biblioteca.Base.Celula<E> r = anterior.getProximo();
                    anterior.setProximo(r.getProximo());
                    if (r == ultimo) ultimo = anterior;
                    r.setProximo(null); tamanho--;
                    return r.getItem();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F082]
    // ============================================================================
    // region [F083] 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL03_RemoverValor.java
    // BUSCA: BL03 Remover Valor
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL03_RemoverValor.java
    // ============================================================================
    /*
     * ============================================================================
     * BL03 - Retirar primeira ocorrencia
     *
     * BASE: Listas encadeadas - AEDs II.pdf, questao 3, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Busque o predecessor da primeira ocorrencia por equals. Religue antes de avancar.
     * O metodo devolve o objeto encontrado, nao o argumento procurado.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,20,30], remover valor20 -> [10,20,30].
     *
     * CASOS DE BORDA
     * Inicio/meio/fim; unico; ausente; repetidos.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar.
     *
     * COMO ADAPTAR
     * Remover todas exige continuar e manter predecessor parado quando remove.
     *
     * ATENCAO AO CONTRATO
     * Sobrecarga: Lista<Integer>.remover(2) remove POSICAO2; use Integer.valueOf(2) para VALOR2.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BL03_RemoverValor {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public E remover(int pos) {
                    if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                    Biblioteca.Base.Celula<E> anterior = primeiro;
                    for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
                    Biblioteca.Base.Celula<E> r = anterior.getProximo();
                    anterior.setProximo(r.getProximo());
                    if (r == ultimo) ultimo = anterior;
                    r.setProximo(null); tamanho--;
                    return r.getItem();
                }

            /** Com E=Integer: remover(2) escolhe posicao; remover(Integer.valueOf(2)) escolhe valor. */
                public E remover(E itemProcurado) {
                    Biblioteca.Base.Celula<E> anterior = primeiro;
                    while (anterior.getProximo() != null && !anterior.getProximo().getItem().equals(itemProcurado)) anterior = anterior.getProximo();
                    if (anterior.getProximo() == null) throw new NoSuchElementException("Item ausente");
                    Biblioteca.Base.Celula<E> r = anterior.getProximo();
                    anterior.setProximo(r.getProximo());
                    if (r == ultimo) ultimo = anterior;
                    r.setProximo(null); tamanho--;
                    return r.getItem();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F083]
    // ============================================================================
    // region [F084] 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL04_Contar.java
    // BUSCA: BL04 Contar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL04_Contar.java
    // ============================================================================
    /*
     * ============================================================================
     * BL04 - Contar lista sem incluir sentinela
     *
     * BASE: Listas encadeadas - AEDs II.pdf, questao 4, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Conte os nos a partir de primeiro.proximo. Nao modifique primeiro/ultimo.
     *
     * EXEMPLO / TESTE DE MESA
     * []->0; [9]->1; [9,9,9]->3.
     *
     * CASOS DE BORDA
     * Vazia; unidade; depois de insercoes/remocoes.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) memoria.
     *
     * COMO ADAPTAR
     * Retornar tamanho e O(1) se o campo existir e suas atualizacoes forem corretas.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BL04_Contar {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public int obterNumeroItens() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F084]
    // ============================================================================
    // region [F085] 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL05_Localizar.java
    // BUSCA: BL05 Localizar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL05_Localizar.java
    // ============================================================================
    /*
     * ============================================================================
     * BL05 - Consultar posicao
     *
     * BASE: Listas encadeadas - AEDs II.pdf, questao 5, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Pos0 corresponde ao primeiro dado. Avance pos vezes, nao pos+1.
     * Consulta nao remove. Intervalo valido:0..n-1.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30]: localizar(0)=10; localizar(2)=30; localizar(3)=erro.
     *
     * CASOS DE BORDA
     * Pos negativa; pos==n; vazia; primeiro/ultimo.
     *
     * CUSTO E EFEITOS
     * O(pos+1) tempo/O(1) auxiliar.
     *
     * COMO ADAPTAR
     * Sem campo tamanho, detecte aux==null durante a caminhada. Veja R01 para recursao.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BL05_Localizar {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public E localizar(int pos) {
                    if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                    Biblioteca.Base.Celula<E> p = primeiro.getProximo();
                    for (int i = 0; i < pos; i++) p = p.getProximo();
                    return p.getItem();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F085]
    // ============================================================================
    // region [F086] 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL06_Trocar.java
    // BUSCA: BL06 Trocar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/02_LISTAS_BL/BL06_Trocar.java
    // ============================================================================
    /*
     * ============================================================================
     * BL06 - Trocar dois itens de lugar
     *
     * BASE: Listas encadeadas - AEDs II.pdf, questao 6, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Localize os predecessores dos dois nos antes de alterar. Trate separadamente
     * X antes de Y, Y antes de X e nao adjacentes. Corrija ultimo.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30,40], trocar20/40 -> [10,40,30,20].
     * [10,20], trocar10/20 -> [20,10].
     *
     * CASOS DE BORDA
     * Vizinhos nas duas ordens; extremos; mesmo no; ausencia antes de alterar.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar. Item final nao e modificado.
     *
     * COMO ADAPTAR
     * Variante com setItem troca valores, nao nos. So vale se o campo nao for final.
     *
     * ATENCAO AO CONTRATO
     * O PDF sugere retirar final; a revisao traz item final. A solucao aqui funciona por religacao.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BL06_Trocar {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Primeiras ocorrencias; troca CELULAS, sem alterar item final. */
                public void trocar(E xItem, E yItem) {
                    Biblioteca.Base.Celula<E> ax = primeiro, ay = primeiro;
                    while (ax.getProximo() != null && !ax.getProximo().getItem().equals(xItem)) ax = ax.getProximo();
                    while (ay.getProximo() != null && !ay.getProximo().getItem().equals(yItem)) ay = ay.getProximo();
                    Biblioteca.Base.Celula<E> x = ax.getProximo(), y = ay.getProximo();
                    if (x == null || y == null) throw new NoSuchElementException("Item ausente");
                    if (x == y) return;
                    if (x.getProximo() == y) {
                        ax.setProximo(y); x.setProximo(y.getProximo()); y.setProximo(x);
                    } else if (y.getProximo() == x) {
                        ay.setProximo(x); y.setProximo(x.getProximo()); x.setProximo(y);
                    } else {
                        Biblioteca.Base.Celula<E> nx = x.getProximo(), ny = y.getProximo();
                        ax.setProximo(y); ay.setProximo(x); x.setProximo(ny); y.setProximo(nx);
                    }
                    if (ultimo == x) ultimo = y; else if (ultimo == y) ultimo = x;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F086]
    // ============================================================================
    // region [F087] 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE - Pilhas - AEDs II.pdf
     * ============================================================================
     *
     * BP01_Concatenar.java
     *   Concatenar pilhas com ordem declarada
     * BP02_Contar.java
     *   Contar pilha com fundo sentinela
     * BP03_Inverter.java
     *   Inverter pilha por links ou recursao
     * BP04_Palindromo.java
     *   String palindromo usando pilha de celulas
     *
     * Procure SOLUCAO_PEDIDA_AQUI dentro de cada ficha.
     * As explicacoes ficam em comentarios; os metodos estao em codigo Java real.
     */
    // endregion [F087]
    // ============================================================================
    // region [F088] 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP01_Concatenar.java
    // BUSCA: BP01 Concatenar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP01_Concatenar.java
    // ============================================================================
    /*
     * ============================================================================
     * BP01 - Concatenar pilhas com ordem declarada
     *
     * BASE: Pilhas - AEDs II.pdf, questao 1, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Adotamos final como fim da sequencia topo->fundo. Copie outra, encontre ultimo
     * dado de this e anexe os itens da copia mantendo a ordem. Nao anexe a sentinela alheia.
     *
     * EXEMPLO / TESTE DE MESA
     * Topo A=[3,2], topo B=[9,8] -> topo A=[3,2,9,8]; B intacta.
     *
     * CASOS DE BORDA
     * Vazias; unidade; autoalias; fim precisa apontar para fundo de A.
     *
     * CUSTO E EFEITOS
     * O(n+m) tempo/O(m) auxiliar e celulas.
     *
     * COMO ADAPTAR
     * Se final significar empilhar sobre o topo, a ordem muda; desenhe antes.
     *
     * ATENCAO AO CONTRATO
     * A palavra final e ambigua na folha. Esta ficha declara sua convencao.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Pilha.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BP01_Concatenar {
        public static class Pilha<E> {
            private Biblioteca.Base.Celula<E> topo;
            private final Biblioteca.Base.Celula<E> fundo;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Convencao: topo[A,B] + topo[C,D] = topo[A,B,C,D]. Preserva outra. */
                public void concatenar(Pilha<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Pilha nula");
                    Pilha<E> copia = outra.copiar();
                    Biblioteca.Base.Celula<E> anterior = fundo;
                    for (Biblioteca.Base.Celula<E> p = topo; p != fundo; p = p.getProximo()) anterior = p;
                    while (!copia.vazia()) {
                        Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(copia.desempilhar(), fundo);
                        if (anterior == fundo) topo = nova;
                        else anterior.setProximo(nova);
                        anterior = nova;
                    }
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Pilha() { fundo = new Biblioteca.Base.Celula<>(); topo = fundo; }

            public boolean vazia() { return topo == fundo; }

            public void empilhar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    topo = new Biblioteca.Base.Celula<>(item, topo);
                }

            public E consultarTopo() {
                    if (vazia()) throw new NoSuchElementException("Pilha vazia");
                    return topo.getItem();
                }

            public E desempilhar() {
                    E removido = consultarTopo();
                    topo = topo.getProximo();
                    return removido;
                }

            public int obterNumeroItens() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = topo; p != fundo; p = p.getProximo()) n++;
                    return n;
                }

            /** Copia celulas; nao clona profundamente os objetos E. Preserva this. */
                public Pilha<E> subPilha(int numItens) {
                    if (numItens < 0) throw new IllegalArgumentException("Quantidade negativa");
                    Biblioteca.Base.Celula<E> aux = topo;
                    Pilha<E> inversa = new Pilha<>();
                    for (int i = 0; i < numItens; i++) {
                        if (aux == fundo) throw new IllegalArgumentException("Itens insuficientes");
                        inversa.empilhar(aux.getItem());
                        aux = aux.getProximo();
                    }
                    Pilha<E> resultado = new Pilha<>();
                    while (!inversa.vazia()) resultado.empilhar(inversa.desempilhar());
                    return resultado;
                }

            public Pilha<E> copiar() { return subPilha(obterNumeroItens()); }

            /** Conveniencia do acervo para testes; nao assumir que existe no template. */
                public Object[] toArray() {
                    Object[] a = new Object[obterNumeroItens()];
                    int i = 0;
                    for (Biblioteca.Base.Celula<E> p = topo; p != fundo; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F088]
    // ============================================================================
    // region [F089] 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP02_Contar.java
    // BUSCA: BP02 Contar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP02_Contar.java
    // ============================================================================
    /*
     * ============================================================================
     * BP02 - Contar pilha com fundo sentinela
     *
     * BASE: Pilhas - AEDs II.pdf, questao 2, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Comece em topo e pare em fundo. O fundo e um objeto real; parar somente em
     * null pode contar a sentinela.
     *
     * EXEMPLO / TESTE DE MESA
     * topo->30->20->10->S->null:3 dados.
     *
     * CASOS DE BORDA
     * topo==fundo retorna0; unidade1; sentinela nao e item.
     *
     * CUSTO E EFEITOS
     * Iterativa O(n)/O(1); recursiva O(n)/O(n).
     *
     * COMO ADAPTAR
     * Na pilha SEM sentinela a parada correta e null, nao fundo.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Pilha.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BP02_Contar {
        public static class Pilha<E> {
            private Biblioteca.Base.Celula<E> topo;
            private final Biblioteca.Base.Celula<E> fundo;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public int obterNumeroItens() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = topo; p != fundo; p = p.getProximo()) n++;
                    return n;
                }

            public int contarRecursivo() { return contarRecursivo(topo); }

            private int contarRecursivo(Biblioteca.Base.Celula<E> atual) {
                    if (atual == fundo) return 0;
                    return 1 + contarRecursivo(atual.getProximo());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Pilha() { fundo = new Biblioteca.Base.Celula<>(); topo = fundo; }

            public boolean vazia() { return topo == fundo; }

            public void empilhar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    topo = new Biblioteca.Base.Celula<>(item, topo);
                }

            /** Conveniencia do acervo para testes; nao assumir que existe no template. */
                public Object[] toArray() {
                    Object[] a = new Object[obterNumeroItens()];
                    int i = 0;
                    for (Biblioteca.Base.Celula<E> p = topo; p != fundo; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F089]
    // ============================================================================
    // region [F090] 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP03_Inverter.java
    // BUSCA: BP03 Inverter
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP03_Inverter.java
    // ============================================================================
    /*
     * ============================================================================
     * BP03 - Inverter pilha por links ou recursao
     *
     * BASE: Pilhas - AEDs II.pdf, questao 3, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Por links, anterior comeca no fundo. Guarde seguinte antes de virar cada seta.
     * Por API recursiva: retire topo, inverta resto, coloque o salvo no fundo.
     *
     * EXEMPLO / TESTE DE MESA
     * topo[30,20,10] -> topo[10,20,30]; primeiro pop retorna10.
     *
     * CASOS DE BORDA
     * Vazia/unidade; inverter duas vezes; sentinela continua fundo.
     *
     * CUSTO E EFEITOS
     * Links O(n)/O(1). Recursao com inserirFundo O(n^2) tempo/O(n) chamadas.
     *
     * COMO ADAPTAR
     * Uma transferencia entre pilhas inverte; duas restauram. Conte as inversoes.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Pilha.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BP03_Inverter {
        public static class Pilha<E> {
            private Biblioteca.Base.Celula<E> topo;
            private final Biblioteca.Base.Celula<E> fundo;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void inverter() {
                    Biblioteca.Base.Celula<E> anterior = fundo;
                    Biblioteca.Base.Celula<E> atual = topo;
                    while (atual != fundo) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior);
                        anterior = atual;
                        atual = seguinte;
                    }
                    topo = anterior;
                }

            /** Apenas API de pilha. O(n^2) tempo e O(n) chamadas. */
                public void inverterRecursivamente() {
                    if (vazia()) return;
                    E item = desempilhar();
                    inverterRecursivamente();
                    inserirFundo(item);
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Pilha() { fundo = new Biblioteca.Base.Celula<>(); topo = fundo; }

            public boolean vazia() { return topo == fundo; }

            public void empilhar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    topo = new Biblioteca.Base.Celula<>(item, topo);
                }

            public E consultarTopo() {
                    if (vazia()) throw new NoSuchElementException("Pilha vazia");
                    return topo.getItem();
                }

            public E desempilhar() {
                    E removido = consultarTopo();
                    topo = topo.getProximo();
                    return removido;
                }

            public int obterNumeroItens() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = topo; p != fundo; p = p.getProximo()) n++;
                    return n;
                }

            private void inserirFundo(E item) {
                    if (vazia()) { empilhar(item); return; }
                    E salvo = desempilhar();
                    inserirFundo(item);
                    empilhar(salvo);
                }

            /** Conveniencia do acervo para testes; nao assumir que existe no template. */
                public Object[] toArray() {
                    Object[] a = new Object[obterNumeroItens()];
                    int i = 0;
                    for (Biblioteca.Base.Celula<E> p = topo; p != fundo; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F090]
    // ============================================================================
    // region [F091] 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP04_Palindromo.java
    // BUSCA: BP04 Palindromo
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/03_PILHAS_BP/BP04_Palindromo.java
    // ============================================================================
    /*
     * ============================================================================
     * BP04 - String palindromo usando pilha de celulas
     *
     * BASE: Pilhas - AEDs II.pdf, questao 4, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * A pilha retira em ordem inversa; a fila retira em ordem normal. Compare cada par.
     * Esta adaptacao ignora caixa, espacos, pontuacao e acentos.
     *
     * EXEMPLO / TESTE DE MESA
     * "Socorram-me em Marrocos"->true; "arara"->true; "java"->false.
     *
     * CASOS DE BORDA
     * Vazia=true por convencao; par/impar; acentos; caixa; uma letra.
     *
     * CUSTO E EFEITOS
     * O(n) tempo e memoria.
     *
     * COMO ADAPTAR
     * Para caracteres exatos, retire a normalizacao. Sem fila, percorra o texto enquanto desempilha.
     *
     * ATENCAO AO CONTRATO
     * A normalizacao completa foi uma escolha autoral; o PDF apresenta palavras e frases.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class BP04_Palindromo {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Politica explicita: ignora caixa, espacos, pontuacao e marcas de acento. */
                public static boolean palindromo(String texto) {
                    if (texto == null) throw new IllegalArgumentException("Texto nulo");
                    String s = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{M}+", "").toLowerCase(Locale.ROOT);
                    Biblioteca.Base.Pilha<Integer> p = new Biblioteca.Base.Pilha<>(); Biblioteca.Base.Fila<Integer> f = new Biblioteca.Base.Fila<>();
                    for (int i = 0; i < s.length();) {
                        int c = s.codePointAt(i); i += Character.charCount(c);
                        if (Character.isLetterOrDigit(c)) { p.empilhar(c); f.enfileirar(c); }
                    }
                    while (!f.vazia()) if (!f.desenfileirar().equals(p.desempilhar())) return false;
                    return true;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F091]
    // ============================================================================
    // region [F092] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE - Lista de Exercicios de Lista Flexivel.docx.PDF
     * ============================================================================
     *
     * LF01_ConstrutorFilasOrdenadas.java
     *   Construtor com duas filas ordenadas
     * LF02_UnirPilha.java
     *   Unir lista e pilha na ordem de insercao
     * LF03_ContarOcorrencias.java
     *   Contar ocorrencias recursivas
     * LF04_Contem.java
     *   Contem recursivo
     * LF05_Mesclar.java
     *   Mesclar listas alternadas
     * LF06_CopiaInvertida.java
     *   Nova lista invertida preservando origem
     * LF07_Inverter.java
     *   Inverter lista atual
     * LF08_MesclarInvertidas.java
     *   Intercalar duas listas invertidas
     * LF09_Clone.java
     *   Clone estrutural
     * LF10_InserirEmOrdem.java
     *   Insercao em lista ordenada
     * LF11_RemoverTodos.java
     *   Remover todas as ocorrencias
     *
     * Procure SOLUCAO_PEDIDA_AQUI dentro de cada ficha.
     * As explicacoes ficam em comentarios; os metodos estao em codigo Java real.
     */
    // endregion [F092]
    // ============================================================================
    // region [F093] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF01_ConstrutorFilasOrdenadas.java
    // BUSCA: LF01 Construtor Filas Ordenadas
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF01_ConstrutorFilasOrdenadas.java
    // ============================================================================
    /*
     * ============================================================================
     * LF01 - Construtor com duas filas ordenadas
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 1, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Copie cada fila pela API publica e restaure-a. Mantenha um candidato de cada
     * origem; escolha o menor por compareTo, avance so esse lado e copie sobras.
     *
     * EXEMPLO / TESTE DE MESA
     * A[1,4,7],B[2,4,9] -> nova[1,2,4A,4B,7,9].
     *
     * CASOS DE BORDA
     * Ambas/uma vazia; comprimentos distintos; empates; A==B.
     *
     * CUSTO E EFEITOS
     * O(n+m) tempo/O(n+m) espaco. Entradas preservadas logicamente.
     *
     * COMO ADAPTAR
     * Se consumir entradas for permitido, pode dispensar copias auxiliares.
     *
     * ATENCAO AO CONTRATO
     * Classe com E extends Comparable<E>. Os helpers desta ficha foram implementados, nao sao presumidos prontos.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF01_ConstrutorFilasOrdenadas {
        public static class Lista<E extends Comparable<E>> {
            private Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Lista() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            /** LF01: copia via API publica; entradas ficam na mesma ordem. */
                public Lista(Biblioteca.Base.Fila<E> a, Biblioteca.Base.Fila<E> b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
                    E x = ca.vazia() ? null : ca.desenfileirar();
                    E y = cb.vazia() ? null : cb.desenfileirar();
                    while (x != null && y != null) {
                        if (x.compareTo(y) <= 0) {
                            inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
                        } else {
                            inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
                        }
                    }
                    if (x != null) inserirFinal(x);
                    if (y != null) inserirFinal(y);
                    while (!ca.vazia()) inserirFinal(ca.desenfileirar());
                    while (!cb.vazia()) inserirFinal(cb.desenfileirar());
                }

            private Biblioteca.Base.Fila<E> copiarPorAPI(Biblioteca.Base.Fila<E> fila) {
                    Biblioteca.Base.Fila<E> copia = new Biblioteca.Base.Fila<>(), auxiliar = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) {
                        E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
                    }
                    while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
                    return copia;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public boolean vazia() { return inicio == fim; }

            public void inserirFinal(E novo) {
                    if (novo == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> c = new Biblioteca.Base.Celula<>(novo);
                    fim.setProximo(c); fim = c; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F093]
    // ============================================================================
    // region [F094] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF02_UnirPilha.java
    // BUSCA: LF02 Unir Pilha
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF02_UnirPilha.java
    // ============================================================================
    /*
     * ============================================================================
     * LF02 - Unir lista e pilha na ordem de insercao
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 2, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Uma pilha entrega a ordem contraria da insercao. Transfira para auxiliar e
     * desempilhe auxiliar para a lista; reempilhe na origem para restaura-la.
     *
     * EXEMPLO / TESTE DE MESA
     * Empilhou10,20,30 (topo30); lista[A] vira[A,10,20,30].
     *
     * CASOS DE BORDA
     * Pilha/lista vazias; unidade; tres valores distintos.
     *
     * CUSTO E EFEITOS
     * O(m) tempo/O(m) auxiliar. Preserva a pilha ao final.
     *
     * COMO ADAPTAR
     * Inserir direto os pops geraria30,20,10 e descumpriria ordem de insercao.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF02_UnirPilha {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void unir(Biblioteca.Base.Pilha<E> pilha) {
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) aux.empilhar(pilha.desempilhar());
                    while (!aux.vazia()) {
                        E e = aux.desempilhar(); inserirFinal(e); pilha.empilhar(e);
                    }
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F094]
    // ============================================================================
    // region [F095] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF03_ContarOcorrencias.java
    // BUSCA: LF03 Contar Ocorrencias
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF03_ContarOcorrencias.java
    // ============================================================================
    /*
     * ============================================================================
     * LF03 - Contar ocorrencias recursivas
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 3, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Caso aux==null devolve0. Atual igual ao alvo contribui1; diferente contribui0.
     * A chamada passa item igual e aux.proximo. Nao adicione parametro contador.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,10],alvo10: volta0 ->1 ->1 ->2.
     *
     * CASOS DE BORDA
     * Vazia0; nenhuma0; todasn; repetidas. Wrapper pula S.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(n) chamadas; sem mudar links.
     *
     * COMO ADAPTAR
     * Para contar todos, some1 sempre; para criterio externo use Predicate em outra assinatura.
     *
     * ATENCAO AO CONTRATO
     * Assinatura e equals obrigatorios; nao lancar excecao explicitamente neste metodo.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF03_ContarOcorrencias {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public int contarQtos(E item) { return contarQtos(item, primeiro.getProximo()); }

            public int contarQtos(E item, Biblioteca.Base.Celula<E> aux) {
                    if (aux == null) return 0;
                    if (aux.getItem().equals(item)) return 1 + contarQtos(item, aux.getProximo());
                    return contarQtos(item, aux.getProximo());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F095]
    // ============================================================================
    // region [F096] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF04_Contem.java
    // BUSCA: LF04 Contem
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF04_Contem.java
    // ============================================================================
    /*
     * ============================================================================
     * LF04 - Contem recursivo
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 4, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * null=false; achou=true; senao repasse resultado do resto. O boolean viaja
     * pelas chamadas pendentes sem virar uma contagem.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30],alvo20: chamada20 retorna true; chamada10 repassa true.
     *
     * CASOS DE BORDA
     * Vazia; primeiro; ultimo; ausente.
     *
     * CUSTO E EFEITOS
     * O(n) pior tempo/stack; para cedo ao achar.
     *
     * COMO ADAPTAR
     * Forma equivalente: equals || contem(proximo). Separar ifs facilita aprender.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF04_Contem {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public boolean contem(E item) { return contem(item, primeiro.getProximo()); }

            public boolean contem(E item, Biblioteca.Base.Celula<E> aux) {
                    if (aux == null) return false;
                    if (aux.getItem().equals(item)) return true;
                    return contem(item, aux.getProximo());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F096]
    // ============================================================================
    // region [F097] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF05_Mesclar.java
    // BUSCA: LF05 Mesclar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF05_Mesclar.java
    // ============================================================================
    /*
     * ============================================================================
     * LF05 - Mesclar listas alternadas
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 5, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Dois cursores independentes. Adicione um de A e um de B quando existirem.
     * Use || para continuar enquanto ainda houver itens em qualquer origem.
     *
     * EXEMPLO / TESTE DE MESA
     * A[1,3,5],B[2,4] -> A[1,2,3,4,5]; B preservada.
     *
     * CASOS DE BORDA
     * Tamanhos diferentes; ambas/uma vazia; outra==this.
     *
     * CUSTO E EFEITOS
     * O(n+m) tempo e celulas novas.
     *
     * COMO ADAPTAR
     * Reaproveitar nos exige outro contrato: consumir origem e ajustar extremos.
     *
     * ATENCAO AO CONTRATO
     * O PDF nao fixa destruicao da segunda lista. Aqui ela e mantida.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF05_Mesclar {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void mesclar(Lista<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Lista nula");
                    Lista<E> nova = new Lista<>();
                    Biblioteca.Base.Celula<E> a = primeiro.getProximo(), b = outra.primeiro.getProximo();
                    while (a != null || b != null) {
                        if (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
                        if (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                    }
                    primeiro.setProximo(nova.primeiro.getProximo());
                    ultimo = nova.vazia() ? primeiro : nova.ultimo;
                    tamanho = nova.tamanho;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F097]
    // ============================================================================
    // region [F098] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF06_CopiaInvertida.java
    // BUSCA: LF06 Copia Invertida
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF06_CopiaInvertida.java
    // ============================================================================
    /*
     * ============================================================================
     * LF06 - Nova lista invertida preservando origem
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 6, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Percorra origem normalmente e insira cada item na posicao0 do resultado.
     * Inserir no inicio e O(1), mesmo que o metodo geral insira por indice.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30] -> resultado cresce[10],[20,10],[30,20,10].
     *
     * CASOS DE BORDA
     * Vazia retorna nova vazia; unidade; origem continua intacta.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(n) celulas.
     *
     * COMO ADAPTAR
     * Outra opcao e percorrer recursivamente e inserir no final na VOLTA.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF06_CopiaInvertida {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Lista<E> invertida() {
                    Lista<E> nova = new Lista<>();
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserir(p.getItem(), 0);
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public void inserir(E item, int pos) {
                    if (pos < 0 || pos > tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> anterior = primeiro;
                    for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item, anterior.getProximo());
                    anterior.setProximo(nova);
                    if (anterior == ultimo) ultimo = nova;
                    tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F098]
    // ============================================================================
    // region [F099] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF07_Inverter.java
    // BUSCA: LF07 Inverter
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF07_Inverter.java
    // ============================================================================
    /*
     * ============================================================================
     * LF07 - Inverter lista atual
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 7, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Guarde antigo primeiro para novo ultimo. Salve seguinte, vire seta para
     * anterior e avance. Ao final, sentinela aponta para o antigo ultimo.
     *
     * EXEMPLO / TESTE DE MESA
     * S->10->20->30 vira S->30->20->10. ultimo=10.
     *
     * CASOS DE BORDA
     * Vazia: ultimo=S; unidade; inverter duas vezes.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar. Mesmos nos e tamanho.
     *
     * COMO ADAPTAR
     * Mudar somente primeiro/ultimo nao vira as setas internas.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF07_Inverter {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void inverter() {
                    Biblioteca.Base.Celula<E> antigoPrimeiro = primeiro.getProximo();
                    Biblioteca.Base.Celula<E> anterior = null, atual = antigoPrimeiro;
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior); anterior = atual; atual = seguinte;
                    }
                    primeiro.setProximo(anterior);
                    ultimo = antigoPrimeiro == null ? primeiro : antigoPrimeiro;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F099]
    // ============================================================================
    // region [F100] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF08_MesclarInvertidas.java
    // BUSCA: LF08 Mesclar Invertidas
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF08_MesclarInvertidas.java
    // ============================================================================
    /*
     * ============================================================================
     * LF08 - Intercalar duas listas invertidas
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 8, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Crie copia invertida de cada lista e mescle as copias. Segue a ordem do
     * EXEMPLO do PDF: this invertida primeiro, outra invertida depois; acrescente sobras.
     *
     * EXEMPLO / TESTE DE MESA
     * X1 X3 X5 X7 X9 X11 / Y1 Y3 Y9 Y2 Y5 Y7 Y4 Y6
     * -> X11 Y6 X9 Y4 X7 Y7 X5 Y5 X3 Y2 X1 Y9 Y3 Y1
     *
     * CASOS DE BORDA
     * Comprimentos diferentes; vazias; autoalias; origens intactas.
     *
     * CUSTO E EFEITOS
     * O(n+m) tempo e memoria.
     *
     * COMO ADAPTAR
     * Comecar pela outra daria resultado diferente do exemplo.
     *
     * ATENCAO AO CONTRATO
     * A redacao mistura concatenacao/mesclagem. O exemplo orienta esta escolha.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF08_MesclarInvertidas {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** LF08: segue o exemplo do PDF, this invertida primeiro. */
                public Lista<E> mesclarInvertidas(Lista<E> outra) {
                    Lista<E> a = invertida(); a.mesclar(outra.invertida()); return a;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public void inserir(E item, int pos) {
                    if (pos < 0 || pos > tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> anterior = primeiro;
                    for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item, anterior.getProximo());
                    anterior.setProximo(nova);
                    if (anterior == ultimo) ultimo = nova;
                    tamanho++;
                }

            public Lista<E> invertida() {
                    Lista<E> nova = new Lista<>();
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserir(p.getItem(), 0);
                    return nova;
                }

            public void mesclar(Lista<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Lista nula");
                    Lista<E> nova = new Lista<>();
                    Biblioteca.Base.Celula<E> a = primeiro.getProximo(), b = outra.primeiro.getProximo();
                    while (a != null || b != null) {
                        if (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
                        if (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                    }
                    primeiro.setProximo(nova.primeiro.getProximo());
                    ultimo = nova.vazia() ? primeiro : nova.ultimo;
                    tamanho = nova.tamanho;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F100]
    // ============================================================================
    // region [F101] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF09_Clone.java
    // BUSCA: LF09 Clone
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF09_Clone.java
    // ============================================================================
    /*
     * ============================================================================
     * LF09 - Clone estrutural
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 9, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Novo objeto Lista, novas celulas, mesmos itens E. Percorra e insira ao final.
     *
     * EXEMPLO / TESTE DE MESA
     * a[Pedido1,Pedido2],b=a.clone(): retirar de b nao retira de a.
     * Alterar Pedido1 compartilhado pode aparecer nas duas.
     *
     * CASOS DE BORDA
     * Vazia; unidade; ordem; independencia estrutural.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(n) nos novos.
     *
     * COMO ADAPTAR
     * Copia profunda precisa copiar cada E; nao existe clone profundo generico automatico.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF09_Clone {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            @Override public Lista<E> clone() {
                    Lista<E> nova = new Lista<>();
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserirFinal(p.getItem());
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F101]
    // ============================================================================
    // region [F102] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF10_InserirEmOrdem.java
    // BUSCA: LF10 Inserir Em Ordem
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF10_InserirEmOrdem.java
    // ============================================================================
    /*
     * ============================================================================
     * LF10 - Insercao em lista ordenada
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 10, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Procure predecessor enquanto o proximo valor for <= ao novo. Insira depois
     * de anterior e antes de seu sucessor. Atualize ultimo se inseriu ao final.
     *
     * EXEMPLO / TESTE DE MESA
     * [2,4,4,8],inserir4 ->[2,4,4,4novo,8].
     *
     * CASOS DE BORDA
     * Vazia; menor/maior que todos; empate; unidade.
     *
     * CUSTO E EFEITOS
     * O(n) tempo, uma celula nova.
     *
     * COMO ADAPTAR
     * Decrescente inverte sinal; < em vez de <= insere antes dos iguais.
     *
     * ATENCAO AO CONTRATO
     * CompareTo exige limite E extends Comparable<E> ou outro criterio autorizado.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/flexiveis/ListaOrdenada.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF10_InserirEmOrdem {
        public static class ListaOrdenada<E extends Comparable<E>> {
            private final Biblioteca.Base.Celula<E> primeiro = new Biblioteca.Base.Celula<>();
            private Biblioteca.Base.Celula<E> ultimo = primeiro;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void inserirEmOrdem(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> anterior = primeiro;
                    while (anterior.getProximo() != null && anterior.getProximo().getItem().compareTo(item) <= 0) anterior = anterior.getProximo();
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item, anterior.getProximo());
                    anterior.setProximo(nova); if (anterior == ultimo) ultimo = nova; tamanho++;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F102]
    // ============================================================================
    // region [F103] 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF11_RemoverTodos.java
    // BUSCA: LF11 Remover Todos
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/04_LISTA_FLEXIVEL_LF/LF11_RemoverTodos.java
    // ============================================================================
    /*
     * ============================================================================
     * LF11 - Remover todas as ocorrencias
     *
     * BASE: Lista de Exercicios de Lista Flexivel.docx.PDF, questao 11, pagina 3.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ao remover o sucessor, anterior fica parado para examinar o NOVO sucessor.
     * Ao manter, avance anterior. Corrija ultimo e tamanho em cada remocao.
     *
     * EXEMPLO / TESTE DE MESA
     * [2,2,3,2],alvo2 ->[3],true; [3,4],alvo2 ->false.
     *
     * CASOS DE BORDA
     * Vazia lanca; consecutivos; todos; nenhum; inicio/fim.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar, uma passagem.
     *
     * COMO ADAPTAR
     * Lista dupla usa atual.anterior e dispensa manter predecessor externo.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class LF11_RemoverTodos {
        public static class Lista<E> {
            private final Biblioteca.Base.Celula<E> primeiro;
            private Biblioteca.Base.Celula<E> ultimo;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public boolean removerTodos(E item) {
                    if (vazia()) throw new IllegalStateException("Lista vazia");
                    boolean removeu = false;
                    Biblioteca.Base.Celula<E> anterior = primeiro;
                    while (anterior.getProximo() != null) {
                        Biblioteca.Base.Celula<E> atual = anterior.getProximo();
                        if (atual.getItem().equals(item)) {
                            anterior.setProximo(atual.getProximo());
                            if (atual == ultimo) ultimo = anterior;
                            atual.setProximo(null); tamanho--; removeu = true;
                        } else anterior = atual;
                    }
                    return removeu;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { primeiro = new Biblioteca.Base.Celula<>(); ultimo = primeiro; }

            public boolean vazia() { return primeiro == ultimo; }

            public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F103]
    // ============================================================================
    // region [F104] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE - Lista de Exercicios Fila Flexivel.docx.PDF
     * ============================================================================
     *
     * FF01_ConstrutorArray.java
     *   Construtor de fila por array
     * FF02_ConstrutorPilha.java
     *   Construtor por pilha preservada
     * FF03_Unir.java
     *   Uniao preservando fila atual
     * FF04_ContagemRecursiva.java
     *   Contar dados com recursao
     * FF05_ContemRecursivo.java
     *   Pesquisa booleana recursiva
     * FF06_InverterRecebida.java
     *   Inverter a fila recebida
     * FF07_CopiaInvertida.java
     *   Devolver fila invertida sem destruir this
     * FF08_Mesclar.java
     *   Alternar duas filas
     * FF09_Inverter.java
     *   Inverter fila em quatro versoes
     * FF10_QuantosAfrente.java
     *   Quantos antes do alvo com retorno int
     * FF11_DoisArraysOrdenados.java
     *   Construtor com merge de dois arrays
     * FF12_Copiar.java
     *   Criar copia exata da fila
     * FF13_Dividir.java
     *   Dividir pelos indices originais
     * FF14_PseudoPilha.java
     *   Pilha usando filas
     *
     * Procure SOLUCAO_PEDIDA_AQUI dentro de cada ficha.
     * As explicacoes ficam em comentarios; os metodos estao em codigo Java real.
     */
    // endregion [F104]
    // ============================================================================
    // region [F105] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF01_ConstrutorArray.java
    // BUSCA: FF01 Construtor Array
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF01_ConstrutorArray.java
    // ============================================================================
    /*
     * ============================================================================
     * FF01 - Construtor de fila por array
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 1, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Chame this() para inicializar a sentinela, percorra array e ignore nulls.
     * Enfileire os demais valores na ordem do array.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,null,20,null,30] ->[10,20,30].
     *
     * CASOS DE BORDA
     * Array vazio/todosnull; referencia de array null rejeitada.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(k) nos, k nao nulos.
     *
     * COMO ADAPTAR
     * Uma sentinela por fila; nao crie uma sentinela para cada posicao null.
     *
     * ATENCAO AO CONTRATO
     * Os construtores sobrecarregados estao juntos. Escolha Fila(E[]) para esta questao.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF01_ConstrutorArray {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F105]
    // ============================================================================
    // region [F106] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF02_ConstrutorPilha.java
    // BUSCA: FF02 Construtor Pilha
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF02_ConstrutorPilha.java
    // ============================================================================
    /*
     * ============================================================================
     * FF02 - Construtor por pilha preservada
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 2, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Retire topo, coloque na fila e numa pilha auxiliar. Depois devolva a
     * auxiliar a origem. A fila segue topo->fundo.
     *
     * EXEMPLO / TESTE DE MESA
     * Pilha topo[30,20,10] -> fila[30,20,10]; pilha restaurada.
     *
     * CASOS DE BORDA
     * Vazia; unidade; comparar ordem com tres valores.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(n) auxiliar.
     *
     * COMO ADAPTAR
     * Para ordem de insercao, inverta antes e enfileire durante a restauracao.
     *
     * ATENCAO AO CONTRATO
     * O enunciado nao fixa ordem/preservacao. Aqui topoprimeiro e preservacao sao declarados.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF02_ConstrutorPilha {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F106]
    // ============================================================================
    // region [F107] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF03_Unir.java
    // BUSCA: FF03 Unir
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF03_Unir.java
    // ============================================================================
    /*
     * ============================================================================
     * FF03 - Uniao preservando fila atual
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 3, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Copie this para a nova fila; acrescente os itens da outra. Ambas ficam
     * inalteradas nesta implementacao.
     *
     * EXEMPLO / TESTE DE MESA
     * A[1,2],B[3,4] -> retorno[1,2,3,4]; A e B iguais ao inicio.
     *
     * CASOS DE BORDA
     * Vazias; comprimentos diferentes; mesma instancia.
     *
     * CUSTO E EFEITOS
     * O(n+m) tempo e celulas.
     *
     * COMO ADAPTAR
     * Nao consumir this: essa proibicao e explicita no PDF.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF03_Unir {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila<E> unir(Fila<E> outra) {
                    Fila<E> nova = copiar();
                    nova.concatenar(outra);
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Fila<E> copiar() {
                    Fila<E> nova = new Fila<>();
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) nova.enfileirar(p.getItem());
                    return nova;
                }

            public void concatenar(Fila<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Fila nula");
                    Fila<E> fonte = outra == this ? outra.copiar() : outra;
                    for (Biblioteca.Base.Celula<E> p = fonte.frente.getProximo(); p != null; p = p.getProximo()) enfileirar(p.getItem());
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F107]
    // ============================================================================
    // region [F108] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF04_ContagemRecursiva.java
    // BUSCA: FF04 Contagem Recursiva
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF04_ContagemRecursiva.java
    // ============================================================================
    /*
     * ============================================================================
     * FF04 - Contar dados com recursao
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 4, pagina 1.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Assinatura recebe apenas Celula<E>. Null contribui0; cada celula contribui1
     * mais a quantidade restante. Wrapper passa frente.proximo.
     *
     * EXEMPLO / TESTE DE MESA
     * 10 chama20;20 chama30;30 chama null. Retornos0,1,2,3.
     *
     * CASOS DE BORDA
     * Vazia0; unidade1; nao contar sentinela.
     *
     * CUSTO E EFEITOS
     * O(n) tempo e stack.
     *
     * COMO ADAPTAR
     * int resposta=rec(proximo);return1+resposta equivale ao return1+rec(proximo).
     *
     * ATENCAO AO CONTRATO
     * Nao acrescentar parametro contador nem reiniciar em frente.proximo dentro da recursao.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF04_ContagemRecursiva {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public int obterNumeroItens() { return obterNumeroItens(frente.getProximo()); }

            public int obterNumeroItens(Biblioteca.Base.Celula<E> aux) {
                    if (aux == null) return 0;
                    return 1 + obterNumeroItens(aux.getProximo());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F108]
    // ============================================================================
    // region [F109] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF05_ContemRecursivo.java
    // BUSCA: FF05 Contem Recursivo
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF05_ContemRecursivo.java
    // ============================================================================
    /*
     * ============================================================================
     * FF05 - Pesquisa booleana recursiva
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 5, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Teste null antes de getItem. Achou equals retorna true; caso contrario
     * retorne contem(item,aux.proximo).
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30],alvo30 -> true propagado pela chamada20 e depois10.
     *
     * CASOS DE BORDA
     * Vaziafalse; ausentefalse; primeiro/ultimo.
     *
     * CUSTO E EFEITOS
     * O(n) pior tempo e stack; sem alteracao.
     *
     * COMO ADAPTAR
     * Devolver item requer retorno E e um contrato de ausencia; Celula<E> devolveria o no.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF05_ContemRecursivo {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public boolean contem(E item) { return contem(item, frente.getProximo()); }

            public boolean contem(E item, Biblioteca.Base.Celula<E> aux) {
                    if (aux == null) return false;
                    if (aux.getItem().equals(item)) return true;
                    return contem(item, aux.getProximo());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F109]
    // ============================================================================
    // region [F110] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF06_InverterRecebida.java
    // BUSCA: FF06 Inverter Recebida
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF06_InverterRecebida.java
    // ============================================================================
    /*
     * ============================================================================
     * FF06 - Inverter a fila recebida
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 6, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Chame inverter sobre o argumento e retorne a mesma referencia. This so
     * muda se o argumento e a propria this.
     *
     * EXEMPLO / TESTE DE MESA
     * A[1],B[2,3,4]: R=A.inverterOutra(B); B[4,3,2] e R==B.
     *
     * CASOS DE BORDA
     * Vazia; unidade; autoalias; null.
     *
     * CUSTO E EFEITOS
     * O(m) tempo/O(1) auxiliar. Modifica B.
     *
     * COMO ADAPTAR
     * return B.invertida() devolveria uma copia e preservaria B: outro contrato.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF06_InverterRecebida {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila<E> inverterOutra(Fila<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Fila nula");
                    outra.inverter();
                    return outra;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public void inverter() {
                    Biblioteca.Base.Celula<E> antigoPrimeiro = frente.getProximo();
                    Biblioteca.Base.Celula<E> anterior = null, atual = antigoPrimeiro;
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior);
                        anterior = atual;
                        atual = seguinte;
                    }
                    frente.setProximo(anterior);
                    tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F110]
    // ============================================================================
    // region [F111] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF07_CopiaInvertida.java
    // BUSCA: FF07 Copia Invertida
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF07_CopiaInvertida.java
    // ============================================================================
    /*
     * ============================================================================
     * FF07 - Devolver fila invertida sem destruir this
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 7, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Copie e inverta a copia. Nenhum no original tem sua ligacao modificada.
     *
     * EXEMPLO / TESTE DE MESA
     * A[1,2,3] -> R[3,2,1]; A permanece[1,2,3].
     *
     * CASOS DE BORDA
     * Vazia; unidade; objetos mutaveis; independencia das celulas.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(n) novas celulas.
     *
     * COMO ADAPTAR
     * Fila->pilha->fila nova tambem inverte, com memoria auxiliar.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF07_CopiaInvertida {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila<E> invertida() { Fila<E> nova = copiar(); nova.inverter(); return nova; }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Fila<E> copiar() {
                    Fila<E> nova = new Fila<>();
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) nova.enfileirar(p.getItem());
                    return nova;
                }

            public void inverter() {
                    Biblioteca.Base.Celula<E> antigoPrimeiro = frente.getProximo();
                    Biblioteca.Base.Celula<E> anterior = null, atual = antigoPrimeiro;
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior);
                        anterior = atual;
                        atual = seguinte;
                    }
                    frente.setProximo(anterior);
                    tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F111]
    // ============================================================================
    // region [F112] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF08_Mesclar.java
    // BUSCA: FF08 Mesclar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF08_Mesclar.java
    // ============================================================================
    /*
     * ============================================================================
     * FF08 - Alternar duas filas
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 8, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Leia as origens com cursores independentes e crie sequencia alternada.
     * Somente depois substitua a cadeia de this.
     *
     * EXEMPLO / TESTE DE MESA
     * A[1,3],B[2,4,6] -> A[1,2,3,4,6]; B preservada.
     *
     * CASOS DE BORDA
     * Uma/ambas vazias; sobras; selfalias.
     *
     * CUSTO E EFEITOS
     * O(n+m) tempo e novas celulas.
     *
     * COMO ADAPTAR
     * && encerra quando uma termina: nesse caso seriam obrigatorios lacos de sobras.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF08_Mesclar {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Alterna; preserva outra. Altera this adotando uma cadeia nova. */
                public void mesclar(Fila<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Fila nula");
                    Fila<E> nova = new Fila<>();
                    Biblioteca.Base.Celula<E> a = frente.getProximo(), b = outra.frente.getProximo();
                    while (a != null || b != null) {
                        if (a != null) { nova.enfileirar(a.getItem()); a = a.getProximo(); }
                        if (b != null) { nova.enfileirar(b.getItem()); b = b.getProximo(); }
                    }
                    frente.setProximo(nova.frente.getProximo());
                    tras = nova.vazia() ? frente : nova.tras;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F112]
    // ============================================================================
    // region [F113] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF09_Inverter.java
    // BUSCA: FF09 Inverter
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF09_Inverter.java
    // ============================================================================
    /*
     * ============================================================================
     * FF09 - Inverter fila em quatro versoes
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 9, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Compare religacao com anterior, religacao por inserir na frente, pilha auxiliar
     * e recursao retirando e reinserindo na volta. Todas invertem this.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30] ->[30,20,10]. Antigo primeiro vira tras.
     *
     * CASOS DE BORDA
     * Vazia/unidade; inverter duas vezes; inserir depois.
     *
     * CUSTO E EFEITOS
     * Todas O(n) tempo. Links O(1) auxiliar; pilha/recursao O(n).
     *
     * COMO ADAPTAR
     * Sem criar celulas: escolha links. Sem tocar atributos: use operacoes publicas.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF09_Inverter {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void inverter() {
                    Biblioteca.Base.Celula<E> antigoPrimeiro = frente.getProximo();
                    Biblioteca.Base.Celula<E> anterior = null, atual = antigoPrimeiro;
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior);
                        anterior = atual;
                        atual = seguinte;
                    }
                    frente.setProximo(anterior);
                    tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
                }

            /** Variante para quem prefere nao usar uma variavel chamada anterior. */
                public void inverterSemAnterior() {
                    Biblioteca.Base.Celula<E> antigoPrimeiro = frente.getProximo();
                    Biblioteca.Base.Celula<E> atual = antigoPrimeiro;
                    frente.setProximo(null);
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(frente.getProximo());
                        frente.setProximo(atual);
                        atual = seguinte;
                    }
                    tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
                }

            public void inverterPorPilha() {
                    Biblioteca.Base.Pilha<E> p = new Biblioteca.Base.Pilha<>();
                    while (!vazia()) p.empilhar(desenfileirar());
                    while (!p.vazia()) enfileirar(p.desempilhar());
                }

            public void inverterRecursivamente() {
                    if (vazia()) return;
                    E item = desenfileirar();
                    inverterRecursivamente();
                    enfileirar(item);
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public E desenfileirar() {
                    if (vazia()) throw new NoSuchElementException("Fila vazia");
                    Biblioteca.Base.Celula<E> removida = frente.getProximo();
                    frente.setProximo(removida.getProximo());
                    if (removida == tras) tras = frente;
                    removida.setProximo(null);
                    return removida.getItem();
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F113]
    // ============================================================================
    // region [F114] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF10_QuantosAfrente.java
    // BUSCA: FF10 Quantos Afrente
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF10_QuantosAfrente.java
    // ============================================================================
    /*
     * ============================================================================
     * FF10 - Quantos antes do alvo com retorno int
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 10, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ao achar, retorne0. Ao nao achar na celula atual, espere o resultado da
     * proxima e some1. Quando chega a null sem alvo, lance excecao.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30],alvo30
     * 10 espera 1+f(20);20 espera1+f(30);30 retorna0
     * 20 retorna1;10 retorna2.
     *
     * CASOS DE BORDA
     * Primeiro0; ultimo n-1; ausencia/vazia excecao.
     *
     * CUSTO E EFEITOS
     * O(n) tempo e stack. Nao enfileira nem remove.
     *
     * COMO ADAPTAR
     * Copiar depois do alvo e outro metodo, retornando Fila<E>; veja integracao.
     *
     * ATENCAO AO CONTRATO
     * Assinatura do PDF: quantosAfrente(Celula<E> atual,E item). Celula vem primeiro.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF10_QuantosAfrente {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public int quantosAfrente(E item) { return quantosAfrente(frente.getProximo(), item); }

            /** FF10 exige esta ordem: celula primeiro, item segundo. */
                public int quantosAfrente(Biblioteca.Base.Celula<E> atual, E item) {
                    if (atual == null) throw new NoSuchElementException("Item nao encontrado");
                    if (atual.getItem().equals(item)) return 0;
                    return 1 + quantosAfrente(atual.getProximo(), item);
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F114]
    // ============================================================================
    // region [F115] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF11_DoisArraysOrdenados.java
    // BUSCA: FF11 Dois Arrays Ordenados
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF11_DoisArraysOrdenados.java
    // ============================================================================
    /*
     * ============================================================================
     * FF11 - Construtor com merge de dois arrays
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 11, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * i e j apontam os candidatos de arrays ja ordenados. Enfileire menor e
     * avance so o indice usado. Depois acrescente os que sobraram.
     *
     * EXEMPLO / TESTE DE MESA
     * A[1,3,7],B[2,3,8] ->[1,2,3A,3B,7,8].
     *
     * CASOS DE BORDA
     * Vazios; empates; um termina antes; dados nao nulos.
     *
     * CUSTO E EFEITOS
     * O(n+m) tempo/O(n+m) resultado; preserva arrays.
     *
     * COMO ADAPTAR
     * Para decrescente ajuste comparacao e precondicao das entradas.
     *
     * ATENCAO AO CONTRATO
     * Requer Comparable. Nao confundir com FF01 que ignora nulls do array.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF11_DoisArraysOrdenados {
        public static class Fila<E extends Comparable<E>> {
            private final Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            public Fila(E[] a, E[] b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Array nulo");
                    int i = 0, j = 0;
                    while (i < a.length && j < b.length) {
                        if (a[i].compareTo(b[j]) <= 0) enfileirar(a[i++]);
                        else enfileirar(b[j++]);
                    }
                    while (i < a.length) enfileirar(a[i++]);
                    while (j < b.length) enfileirar(b[j++]);
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public boolean vazia() { return inicio == fim; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    fim.setProximo(nova); fim = nova;
                }

            public Object[] toArray() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) n++;
                    Object[] a = new Object[n]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F115]
    // ============================================================================
    // region [F116] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF12_Copiar.java
    // BUSCA: FF12 Copiar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF12_Copiar.java
    // ============================================================================
    /*
     * ============================================================================
     * FF12 - Criar copia exata da fila
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 12, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Cursor percorre, nova fila recebe dados em ordem. Original nao e desenfileirada.
     *
     * EXEMPLO / TESTE DE MESA
     * [A,B,C] -> nova[A,B,C], com celulas diferentes.
     *
     * CASOS DE BORDA
     * Vazia; unidade; ordem; independencia dos nos.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/memoria.
     *
     * COMO ADAPTAR
     * Somente API publica: transferir para auxiliar e restaurar ao final.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF12_Copiar {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila<E> copiar() {
                    Fila<E> nova = new Fila<>();
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) nova.enfileirar(p.getItem());
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F116]
    // ============================================================================
    // region [F117] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF13_Dividir.java
    // BUSCA: FF13 Dividir
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF13_Dividir.java
    // ============================================================================
    /*
     * ============================================================================
     * FF13 - Dividir pelos indices originais
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 13, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Retorno recebe0,2,4; this mantem1,3,5. Contador e incrementado mesmo
     * quando a celula atual e removida.
     *
     * EXEMPLO / TESTE DE MESA
     * [A,B,C,D,E,F] -> retorno[A,C,E],this[B,D,F].
     *
     * CASOS DE BORDA
     * Vazia; unico vai todo ao retorno; pares/impares; extremos.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar alem de nova sentinela.
     *
     * COMO ADAPTAR
     * Dividir ao meio e outro criterio: blocos contiguos em vez de alternancia.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF13_Dividir {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Pares das POSICOES originais vao para retorno; impares ficam em this. */
                public Fila<E> dividir() {
                    Fila<E> pares = new Fila<>();
                    Biblioteca.Base.Celula<E> anterior = frente, atual = frente.getProximo();
                    int pos = 0;
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        if (pos % 2 == 0) {
                            anterior.setProximo(seguinte);
                            if (atual == tras) tras = anterior;
                            atual.setProximo(null);
                            pares.tras.setProximo(atual);
                            pares.tras = atual;
                        } else anterior = atual;
                        atual = seguinte;
                        pos++;
                    }
                    return pares;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F117]
    // ============================================================================
    // region [F118] 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF14_PseudoPilha.java
    // BUSCA: FF14 Pseudo Pilha
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/05_FILA_FLEXIVEL_FF/FF14_PseudoPilha.java
    // ============================================================================
    /*
     * ============================================================================
     * FF14 - Pilha usando filas
     *
     * BASE: Lista de Exercicios Fila Flexivel.docx.PDF, questao 14, pagina 3.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Empilhar coloca novo na auxiliar antes de transferir os antigos. Troque
     * as referencias das filas. Consultar deve restaurar a ordem apos retirar.
     *
     * EXEMPLO / TESTE DE MESA
     * push10,20,30 -> principal[30,20,10]; pop retorna30.
     *
     * CASOS DE BORDA
     * Vazia; consultar duas vezes sem alterar ordem; push/pop intercalados.
     *
     * CUSTO E EFEITOS
     * Push O(n), pop O(1), consulta O(n) na API restrita; O(n) espaco.
     *
     * COMO ADAPTAR
     * Pode inverter a escolha de custos: push O(1), pop O(n).
     *
     * ATENCAO AO CONTRATO
     * A Fila fornecida nesta questao nao mostra consultarInicio; esta solucao nao usa esse metodo.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/PseudoPilha.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class FF14_PseudoPilha {
        public static class PseudoPilha<E> {
            private Biblioteca.Base.Fila<E> principal = new Biblioteca.Base.Fila<>();
            private Biblioteca.Base.Fila<E> auxiliar = new Biblioteca.Base.Fila<>();
            private int tam;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public boolean vazia() { return principal.vazia(); }

            public void empilhar(E item) {
                    auxiliar.enfileirar(item);
                    while (!principal.vazia()) auxiliar.enfileirar(principal.desenfileirar());
                    Biblioteca.Base.Fila<E> troca = principal; principal = auxiliar; auxiliar = troca;
                    tam++;
                }

            public E desempilhar() {
                    if (vazia()) throw new NoSuchElementException("Pilha vazia");
                    E item = principal.desenfileirar(); tam--; return item;
                }

            public E consultarTopo() {
                    if (vazia()) throw new NoSuchElementException("Pilha vazia");
                    E item = principal.desenfileirar(); principal.enfileirar(item);
                    for (int i = 1; i < tam; i++) principal.enfileirar(principal.desenfileirar());
                    return item;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============

        }
    }
    // endregion [F118]
    // ============================================================================
    // region [F119] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * INDICE - Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF
     * ============================================================================
     *
     * R01_ObterItem.java
     *   Obter posicao recursivamente
     * R02_ExtrairMenores.java
     *   Separar menores mantendo ordem
     * R03_PseudoFila.java
     *   Fila com duas pilhas e custo amortizado
     * R04_CorrigirTras.java
     *   Desenfileirar com tras incorreto
     * R05_IntercalarOrdenadas.java
     *   Merge copiador e estavel
     * R06_MaiorRecursivo.java
     *   Maior item sem parametro extra
     * R07_Rotacionar.java
     *   Mover prefixo sem copiar celulas
     * R08_DividirAoMeio.java
     *   Partir cadeia reaproveitando nos
     * R09_TrocarPrimeiros.java
     *   Trocar dois primeiros e corrigir fim
     * R10_CustosSimplesDupla.java
     *   Tabela de custos simples versus dupla
     * R11_RemoverFimDupla.java
     *   Remover ultimo da dupla
     * R12_InserirDupla.java
     *   Inserir em posicao na dupla
     * R13_InverterDupla.java
     *   Inverter dupla preservando sentinela
     * R14_RemoverTodosDupla.java
     *   Remover ocorrencias na dupla
     * R15_PalindromoDupla.java
     *   Comparar extremos da dupla
     * R16_ConcatenarDupla.java
     *   Transferir outra dupla em O(1)
     * R17_ConstrutorDuplaFila.java
     *   Dupla por fila preservando ordem
     * R18_MergeSort.java
     *   Arvore e ultima intercalacao do Mergesort
     * R19_HeapSort.java
     *   Heapsort base um e trocas
     * R20_QuickSort.java
     *   Quick pivo final versus central
     * R21_EscolherAlgoritmo.java
     *   Escolha justificada de ordenacao
     * R22_Lomuto.java
     *   Particionar nao e ordenar
     * R23_OrdenarLista.java
     *   Mergesort recursivo da lista
     *
     * Procure SOLUCAO_PEDIDA_AQUI dentro de cada ficha.
     * As explicacoes ficam em comentarios; os metodos estao em codigo Java real.
     */
    // endregion [F119]
    // ============================================================================
    // region [F120] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R01_ObterItem.java
    // BUSCA: R01 Obter Item
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R01_ObterItem.java
    // ============================================================================
    /*
     * ============================================================================
     * R01 - Obter posicao recursivamente
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 1, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Pos e a distancia restante a partir de aux. Quando pos==0, devolva item.
     * Caso geral avanca aux e reduz pos. Sem laços nem contador extra.
     *
     * EXEMPLO / TESTE DE MESA
     * (A,2)->(B,1)->(C,0); retorno C->C->C.
     *
     * CASOS DE BORDA
     * Pos negativa/fora/vazia: excecao. Pos0: primeiro.
     *
     * CUSTO E EFEITOS
     * O(pos+1) tempo/stack para posicao valida; pior O(n).
     *
     * COMO ADAPTAR
     * Para k-esimo do fim use dois cursores, nao apenas pos++.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R01_ObterItem {
        public static class Fila<E extends Comparable<E>> {
            private final Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public E obterItem(int pos) { return obterItem(inicio.getProximo(), pos); }

            public E obterItem(Biblioteca.Base.Celula<E> aux, int pos) {
                    if (pos < 0 || aux == null) throw new IndexOutOfBoundsException("Posicao inexistente");
                    if (pos == 0) return aux.getItem();
                    return obterItem(aux.getProximo(), pos - 1);
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            public Fila(E[] a, E[] b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Array nulo");
                    int i = 0, j = 0;
                    while (i < a.length && j < b.length) {
                        if (a[i].compareTo(b[j]) <= 0) enfileirar(a[i++]);
                        else enfileirar(b[j++]);
                    }
                    while (i < a.length) enfileirar(a[i++]);
                    while (j < b.length) enfileirar(b[j++]);
                }

            public boolean vazia() { return inicio == fim; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    fim.setProximo(nova); fim = nova;
                }

            public Object[] toArray() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) n++;
                    Object[] a = new Object[n]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F120]
    // ============================================================================
    // region [F121] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R02_ExtrairMenores.java
    // BUSCA: R02 Extrair Menores
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R02_ExtrairMenores.java
    // ============================================================================
    /*
     * ============================================================================
     * R02 - Separar menores mantendo ordem
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 2, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ao aprovar por compareTo<0, desligue o no da origem e anexe ao destino.
     * Se mantiver o no, avance anterior. Sempre salve seguinte antes.
     *
     * EXEMPLO / TESTE DE MESA
     * [8,3,10,1,7,12],limite7 -> retorno[3,1],this[8,10,7,12].
     *
     * CASOS DE BORDA
     * Nenhum/todos; iguais ao limite ficam; consecutivos; ultimo; vazia.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar, reutiliza nos.
     *
     * COMO ADAPTAR
     * <=0 incluiria iguais. Predicate poderia substituir criterio se assinatura permitisse.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R02_ExtrairMenores {
        public static class Fila<E extends Comparable<E>> {
            private final Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Fila<E> extrairMenores(E limite) {
                    if (limite == null) throw new IllegalArgumentException("Limite nulo");
                    Fila<E> nova = new Fila<>();
                    Biblioteca.Base.Celula<E> anterior = inicio, atual = inicio.getProximo();
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        if (atual.getItem().compareTo(limite) < 0) {
                            anterior.setProximo(seguinte);
                            if (fim == atual) fim = anterior;
                            atual.setProximo(null);
                            nova.fim.setProximo(atual); nova.fim = atual;
                        } else anterior = atual;
                        atual = seguinte;
                    }
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            public Fila(E[] a, E[] b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Array nulo");
                    int i = 0, j = 0;
                    while (i < a.length && j < b.length) {
                        if (a[i].compareTo(b[j]) <= 0) enfileirar(a[i++]);
                        else enfileirar(b[j++]);
                    }
                    while (i < a.length) enfileirar(a[i++]);
                    while (j < b.length) enfileirar(b[j++]);
                }

            public boolean vazia() { return inicio == fim; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    fim.setProximo(nova); fim = nova;
                }

            public Object[] toArray() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) n++;
                    Object[] a = new Object[n]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F121]
    // ============================================================================
    // region [F122] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R03_PseudoFila.java
    // BUSCA: R03 Pseudo Fila
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R03_PseudoFila.java
    // ============================================================================
    /*
     * ============================================================================
     * R03 - Fila com duas pilhas e custo amortizado
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 3, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Entrada recebe. Saida entrega. Somente quando saida estiver vazia transfira
     * tudo de entrada para saida, invertendo uma vez a ordem.
     *
     * EXEMPLO / TESTE DE MESA
     * enqueue1,2,3:entrada topo[3,2,1]
     * dequeue transfere:saida topo[1,2,3],retira1
     * enqueue4 nao muda saida; proximas retiradas2,3,4.
     *
     * CASOS DE BORDA
     * Vazia; saida com itens e entrada nova; consulta repetida.
     *
     * CUSTO E EFEITOS
     * Pior de uma retirada O(n). Cada item transfere uma vez: O(1) amortizado por operacao.
     *
     * COMO ADAPTAR
     * Transferir sempre, mesmo quando saida nao esta vazia, quebra FIFO ou desperdiça trabalho.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/PseudoFila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R03_PseudoFila {
        public static class PseudoFila<E> {
            private final Biblioteca.Base.Pilha<E> entrada = new Biblioteca.Base.Pilha<>();
            private final Biblioteca.Base.Pilha<E> saida = new Biblioteca.Base.Pilha<>();

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public boolean vazia() { return entrada.vazia() && saida.vazia(); }

            public void enfileirar(E item) { entrada.empilhar(item); }

            public E desenfileirar() { prepararSaida(); return saida.desempilhar(); }

            public E consultarInicio() { prepararSaida(); return saida.consultarTopo(); }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private void prepararSaida() {
                    if (saida.vazia()) while (!entrada.vazia()) saida.empilhar(entrada.desempilhar());
                }
        }
    }
    // endregion [F122]
    // ============================================================================
    // region [F123] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R04_CorrigirTras.java
    // BUSCA: R04 Corrigir Tras
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R04_CorrigirTras.java
    // ============================================================================
    /*
     * ============================================================================
     * R04 - Desenfileirar com tras incorreto
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 4, pagina 2.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * O codigo defeituoso esquece tras ao retirar o unico dado. A insercao
     * seguinte se liga ao no removido, desconectado da sentinela. Corrija tras=frente.
     *
     * EXEMPLO / TESTE DE MESA
     * enq5,enq8,deq5,enq2,deq8,deq2 -> S->null,tras=2 (errado)
     * enq7 liga2->7 mas S continua null. Novo deq causa NullPointerException.
     *
     * CASOS DE BORDA
     * Teste esvaziar e imediatamente enfileirar novamente.
     *
     * CUSTO E EFEITOS
     * A correcao custa O(1).
     *
     * COMO ADAPTAR
     * A lista simples tambem precisa atualizar ultimo ao remover o ultimo dado.
     *
     * ATENCAO AO CONTRATO
     * Rastro completo em 07_RASTROS_ORDENACAO/R04_EstadoDaFila.java.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R04_CorrigirTras {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public E desenfileirar() {
                    if (vazia()) throw new NoSuchElementException("Fila vazia");
                    Biblioteca.Base.Celula<E> removida = frente.getProximo();
                    frente.setProximo(removida.getProximo());
                    if (removida == tras) tras = frente;
                    removida.setProximo(null);
                    return removida.getItem();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F123]
    // ============================================================================
    // region [F124] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R05_IntercalarOrdenadas.java
    // BUSCA: R05 Intercalar Ordenadas
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R05_IntercalarOrdenadas.java
    // ============================================================================
    /*
     * ============================================================================
     * R05 - Merge copiador e estavel
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 5, pagina 3.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Percorra cada origem uma vez com um cursor. Escolha menor por compareTo.
     * No empate, <= escolhe this primeiro. Crie novos nos, nao altere entradas.
     *
     * EXEMPLO / TESTE DE MESA
     * A[1,4a,7],B[2,4b,8] ->[1,2,4a,4b,7,8].
     *
     * CASOS DE BORDA
     * Vazias; duplicados; comprimentos distintos; mesmo objeto.
     *
     * CUSTO E EFEITOS
     * O(n+m) tempo/O(n+m) novas celulas.
     *
     * COMO ADAPTAR
     * Merge por religacao usa menos alocacoes, mas consome entradas e nao atende este contrato.
     *
     * ATENCAO AO CONTRATO
     * Inserir ao final precisa ser O(1) para manter custo linear.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R05_IntercalarOrdenadas {
        public static class Lista<E extends Comparable<E>> {
            private Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Lista<E> intercalarOrdenadas(Lista<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Lista nula");
                    Lista<E> nova = new Lista<>();
                    Biblioteca.Base.Celula<E> a = inicio.getProximo(), b = outra.inicio.getProximo();
                    while (a != null && b != null) {
                        if (a.getItem().compareTo(b.getItem()) <= 0) {
                            nova.inserirFinal(a.getItem()); a = a.getProximo();
                        } else { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                    }
                    while (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
                    while (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            /** LF01: copia via API publica; entradas ficam na mesma ordem. */
                public Lista(Biblioteca.Base.Fila<E> a, Biblioteca.Base.Fila<E> b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
                    E x = ca.vazia() ? null : ca.desenfileirar();
                    E y = cb.vazia() ? null : cb.desenfileirar();
                    while (x != null && y != null) {
                        if (x.compareTo(y) <= 0) {
                            inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
                        } else {
                            inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
                        }
                    }
                    if (x != null) inserirFinal(x);
                    if (y != null) inserirFinal(y);
                    while (!ca.vazia()) inserirFinal(ca.desenfileirar());
                    while (!cb.vazia()) inserirFinal(cb.desenfileirar());
                }

            private Biblioteca.Base.Fila<E> copiarPorAPI(Biblioteca.Base.Fila<E> fila) {
                    Biblioteca.Base.Fila<E> copia = new Biblioteca.Base.Fila<>(), auxiliar = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) {
                        E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
                    }
                    while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
                    return copia;
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFinal(E novo) {
                    if (novo == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> c = new Biblioteca.Base.Celula<>(novo);
                    fim.setProximo(c); fim = c; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F124]
    // ============================================================================
    // region [F125] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R06_MaiorRecursivo.java
    // BUSCA: R06 Maior Recursivo
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R06_MaiorRecursivo.java
    // ============================================================================
    /*
     * ============================================================================
     * R06 - Maior item sem parametro extra
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 6, pagina 3.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ultimo dado e o maior do trecho unitario. Obtenha maior do resto e compare
     * com item atual. Retorne E, nao o inteiro devolvido por compareTo.
     *
     * EXEMPLO / TESTE DE MESA
     * [-8,-3,-10]: retorna-10, depois-3, depois-3.
     *
     * CASOS DE BORDA
     * Vazia lanca; negativos; unidade; empates; maior nos extremos.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/stack. Empate conserva o primeiro nesta implementacao.
     *
     * COMO ADAPTAR
     * Para menor troque comparacao. Zero nao e valor neutro para maior de numeros negativos.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R06_MaiorRecursivo {
        public static class Lista<E extends Comparable<E>> {
            private Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public E obterMaior() {
                    if (vazia()) throw new NoSuchElementException("Lista vazia");
                    return obterMaior(inicio.getProximo());
                }

            public E obterMaior(Biblioteca.Base.Celula<E> aux) {
                    if (aux == null) throw new NoSuchElementException("Trecho vazio");
                    if (aux.getProximo() == null) return aux.getItem();
                    E maiorResto = obterMaior(aux.getProximo());
                    if (aux.getItem().compareTo(maiorResto) >= 0) return aux.getItem();
                    return maiorResto;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            /** LF01: copia via API publica; entradas ficam na mesma ordem. */
                public Lista(Biblioteca.Base.Fila<E> a, Biblioteca.Base.Fila<E> b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
                    E x = ca.vazia() ? null : ca.desenfileirar();
                    E y = cb.vazia() ? null : cb.desenfileirar();
                    while (x != null && y != null) {
                        if (x.compareTo(y) <= 0) {
                            inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
                        } else {
                            inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
                        }
                    }
                    if (x != null) inserirFinal(x);
                    if (y != null) inserirFinal(y);
                    while (!ca.vazia()) inserirFinal(ca.desenfileirar());
                    while (!cb.vazia()) inserirFinal(cb.desenfileirar());
                }

            private Biblioteca.Base.Fila<E> copiarPorAPI(Biblioteca.Base.Fila<E> fila) {
                    Biblioteca.Base.Fila<E> copia = new Biblioteca.Base.Fila<>(), auxiliar = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) {
                        E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
                    }
                    while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
                    return copia;
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFinal(E novo) {
                    if (novo == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> c = new Biblioteca.Base.Celula<>(novo);
                    fim.setProximo(c); fim = c; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F125]
    // ============================================================================
    // region [F126] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R07_Rotacionar.java
    // BUSCA: R07 Rotacionar
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R07_Rotacionar.java
    // ============================================================================
    /*
     * ============================================================================
     * R07 - Mover prefixo sem copiar celulas
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 7, pagina 3.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ache a ultima celula do prefixo. Guarde novo primeiro. Ligue fim antigo
     * ao primeiro antigo, corte prefixo com null e atualize inicio/fim.
     *
     * EXEMPLO / TESTE DE MESA
     * [A,B,C,D,E],k2 ->[C,D,E,A,B].
     *
     * CASOS DE BORDA
     * k0/kn nada muda; k<0/k>n lanca; vazia aceita k0.
     *
     * CUSTO E EFEITOS
     * O(k) tempo/O(1) auxiliar. Mesmos nos, mesmo tamanho.
     *
     * COMO ADAPTAR
     * Rotacao direita r equivale a esquerda n-r se a especificacao permitir.
     *
     * ATENCAO AO CONTRATO
     * Nao criar celulas nem chamar inserir/remover. Nao usar modulo para esconder k invalido.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R07_Rotacionar {
        public static class Lista<E extends Comparable<E>> {
            private Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void rotacionar(int k) {
                    if (k < 0 || k > tamanho) throw new IllegalArgumentException("k invalido");
                    if (k == 0 || k == tamanho) return;
                    Biblioteca.Base.Celula<E> antigoPrimeiro = inicio.getProximo(), corte = antigoPrimeiro;
                    for (int i = 1; i < k; i++) corte = corte.getProximo();
                    Biblioteca.Base.Celula<E> novoPrimeiro = corte.getProximo();
                    fim.setProximo(antigoPrimeiro); corte.setProximo(null);
                    inicio.setProximo(novoPrimeiro); fim = corte;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            /** LF01: copia via API publica; entradas ficam na mesma ordem. */
                public Lista(Biblioteca.Base.Fila<E> a, Biblioteca.Base.Fila<E> b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
                    E x = ca.vazia() ? null : ca.desenfileirar();
                    E y = cb.vazia() ? null : cb.desenfileirar();
                    while (x != null && y != null) {
                        if (x.compareTo(y) <= 0) {
                            inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
                        } else {
                            inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
                        }
                    }
                    if (x != null) inserirFinal(x);
                    if (y != null) inserirFinal(y);
                    while (!ca.vazia()) inserirFinal(ca.desenfileirar());
                    while (!cb.vazia()) inserirFinal(cb.desenfileirar());
                }

            private Biblioteca.Base.Fila<E> copiarPorAPI(Biblioteca.Base.Fila<E> fila) {
                    Biblioteca.Base.Fila<E> copia = new Biblioteca.Base.Fila<>(), auxiliar = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) {
                        E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
                    }
                    while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
                    return copia;
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFinal(E novo) {
                    if (novo == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> c = new Biblioteca.Base.Celula<>(novo);
                    fim.setProximo(c); fim = c; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F126]
    // ============================================================================
    // region [F127] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R08_DividirAoMeio.java
    // BUSCA: R08 Dividir Ao Meio
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R08_DividirAoMeio.java
    // ============================================================================
    /*
     * ============================================================================
     * R08 - Partir cadeia reaproveitando nos
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 8, pagina 3.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Metade esquerda=(n+1)/2. Ache o corte, passe a cadeia restante para a nova
     * sentinela e zere corte.proximo. Ajuste fim/tamanho das duas.
     *
     * EXEMPLO / TESTE DE MESA
     * [A,B,C,D,E] -> this[A,B,C],retorno[D,E].
     * [A,B,C,D] -> this[A,B],retorno[C,D].
     *
     * CASOS DE BORDA
     * 0/1 deixam retorno vazio; pares/impares; novas insercoes em ambas.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar. Uma nova sentinela, nenhum novo no de dados.
     *
     * COMO ADAPTAR
     * Separar pares/impares (FF13) e outra operacao.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R08_DividirAoMeio {
        public static class Lista<E extends Comparable<E>> {
            private Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public Lista<E> dividirAoMeio() {
                    Lista<E> outra = new Lista<>();
                    int esquerda = (tamanho + 1) / 2;
                    if (esquerda == tamanho) return outra;
                    Biblioteca.Base.Celula<E> corte = inicio;
                    for (int i = 0; i < esquerda; i++) corte = corte.getProximo();
                    outra.inicio.setProximo(corte.getProximo());
                    outra.fim = fim; outra.tamanho = tamanho - esquerda;
                    corte.setProximo(null); fim = corte; tamanho = esquerda;
                    return outra;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            /** LF01: copia via API publica; entradas ficam na mesma ordem. */
                public Lista(Biblioteca.Base.Fila<E> a, Biblioteca.Base.Fila<E> b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
                    E x = ca.vazia() ? null : ca.desenfileirar();
                    E y = cb.vazia() ? null : cb.desenfileirar();
                    while (x != null && y != null) {
                        if (x.compareTo(y) <= 0) {
                            inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
                        } else {
                            inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
                        }
                    }
                    if (x != null) inserirFinal(x);
                    if (y != null) inserirFinal(y);
                    while (!ca.vazia()) inserirFinal(ca.desenfileirar());
                    while (!cb.vazia()) inserirFinal(cb.desenfileirar());
                }

            private Biblioteca.Base.Fila<E> copiarPorAPI(Biblioteca.Base.Fila<E> fila) {
                    Biblioteca.Base.Fila<E> copia = new Biblioteca.Base.Fila<>(), auxiliar = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) {
                        E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
                    }
                    while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
                    return copia;
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFinal(E novo) {
                    if (novo == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> c = new Biblioteca.Base.Celula<>(novo);
                    fim.setProximo(c); fim = c; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F127]
    // ============================================================================
    // region [F128] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R09_TrocarPrimeiros.java
    // BUSCA: R09 Trocar Primeiros
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R09_TrocarPrimeiros.java
    // ============================================================================
    /*
     * ============================================================================
     * R09 - Trocar dois primeiros e corrigir fim
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 9, pagina 3.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Guarde a/b. a.proximo=b.proximo; b.proximo=a; S.proximo=b.
     * Se b era fim, a passa a fim. Menos de2 itens lanca.
     *
     * EXEMPLO / TESTE DE MESA
     * [4,7,1,9]->[7,4,1,9],fim9
     * [4,7]->[7,4],fim4
     *
     * CASOS DE BORDA
     * 0/1 lanca;2 exige corrigir fim;3+ mantem fim.
     *
     * CUSTO E EFEITOS
     * O(1) tempo/espaco; mesmo tamanho.
     *
     * COMO ADAPTAR
     * Para quaisquer duas ocorrencias veja BL06.
     *
     * ATENCAO AO CONTRATO
     * O rastro do codigo incorreto esta em 07_RASTROS_ORDENACAO/R09_TrocaPrimeiros.java.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R09_TrocarPrimeiros {
        public static class Lista<E extends Comparable<E>> {
            private Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void trocarDoisPrimeiros() {
                    if (tamanho < 2) throw new IllegalStateException("Menos de dois itens");
                    Biblioteca.Base.Celula<E> a = inicio.getProximo(), b = a.getProximo();
                    a.setProximo(b.getProximo()); b.setProximo(a); inicio.setProximo(b);
                    if (fim == b) fim = a;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            /** LF01: copia via API publica; entradas ficam na mesma ordem. */
                public Lista(Biblioteca.Base.Fila<E> a, Biblioteca.Base.Fila<E> b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
                    E x = ca.vazia() ? null : ca.desenfileirar();
                    E y = cb.vazia() ? null : cb.desenfileirar();
                    while (x != null && y != null) {
                        if (x.compareTo(y) <= 0) {
                            inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
                        } else {
                            inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
                        }
                    }
                    if (x != null) inserirFinal(x);
                    if (y != null) inserirFinal(y);
                    while (!ca.vazia()) inserirFinal(ca.desenfileirar());
                    while (!cb.vazia()) inserirFinal(cb.desenfileirar());
                }

            private Biblioteca.Base.Fila<E> copiarPorAPI(Biblioteca.Base.Fila<E> fila) {
                    Biblioteca.Base.Fila<E> copia = new Biblioteca.Base.Fila<>(), auxiliar = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) {
                        E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
                    }
                    while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
                    return copia;
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFinal(E novo) {
                    if (novo == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> c = new Biblioteca.Base.Celula<>(novo);
                    fim.setProximo(c); fim = c; tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F128]
    // ============================================================================
    // region [F129] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R10_CustosSimplesDupla.java
    // BUSCA: R10 Custos Simples Dupla
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R10_CustosSimplesDupla.java
    // ============================================================================
    /*
     * ============================================================================
     * R10 - Tabela de custos simples versus dupla
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 10, pagina 4.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * A dupla guarda predecessor em cada no. Na simples, ter fim nao entrega
     * o predecessor de fim. Memoria extra: uma referencia anterior por no.
     *
     * EXEMPLO / TESTE DE MESA
     * OPERACAO                 SIMPLES                   DUPLA
     * Inserir final            O(1)                      O(1)
     * Remover final            O(n)                      O(1)
     * Remover no conhecido     O(n)                      O(1)
     * Inserir antes de no      O(n)                      O(1)
     * Percorrer reverso        O(n) com stack O(n)       O(n),auxO(1)
     *                         O(n^2) buscando predecessores sem auxiliar
     *
     * CASOS DE BORDA
     * No conhecido deve ser valido, pertencer a lista e nao ser sentinela.
     *
     * CUSTO E EFEITOS
     * Dupla: O(n) referencias adicionais; mais setas precisam ser mantidas por alteracao.
     *
     * COMO ADAPTAR
     * O custo de percurso reverso na simples depende da memoria permitida. Declare a hipotese.
     *
     * ATENCAO AO CONTRATO
     * A sentinela simplifica inicio ao fornecer predecessor real. Item final impede truques de copiar sucessor.
     *
     * ============================================================================
     */
    // endregion [F129]
    // ============================================================================
    // region [F130] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R11_RemoverFimDupla.java
    // BUSCA: R11 Remover Fim Dupla
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R11_RemoverFimDupla.java
    // ============================================================================
    /*
     * ============================================================================
     * R11 - Remover ultimo da dupla
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 11, pagina 4.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Guarde fim. Novo fim=removido.anterior. Faca novoFim.proximo=null e
     * decremente tamanho. Quando unico, anterior e a sentinela.
     *
     * EXEMPLO / TESTE DE MESA
     * S<->10<->20<->30 ->retorna30;fim20. Unidade10 ->fimS.
     *
     * CASOS DE BORDA
     * Vaziaerro; unidade;2; remover todos e inserir de novo.
     *
     * CUSTO E EFEITOS
     * Dupla O(1). Simples precisa buscar anterior:O(n).
     *
     * COMO ADAPTAR
     * Guarde referencias antes de zerar links do removido.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/ListaDupla.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R11_RemoverFimDupla {
        public static class ListaDupla<E> {
            private final Biblioteca.Base.CelulaDupla<E> inicio;
            private Biblioteca.Base.CelulaDupla<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public E removerFim() {
                    if (vazia()) throw new NoSuchElementException("Lista vazia");
                    Biblioteca.Base.CelulaDupla<E> r = fim;
                    fim = r.getAnterior(); fim.setProximo(null);
                    r.setAnterior(null); tamanho--;
                    return r.getItem();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public ListaDupla() { inicio = new Biblioteca.Base.CelulaDupla<>(); fim = inicio; }

            public ListaDupla(Biblioteca.Base.Fila<E> fila) {
                    this();
                    if (fila == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> aux = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                    while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFim(E item) { inserir(item, tamanho); }

            public void inserir(E item, int posicao) {
                    if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.CelulaDupla<E> anterior;
                    if (posicao == tamanho) anterior = fim;
                    else {
                        anterior = inicio;
                        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    }
                    Biblioteca.Base.CelulaDupla<E> seguinte = anterior.getProximo();
                    Biblioteca.Base.CelulaDupla<E> nova = new Biblioteca.Base.CelulaDupla<>(item);
                    nova.setAnterior(anterior); nova.setProximo(seguinte);
                    anterior.setProximo(nova);
                    if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
                    tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F130]
    // ============================================================================
    // region [F131] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R12_InserirDupla.java
    // BUSCA: R12 Inserir Dupla
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R12_InserirDupla.java
    // ============================================================================
    /*
     * ============================================================================
     * R12 - Inserir em posicao na dupla
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 12, pagina 4.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Localize anterior/sucessor. Nova aponta a ambos; anterior.proximo=nova;
     * sucessor.anterior=nova quando existir. Sem sucessor, fim=nova.
     *
     * EXEMPLO / TESTE DE MESA
     * S<->A<->C; inserirB pos1 ->S<->A<->B<->C.
     *
     * CASOS DE BORDA
     * 0..n valido; negativos/>n invalidos; vazio;inicio;fim.
     *
     * CUSTO E EFEITOS
     * O(pos) busca/O(1) religacao. Final e O(1) usando fim.
     *
     * COMO ADAPTAR
     * Buscar pelo extremo mais perto reduz passos para min(pos,n-pos).
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/ListaDupla.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R12_InserirDupla {
        public static class ListaDupla<E> {
            private final Biblioteca.Base.CelulaDupla<E> inicio;
            private Biblioteca.Base.CelulaDupla<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void inserir(E item, int posicao) {
                    if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.CelulaDupla<E> anterior;
                    if (posicao == tamanho) anterior = fim;
                    else {
                        anterior = inicio;
                        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    }
                    Biblioteca.Base.CelulaDupla<E> seguinte = anterior.getProximo();
                    Biblioteca.Base.CelulaDupla<E> nova = new Biblioteca.Base.CelulaDupla<>(item);
                    nova.setAnterior(anterior); nova.setProximo(seguinte);
                    anterior.setProximo(nova);
                    if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
                    tamanho++;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public ListaDupla() { inicio = new Biblioteca.Base.CelulaDupla<>(); fim = inicio; }

            public ListaDupla(Biblioteca.Base.Fila<E> fila) {
                    this();
                    if (fila == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> aux = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                    while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFim(E item) { inserir(item, tamanho); }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F131]
    // ============================================================================
    // region [F132] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R13_InverterDupla.java
    // BUSCA: R13 Inverter Dupla
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R13_InverterDupla.java
    // ============================================================================
    /*
     * ============================================================================
     * R13 - Inverter dupla preservando sentinela
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 13, pagina 4.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Vire as duas setas de cada dado. Trate fronteiras: antigo primeiro passa
     * a ter proximo null; antigo fim tem anterior S. Religue S e fim ao final.
     *
     * EXEMPLO / TESTE DE MESA
     * S<->10<->20<->30 ->S<->30<->20<->10. S nao muda.
     *
     * CASOS DE BORDA
     * Vazia/unidade; verificar ida e volta; inverter duas vezes.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar; sem novos nos ou troca de itens.
     *
     * COMO ADAPTAR
     * So trocar inicio/fim nao inverte links e ainda quebraria a sentinela.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/ListaDupla.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R13_InverterDupla {
        public static class ListaDupla<E> {
            private final Biblioteca.Base.CelulaDupla<E> inicio;
            private Biblioteca.Base.CelulaDupla<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void inverter() {
                    if (vazia()) return;
                    Biblioteca.Base.CelulaDupla<E> antigoPrimeiro = inicio.getProximo(), antigoFim = fim;
                    Biblioteca.Base.CelulaDupla<E> atual = antigoPrimeiro;
                    while (atual != null) {
                        Biblioteca.Base.CelulaDupla<E> seguinte = atual.getProximo(), anterior = atual.getAnterior();
                        atual.setProximo(anterior == inicio ? null : anterior);
                        atual.setAnterior(seguinte == null ? inicio : seguinte);
                        atual = seguinte;
                    }
                    inicio.setProximo(antigoFim); fim = antigoPrimeiro;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public ListaDupla() { inicio = new Biblioteca.Base.CelulaDupla<>(); fim = inicio; }

            public ListaDupla(Biblioteca.Base.Fila<E> fila) {
                    this();
                    if (fila == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> aux = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                    while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFim(E item) { inserir(item, tamanho); }

            public void inserir(E item, int posicao) {
                    if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.CelulaDupla<E> anterior;
                    if (posicao == tamanho) anterior = fim;
                    else {
                        anterior = inicio;
                        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    }
                    Biblioteca.Base.CelulaDupla<E> seguinte = anterior.getProximo();
                    Biblioteca.Base.CelulaDupla<E> nova = new Biblioteca.Base.CelulaDupla<>(item);
                    nova.setAnterior(anterior); nova.setProximo(seguinte);
                    anterior.setProximo(nova);
                    if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
                    tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F132]
    // ============================================================================
    // region [F133] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R14_RemoverTodosDupla.java
    // BUSCA: R14 Remover Todos Dupla
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R14_RemoverTodosDupla.java
    // ============================================================================
    /*
     * ============================================================================
     * R14 - Remover ocorrencias na dupla
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 14, pagina 4.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Guarde seguinte antes de remover atual. O proprio atual.anterior fornece
     * predecessor. Corrija os dois lados e os controles usando desligar.
     *
     * EXEMPLO / TESTE DE MESA
     * [2,2,3,2],alvo2 ->[3],true; ausente ->false.
     *
     * CASOS DE BORDA
     * Vazia lanca; todos; nenhum; consecutivos; extremos.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar. Uma passagem.
     *
     * COMO ADAPTAR
     * A variavel predecessor persistente da lista simples deixa de ser necessaria.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/ListaDupla.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R14_RemoverTodosDupla {
        public static class ListaDupla<E> {
            private final Biblioteca.Base.CelulaDupla<E> inicio;
            private Biblioteca.Base.CelulaDupla<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public boolean removerTodos(E item) {
                    if (vazia()) throw new IllegalStateException("Lista vazia");
                    boolean removeu = false;
                    Biblioteca.Base.CelulaDupla<E> atual = inicio.getProximo();
                    while (atual != null) {
                        Biblioteca.Base.CelulaDupla<E> seguinte = atual.getProximo();
                        if (atual.getItem().equals(item)) { desligar(atual); removeu = true; }
                        atual = seguinte;
                    }
                    return removeu;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public ListaDupla() { inicio = new Biblioteca.Base.CelulaDupla<>(); fim = inicio; }

            public ListaDupla(Biblioteca.Base.Fila<E> fila) {
                    this();
                    if (fila == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> aux = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                    while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFim(E item) { inserir(item, tamanho); }

            public void inserir(E item, int posicao) {
                    if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.CelulaDupla<E> anterior;
                    if (posicao == tamanho) anterior = fim;
                    else {
                        anterior = inicio;
                        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    }
                    Biblioteca.Base.CelulaDupla<E> seguinte = anterior.getProximo();
                    Biblioteca.Base.CelulaDupla<E> nova = new Biblioteca.Base.CelulaDupla<>(item);
                    nova.setAnterior(anterior); nova.setProximo(seguinte);
                    anterior.setProximo(nova);
                    if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
                    tamanho++;
                }

            private E desligar(Biblioteca.Base.CelulaDupla<E> atual) {
                    Biblioteca.Base.CelulaDupla<E> anterior = atual.getAnterior(), seguinte = atual.getProximo();
                    anterior.setProximo(seguinte);
                    if (seguinte != null) seguinte.setAnterior(anterior); else fim = anterior;
                    atual.setAnterior(null); atual.setProximo(null); tamanho--;
                    return atual.getItem();
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F133]
    // ============================================================================
    // region [F134] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R15_PalindromoDupla.java
    // BUSCA: R15 Palindromo Dupla
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R15_PalindromoDupla.java
    // ============================================================================
    /*
     * ============================================================================
     * R15 - Comparar extremos da dupla
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 15, pagina 4.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * a comeca primeiro dado, b no fim. Compare equals, avance a.proximo e
     * b.anterior. Fazer tamanho/2 comparacoes evita tratar cruzamento separado.
     *
     * EXEMPLO / TESTE DE MESA
     * [A,R,A,R,A]->true;[1,2,2,1]->true;[1,2,3]->false.
     *
     * CASOS DE BORDA
     * Vazia e unidade true; par/impar; divergencia inicial.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) memoria, sem modificar.
     *
     * COMO ADAPTAR
     * Sem tamanho, pare ao encontrar/cruzar cursores. Nao compare objetos de dados com ==.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/ListaDupla.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R15_PalindromoDupla {
        public static class ListaDupla<E> {
            private final Biblioteca.Base.CelulaDupla<E> inicio;
            private Biblioteca.Base.CelulaDupla<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public boolean ehPalindromo() {
                    Biblioteca.Base.CelulaDupla<E> a = inicio.getProximo(), b = fim;
                    for (int i = 0; i < tamanho / 2; i++) {
                        if (!a.getItem().equals(b.getItem())) return false;
                        a = a.getProximo(); b = b.getAnterior();
                    }
                    return true;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public ListaDupla() { inicio = new Biblioteca.Base.CelulaDupla<>(); fim = inicio; }

            public ListaDupla(Biblioteca.Base.Fila<E> fila) {
                    this();
                    if (fila == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> aux = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                    while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFim(E item) { inserir(item, tamanho); }

            public void inserir(E item, int posicao) {
                    if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.CelulaDupla<E> anterior;
                    if (posicao == tamanho) anterior = fim;
                    else {
                        anterior = inicio;
                        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    }
                    Biblioteca.Base.CelulaDupla<E> seguinte = anterior.getProximo();
                    Biblioteca.Base.CelulaDupla<E> nova = new Biblioteca.Base.CelulaDupla<>(item);
                    nova.setAnterior(anterior); nova.setProximo(seguinte);
                    anterior.setProximo(nova);
                    if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
                    tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F134]
    // ============================================================================
    // region [F135] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R16_ConcatenarDupla.java
    // BUSCA: R16 Concatenar Dupla
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R16_ConcatenarDupla.java
    // ============================================================================
    /*
     * ============================================================================
     * R16 - Transferir outra dupla em O(1)
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 16, pagina 5.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ligue fimA a primeiroB, corrija anterior do primeiroB e adote fimB.
     * Esvazie a sentinela e controles de B. Os nos de B agora pertencem a A.
     *
     * EXEMPLO / TESTE DE MESA
     * A:S<->1<->2;B:T<->3<->4
     * A:S<->1<->2<->3<->4;B:T->null,fimB=T,tamanhoB0.
     *
     * CASOS DE BORDA
     * B vazia; A vazia; ambas; reutilizar B; selfconcat rejeitada.
     *
     * CUSTO E EFEITOS
     * O(1) tempo/espaco. Consome B. Sem fim, achar cauda custariaO(n).
     *
     * COMO ADAPTAR
     * Preservar B exigiria copiar nos, nao essa transferencia constante.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/ListaDupla.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R16_ConcatenarDupla {
        public static class ListaDupla<E> {
            private final Biblioteca.Base.CelulaDupla<E> inicio;
            private Biblioteca.Base.CelulaDupla<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Transfere os nos, O(1); esvazia outra. */
                public void concatenar(ListaDupla<E> outra) {
                    if (outra == null || outra == this) throw new IllegalArgumentException("Origem invalida");
                    if (outra.vazia()) return;
                    Biblioteca.Base.CelulaDupla<E> primeiroOutro = outra.inicio.getProximo();
                    fim.setProximo(primeiroOutro); primeiroOutro.setAnterior(fim);
                    fim = outra.fim; tamanho += outra.tamanho;
                    outra.inicio.setProximo(null); outra.fim = outra.inicio; outra.tamanho = 0;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public ListaDupla() { inicio = new Biblioteca.Base.CelulaDupla<>(); fim = inicio; }

            public ListaDupla(Biblioteca.Base.Fila<E> fila) {
                    this();
                    if (fila == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> aux = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                    while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFim(E item) { inserir(item, tamanho); }

            public void inserir(E item, int posicao) {
                    if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.CelulaDupla<E> anterior;
                    if (posicao == tamanho) anterior = fim;
                    else {
                        anterior = inicio;
                        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    }
                    Biblioteca.Base.CelulaDupla<E> seguinte = anterior.getProximo();
                    Biblioteca.Base.CelulaDupla<E> nova = new Biblioteca.Base.CelulaDupla<>(item);
                    nova.setAnterior(anterior); nova.setProximo(seguinte);
                    anterior.setProximo(nova);
                    if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
                    tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F135]
    // ============================================================================
    // region [F136] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R17_ConstrutorDuplaFila.java
    // BUSCA: R17 Construtor Dupla Fila
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R17_ConstrutorDuplaFila.java
    // ============================================================================
    /*
     * ============================================================================
     * R17 - Dupla por fila preservando ordem
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 17, pagina 5.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Retire da fila, insira na lista e numa auxiliar. Devolva a auxiliar a
     * origem no fim. Use SOMENTE API publica, nao campos privados da Fila.
     *
     * EXEMPLO / TESTE DE MESA
     * Fila[A,B,C] ->lista[A,B,C]; fila restaurada[A,B,C].
     *
     * CASOS DE BORDA
     * Vazia/unidade; origem deve manter sequencia.
     *
     * CUSTO E EFEITOS
     * O(n) tempo e auxiliar. Itens/ordem preservados, nao identidade das celulas internas.
     *
     * COMO ADAPTAR
     * A API de retirar/reinserir nao permite prometer identidade de cada no da fila.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/ListaDupla.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R17_ConstrutorDuplaFila {
        public static class ListaDupla<E> {
            private final Biblioteca.Base.CelulaDupla<E> inicio;
            private Biblioteca.Base.CelulaDupla<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public ListaDupla() { inicio = new Biblioteca.Base.CelulaDupla<>(); fim = inicio; }

            public ListaDupla(Biblioteca.Base.Fila<E> fila) {
                    this();
                    if (fila == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> aux = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                    while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public boolean vazia() { return inicio == fim; }

            public void inserirFim(E item) { inserir(item, tamanho); }

            public void inserir(E item, int posicao) {
                    if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.CelulaDupla<E> anterior;
                    if (posicao == tamanho) anterior = fim;
                    else {
                        anterior = inicio;
                        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    }
                    Biblioteca.Base.CelulaDupla<E> seguinte = anterior.getProximo();
                    Biblioteca.Base.CelulaDupla<E> nova = new Biblioteca.Base.CelulaDupla<>(item);
                    nova.setAnterior(anterior); nova.setProximo(seguinte);
                    anterior.setProximo(nova);
                    if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
                    tamanho++;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F136]
    // ============================================================================
    // region [F137] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R18_MergeSort.java
    // BUSCA: R18 Merge Sort
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R18_MergeSort.java
    // ============================================================================
    /*
     * ============================================================================
     * R18 - Arvore e ultima intercalacao do Mergesort
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 18, pagina 5.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Divida intervalos fechados em meio=(esq+dir)/2. Ordene metades e intercale
     * usando dois indices. Testes entre candidatos contam; copiar sobras nao.
     *
     * EXEMPLO / TESTE DE MESA
     * [29,14,37,8,21,3,45,16,11]
     * ultima: [8,14,21,29,37] com [3,11,16,45]
     * resultado[3,8,11,14,16,21,29,37,45];8 comparacoes finais.
     *
     * CASOS DE BORDA
     * 0/1 base; esquerda com item extra; empate escolhe esquerda.
     *
     * CUSTO E EFEITOS
     * O(n log n) tempo/O(n) auxiliar no vetor; O(log n) chamadas.
     *
     * COMO ADAPTAR
     * Rastro de TODAS divisoes/mesclagens na pasta07, arquivo R18_MergeSort.java.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/ordenacao/Ordenacoes.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R18_MergeSort {
        public static final class Ordenacoes {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static void mergeSort(int[] a) { mergeSort(a, new int[a.length], 0, a.length - 1); }

            private static void mergeSort(int[] a, int[] aux, int esq, int dir) {
                    if (esq >= dir) return;
                    int meio = esq + (dir - esq) / 2;
                    mergeSort(a, aux, esq, meio); mergeSort(a, aux, meio + 1, dir);
                    int i = esq, j = meio + 1, k = esq;
                    while (i <= meio && j <= dir) aux[k++] = a[i] <= a[j] ? a[i++] : a[j++];
                    while (i <= meio) aux[k++] = a[i++];
                    while (j <= dir) aux[k++] = a[j++];
                    for (k = esq; k <= dir; k++) a[k] = aux[k];
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Ordenacoes() { }
        }
    }
    // endregion [F137]
    // ============================================================================
    // region [F138] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R19_HeapSort.java
    // BUSCA: R19 Heap Sort
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R19_HeapSort.java
    // ============================================================================
    /*
     * ============================================================================
     * R19 - Heapsort base um e trocas
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 19, pagina 5.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ignore array0. Filhos2*i/2*i+1. Construa de n/2 ate1. Troque raiz
     * com ultimo ativo, reduza heap e repare descendo pela maior crianca.
     *
     * EXEMPLO / TESTE DE MESA
     * [12,7,25,3,18,30,9,14] ->[3,7,9,12,14,18,25,30].
     *
     * CASOS DE BORDA
     * 0/1; filho direito ausente; nao tocar sufixo ja ordenado.
     *
     * CUSTO E EFEITOS
     * Construcao O(n), ordenacao O(n log n), auxiliar O(1).
     *
     * COMO ADAPTAR
     * Base zero usa outras formulas. Rastro completo R19_HeapSort.java em pasta07.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/ordenacao/Ordenacoes.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R19_HeapSort {
        public static final class Ordenacoes {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** R19: array[0] ignorado, elementos em 1..n. */
                public static void heapSortBaseUm(int[] a) {
                    int n = a.length - 1;
                    for (int i = n / 2; i >= 1; i--) descerBaseUm(a, i, n);
                    for (int fim = n; fim > 1; fim--) { trocar(a, 1, fim); descerBaseUm(a, 1, fim - 1); }
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Ordenacoes() { }

            public static void trocar(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }

            private static void descerBaseUm(int[] a, int pai, int n) {
                    while (2 * pai <= n) {
                        int filho = 2 * pai;
                        if (filho < n && a[filho + 1] > a[filho]) filho++;
                        if (a[pai] >= a[filho]) return;
                        trocar(a, pai, filho); pai = filho;
                    }
                }
        }
    }
    // endregion [F138]
    // ============================================================================
    // region [F139] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R20_QuickSort.java
    // BUSCA: R20 Quick Sort
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R20_QuickSort.java
    // ============================================================================
    /*
     * ============================================================================
     * R20 - Quick pivo final versus central
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 20, pagina 5.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * i avanca ate >=pivo; j ate <=pivo; troque e avance ambos. Recurse em
     * esq..j e i..dir. O VALOR do pivo permanece salvo mesmo apos trocas.
     *
     * EXEMPLO / TESTE DE MESA
     * [3,5,8,11,14,17,20]
     * pivo final:33 testes elemento/pivo; central:16.
     *
     * CASOS DE BORDA
     * Contar testes falsos finais dos whiles; nao contar i<=j como teste de elemento.
     *
     * CUSTO E EFEITOS
     * Equilibrado O(n log n); desequilibrado O(n^2); stack podeO(n).
     *
     * COMO ADAPTAR
     * Mediana de tres evita extremo neste vetor crescente, nao garante melhor caso em toda entrada.
     *
     * ATENCAO AO CONTRATO
     * Rastro exato e chamadas em pasta07/R20_QuickSort.java.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/ordenacao/Ordenacoes.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R20_QuickSort {
        public static final class Ordenacoes {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static void quickSortCentro(int[] a) { quick(a, 0, a.length - 1, false); }

            public static void quickSortUltimo(int[] a) { quick(a, 0, a.length - 1, true); }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Ordenacoes() { }

            public static void trocar(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }

            private static void quick(int[] a, int esq, int dir, boolean ultimo) {
                    if (esq >= dir) return;
                    int i = esq, j = dir;
                    int pivo = a[ultimo ? dir : esq + (dir - esq) / 2];
                    while (i <= j) {
                        while (a[i] < pivo) i++;
                        while (a[j] > pivo) j--;
                        if (i <= j) { trocar(a, i, j); i++; j--; }
                    }
                    if (esq < j) quick(a, esq, j, ultimo);
                    if (i < dir) quick(a, i, dir, ultimo);
                }
        }
    }
    // endregion [F139]
    // ============================================================================
    // region [F140] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R21_EscolherAlgoritmo.java
    // BUSCA: R21 Escolher Algoritmo
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R21_EscolherAlgoritmo.java
    // ============================================================================
    /*
     * ============================================================================
     * R21 - Escolha justificada de ordenacao
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 21, pagina 6.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Escolha pelos requisitos antes de falar em rapidez: estabilidade, memoria,
     * pior caso e acesso sequencial/importancia de indices.
     *
     * EXEMPLO / TESTE DE MESA
     * a) lista encadeada grande: Mergesort, merge sequencial.
     * b) nota preservando nomes empatados: Mergesort estavel, empate pela esquerda.
     * c) O(1) memoria/pior caso nao quadratico: Heapsort iterativo.
     * d) quase ordenado: Insertion, poucos deslocamentos/inversoes.
     *
     * CASOS DE BORDA
     * Quick/heap padroes nao sao estaveis. Insertion tem pior caso quadratico.
     *
     * CUSTO E EFEITOS
     * Merge/heap piorO(nlogn). Insertion O(n+I),I=inversoes; piorO(n^2).
     *
     * COMO ADAPTAR
     * Uma restricao nova pode mudar a resposta. Apresente motivo, nao somente nome.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ============================================================================
     */
    // endregion [F140]
    // ============================================================================
    // region [F141] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R22_Lomuto.java
    // BUSCA: R22 Lomuto
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R22_Lomuto.java
    // ============================================================================
    /*
     * ============================================================================
     * R22 - Particionar nao e ordenar
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 22, pagina 6.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ultimo e pivo. i encerra prefixo<=pivo; j percorre antes do pivo. Ao
     * final troque pivo para i+1. O retorno e POSICAO final do pivo.
     *
     * EXEMPLO / TESTE DE MESA
     * [7,2,9,4,6,1,5] ->[2,4,1,5,6,9,7],retorna3.
     *
     * CASOS DE BORDA
     * Lados ainda nao ordenados; recursao exclui p:esq..p-1,p+1..dir.
     *
     * CUSTO E EFEITOS
     * ParticaoO(n). Quick piorO(n^2) em crescente/inverso/todosiguais com <=.
     *
     * COMO ADAPTAR
     * Nao misture os limites desta versao com R20. Rastro pasta07/R22_Lomuto.java.
     *
     * ATENCAO AO CONTRATO
     * Use os nomes, a assinatura e as restricoes do template efetivamente entregue na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/ordenacao/Ordenacoes.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R22_Lomuto {
        public static final class Ordenacoes {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static int particionar(int[] a, int esq, int dir) {
                    int pivo = a[dir], i = esq - 1;
                    for (int j = esq; j < dir; j++) if (a[j] <= pivo) trocar(a, ++i, j);
                    trocar(a, i + 1, dir); return i + 1;
                }

            public static void quickSortLomuto(int[] a) { lomuto(a, 0, a.length - 1); }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Ordenacoes() { }

            public static void trocar(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }

            private static void lomuto(int[] a, int e, int d) {
                    if (e >= d) return;
                    int p = particionar(a, e, d);
                    lomuto(a, e, p - 1); lomuto(a, p + 1, d);
                }
        }
    }
    // endregion [F141]
    // ============================================================================
    // region [F142] 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R23_OrdenarLista.java
    // BUSCA: R23 Ordenar Lista
    // ORIGEM_NO_ACERVO: 04_EXERCICIOS_DOS_PDFS/06_REVISAO_R/R23_OrdenarLista.java
    // ============================================================================
    /*
     * ============================================================================
     * R23 - Mergesort recursivo da lista
     *
     * BASE: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF, questao 23, pagina 6.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Base tamanho<=1. Divida em duas, ordene THIS e direita, intercale em
     * nova lista e adote seus campos. this=ordenada nao e atribuicao permitida em Java.
     *
     * EXEMPLO / TESTE DE MESA
     * [4,1,3,2] ->metades[4,1]/[3,2] ->[1,4]/[2,3] ->[1,2,3,4].
     *
     * CASOS DE BORDA
     * Vazia/unidade; impar/par; empates; crescente/inversa.
     *
     * CUSTO E EFEITOS
     * T(n)=T(ceil(n/2))+T(floor(n/2))+Theta(n)=Theta(nlogn).
     * Memoria viva auxiliar O(n), stackO(logn); alocacoes totais O(nlogn) no merge copiador.
     *
     * COMO ADAPTAR
     * Merge por religacao economiza alocacoes, mas R05 exige copia preservando entradas.
     *
     * ATENCAO AO CONTRATO
     * Usa dividirAoMeio(R08) e intercalarOrdenadas(R05). Funcoes incluidas como dependencias abaixo.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/revisao/Lista.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class R23_OrdenarLista {
        public static class Lista<E extends Comparable<E>> {
            private Biblioteca.Base.Celula<E> inicio;
            private Biblioteca.Base.Celula<E> fim;
            private int tamanho;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void ordenar() {
                    if (tamanho <= 1) return;
                    Lista<E> direita = dividirAoMeio();
                    this.ordenar(); direita.ordenar();
                    Lista<E> ordenada = intercalarOrdenadas(direita);
                    inicio = ordenada.inicio; fim = ordenada.fim; tamanho = ordenada.tamanho;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Lista() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }

            /** LF01: copia via API publica; entradas ficam na mesma ordem. */
                public Lista(Biblioteca.Base.Fila<E> a, Biblioteca.Base.Fila<E> b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
                    E x = ca.vazia() ? null : ca.desenfileirar();
                    E y = cb.vazia() ? null : cb.desenfileirar();
                    while (x != null && y != null) {
                        if (x.compareTo(y) <= 0) {
                            inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
                        } else {
                            inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
                        }
                    }
                    if (x != null) inserirFinal(x);
                    if (y != null) inserirFinal(y);
                    while (!ca.vazia()) inserirFinal(ca.desenfileirar());
                    while (!cb.vazia()) inserirFinal(cb.desenfileirar());
                }

            private Biblioteca.Base.Fila<E> copiarPorAPI(Biblioteca.Base.Fila<E> fila) {
                    Biblioteca.Base.Fila<E> copia = new Biblioteca.Base.Fila<>(), auxiliar = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) {
                        E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
                    }
                    while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
                    return copia;
                }

            public boolean vazia() { return inicio == fim; }

            public void inserirFinal(E novo) {
                    if (novo == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> c = new Biblioteca.Base.Celula<>(novo);
                    fim.setProximo(c); fim = c; tamanho++;
                }

            public Lista<E> intercalarOrdenadas(Lista<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Lista nula");
                    Lista<E> nova = new Lista<>();
                    Biblioteca.Base.Celula<E> a = inicio.getProximo(), b = outra.inicio.getProximo();
                    while (a != null && b != null) {
                        if (a.getItem().compareTo(b.getItem()) <= 0) {
                            nova.inserirFinal(a.getItem()); a = a.getProximo();
                        } else { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                    }
                    while (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
                    while (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                    return nova;
                }

            public Lista<E> dividirAoMeio() {
                    Lista<E> outra = new Lista<>();
                    int esquerda = (tamanho + 1) / 2;
                    if (esquerda == tamanho) return outra;
                    Biblioteca.Base.Celula<E> corte = inicio;
                    for (int i = 0; i < esquerda; i++) corte = corte.getProximo();
                    outra.inicio.setProximo(corte.getProximo());
                    outra.fim = fim; outra.tamanho = tamanho - esquerda;
                    corte.setProximo(null); fim = corte; tamanho = esquerda;
                    return outra;
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F142]
    // ============================================================================
    // region [F143] 05_CLASSICOS_PESQUISADOS/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * 20 CLASSICOS E VARIACOES
     * ============================================================================
     *
     * Pesquisa externa complementa os PDFs, nao revela a prova.
     *
     * C01_Delimitadores.java
     *   Balanceamento de parenteses/chaves/colchetes
     * C02_Posfixa.java
     *   Avaliar expressao posfixa
     * C03_Binario.java
     *   Converter inteiro para binario
     * C04_Palindromo.java
     *   Frase palindromo com fila e pilha
     * C05_InverterCadeia.java
     *   Reverse Linked List iterativo e recursivo
     * C06_DetectarCiclo.java
     *   Linked List Cycle
     * C07_InicioDoCiclo.java
     *   Encontrar entrada do ciclo
     * C08_Meio.java
     *   Encontrar meio com dois cursores
     * C09_KDoFim.java
     *   Consultar k-esimo do fim
     * C10_RemoverKDoFim.java
     *   Remover n-esimo a partir do final
     * C11_MergeNos.java
     *   Intercalar cadeias reaproveitando nos
     * C12_DuplicadosOrdenados.java
     *   Eliminar duplicados consecutivos
     * C13_DuplicadosNaoOrdenados.java
     *   Eliminar repetidos sem ordenar
     * C14_ParticaoEstavel.java
     *   Particionar lista mantendo ordem interna
     * C15_InverterPrefixo.java
     *   Inverter somente os primeiros k da fila
     * C16_Josephus.java
     *   Josephus com fila
     * C17_ProximoMaior.java
     *   Proximo maior com pilha monotona
     * C18_SaidaDePilha.java
     *   Validar sequencia de desempilhamento
     * C19_PilhaMinima.java
     *   Minimo em tempo constante
     * C20_FilaDuasPilhas.java
     *   Fila por duas pilhas
     */
    // endregion [F143]
    // ============================================================================
    // region [F144] 05_CLASSICOS_PESQUISADOS/C01_Delimitadores.java
    // BUSCA: C01 Delimitadores
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C01_Delimitadores.java
    // ============================================================================
    /*
     * ============================================================================
     * C01 - Balanceamento de parenteses/chaves/colchetes
     *
     * BASE: HackerRank Balanced Brackets: https://www.hackerrank.com/challenges/balanced-brackets/problem
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Empilhe aberturas; cada fechamento deve combinar com a ultima abertura.
     * Nesta adaptacao retorna boolean e ignora outros caracteres; fonte usa YES/NO.
     *
     * EXEMPLO / TESTE DE MESA
     * {[()]}->true;([)]->false;(() ->false.
     *
     * CASOS DE BORDA
     * Vazia; fechamento inicial; aberturas restantes; tipos cruzados.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/memoria. Cada simbolo empilha/desempilha no maximo uma vez.
     *
     * COMO ADAPTAR
     * Contar quantidades nao basta: ([)] tem as quantidades certas e a ordem errada.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C01_Delimitadores {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static boolean delimitadoresBalanceados(String texto) {
                    if (texto == null) throw new IllegalArgumentException("Texto nulo");
                    Biblioteca.Base.Pilha<Character> p = new Biblioteca.Base.Pilha<>();
                    for (int i = 0; i < texto.length(); i++) {
                        char c = texto.charAt(i);
                        if (c == '(' || c == '[' || c == '{') p.empilhar(c);
                        else if (c == ')' || c == ']' || c == '}') {
                            if (p.vazia()) return false;
                            char a = p.desempilhar();
                            if ((c == ')' && a != '(') || (c == ']' && a != '[') || (c == '}' && a != '{')) return false;
                        }
                    }
                    return p.vazia();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F144]
    // ============================================================================
    // region [F145] 05_CLASSICOS_PESQUISADOS/C02_Posfixa.java
    // BUSCA: C02 Posfixa
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C02_Posfixa.java
    // ============================================================================
    /*
     * ============================================================================
     * C02 - Avaliar expressao posfixa
     *
     * BASE: Tema de expressoes com pilha: https://algs4.cs.princeton.edu/13stacks/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Numero empilha. Operador retira b e depois a, calcula a OP b, empilha resultado.
     * Tokens separados por espacos, operadores+,-,*,/. Interface definida neste acervo.
     *
     * EXEMPLO / TESTE DE MESA
     * "3 4 + 2 *" ->14; "10 4 -" ->6.
     *
     * CASOS DE BORDA
     * Falta operando; sobram operandos; vazio; divisao por zero; numeros negativos.
     *
     * CUSTO E EFEITOS
     * O(n) tokens e memoria, desconsiderando custo de parse de token enorme.
     *
     * COMO ADAPTAR
     * Infixa precisa precedencia. Nao inverter operandos em subtracao/divisao.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C02_Posfixa {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Tokens separados por espacos. O primeiro pop e o operando DIREITO. */
                public static double avaliarPosfixa(String expressao) {
                    if (expressao == null || expressao.trim().isEmpty()) throw new IllegalArgumentException("Expressao vazia");
                    Biblioteca.Base.Pilha<Double> p = new Biblioteca.Base.Pilha<>();
                    for (String token : expressao.trim().split("\\s+")) {
                        if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                            if (p.vazia()) throw new IllegalArgumentException("Falta operando");
                            double b = p.desempilhar();
                            if (p.vazia()) throw new IllegalArgumentException("Falta operando");
                            double a = p.desempilhar();
                            if (token.equals("+")) p.empilhar(a + b);
                            else if (token.equals("-")) p.empilhar(a - b);
                            else if (token.equals("*")) p.empilhar(a * b);
                            else { if (b == 0) throw new ArithmeticException("Divisao por zero"); p.empilhar(a / b); }
                        } else p.empilhar(Double.parseDouble(token));
                    }
                    if (p.vazia()) throw new IllegalArgumentException("Sem resultado");
                    double r = p.desempilhar();
                    if (!p.vazia()) throw new IllegalArgumentException("Operandos sobrando");
                    return r;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F145]
    // ============================================================================
    // region [F146] 05_CLASSICOS_PESQUISADOS/C03_Binario.java
    // BUSCA: C03 Binario
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C03_Binario.java
    // ============================================================================
    /*
     * ============================================================================
     * C03 - Converter inteiro para binario
     *
     * BASE: Princeton, exercicios de pilhas: https://www.cs.princeton.edu/courses/archive/spr01/cs126/exercises/adt.html
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Restos das divisoes por2 saem do bit menos significativo ao mais significativo.
     * Empilhar e retirar inverte essa ordem.
     *
     * EXEMPLO / TESTE DE MESA
     * 13:restos1,0,1,1; pops1,1,0,1 ->"1101".
     *
     * CASOS DE BORDA
     * 0 precisa devolver"0";1;potencias de2;negativo rejeitado.
     *
     * CUSTO E EFEITOS
     * O(log n) tempo e memoria para n>0.
     *
     * COMO ADAPTAR
     * Outra base b usa resto%b e divide/b; bases>10 exigem mapa de digitos.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C03_Binario {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static String binario(int n) {
                    if (n < 0) throw new IllegalArgumentException("Numero negativo");
                    if (n == 0) return "0";
                    Biblioteca.Base.Pilha<Integer> p = new Biblioteca.Base.Pilha<>();
                    while (n > 0) { p.empilhar(n % 2); n /= 2; }
                    StringBuilder s = new StringBuilder();
                    while (!p.vazia()) s.append(p.desempilhar());
                    return s.toString();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F146]
    // ============================================================================
    // region [F147] 05_CLASSICOS_PESQUISADOS/C04_Palindromo.java
    // BUSCA: C04 Palindromo
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C04_Palindromo.java
    // ============================================================================
    /*
     * ============================================================================
     * C04 - Frase palindromo com fila e pilha
     *
     * BASE: Princeton Palindrome checker: https://algs4.cs.princeton.edu/13stacks/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Compare retirada FIFO com LIFO dos mesmos caracteres. A implementacao ignora
     * caixa/espacos/pontuacao e ainda remove acentos como adaptacao explicita.
     *
     * EXEMPLO / TESTE DE MESA
     * "A grama e amarga" ->true; "abc"->false.
     *
     * CASOS DE BORDA
     * Vazia;unidade;pares/impares;Unicode;normalizacao.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/memoria; String nao muda.
     *
     * COMO ADAPTAR
     * Exigir caracteres exatos muda o resultado: remova normalizacao nesse contrato.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C04_Palindromo {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Politica explicita: ignora caixa, espacos, pontuacao e marcas de acento. */
                public static boolean palindromo(String texto) {
                    if (texto == null) throw new IllegalArgumentException("Texto nulo");
                    String s = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{M}+", "").toLowerCase(Locale.ROOT);
                    Biblioteca.Base.Pilha<Integer> p = new Biblioteca.Base.Pilha<>(); Biblioteca.Base.Fila<Integer> f = new Biblioteca.Base.Fila<>();
                    for (int i = 0; i < s.length();) {
                        int c = s.codePointAt(i); i += Character.charCount(c);
                        if (Character.isLetterOrDigit(c)) { p.empilhar(c); f.enfileirar(c); }
                    }
                    while (!f.vazia()) if (!f.desenfileirar().equals(p.desempilhar())) return false;
                    return true;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F147]
    // ============================================================================
    // region [F148] 05_CLASSICOS_PESQUISADOS/C05_InverterCadeia.java
    // BUSCA: C05 Inverter Cadeia
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C05_InverterCadeia.java
    // ============================================================================
    /*
     * ============================================================================
     * C05 - Reverse Linked List iterativo e recursivo
     *
     * BASE: LeetCode206: https://leetcode.com/problems/reverse-linked-list/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Reaproveite nos. Iterativa salva seguinte e vira seta. Recursiva inverte
     * resto, faz proxima apontar ao atual, termina atual.proximo=null e repassa cabeca.
     *
     * EXEMPLO / TESTE DE MESA
     * 10->20->30->null ->30->20->10->null.
     *
     * CASOS DE BORDA
     * null;unidade;2;inverter duas vezes.
     *
     * CUSTO E EFEITOS
     * O(n) tempo; auxiliarO(1) iterativo/O(n) recursivo.
     *
     * COMO ADAPTAR
     * Parametro e primeiro DADO, sem sentinela. Wrapper precisa adotar retorno e atualizar fim.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C05_InverterCadeia {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Cadeias SEM sentinela: devolver a nova cabeca nao atualiza seu objeto Lista. */
                public static <E> Biblioteca.Base.Celula<E> inverterLigacoes(Biblioteca.Base.Celula<E> atual) {
                    Biblioteca.Base.Celula<E> anterior = null;
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior); anterior = atual; atual = seguinte;
                    }
                    return anterior;
                }

            public static <E> Biblioteca.Base.Celula<E> inverterLigacoesRec(Biblioteca.Base.Celula<E> atual) {
                    if (atual == null || atual.getProximo() == null) return atual;
                    Biblioteca.Base.Celula<E> novaCabeca = inverterLigacoesRec(atual.getProximo());
                    atual.getProximo().setProximo(atual); atual.setProximo(null);
                    return novaCabeca;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F148]
    // ============================================================================
    // region [F149] 05_CLASSICOS_PESQUISADOS/C06_DetectarCiclo.java
    // BUSCA: C06 Detectar Ciclo
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C06_DetectarCiclo.java
    // ============================================================================
    /*
     * ============================================================================
     * C06 - Linked List Cycle
     *
     * BASE: LeetCode141: https://leetcode.com/problems/linked-list-cycle/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Lento anda1, rapido2. Se rapido chega a null, nao ha ciclo. Se se encontram
     * na MESMA celula, ha ciclo. Valores repetidos nao provam ciclo.
     *
     * EXEMPLO / TESTE DE MESA
     * A->B->C->null:false. A->B->C->B...:true.
     *
     * CASOS DE BORDA
     * Vazia;autoenlace;no unico sem ciclo;cauda antes do ciclo.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) memoria; nao altera.
     *
     * COMO ADAPTAR
     * Use == entre referencias das celulas, nao equals entre valores.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C06_DetectarCiclo {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> boolean temCiclo(Biblioteca.Base.Celula<E> inicio) {
                    Biblioteca.Base.Celula<E> lento = inicio, rapido = inicio;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                        if (lento == rapido) return true;
                    }
                    return false;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F149]
    // ============================================================================
    // region [F150] 05_CLASSICOS_PESQUISADOS/C07_InicioDoCiclo.java
    // BUSCA: C07 Inicio Do Ciclo
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C07_InicioDoCiclo.java
    // ============================================================================
    /*
     * ============================================================================
     * C07 - Encontrar entrada do ciclo
     *
     * BASE: LeetCode142: https://leetcode.com/problems/linked-list-cycle-ii/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Encontre colisao lento/rapido. Reposicione um na cabeca e ande ambos1 passo.
     * O encontro seguinte identifica a entrada, nao necessariamente a colisao anterior.
     *
     * EXEMPLO / TESTE DE MESA
     * A->B->C->D->B...: devolve referencia de B.
     *
     * CASOS DE BORDA
     * Sem ciclo retorna null;autoenlace;ciclo na cabeca.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar; nao altera links.
     *
     * COMO ADAPTAR
     * Nao retornar a primeira colisao como se sempre fosse entrada.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C07_InicioDoCiclo {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> Biblioteca.Base.Celula<E> inicioDoCiclo(Biblioteca.Base.Celula<E> inicio) {
                    Biblioteca.Base.Celula<E> lento = inicio, rapido = inicio;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                        if (lento == rapido) {
                            lento = inicio;
                            while (lento != rapido) { lento = lento.getProximo(); rapido = rapido.getProximo(); }
                            return lento;
                        }
                    }
                    return null;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F150]
    // ============================================================================
    // region [F151] 05_CLASSICOS_PESQUISADOS/C08_Meio.java
    // BUSCA: C08 Meio
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C08_Meio.java
    // ============================================================================
    /*
     * ============================================================================
     * C08 - Encontrar meio com dois cursores
     *
     * BASE: LeetCode876: https://leetcode.com/problems/middle-of-the-linked-list/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Lento1/rapido2. No fim, lento esta no centro. Nesta convencao, quando par
     * retorna a SEGUNDA central; vazio retorna null como extensao.
     *
     * EXEMPLO / TESTE DE MESA
     * [1,2,3,4,5]->no3;[1,2,3,4]->no3.
     *
     * CASOS DE BORDA
     * Vazia;um;par;impar.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) espaco.
     *
     * COMO ADAPTAR
     * Para cortar a lista com extra na esquerda, encontre o ultimo da esquerda, nao copie cegamente essa convencao.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C08_Meio {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Tamanho par: segunda celula central. */
                public static <E> Biblioteca.Base.Celula<E> meio(Biblioteca.Base.Celula<E> inicio) {
                    Biblioteca.Base.Celula<E> lento = inicio, rapido = inicio;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                    }
                    return lento;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F151]
    // ============================================================================
    // region [F152] 05_CLASSICOS_PESQUISADOS/C09_KDoFim.java
    // BUSCA: C09 KDo Fim
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C09_KDoFim.java
    // ============================================================================
    /*
     * ============================================================================
     * C09 - Consultar k-esimo do fim
     *
     * BASE: Adaptacao de consulta do padrao LeetCode19: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Adiante rapido k nos, depois ande rapido/lento juntos. Quando rapido atinge
     * null, lento identifica o k-esimo do fim. k1 significa ultimo.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30,40]:k1=40;k2=30;k4=10.
     *
     * CASOS DE BORDA
     * k<=0 ou >n;vazia;primeiro/ultimo.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar; consulta nao altera.
     *
     * COMO ADAPTAR
     * A fonte remove; esta ficha apenas consulta. A remocao aparece em C10.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C09_KDoFim {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** k=1 consulta o ultimo item. */
                public static <E> E kEsimoDoFim(Biblioteca.Base.Celula<E> inicio, int k) {
                    if (k <= 0) throw new IllegalArgumentException("k invalido");
                    Biblioteca.Base.Celula<E> rapido = inicio, lento = inicio;
                    for (int i = 0; i < k; i++) {
                        if (rapido == null) throw new IllegalArgumentException("k maior que tamanho");
                        rapido = rapido.getProximo();
                    }
                    while (rapido != null) { rapido = rapido.getProximo(); lento = lento.getProximo(); }
                    return lento.getItem();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F152]
    // ============================================================================
    // region [F153] 05_CLASSICOS_PESQUISADOS/C10_RemoverKDoFim.java
    // BUSCA: C10 Remover KDo Fim
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C10_RemoverKDoFim.java
    // ============================================================================
    /*
     * ============================================================================
     * C10 - Remover n-esimo a partir do final
     *
     * BASE: LeetCode19: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Sentinela temporaria permite retirar cabeca sem ramo especial. Mantenha a
     * distancia entre cursores e pare com lento no predecessor do alvo.
     *
     * EXEMPLO / TESTE DE MESA
     * [10,20,30,40],k2 ->[10,20,40];[10],k1 ->null.
     *
     * CASOS DE BORDA
     * Cabeca;ultimo;unico;k invalido deve falhar antes de alterar.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar; devolve nova cabeca.
     *
     * COMO ADAPTAR
     * Adapte fim/tamanho do objeto Lista no wrapper. Ignorar retorno pode manter a antiga cabeca removida.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C10_RemoverKDoFim {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> Biblioteca.Base.Celula<E> removerKEsimoDoFim(Biblioteca.Base.Celula<E> inicio, int k) {
                    if (k <= 0) throw new IllegalArgumentException("k invalido");
                    Biblioteca.Base.Celula<E> s = new Biblioteca.Base.Celula<>(null, inicio), rapido = s, lento = s;
                    for (int i = 0; i < k; i++) {
                        rapido = rapido.getProximo();
                        if (rapido == null) throw new IllegalArgumentException("k maior que tamanho");
                    }
                    while (rapido.getProximo() != null) { rapido = rapido.getProximo(); lento = lento.getProximo(); }
                    lento.setProximo(lento.getProximo().getProximo());
                    return s.getProximo();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F153]
    // ============================================================================
    // region [F154] 05_CLASSICOS_PESQUISADOS/C11_MergeNos.java
    // BUSCA: C11 Merge Nos
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C11_MergeNos.java
    // ============================================================================
    /*
     * ============================================================================
     * C11 - Intercalar cadeias reaproveitando nos
     *
     * BASE: LeetCode21: https://leetcode.com/problems/merge-two-sorted-lists/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Ligue fim do resultado ao menor no candidato, avance origem correspondente.
     * Ao acabar uma, anexe o restante da outra sem copiar todos os dados.
     *
     * EXEMPLO / TESTE DE MESA
     * [1,4,7] e[2,5,8] ->[1,2,4,5,7,8].
     *
     * CASOS DE BORDA
     * Vazias;empates;cadeias devem ser DISJUNTAS.
     *
     * CUSTO E EFEITOS
     * O(n+m) tempo/O(1) auxiliar; altera links das entradas.
     *
     * COMO ADAPTAR
     * Diferente de R05, que exige preservar ambas e criar novos nos.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C11_MergeNos {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Consome ligacoes. Entradas devem ser disjuntas e ordenadas. */
                public static <E extends Comparable<E>> Biblioteca.Base.Celula<E> intercalarNos(Biblioteca.Base.Celula<E> a, Biblioteca.Base.Celula<E> b) {
                    Biblioteca.Base.Celula<E> s = new Biblioteca.Base.Celula<>(), fim = s;
                    while (a != null && b != null) {
                        if (a.getItem().compareTo(b.getItem()) <= 0) { fim.setProximo(a); a = a.getProximo(); }
                        else { fim.setProximo(b); b = b.getProximo(); }
                        fim = fim.getProximo();
                    }
                    fim.setProximo(a != null ? a : b);
                    return s.getProximo();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F154]
    // ============================================================================
    // region [F155] 05_CLASSICOS_PESQUISADOS/C12_DuplicadosOrdenados.java
    // BUSCA: C12 Duplicados Ordenados
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C12_DuplicadosOrdenados.java
    // ============================================================================
    /*
     * ============================================================================
     * C12 - Eliminar duplicados consecutivos
     *
     * BASE: LeetCode83: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Compare atual com proximo. Igual: pule proximo e mantenha atual para testar
     * a nova candidata. Diferente: avance.
     *
     * EXEMPLO / TESTE DE MESA
     * [1,1,1,2,3,3] ->[1,2,3].
     *
     * CASOS DE BORDA
     * Vazia;unidade;todos iguais;nenhuma duplicata.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar; altera ligacoes.
     *
     * COMO ADAPTAR
     * Lista deve estar ordenada para que todos os iguais fiquem juntos.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C12_DuplicadosOrdenados {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> Biblioteca.Base.Celula<E> removerDuplicadosOrdenados(Biblioteca.Base.Celula<E> inicio) {
                    Biblioteca.Base.Celula<E> p = inicio;
                    while (p != null && p.getProximo() != null) {
                        if (p.getItem().equals(p.getProximo().getItem())) p.setProximo(p.getProximo().getProximo());
                        else p = p.getProximo();
                    }
                    return inicio;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F155]
    // ============================================================================
    // region [F156] 05_CLASSICOS_PESQUISADOS/C13_DuplicadosNaoOrdenados.java
    // BUSCA: C13 Duplicados Nao Ordenados
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C13_DuplicadosNaoOrdenados.java
    // ============================================================================
    /*
     * ============================================================================
     * C13 - Eliminar repetidos sem ordenar
     *
     * BASE: Variacao autoral de equals/removerTodos dos PDFs, sem colecoes prontas.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Fixe cada no e retire repeticoes no trecho seguinte. Mantem a primeira
     * ocorrencia de cada item e a ordem relativa dessas ocorrencias.
     *
     * EXEMPLO / TESTE DE MESA
     * [3,1,3,2,1,2] ->[3,1,2].
     *
     * CASOS DE BORDA
     * Todos iguais;nenhum;ultimo repetido;vazia.
     *
     * CUSTO E EFEITOS
     * O(n^2) tempo/O(1) auxiliar.
     *
     * COMO ADAPTAR
     * HashSet mudaria o custo, mas e uma colecao pronta proibida na revisao. Ordenar mudaria a ordem.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C13_DuplicadosNaoOrdenados {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> Biblioteca.Base.Celula<E> removerDuplicados(Biblioteca.Base.Celula<E> inicio) {
                    for (Biblioteca.Base.Celula<E> p = inicio; p != null; p = p.getProximo()) {
                        Biblioteca.Base.Celula<E> anterior = p;
                        while (anterior.getProximo() != null) {
                            if (p.getItem().equals(anterior.getProximo().getItem())) anterior.setProximo(anterior.getProximo().getProximo());
                            else anterior = anterior.getProximo();
                        }
                    }
                    return inicio;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F156]
    // ============================================================================
    // region [F157] 05_CLASSICOS_PESQUISADOS/C14_ParticaoEstavel.java
    // BUSCA: C14 Particao Estavel
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C14_ParticaoEstavel.java
    // ============================================================================
    /*
     * ============================================================================
     * C14 - Particionar lista mantendo ordem interna
     *
     * BASE: LeetCode86: https://leetcode.com/problems/partition-list/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Destaque cada no e anexe ao grupo menores ou maiores/iguais. Ao final junte
     * as duas cadeias. A ordem relativa dentro dos grupos e mantida.
     *
     * EXEMPLO / TESTE DE MESA
     * [8,3,10,1,7,12],limite7 ->[3,1,8,10,7,12].
     *
     * CASOS DE BORDA
     * Todos/nenhum aprovados;iguais ao limite;vazia;salvar seguinte antes de cortar.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(1) auxiliar; reutiliza nos.
     *
     * COMO ADAPTAR
     * R02 retorna os menores em outra fila; aqui junta tudo numa cadeia com grupos.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C14_ParticaoEstavel {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E extends Comparable<E>> Biblioteca.Base.Celula<E> particionarEstavel(Biblioteca.Base.Celula<E> inicio, E limite) {
                    Biblioteca.Base.Celula<E> s1 = new Biblioteca.Base.Celula<>(), s2 = new Biblioteca.Base.Celula<>(), f1 = s1, f2 = s2;
                    for (Biblioteca.Base.Celula<E> atual = inicio; atual != null;) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo(); atual.setProximo(null);
                        if (atual.getItem().compareTo(limite) < 0) { f1.setProximo(atual); f1 = atual; }
                        else { f2.setProximo(atual); f2 = atual; }
                        atual = seguinte;
                    }
                    f1.setProximo(s2.getProximo()); return s1.getProximo();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F157]
    // ============================================================================
    // region [F158] 05_CLASSICOS_PESQUISADOS/C15_InverterPrefixo.java
    // BUSCA: C15 Inverter Prefixo
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C15_InverterPrefixo.java
    // ============================================================================
    /*
     * ============================================================================
     * C15 - Inverter somente os primeiros k da fila
     *
     * BASE: Variacao autoral de fila+pilha dos PDFs.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Tire k para pilha; coloque pops no final; rode os n-k elementos do sufixo
     * para recolocar esse sufixo depois do prefixo invertido.
     *
     * EXEMPLO / TESTE DE MESA
     * [1,2,3,4,5],k3: [4,5,3,2,1] ->rodar2 ->[3,2,1,4,5].
     *
     * CASOS DE BORDA
     * k0;k1;kn;fora do intervalo;vazia.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(k) auxiliar, usando API.
     *
     * COMO ADAPTAR
     * Se proibido recriar celulas, inverta os links do prefixo e reconecte ao sufixo.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C15_InverterPrefixo {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static <E> void inverterPrimeiros(Biblioteca.Base.Fila<E> fila, int k) {
                    int n = fila.tamanho();
                    if (k < 0 || k > n) throw new IllegalArgumentException("k invalido");
                    Biblioteca.Base.Pilha<E> p = new Biblioteca.Base.Pilha<>();
                    for (int i = 0; i < k; i++) p.empilhar(fila.desenfileirar());
                    while (!p.vazia()) fila.enfileirar(p.desempilhar());
                    for (int i = 0; i < n - k; i++) fila.enfileirar(fila.desenfileirar());
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F158]
    // ============================================================================
    // region [F159] 05_CLASSICOS_PESQUISADOS/C16_Josephus.java
    // BUSCA: C16 Josephus
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C16_Josephus.java
    // ============================================================================
    /*
     * ============================================================================
     * C16 - Josephus com fila
     *
     * BASE: Princeton Josephus: https://algs4.cs.princeton.edu/13stacks/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Pessoas0..n-1. Rode m-1 posicoes e retire a proxima; repita ate sobrar uma.
     * Esta adaptacao retorna sobrevivente em vez de imprimir eliminacoes.
     *
     * EXEMPLO / TESTE DE MESA
     * n7,m3 ->sobrevivente3 (base0); base1 seria4.
     *
     * CASOS DE BORDA
     * n1;m1;m>n;valoresinvalidos.
     *
     * CUSTO E EFEITOS
     * O(n^2) pior com modulo de voltas; O(n) memoria.
     *
     * COMO ADAPTAR
     * Formula recursiva matematica nao simula fila, caso a questao exija essa estrutura.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C16_Josephus {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Pessoas 0..n-1; retorna sobrevivente. */
                public static int josephus(int n, int m) {
                    if (n <= 0 || m <= 0) throw new IllegalArgumentException();
                    Biblioteca.Base.Fila<Integer> f = new Biblioteca.Base.Fila<>();
                    for (int i = 0; i < n; i++) f.enfileirar(i);
                    for (int restam = n; restam > 1; restam--) {
                        int passos = (m - 1) % restam;
                        for (int i = 0; i < passos; i++) f.enfileirar(f.desenfileirar());
                        f.desenfileirar();
                    }
                    return f.desenfileirar();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F159]
    // ============================================================================
    // region [F160] 05_CLASSICOS_PESQUISADOS/C17_ProximoMaior.java
    // BUSCA: C17 Proximo Maior
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C17_ProximoMaior.java
    // ============================================================================
    /*
     * ============================================================================
     * C17 - Proximo maior com pilha monotona
     *
     * BASE: Adaptacao de LeetCode496: https://leetcode.com/problems/next-greater-element-i/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Pilha guarda indices sem resposta. Valor novo maior que topo resolve aquele
     * indice; repita enquanto resolver e depois empilhe indice atual.
     *
     * EXEMPLO / TESTE DE MESA
     * [2,1,2,4,3] ->[4,2,4,-1,-1].
     *
     * CASOS DE BORDA
     * Vazio;crescente;decrescente;iguais;negativos.
     *
     * CUSTO E EFEITOS
     * O(n) tempo amortizado/O(n) memoria; cada indice entra/sai uma vez.
     *
     * COMO ADAPTAR
     * A fonte tem dois arrays. Aqui e um unico vetor, com -1 para ausencia, interface explicitamente adaptada.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C17_ProximoMaior {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static int[] proximosMaiores(int[] a) {
                    int[] resultado = new int[a.length]; Biblioteca.Base.Pilha<Integer> indices = new Biblioteca.Base.Pilha<>();
                    for (int i = 0; i < a.length; i++) {
                        resultado[i] = -1;
                        while (!indices.vazia() && a[i] > a[indices.consultarTopo()]) resultado[indices.desempilhar()] = a[i];
                        indices.empilhar(i);
                    }
                    return resultado;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F160]
    // ============================================================================
    // region [F161] 05_CLASSICOS_PESQUISADOS/C18_SaidaDePilha.java
    // BUSCA: C18 Saida De Pilha
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C18_SaidaDePilha.java
    // ============================================================================
    /*
     * ============================================================================
     * C18 - Validar sequencia de desempilhamento
     *
     * BASE: Princeton exercicios de push/pop: https://www.cs.princeton.edu/courses/archive/spr01/cs126/exercises/adt.html
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Empilhe os valores da entrada. Enquanto o topo coincide com a proxima
     * saida desejada, retire e avance a saida. No fim todas devem ter sido produzidas.
     *
     * EXEMPLO / TESTE DE MESA
     * entrada[1,2,3],saida[2,3,1]:true;saida[3,1,2]:false.
     *
     * CASOS DE BORDA
     * Vazios;comprimentos diferentes;valores repetidos conforme contrato.
     *
     * CUSTO E EFEITOS
     * O(n) tempo/O(n) auxiliar.
     *
     * COMO ADAPTAR
     * Ter os mesmos valores nao prova que a ordem de saida pode ser obtida por uma pilha.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/Classicos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C18_SaidaDePilha {
        public static final class Classicos {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static boolean sequenciaDesempilhavel(int[] entrada, int[] saida) {
                    if (entrada.length != saida.length) return false;
                    Biblioteca.Base.Pilha<Integer> p = new Biblioteca.Base.Pilha<>(); int j = 0;
                    for (int x : entrada) {
                        p.empilhar(x);
                        while (!p.vazia() && j < saida.length && p.consultarTopo() == saida[j]) { p.desempilhar(); j++; }
                    }
                    return j == saida.length;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private Classicos() { }
        }
    }
    // endregion [F161]
    // ============================================================================
    // region [F162] 05_CLASSICOS_PESQUISADOS/C19_PilhaMinima.java
    // BUSCA: C19 Pilha Minima
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C19_PilhaMinima.java
    // ============================================================================
    /*
     * ============================================================================
     * C19 - Minimo em tempo constante
     *
     * BASE: LeetCode155: https://leetcode.com/problems/min-stack/
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Use uma pilha de dados e outra dos minimos. Empilhe novo minimo quando
     * valor<=minimo atual, inclusive empates. Ao retirar esse valor, retire um minimo.
     *
     * EXEMPLO / TESTE DE MESA
     * push3,push1,push1;pop1 ->minimo ainda1;pop1 ->minimo3.
     *
     * CASOS DE BORDA
     * Minimos repetidos;primeiro;vazia;consulta sem remover.
     *
     * CUSTO E EFEITOS
     * O(1) por operacao/O(n) memoria.
     *
     * COMO ADAPTAR
     * Usar somente < em vez de <= perde informacao sobre minimos duplicados.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/classicos/PilhaMinima.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C19_PilhaMinima {
        public static class PilhaMinima<E extends Comparable<E>> {
            private final Biblioteca.Base.Pilha<E> dados = new Biblioteca.Base.Pilha<>();
            private final Biblioteca.Base.Pilha<E> minimos = new Biblioteca.Base.Pilha<>();

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public void empilhar(E item) {
                    dados.empilhar(item);
                    if (minimos.vazia() || item.compareTo(minimos.consultarTopo()) <= 0) minimos.empilhar(item);
                }

            public E desempilhar() {
                    E item = dados.desempilhar();
                    if (item.compareTo(minimos.consultarTopo()) == 0) minimos.desempilhar();
                    return item;
                }

            public E consultarTopo() { return dados.consultarTopo(); }

            public E minimo() { return minimos.consultarTopo(); }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public boolean vazia() { return dados.vazia(); }
        }
    }
    // endregion [F162]
    // ============================================================================
    // region [F163] 05_CLASSICOS_PESQUISADOS/C20_FilaDuasPilhas.java
    // BUSCA: C20 Fila Duas Pilhas
    // ORIGEM_NO_ACERVO: 05_CLASSICOS_PESQUISADOS/C20_FilaDuasPilhas.java
    // ============================================================================
    /*
     * ============================================================================
     * C20 - Fila por duas pilhas
     *
     * BASE: HackerRank Queue using Two Stacks: https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Mesma estrutura de R03. A plataforma pede interpretar comandos de entrada;
     * aqui isolamos a implementacao da fila e mantemos nomes do curso.
     *
     * EXEMPLO / TESTE DE MESA
     * inserir1,2;retirar1;inserir3;retirar2;retirar3.
     *
     * CASOS DE BORDA
     * Entrada nova quando saida ainda possui itens;vazia;consultas repetidas.
     *
     * CUSTO E EFEITOS
     * O(1) amortizado; retirada individual podeO(n).
     *
     * COMO ADAPTAR
     * Nomes push/pop/peek da plataforma foram adaptados a empilhar/desempilhar/consultar.
     *
     * ATENCAO AO CONTRATO
     * Adaptacao autoral para as classes do curso. Nao e evidencia de que caira na prova.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/PseudoFila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class C20_FilaDuasPilhas {
        public static class PseudoFila<E> {
            private final Biblioteca.Base.Pilha<E> entrada = new Biblioteca.Base.Pilha<>();
            private final Biblioteca.Base.Pilha<E> saida = new Biblioteca.Base.Pilha<>();

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public boolean vazia() { return entrada.vazia() && saida.vazia(); }

            public void enfileirar(E item) { entrada.empilhar(item); }

            public E desenfileirar() { prepararSaida(); return saida.desempilhar(); }

            public E consultarInicio() { prepararSaida(); return saida.consultarTopo(); }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private void prepararSaida() {
                    if (saida.vazia()) while (!entrada.vazia()) saida.empilhar(entrada.desempilhar());
                }
        }
    }
    // endregion [F163]
    // ============================================================================
    // region [F164] 06_APP_FUNCTION_PREDICATE/00_GUIA.java
    // BUSCA: 00 GUIA
    // ORIGEM_NO_ACERVO: 06_APP_FUNCTION_PREDICATE/00_GUIA.java
    // ============================================================================
    /*
     * ============================================================================
     * APP: QUEM DECLARA, QUEM CHAMA, QUEM RETORNA
     * ============================================================================
     *
     *
     * 1. App declara static Fila<Pedido> filaPedidos=new Fila<>(); fora dos metodos.
     * 2. FinalizarPedido enfileira os pedidos nessa MESMA fila.
     * 3. App cria Function/Predicate, com condicao fixa ou parametro vindo do usuario.
     * 4. Chama filaPedidos.calcularValorMedio(extrator,k) ou filtrar(condicao,k).
     * 5. Fila percorre celulas e entrega aux.getItem() para apply/test.
     *
     * Function NAO adivinha preco: a lambda define exatamente o codigo executado.
     *   Function<Pedido,Double> extrator=p->p.valorFinal();
     * Predicate NAO le teclado: a App pode ler minimo e captura-lo na lambda.
     *   Predicate<Pedido> condicao=p->p.valorFinal()>=minimo;
     *
     * Os nomes dos parametros da Fila nao precisam ser iguais aos nomes na App.
     * condicao na App pode ser condicional dentro de Fila: valor da referencia foi
     * passado, nao o nome da variavel.
     *
     * E item=aux.getItem(); valor=extrator.apply(item) e equivalente a aplicar direto
     * extrator.apply(aux.getItem()). A variavel intermediaria so torna o tipo visivel.
     *
     * O recorte de media fornecido especifica os primeiros quantidade. Parte do texto
     * do filtro estava cortada; o acervo adota quantidade de EXAMINADOS e explicita
     * isso. Sempre compare com o enunciado integral entregue na prova.
     *
     * A01_AppCompleta.java mostra uma demo realmente compilavel. Fonte reutilizavel
     * original:src/aed/app/AppPedidos.java. Nao precisa de navegador nem produtos.txt.
     */
    // endregion [F164]
    // ============================================================================
    // region [F165] 06_APP_FUNCTION_PREDICATE/A01_AppCompleta.java
    // BUSCA: A01 App Completa
    // ORIGEM_NO_ACERVO: 06_APP_FUNCTION_PREDICATE/A01_AppCompleta.java
    // ============================================================================
    /*
     * ============================================================================
     * A01 - App executavel com Function e Predicate
     *
     * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Crie uma fila compartilhada fora dos metodos. Finalizar enfileira. App define
     * a lambda; Fila apenas a executa para cada item. --interativo abre o menu de console.
     *
     * EXEMPLO / TESTE DE MESA
     * Demo80,250,120 ->media150;filtro>=100 ->250,120;origem3itens.
     *
     * CASOS DE BORDA
     * Quantidade invalida;pedido null;valores nao finitos.
     *
     * CUSTO E EFEITOS
     * Custos herdados das operacoes da Fila.
     *
     * COMO ADAPTAR
     * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
     *
     * ATENCAO AO CONTRATO
     * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/app/AppPedidos.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class A01_AppCompleta {
        public static final class AppPedidos {
            private static final Biblioteca.Base.Fila<Biblioteca.Aplicacao.PedidoDemo> filaPedidos = new Biblioteca.Base.Fila<>();
            private static final Biblioteca.Base.Pilha<Biblioteca.Aplicacao.PedidoDemo> pilhaPedidos = new Biblioteca.Base.Pilha<>();
            private static int proximoId = 1;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static void finalizarPedido(Biblioteca.Aplicacao.PedidoDemo pedido) {
                    if (pedido == null) throw new IllegalArgumentException("Pedido nulo");
                    filaPedidos.enfileirar(pedido); pilhaPedidos.empilhar(pedido);
                }

            public static void mostrarMediaPedidos(int quantidade) {
                    Function<Biblioteca.Aplicacao.PedidoDemo, Double> extrator = pedido -> pedido.valorFinal();
                    double media = filaPedidos.calcularValorMedio(extrator, quantidade);
                    System.out.printf("Media: %.2f%n", media);
                }

            public static void mostrarPedidosFiltrados(int quantidade, double minimo) {
                    Predicate<Biblioteca.Aplicacao.PedidoDemo> condicao = pedido -> pedido.valorFinal() >= minimo;
                    Biblioteca.Base.Fila<Biblioteca.Aplicacao.PedidoDemo> filtrados = filaPedidos.filtrar(condicao, quantidade);
                    while (!filtrados.vazia()) System.out.println(filtrados.desenfileirar());
                }

            public static void main(String[] args) {
                    if (args.length == 0 || !args[0].equals("--interativo")) { demonstrar(); return; }
                    Scanner sc = new Scanner(System.in, "UTF-8");
                    while (true) {
                        System.out.println("1 cadastrar, 2 media, 3 filtrar, 4 listar, 0 sair");
                        if (!sc.hasNextLine()) break;
                        String opcao = sc.nextLine().trim();
                        if (opcao.equals("0")) break;
                        try {
                            if (opcao.equals("1")) {
                                System.out.println("Valor:");
                                finalizarPedido(new Biblioteca.Aplicacao.PedidoDemo(proximoId++, Double.parseDouble(sc.nextLine().trim().replace(',', '.'))));
                            } else if (opcao.equals("2")) {
                                System.out.println("Quantidade:"); mostrarMediaPedidos(Integer.parseInt(sc.nextLine().trim()));
                            } else if (opcao.equals("3")) {
                                System.out.println("Quantidade:"); int n = Integer.parseInt(sc.nextLine().trim());
                                System.out.println("Minimo:"); double minimo = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
                                if (Double.isNaN(minimo) || Double.isInfinite(minimo)) throw new IllegalArgumentException("Minimo invalido");
                                mostrarPedidosFiltrados(n, minimo);
                            } else if (opcao.equals("4")) {
                                Biblioteca.Base.Fila<Biblioteca.Aplicacao.PedidoDemo> copia = filaPedidos.copiar();
                                while (!copia.vazia()) System.out.println(copia.desenfileirar());
                            } else System.out.println("Opcao invalida");
                        } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
                    }
                    sc.close();
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private AppPedidos() { }

            public static void demonstrar() {
                    finalizarPedido(new Biblioteca.Aplicacao.PedidoDemo(proximoId++, 80));
                    finalizarPedido(new Biblioteca.Aplicacao.PedidoDemo(proximoId++, 250));
                    finalizarPedido(new Biblioteca.Aplicacao.PedidoDemo(proximoId++, 120));
                    mostrarMediaPedidos(3); mostrarPedidosFiltrados(3, 100);
                    System.out.println("Fila original preservada: " + filaPedidos.tamanho());
                }
        }
    }
    // endregion [F165]
    // ============================================================================
    // region [F166] 06_APP_FUNCTION_PREDICATE/A02_MediaFunction.java
    // BUSCA: A02 Media Function
    // ORIGEM_NO_ACERVO: 06_APP_FUNCTION_PREDICATE/A02_MediaFunction.java
    // ============================================================================
    /*
     * ============================================================================
     * A02 - Function extrai o valor, Fila percorre
     *
     * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * App: Function<Pedido,Double> extrator=p->p.valorFinal().
     * Fila: soma+=extrator.apply(aux.getItem()); media=soma/quantidade.
     *
     * EXEMPLO / TESTE DE MESA
     * Primeiros2 de80,250,120:media165, nao150.
     *
     * CASOS DE BORDA
     * Media0itens gera erro. Quantidade>n gera erro antes do callback.
     *
     * CUSTO E EFEITOS
     * O(k) tempo/O(1) auxiliar;origem preservada.
     *
     * COMO ADAPTAR
     * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
     *
     * ATENCAO AO CONTRATO
     * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class A02_MediaFunction {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public double somarValores(Function<E, Double> extrator, int quantidade) {
                    if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
                    validarQuantidade(quantidade);
                    double soma = 0;
                    Biblioteca.Base.Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        Double valor = extrator.apply(p.getItem());
                        if (valor == null) throw new IllegalArgumentException("Extrator retornou null");
                        soma += valor;
                        p = p.getProximo();
                    }
                    return soma;
                }

            public double calcularValorMedio(Function<E, Double> extrator, int quantidade) {
                    if (quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser positiva");
                    return somarValores(extrator, quantidade) / quantidade;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            private void validarQuantidade(int quantidade) {
                    if (quantidade < 0) throw new IllegalArgumentException("Quantidade negativa");
                    Biblioteca.Base.Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        if (p == null) throw new IllegalArgumentException("Itens insuficientes");
                        p = p.getProximo();
                    }
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F166]
    // ============================================================================
    // region [F167] 06_APP_FUNCTION_PREDICATE/A03_FiltroPredicate.java
    // BUSCA: A03 Filtro Predicate
    // ORIGEM_NO_ACERVO: 06_APP_FUNCTION_PREDICATE/A03_FiltroPredicate.java
    // ============================================================================
    /*
     * ============================================================================
     * A03 - Predicate escolhe quem entra na copia
     *
     * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * App: Predicate<Pedido> condicao=p->p.valorFinal()>=minimo.
     * Fila analisa os primeiros quantidade; nao precisa saber que o criterio e preco.
     *
     * EXEMPLO / TESTE DE MESA
     * [80,250,120,400],k3,min100 ->[250,120];400 nem e examinado.
     *
     * CASOS DE BORDA
     * k0vaziovalido;negativo/insuficienteerro;predicadonullerro.
     *
     * CUSTO E EFEITOS
     * O(k) tempo/O(aprovados) novas celulas.
     *
     * COMO ADAPTAR
     * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
     *
     * ATENCAO AO CONTRATO
     * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class A03_FiltroPredicate {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            /** Quantidade e o numero de EXAMINADOS, nao o numero de aprovados. */
                public Fila<E> filtrar(Predicate<E> condicao, int quantidade) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    validarQuantidade(quantidade);
                    Fila<E> nova = new Fila<>();
                    Biblioteca.Base.Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        if (condicao.test(p.getItem())) nova.enfileirar(p.getItem());
                        p = p.getProximo();
                    }
                    return nova;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            private void validarQuantidade(int quantidade) {
                    if (quantidade < 0) throw new IllegalArgumentException("Quantidade negativa");
                    Biblioteca.Base.Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        if (p == null) throw new IllegalArgumentException("Itens insuficientes");
                        p = p.getProximo();
                    }
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F167]
    // ============================================================================
    // region [F168] 06_APP_FUNCTION_PREDICATE/A04_ContarPredicate.java
    // BUSCA: A04 Contar Predicate
    // ORIGEM_NO_ACERVO: 06_APP_FUNCTION_PREDICATE/A04_ContarPredicate.java
    // ============================================================================
    /*
     * ============================================================================
     * A04 - Contar aprovados sem criar outra fila
     *
     * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Se test(item) devolve true, incremente contador. Nao enfileira e nao remove.
     *
     * EXEMPLO / TESTE DE MESA
     * [80,250,120],>=100,k3 ->2.
     *
     * CASOS DE BORDA
     * Nenhum/todos;quantidade0/negativa/maior.
     *
     * CUSTO E EFEITOS
     * O(k) tempo/O(1) auxiliar.
     *
     * COMO ADAPTAR
     * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
     *
     * ATENCAO AO CONTRATO
     * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/base/Fila.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class A04_ContarPredicate {
        public static class Fila<E> {
            private final Biblioteca.Base.Celula<E> frente;
            private Biblioteca.Base.Celula<E> tras;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public int contarSe(Predicate<E> condicao, int quantidade) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    validarQuantidade(quantidade);
                    int n = 0;
                    Biblioteca.Base.Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        if (condicao.test(p.getItem())) n++;
                        p = p.getProximo();
                    }
                    return n;
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            public Fila() { frente = new Biblioteca.Base.Celula<>(); tras = frente; }

            /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

            /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Biblioteca.Base.Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Biblioteca.Base.Pilha<E> aux = new Biblioteca.Base.Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

            public boolean vazia() { return frente == tras; }

            public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

            public int tamanho() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

            private void validarQuantidade(int quantidade) {
                    if (quantidade < 0) throw new IllegalArgumentException("Quantidade negativa");
                    Biblioteca.Base.Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        if (p == null) throw new IllegalArgumentException("Itens insuficientes");
                        p = p.getProximo();
                    }
                }

            public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
        }
    }
    // endregion [F168]
    // ============================================================================
    // region [F169] 06_APP_FUNCTION_PREDICATE/A05_ModeloPedido.java
    // BUSCA: A05 Modelo Pedido
    // ORIGEM_NO_ACERVO: 06_APP_FUNCTION_PREDICATE/A05_ModeloPedido.java
    // ============================================================================
    /*
     * ============================================================================
     * A05 - PedidoDemo, equals e compareTo
     *
     * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Modelo pequeno independente do comercio original. ID define igualdade/ordem.
     * valorFinal fornece o dado que Function extrai. Nao troca criterio de compareTo.
     *
     * EXEMPLO / TESTE DE MESA
     * Pedido1valor250 e Pedido2valor80:ordenar natural porID,nao porpreco.
     *
     * CASOS DE BORDA
     * Valornaofinito/negativo rejeitado;mesmoID significa equals.
     *
     * CUSTO E EFEITOS
     * Acessos/comparacoes O(1).
     *
     * COMO ADAPTAR
     * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
     *
     * ATENCAO AO CONTRATO
     * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/app/PedidoDemo.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class A05_ModeloPedido {
        public static final class PedidoDemo implements Comparable<PedidoDemo> {
            private final int id;
            private final double valor;

            // ================= SOLUCAO_PEDIDA_AQUI =================
            public PedidoDemo(int id, double valor) {
                    if (valor < 0 || Double.isNaN(valor) || Double.isInfinite(valor)) throw new IllegalArgumentException("Valor invalido");
                    this.id = id; this.valor = valor;
                }

            public int getId() { return id; }

            public double valorFinal() { return valor; }

            @Override public int compareTo(PedidoDemo outro) { return Integer.compare(id, outro.id); }

            @Override public boolean equals(Object o) {
                    return o instanceof PedidoDemo && id == ((PedidoDemo) o).id;
                }

            @Override public int hashCode() { return Integer.hashCode(id); }

            // =========== BASE E AUXILIARES NECESSARIOS ==============

        }
    }
    // endregion [F169]
    // ============================================================================
    // region [F170] 06_APP_FUNCTION_PREDICATE/A06_RecursaoConsole.java
    // BUSCA: A06 Recursao Console
    // ORIGEM_NO_ACERVO: 06_APP_FUNCTION_PREDICATE/A06_RecursaoConsole.java
    // ============================================================================
    /*
     * ============================================================================
     * A06 - Programa para observar as chamadas
     *
     * BASE: Atividades em imagens/codigo do chat; adaptacao autoral.
     * Solucao autoral de estudo. Nao e gabarito oficial nem previsao da prova.
     *
     * PEDIDO E RACIOCINIO
     * Imprime antes/depois da chamada. Cada nivel recebe outra referencia de celula
     * e margem de exibicao. O parametro extra e somente para este demonstrador.
     *
     * EXEMPLO / TESTE DE MESA
     * Entradas10,20,30,null;retornos0,1,2,3. Resultadofinal3.
     *
     * CASOS DE BORDA
     * Nao adicionar margem em questao cuja assinatura e fixa.
     *
     * CUSTO E EFEITOS
     * O(n) chamadas, com custo extra da exibicao.
     *
     * COMO ADAPTAR
     * Nao crie nova fila vazia no metodo de consulta. Reutilize a existente ou receba-a por parametro.
     *
     * ATENCAO AO CONTRATO
     * PedidoDemo e independente. O projeto completo original depende de classes nao fornecidas integralmente. Os contratos adicionais de null/quantidade sao declarados aqui.
     *
     * ARQUIVO COMPLETO DE REFERENCIA: src/aed/app/RecursaoPassoAPasso.java
     * COMO COPIAR: procure SOLUCAO_PEDIDA_AQUI abaixo. A classe interna e uma
     * embalagem para manter esta ficha compilavel. Na prova, leve apenas os metodos
     * necessarios para a classe existente; nao duplique a classe Fila/Lista/Pilha.
     * Os campos e auxiliares estao visiveis abaixo. Nao presuma que helpers extras
     * existem no codigo-base. As classes de apoio ficam em src/aed/base.
     *
     * ============================================================================
     */

    public static final class A06_RecursaoConsole {
        public static final class RecursaoPassoAPasso {


            // ================= SOLUCAO_PEDIDA_AQUI =================
            public static int contar(Biblioteca.Base.Celula<Integer> atual, String margem) {
                    System.out.println(margem + "ENTROU: " + (atual == null ? "null" : atual.getItem()));
                    if (atual == null) {
                        System.out.println(margem + "RETORNA 0");
                        return 0;
                    }
                    System.out.println(margem + "Esta chamada espera o resultado da proxima");
                    int resposta = contar(atual.getProximo(), margem + "  ");
                    System.out.println(margem + "VOLTOU para " + atual.getItem() + "; resposta=" + resposta);
                    System.out.println(margem + "RETORNA " + (1 + resposta));
                    return 1 + resposta;
                }

            public static void main(String[] args) {
                    Biblioteca.Base.Celula<Integer> c30 = new Biblioteca.Base.Celula<>(30);
                    Biblioteca.Base.Celula<Integer> c20 = new Biblioteca.Base.Celula<>(20, c30);
                    Biblioteca.Base.Celula<Integer> c10 = new Biblioteca.Base.Celula<>(10, c20);
                    System.out.println("Resultado final=" + contar(c10, ""));
                }

            // =========== BASE E AUXILIARES NECESSARIOS ==============
            private RecursaoPassoAPasso() { }
        }
    }
    // endregion [F170]
    // ============================================================================
    // region [F171] 07_RASTROS_ORDENACAO/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 07_RASTROS_ORDENACAO/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * RASTROS EXATOS DOS EXERCICIOS
     * ============================================================================
     *
     * R04_EstadoDaFila.java
     * R09_TrocaPrimeiros.java
     * R18_MergeSort.java
     * R19_HeapSort.java
     * R20_QuickSort.java
     * R22_Lomuto.java
     *
     * Todos sao comentarios Java para leitura direta no VS Code.
     * As implementacoes compilaveis estao nas fichas Rxx e em src/aed/ordenacao.
     */
    // endregion [F171]
    // ============================================================================
    // region [F172] 07_RASTROS_ORDENACAO/R04_EstadoDaFila.java
    // BUSCA: R04 Estado Da Fila
    // ORIGEM_NO_ACERVO: 07_RASTROS_ORDENACAO/R04_EstadoDaFila.java
    // ============================================================================
    /*
     * ============================================================================
     * R04 - O QUE ACONTECE QUANDO TRAS NAO E ATUALIZADO
     * ============================================================================
     *
     *
     * BASE: Revisao R04,paginas2-3. Usando EXATAMENTE a retirada defeituosa.
     *
     * Inicial              frente->S->null;tras=S
     * Enfileirar5          frente->S->5->null;tras=5
     * Enfileirar8          frente->S->5->8->null;tras=8
     * Desenfileirar5       frente->S->8->null;tras=8
     * Enfileirar2          frente->S->8->2->null;tras=2
     * Desenfileirar8       frente->S->2->null;tras=2
     * Desenfileirar2       frente->S->null;tras=2 FORA DA CADEIA
     * Enfileirar7          frente->S->null
     *                     cadeia separada2->7->null;tras=7
     *
     * Proxima retirada: frente!=tras, logo vazia() responde false indevidamente.
     * removida=frente.getProximo() recebe null. removida.getProximo() gera
     * NullPointerException. O7 existe mas nao e alcancavel a partir da sentinela.
     *
     * Correcao: se removida==tras, tras=frente. Nao troque frente por null: ela deve
     * continuar referenciando a sentinela. Veja a ficha R04_CorrigirTras.java.
     */
    // endregion [F172]
    // ============================================================================
    // region [F173] 07_RASTROS_ORDENACAO/R09_TrocaPrimeiros.java
    // BUSCA: R09 Troca Primeiros
    // ORIGEM_NO_ACERVO: 07_RASTROS_ORDENACAO/R09_TrocaPrimeiros.java
    // ============================================================================
    /*
     * ============================================================================
     * R09 - ORDEM VISIVEL CORRETA PODE ESCONDER FIM ERRADO
     * ============================================================================
     *
     *
     * BASE: Revisao R09,pagina3.
     *
     * Entrada[4,7,1,9]: S->4->7->1->9,fim9
     * Saida:            S->7->4->1->9,fim9. Este caso funciona.
     *
     * Entrada[4,7]:     S->4->7,fim7
     * Codigo errado:   S->7->4,fim7. Ordem inverte, MAS fim continua incorreto.
     * Correto:         S->7->4,fim4.
     *
     * Se inserir9 usando fim errado,7.proximo passa a9 e a celula4 fica perdida.
     *
     * Vazia: a=null e chamar a.getProximo falha.
     * Unitaria: b=null e chamar b.getProximo falha.
     * Duas: exige atualizar fim.
     * Tres ou mais: fim continua no ultimo original.
     *
     * Antes de acessar: se tamanho<2 lance. Depois de trocar: se fim==b,fim=a.
     * Tamanho nao muda. Veja R09_TrocarPrimeiros.java para a solucao.
     */
    // endregion [F173]
    // ============================================================================
    // region [F174] 07_RASTROS_ORDENACAO/R18_MergeSort.java
    // BUSCA: R18 Merge Sort
    // ORIGEM_NO_ACERVO: 07_RASTROS_ORDENACAO/R18_MergeSort.java
    // ============================================================================
    /*
     * ============================================================================
     * R18 - TODAS AS CHAMADAS E INTERCALACOES
     * ============================================================================
     *
     * BASE: Revisao, questao18, pagina5. Indices base0, meio=(esq+dir)/2.
     * Rastro autoral calculado com as regras do enunciado.
     *
     * ARVORE DE CHAMADAS
     * ordenar(0,8) : [29, 14, 37, 8, 21, 3, 45, 16, 11]
     *   ordenar(0,4) : [29, 14, 37, 8, 21]
     *     ordenar(0,2) : [29, 14, 37]
     *       ordenar(0,1) : [29, 14]
     *         ordenar(0,0) : [29]
     *         ordenar(1,1) : [14]
     *       ordenar(2,2) : [37]
     *     ordenar(3,4) : [8, 21]
     *       ordenar(3,3) : [8]
     *       ordenar(4,4) : [21]
     *   ordenar(5,8) : [3, 45, 16, 11]
     *     ordenar(5,6) : [3, 45]
     *       ordenar(5,5) : [3]
     *       ordenar(6,6) : [45]
     *     ordenar(7,8) : [16, 11]
     *       ordenar(7,7) : [16]
     *       ordenar(8,8) : [11]
     *
     * INTERCALAR [0,1]: [29] com [14]
     * 29 <= 14 -> false
     * Resultado: [14, 29]
     * Comparacoes entre candidatos: 1.
     *
     * INTERCALAR [0,2]: [14, 29] com [37]
     * 14 <= 37 -> true
     * 29 <= 37 -> true
     * Resultado: [14, 29, 37]
     * Comparacoes entre candidatos: 2.
     *
     * INTERCALAR [3,4]: [8] com [21]
     * 8 <= 21 -> true
     * Resultado: [8, 21]
     * Comparacoes entre candidatos: 1.
     *
     * INTERCALAR [0,4]: [14, 29, 37] com [8, 21]
     * 14 <= 8 -> false
     * 14 <= 21 -> true
     * 29 <= 21 -> false
     * Resultado: [8, 14, 21, 29, 37]
     * Comparacoes entre candidatos: 3.
     *
     * INTERCALAR [5,6]: [3] com [45]
     * 3 <= 45 -> true
     * Resultado: [3, 45]
     * Comparacoes entre candidatos: 1.
     *
     * INTERCALAR [7,8]: [16] com [11]
     * 16 <= 11 -> false
     * Resultado: [11, 16]
     * Comparacoes entre candidatos: 1.
     *
     * INTERCALAR [5,8]: [3, 45] com [11, 16]
     * 3 <= 11 -> true
     * 45 <= 11 -> false
     * 45 <= 16 -> false
     * Resultado: [3, 11, 16, 45]
     * Comparacoes entre candidatos: 3.
     *
     * INTERCALAR [0,8]: [8, 14, 21, 29, 37] com [3, 11, 16, 45]
     * 8 <= 3 -> false
     * 8 <= 11 -> true
     * 14 <= 11 -> false
     * 14 <= 16 -> true
     * 21 <= 16 -> false
     * 21 <= 45 -> true
     * 29 <= 45 -> true
     * 37 <= 45 -> true
     * Resultado: [3, 8, 11, 14, 16, 21, 29, 37, 45]
     * Comparacoes entre candidatos: 8.
     *
     * Ultima intercalacao:8 comparacoes. Copiar sobras nao compara dois candidatos.
     * O retorno de cada metade precisa acontecer antes do merge do pai.
     */
    // endregion [F174]
    // ============================================================================
    // region [F175] 07_RASTROS_ORDENACAO/R19_HeapSort.java
    // BUSCA: R19 Heap Sort
    // ORIGEM_NO_ACERVO: 07_RASTROS_ORDENACAO/R19_HeapSort.java
    // ============================================================================
    /*
     * ============================================================================
     * R19 - VETOR E ARVORE APOS AS TROCAS
     * ============================================================================
     *
     * BASE: Revisao R19,pagina5. Array tratado de1..n, slot0 ignorado.
     * Representacao em niveis da arvore: filhos de i sao2*i e2*i+1.
     * Inicial:[12, 7, 25, 3, 18, 30, 9, 14]
     *   nivel 0: 12
     *   nivel 1: 7 25
     *   nivel 2: 3 18 30 9
     *   nivel 3: 14
     *
     * CONSTRUCAO BOTTOM-UP
     *
     * Reorganizar no 4
     * restaurar: troca(4,8) -> vetor [12, 7, 25, 14, 18, 30, 9, 3]
     *   nivel 0: 12
     *   nivel 1: 7 25
     *   nivel 2: 14 18 30 9
     *   nivel 3: 3
     *
     * Reorganizar no 3
     * restaurar: troca(3,6) -> vetor [12, 7, 30, 14, 18, 25, 9, 3]
     *   nivel 0: 12
     *   nivel 1: 7 30
     *   nivel 2: 14 18 25 9
     *   nivel 3: 3
     *
     * Reorganizar no 2
     * restaurar: troca(2,5) -> vetor [12, 18, 30, 14, 7, 25, 9, 3]
     *   nivel 0: 12
     *   nivel 1: 18 30
     *   nivel 2: 14 7 25 9
     *   nivel 3: 3
     *
     * Reorganizar no 1
     * restaurar: troca(1,3) -> vetor [30, 18, 12, 14, 7, 25, 9, 3]
     *   nivel 0: 30
     *   nivel 1: 18 12
     *   nivel 2: 14 7 25 9
     *   nivel 3: 3
     * restaurar: troca(3,6) -> vetor [30, 18, 25, 14, 7, 12, 9, 3]
     *   nivel 0: 30
     *   nivel 1: 18 25
     *   nivel 2: 14 7 12 9
     *   nivel 3: 3
     *
     * Maxheap final:[30, 18, 25, 14, 7, 12, 9, 3]
     *
     * FASE DE ORDENACAO: cada troca e registrada
     *
     * Fixar posicao 8
     * maior para final: troca(1,8) -> vetor [3, 18, 25, 14, 7, 12, 9, 30]
     *   nivel 0: 3
     *   nivel 1: 18 25
     *   nivel 2: 14 7 12 9
     * restaurar: troca(1,3) -> vetor [25, 18, 3, 14, 7, 12, 9, 30]
     *   nivel 0: 25
     *   nivel 1: 18 3
     *   nivel 2: 14 7 12 9
     * restaurar: troca(3,6) -> vetor [25, 18, 12, 14, 7, 3, 9, 30]
     *   nivel 0: 25
     *   nivel 1: 18 12
     *   nivel 2: 14 7 3 9
     * Heap ativo:[25, 18, 12, 14, 7, 3, 9] | Sufixo fixado:[30]
     *
     * Fixar posicao 7
     * maior para final: troca(1,7) -> vetor [9, 18, 12, 14, 7, 3, 25, 30]
     *   nivel 0: 9
     *   nivel 1: 18 12
     *   nivel 2: 14 7 3
     * restaurar: troca(1,2) -> vetor [18, 9, 12, 14, 7, 3, 25, 30]
     *   nivel 0: 18
     *   nivel 1: 9 12
     *   nivel 2: 14 7 3
     * restaurar: troca(2,4) -> vetor [18, 14, 12, 9, 7, 3, 25, 30]
     *   nivel 0: 18
     *   nivel 1: 14 12
     *   nivel 2: 9 7 3
     * Heap ativo:[18, 14, 12, 9, 7, 3] | Sufixo fixado:[25, 30]
     *
     * Fixar posicao 6
     * maior para final: troca(1,6) -> vetor [3, 14, 12, 9, 7, 18, 25, 30]
     *   nivel 0: 3
     *   nivel 1: 14 12
     *   nivel 2: 9 7
     * restaurar: troca(1,2) -> vetor [14, 3, 12, 9, 7, 18, 25, 30]
     *   nivel 0: 14
     *   nivel 1: 3 12
     *   nivel 2: 9 7
     * restaurar: troca(2,4) -> vetor [14, 9, 12, 3, 7, 18, 25, 30]
     *   nivel 0: 14
     *   nivel 1: 9 12
     *   nivel 2: 3 7
     * Heap ativo:[14, 9, 12, 3, 7] | Sufixo fixado:[18, 25, 30]
     *
     * Fixar posicao 5
     * maior para final: troca(1,5) -> vetor [7, 9, 12, 3, 14, 18, 25, 30]
     *   nivel 0: 7
     *   nivel 1: 9 12
     *   nivel 2: 3
     * restaurar: troca(1,3) -> vetor [12, 9, 7, 3, 14, 18, 25, 30]
     *   nivel 0: 12
     *   nivel 1: 9 7
     *   nivel 2: 3
     * Heap ativo:[12, 9, 7, 3] | Sufixo fixado:[14, 18, 25, 30]
     *
     * Fixar posicao 4
     * maior para final: troca(1,4) -> vetor [3, 9, 7, 12, 14, 18, 25, 30]
     *   nivel 0: 3
     *   nivel 1: 9 7
     * restaurar: troca(1,2) -> vetor [9, 3, 7, 12, 14, 18, 25, 30]
     *   nivel 0: 9
     *   nivel 1: 3 7
     * Heap ativo:[9, 3, 7] | Sufixo fixado:[12, 14, 18, 25, 30]
     *
     * Fixar posicao 3
     * maior para final: troca(1,3) -> vetor [7, 3, 9, 12, 14, 18, 25, 30]
     *   nivel 0: 7
     *   nivel 1: 3
     * Heap ativo:[7, 3] | Sufixo fixado:[9, 12, 14, 18, 25, 30]
     *
     * Fixar posicao 2
     * maior para final: troca(1,2) -> vetor [3, 7, 9, 12, 14, 18, 25, 30]
     *   nivel 0: 3
     * Heap ativo:[3] | Sufixo fixado:[7, 9, 12, 14, 18, 25, 30]
     *
     * Vetor final:[3, 7, 9, 12, 14, 18, 25, 30]
     */
    // endregion [F175]
    // ============================================================================
    // region [F176] 07_RASTROS_ORDENACAO/R20_QuickSort.java
    // BUSCA: R20 Quick Sort
    // ORIGEM_NO_ACERVO: 07_RASTROS_ORDENACAO/R20_QuickSort.java
    // ============================================================================
    /*
     * ============================================================================
     * R20 - PIVOS, CHAMADAS, TROCAS E COMPARACOES
     * ============================================================================
     *
     * BASE: Revisao R20,pagina5. Conta CADA teste elemento/pivo, inclusive falso.
     * Nao conta testes de indices i<=j. Troca consigo mesmo e exibida.
     *
     *
     * PIVO ULTIMO - TOTAL 33 COMPARACOES
     *
     * Chamada[0,6],profundidade0,pivo20
     * a[0]=3 < 20 -> true
     * a[1]=5 < 20 -> true
     * a[2]=8 < 20 -> true
     * a[3]=11 < 20 -> true
     * a[4]=14 < 20 -> true
     * a[5]=17 < 20 -> true
     * a[6]=20 < 20 -> false
     * a[6]=20 > 20 -> false
     * troca(6,6) -> [3, 5, 8, 11, 14, 17, 20]
     * Comparacoes nesta chamada:8;proximas chamadas:[(0, 5)]
     *
     * Chamada[0,5],profundidade1,pivo17
     * a[0]=3 < 17 -> true
     * a[1]=5 < 17 -> true
     * a[2]=8 < 17 -> true
     * a[3]=11 < 17 -> true
     * a[4]=14 < 17 -> true
     * a[5]=17 < 17 -> false
     * a[5]=17 > 17 -> false
     * troca(5,5) -> [3, 5, 8, 11, 14, 17, 20]
     * Comparacoes nesta chamada:7;proximas chamadas:[(0, 4)]
     *
     * Chamada[0,4],profundidade2,pivo14
     * a[0]=3 < 14 -> true
     * a[1]=5 < 14 -> true
     * a[2]=8 < 14 -> true
     * a[3]=11 < 14 -> true
     * a[4]=14 < 14 -> false
     * a[4]=14 > 14 -> false
     * troca(4,4) -> [3, 5, 8, 11, 14, 17, 20]
     * Comparacoes nesta chamada:6;proximas chamadas:[(0, 3)]
     *
     * Chamada[0,3],profundidade3,pivo11
     * a[0]=3 < 11 -> true
     * a[1]=5 < 11 -> true
     * a[2]=8 < 11 -> true
     * a[3]=11 < 11 -> false
     * a[3]=11 > 11 -> false
     * troca(3,3) -> [3, 5, 8, 11, 14, 17, 20]
     * Comparacoes nesta chamada:5;proximas chamadas:[(0, 2)]
     *
     * Chamada[0,2],profundidade4,pivo8
     * a[0]=3 < 8 -> true
     * a[1]=5 < 8 -> true
     * a[2]=8 < 8 -> false
     * a[2]=8 > 8 -> false
     * troca(2,2) -> [3, 5, 8, 11, 14, 17, 20]
     * Comparacoes nesta chamada:4;proximas chamadas:[(0, 1)]
     *
     * Chamada[0,1],profundidade5,pivo5
     * a[0]=3 < 5 -> true
     * a[1]=5 < 5 -> false
     * a[1]=5 > 5 -> false
     * troca(1,1) -> [3, 5, 8, 11, 14, 17, 20]
     * Comparacoes nesta chamada:3;proximas chamadas:[]
     *
     *
     * PIVO MEIO - TOTAL 16 COMPARACOES
     *
     * Chamada[0,6],profundidade0,pivo11
     * a[0]=3 < 11 -> true
     * a[1]=5 < 11 -> true
     * a[2]=8 < 11 -> true
     * a[3]=11 < 11 -> false
     * a[6]=20 > 11 -> true
     * a[5]=17 > 11 -> true
     * a[4]=14 > 11 -> true
     * a[3]=11 > 11 -> false
     * troca(3,3) -> [3, 5, 8, 11, 14, 17, 20]
     * Comparacoes nesta chamada:8;proximas chamadas:[(0, 2), (4, 6)]
     *
     * Chamada[0,2],profundidade1,pivo5
     * a[0]=3 < 5 -> true
     * a[1]=5 < 5 -> false
     * a[2]=8 > 5 -> true
     * a[1]=5 > 5 -> false
     * troca(1,1) -> [3, 5, 8, 11, 14, 17, 20]
     * Comparacoes nesta chamada:4;proximas chamadas:[]
     *
     * Chamada[4,6],profundidade1,pivo17
     * a[4]=14 < 17 -> true
     * a[5]=17 < 17 -> false
     * a[6]=20 > 17 -> true
     * a[5]=17 > 17 -> false
     * troca(5,5) -> [3, 5, 8, 11, 14, 17, 20]
     * Comparacoes nesta chamada:4;proximas chamadas:[]
     *
     * Ultimo em crescente e sempre extremo: particoes desequilibradas, padrao quadratico.
     * Central funciona equilibrado NESTE vetor. Mediana de tres entre primeiro/meio/ultimo
     * evita o extremo deste exemplo, mas nao garante bom balanceamento para toda entrada.
     */
    // endregion [F176]
    // ============================================================================
    // region [F177] 07_RASTROS_ORDENACAO/R22_Lomuto.java
    // BUSCA: R22 Lomuto
    // ORIGEM_NO_ACERVO: 07_RASTROS_ORDENACAO/R22_Lomuto.java
    // ============================================================================
    /*
     * ============================================================================
     * R22 - PASSO A PASSO DO PARTICIONAR
     * ============================================================================
     *
     * BASE: Revisao R22,pagina6. Lomuto, indices0..6.
     * Inicial:[7, 2, 9, 4, 6, 1, 5]
     * j=0: 7 <= 5 -> false
     * j=1: 2 <= 5 -> true
     * troca(0,1) -> [2, 7, 9, 4, 6, 1, 5]
     * j=2: 9 <= 5 -> false
     * j=3: 4 <= 5 -> true
     * troca(1,3) -> [2, 4, 9, 7, 6, 1, 5]
     * j=4: 6 <= 5 -> false
     * j=5: 1 <= 5 -> true
     * troca(2,5) -> [2, 4, 1, 7, 6, 9, 5]
     * troca(3,6) -> [2, 4, 1, 5, 6, 9, 7]
     * Retorno:3, indice final do pivo5.
     * Ha6 comparacoes de elementos no for. Os dois lados ainda nao estao ordenados.
     * Chamadas corretas:esq..p-1 e p+1..dir. Nao reutilizar limites da versao R20.
     */
    // endregion [F177]
    // ============================================================================
    // region [F178] 08_SIMULADOS/00_COMO_TREINAR.java
    // BUSCA: 00 COMO TREINAR
    // ORIGEM_NO_ACERVO: 08_SIMULADOS/00_COMO_TREINAR.java
    // ============================================================================
    /*
     * ============================================================================
     * TRES SIMULADOS AUTORAIS
     * ============================================================================
     *
     *
     * Os enunciados e gabaritos estao separados. Nao sao previsao da prova.
     * Abra A_ENUNCIADOS, tente sem olhar A_GABARITO; repita B e C.
     *
     * Para cada metodo:
     *   1. Escreva o contrato: entrada, saida, quem muda e quem fica.
     *   2. Desenhe S e3 dados.
     *   3. Resolva vazio e unidade.
     *   4. Escreva percurso, religacoes e retorno.
     *   5. Teste casos de borda e explique custo.
     *
     * Rubrica autoral de10 pontos:assinatura1,base2,progresso2,links2,ordem/retorno2,
     * testes/custo1. Nao e a distribuicao da professora.
     *
     * Banco minimo:[],[10],[10,20],[20,20,30,20],[1,2,3,4,5]. Posicoes-1,0,n-1,n.
     * Quantidades-1,0,1,n,n+1. Outra vazia/maior/menor/igual a this. Inserir depois de
     * esvaziar. Na dupla conferir ida E volta. Na ordenacao conferir repetidos,
     * negativos,crescente,inversa e empate entre objetos distintos.
     */
    // endregion [F178]
    // ============================================================================
    // region [F179] 08_SIMULADOS/A_ENUNCIADOS.java
    // BUSCA: A ENUNCIADOS
    // ORIGEM_NO_ACERVO: 08_SIMULADOS/A_ENUNCIADOS.java
    // ============================================================================
    /*
     * ============================================================================
     * SIMULADO A - ESTRUTURAS E CALLBACKS
     * ============================================================================
     *
     *
     * Convencao aed.base: frente/tras,primeiro/ultimo,topo/fundo. Sem colecoes prontas.
     *
     * A1. Copiar fila[8,4,9] sem alterar this. Retire um da copia e prove que a original
     * continua com3 dados. Diga se os objetos E foram clonados profundamente.
     *
     * A2. Remover todas as ocorrencias de7 em[7,7,2,7,3,7], retornar bool, equals,
     * lancar se lista vazia. Percorra uma vez. Corrija extremo/tamanho.
     *
     * A3. Empilhou10,20,30,40. Inverta por ligacoes mantendo sentinela no fundo.
     * Qual sera o primeiro pop? Nao usar setItem.
     *
     * A4. Fila[12,5,18,30], Predicate n>=10, quantidade3. Implemente filtrar sem
     * alterar original e explique quem e examinado e quem aparece na nova fila.
     *
     * A5. Objetos com valores80,250,120. Media dos dois primeiros por Function.
     * Depois calcule media do DOBRO desses valores mudando somente a lambda.
     *
     * Respostas em A_GABARITO.java. Exemplos compilaveis nas fichas correspondentes.
     */
    // endregion [F179]
    // ============================================================================
    // region [F180] 08_SIMULADOS/A_GABARITO.java
    // BUSCA: A GABARITO
    // ORIGEM_NO_ACERVO: 08_SIMULADOS/A_GABARITO.java
    // ============================================================================
    /*
     * ============================================================================
     * GABARITO COMENTADO A
     * ============================================================================
     *
     *
     * A1. Cursor depois de S, enfileirar em outra. Copia fica[4,9] apos retirada;
     * original[8,4,9]. Novas celulas, mesmos E. Arquivos BF05_Copiar/FF12_Copiar.
     *
     * A2. Resultado[2,3],true,tamanho2. Mantenha anterior parado depois de remover:
     * assim o segundo7 consecutivo nao e pulado. Arquivo LF11_RemoverTodos.
     *
     * A3. Topo antes40,30,20,10; depois10,20,30,40. Pop retorna10. Anterior inicial
     * na inversao deve ser fundo, nao null. Arquivo BP03_Inverter.
     *
     * A4. Examina12,5,18. Resultado[12,18].30 nao foi examinado. Chamada:
     *   Fila<Integer> r=fila.filtrar(n->n>=10,3);
     * O metodo conta EXAMINADOS. Arquivo A03_FiltroPredicate.
     *
     * A5. (80+250)/2=165. Dobro tem media330. Chamada ilustrativa com Pedido:
     *   fila.calcularValorMedio(p->p.valorFinal()*2,2);
     * Function define qual numero extrair; Fila define a caminhada e a media.
     * Arquivo A02_MediaFunction. Nao dividir por quantidade0.
     */
    // endregion [F180]
    // ============================================================================
    // region [F181] 08_SIMULADOS/B_ENUNCIADOS.java
    // BUSCA: B ENUNCIADOS
    // ORIGEM_NO_ACERVO: 08_SIMULADOS/B_ENUNCIADOS.java
    // ============================================================================
    /*
     * ============================================================================
     * SIMULADO B - RECURSAO
     * ============================================================================
     *
     *
     * Nao usar lacos nos metodos que exigem recursividade. Respeite assinatura.
     *
     * B1. contarQtos(E item,Celula<E> aux), sem contador adicional. Lista[5,2,5,5],
     * alvo5. Mostre todos os retornos.
     *
     * B2. obterItem(Celula<E> aux,int pos), fila[A,B,C,D],pos2. Mostre parametros de
     * cada chamada e o valor devolvido. Lance se posicao nao existe.
     *
     * B3. obterMaior(Celula<E> aux), apenas esse parametro, lista[-8,-3,-10].
     * Por que inicializar maior em0 estaria errado?
     *
     * B4. Copie cadeia[10,20,30] para uma nova fila em ordem inversa sem modificar
     * original. Enfileire DEPOIS da chamada recursiva. Mostre ordem das acoes.
     *
     * B5. Caso-base null->0 e3 celulas de dados. Compare:
     *   X: return1+contar(proximo);
     *   Y: return contar(proximo);
     *   Z: contar(proximo);return1;
     * Quanto devolve cada versao? O aux das tres chamadas e a mesma variavel?
     */
    // endregion [F181]
    // ============================================================================
    // region [F182] 08_SIMULADOS/B_GABARITO.java
    // BUSCA: B GABARITO
    // ORIGEM_NO_ACERVO: 08_SIMULADOS/B_GABARITO.java
    // ============================================================================
    /*
     * ============================================================================
     * GABARITO COMENTADO B
     * ============================================================================
     *
     *
     * B1. Na volta:null0;ultimo5->1;penultimo5->2;2 repassa2;primeiro5->3.
     * Arquivo LF03_ContarOcorrencias. So iguais contribuem1.
     *
     * B2. (A,2)->(B,1)->(C,0). C retorna seu item; B e A repassam esse mesmo item.
     * Arquivo R01_ObterItem. Retorno E, nao numero de passos.
     *
     * B3. Ultimo-10 retorna-10. -3 vence e retorna-3. -8 perde e retorna-3.
     * Zero nem aparece nos dados e daria uma resposta errada. Arquivo R06_MaiorRecursivo.
     *
     * B4. Chamadas descem10,20,30,null. Enfileirar acontece na volta30,20,10.
     * Destino e o MESMO objeto recebido por copia da referencia em cada parametro.
     * Arquivo P10_CopiarNaVolta.
     *
     * B5. X retorna3;Y retorna0;Z retorna1. Z chama os filhos, mas descarta o resultado
     * deles e devolve seu proprio1. Cada chamada possui seu aux independente e fica
     * pendente ate terminar a expressao que solicitou. Nao reinicia do inicio quando
     * recebe resposta. Veja02_RECURSAO/R01_Chamadas_Passo_A_Passo.java.
     */
    // endregion [F182]
    // ============================================================================
    // region [F183] 08_SIMULADOS/C_ENUNCIADOS.java
    // BUSCA: C ENUNCIADOS
    // ORIGEM_NO_ACERVO: 08_SIMULADOS/C_ENUNCIADOS.java
    // ============================================================================
    /*
     * ============================================================================
     * SIMULADO C - RELIGACAO E ORDENACAO
     * ============================================================================
     *
     *
     * C1. Divida[1,2,3,4,5,6,7] ao meio, extra na esquerda, reaproveitando nos.
     * Nao use inserir/remover. Atualize controles de ambas as listas.
     *
     * C2. Rotacione[A,B,C,D,E,F] movendo4 primeiros para final. Somente links.
     * Desenhe as tres ligacoes principais e trate k0,kn,k>n.
     *
     * C3. Duplas A[1,2],B[3,4]. Concatene em O(1), consuma B e permita inserir5 em B
     * depois. O que daria errado se a sentinela de B continuasse ligada a3?
     *
     * C4. A[1,4a,7],B[2,4b,6],a/b com mesma chave4 e objetos distintos. Intercale
     * em nova lista, preserve origens e escolha A no empate. Use isso com dividirAoMeio
     * num ordenar recursivo que segue Mergesort.
     *
     * C5. Mostre a ultima intercalacao do Mergesort em[4,1,3,2]. Qual algoritmo em
     * vetor garante pior caso nao quadratico com O(1) memoria auxiliar? Particionar
     * um vetor significa ordena-lo inteiro?
     */
    // endregion [F183]
    // ============================================================================
    // region [F184] 08_SIMULADOS/C_GABARITO.java
    // BUSCA: C GABARITO
    // ORIGEM_NO_ACERVO: 08_SIMULADOS/C_GABARITO.java
    // ============================================================================
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
    // endregion [F184]
    // ============================================================================
    // region [F185] 09_FONTES_E_VALIDACAO/00_INDICE.java
    // BUSCA: 00 INDICE
    // ORIGEM_NO_ACERVO: 09_FONTES_E_VALIDACAO/00_INDICE.java
    // ============================================================================
    /*
     * ============================================================================
     * FONTES E VALIDACAO
     * ============================================================================
     *
     * FONTES.java - origem dos PDFs e links da pesquisa externa.
     * VALIDACAO.java - compilacao, testes executados, contratos e limites.
     *
     * Tudo pode ser consultado como comentario Java sem abrir navegador.
     */
    // endregion [F185]
    // ============================================================================
    // region [F186] 09_FONTES_E_VALIDACAO/FONTES.java
    // BUSCA: FONTES
    // ORIGEM_NO_ACERVO: 09_FONTES_E_VALIDACAO/FONTES.java
    // ============================================================================
    /*
     * ============================================================================
     * FONTES, ORIGEM E LIMITES
     * ============================================================================
     *
     *
     * MATERIAL BASE: os nove PDFs anexados nesta conversa.
     *
     * BF: Filas - AEDs II.pdf (1 pagina,6 questoes)
     * BL: Listas encadeadas - AEDs II.pdf (1 pagina,6 questoes)
     * BP: Pilhas - AEDs II.pdf (1 pagina,4 questoes)
     * LF: Lista de Exercicios de Lista Flexivel.docx.PDF (3 paginas,11 questoes)
     * FF: Lista de Exercicios Fila Flexivel.docx.PDF (3 paginas,14 questoes)
     * R: Lista_de_Exercicios_Revisao_unidade2_AEDS_II.docx.PDF (6 paginas,23 questoes)
     * SL: Listas-1PorPagina.pdf (93 paginas de slides)
     * SF: Filas-1PorPagina.pdf (59 paginas de slides)
     * SP: Pilhas.pdf (53 paginas de slides)
     *
     * Sao64 questoes numeradas nos seis arquivos de exercicios. Os tres outros sao
     * materiais teoricos com muitos desenhos sequenciais. Total220 paginas de PDF.
     * Os nomes acima omitem alguns acentos so para facilitar busca no editor.
     * Os originais nao estao dentro do ZIP: por pedido do usuario, o conteudo entregue
     * e composto somente por arquivos.java.
     *
     * Function/Predicate/subPilha e o projeto App vieram de imagens/codigo do chat.
     * Nao foram inventados como questoes numeradas dos PDFs. A parte de Predicate
     * estava parcialmente cortada: o contrato de primeiros k EXAMINADOS foi escolhido
     * e identificado. O projeto original completo de comercio nao foi fornecido como
     * projeto compilavel; PedidoDemo/AppPedidos sao exemplos independentes.
     *
     * PESQUISA COMPLEMENTAR: fontes primarias, consultadas em25/10/2026.
     * Os links sao creditos/consulta posterior; o acervo pode ser lido sem acessa-los.
     *
     * Princeton - stacks/queues, Josephus, palindromo, expressoes e outras variacoes:
     * https://algs4.cs.princeton.edu/13stacks/
     * https://www.cs.princeton.edu/courses/archive/spr01/cs126/exercises/adt.html
     *
     * HackerRank:
     * https://www.hackerrank.com/challenges/balanced-brackets/problem
     * https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
     *
     * LeetCode:
     * https://leetcode.com/problems/reverse-linked-list/
     * https://leetcode.com/problems/linked-list-cycle/
     * https://leetcode.com/problems/linked-list-cycle-ii/
     * https://leetcode.com/problems/middle-of-the-linked-list/
     * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
     * https://leetcode.com/problems/merge-two-sorted-lists/
     * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
     * https://leetcode.com/problems/partition-list/
     * https://leetcode.com/problems/next-greater-element-i/
     * https://leetcode.com/problems/min-stack/
     *
     * Java: contratos oficiais de Function.apply e Predicate.test:
     * https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
     * https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
     *
     * Os problemas foram resumidos/adaptados para Celula<E> e as APIs do curso. As
     * solucoes, rastros, guias, exemplos e testes deste acervo sao autorais, nao copias
     * de editoriais nem gabarito oficial. C13/C15 sao variacoes autorais adicionais;
     * C09 e consulta adaptada de remocao; C17 adapta para um vetor, nao a interface
     * original de dois arrays. As diferencas estao sinalizadas nas fichas.
     *
     * Nenhuma fonte permite prever a prova. O repertorio e amplo, mas nao cobre todo
     * problema possivel. Respeite o enunciado e as regras de consulta da professora.
     */
    // endregion [F186]
    // ============================================================================
    // region [F187] 09_FONTES_E_VALIDACAO/VALIDACAO.java
    // BUSCA: VALIDACAO
    // ORIGEM_NO_ACERVO: 09_FONTES_E_VALIDACAO/VALIDACAO.java
    // ============================================================================
    /*
     * ============================================================================
     * RELATO DOS TESTES DESTA EDICAO
     * ============================================================================
     *
     * EDICAO SOMENTE JAVA - 25/10/2026
     *
     * Arquivos .java no pacote final: 190.
     * As fichas, os guias e os indices tambem sao arquivos Java. Nao ha HTML/PDF/MD,
     * JSON/JAR/imagens/scripts ou arquivos.class dentro da entrega.
     *
     * VERIFICACAO EXECUTADA
     * Compilador: javac21.0.12.1, com --release8 e encodingUTF-8.
     * Execucao: JVM disponivel21. Nao foi testado em uma JVM8 separada.
     * Todos os fontes centrais e fichas com implementacao foram compilados JUNTOS.
     * Os arquivos apenas de comentarios tambem sao unidades Java validas e nao
     * precisam de main para serem lidos.
     *
     * Saida real da suite aed.testes.Testes:
     *   OK: 348458 verificacoes passaram.
     *   Testes incluem vazio, unidade, duplicatas, limites, alias, preservacao e
     *   identidade de celulas.
     *
     * Uma verificacao/assertion nao e necessariamente um problema independente:
     * inclui comparacao de cada item de vetores e repeticoes sobre varias entradas.
     * A suite enumera os3280 vetores de comprimento0..7 com valores-1,0,1, compara
     * as ordenacoes com InsertionSort e verifica ordem/multiplicidades da referencia.
     * Tambem inclui200 vetores pseudoaleatorios e300 listas para Mergesort com sementes
     * fixas. Identidade de nos e conferida em rotacoes, divisao e lista dupla.
     *
     * Outros testes: filas/pilhas/listas, vazio/unico, extremos, reutilizacao depois
     * de esvaziar, autoalias, copias, igualdade, preservacao, funcao/predicado, consultas
     * recursivas, modelos de retornos, variantes circulares/sem sentinela e classicos.
     * Reflexao e usada SOMENTE nos testes para verificar identidade, nao nos algoritmos.
     *
     * Rastros R18/R19/R20/R22 foram calculados e conferidos com as entradas exatas
     * fornecidas. R20 registra33 comparacoes com pivo final e16 com pivo central, contando
     * os testes falsos de encerramento dos whiles como exige o texto da revisao.
     *
     * LIMITES
     * Testar nao e prova formal para todas as entradas. Estruturas assumem cadeias
     * validas/aciclicas salvo metodos especificos de ciclo. Recursao muito profunda
     * pode causar StackOverflowError. Callbacks nao devem modificar a propria fila
     * durante o percurso. Dados null sao rejeitados nas estruturas principais, salvo
     * as posicoes ignoradas pelo construtor de array, conforme contrato descrito.
     *
     * Nao foi recompilado o projeto original completo do comercio: arquivos de
     * Produto/ItemDePedido e dados externos nao vieram completos como projeto.
     * A demo PedidoDemo/AppPedidos e independente e foi executada.
     * Nao foi executado Windows neste ambiente Linux. A leitura no VS Code nao
     * exige compilar nada; os comandos opcionais estao em00_COMECE_AQUI.
     *
     * As fontes centrais sao reutilizaveis. As fichas espelham os mesmos corpos em
     * classes internas com dependencias, para a consulta ser autocontida. Na prova,
     * a embalagem da ficha deve ser removida e o metodo adaptado ao template correto.
     * Nao se afirma que todo fragmento de exemplo comentado pode ser colado isolado
     * sem imports, atributos ou auxiliares. Nao e gabarito oficial nem previsao.
     */
    // endregion [F187]
    // BIBLIOTECA AUTONOMA: classes agrupadas para manter os nomes do repertorio.
    public static final class Biblioteca {
        public static final class Base {
            // ============================================================================
            // region [F197] src/aed/base/Celula.java
            // BUSCA: Celula
            // ORIGEM_NO_ACERVO: src/aed/base/Celula.java
            // ============================================================================
            /** Um objeto celula: item e a referencia de um E; proximo referencia outra celula. */
            public static class Celula<E> {
                private final E item;
                private Celula<E> proximo;
                public Celula() { this(null, null); }
                public Celula(E item) { this(item, null); }
                public Celula(E item, Celula<E> proximo) {
                    this.item = item;
                    this.proximo = proximo;
                }
                public E getItem() { return item; }
                public Celula<E> getProximo() { return proximo; }
                public void setProximo(Celula<E> proximo) { this.proximo = proximo; }
            }
            // endregion [F197]
            // ============================================================================
            // region [F198] src/aed/base/CelulaDupla.java
            // BUSCA: Celula Dupla
            // ORIGEM_NO_ACERVO: src/aed/base/CelulaDupla.java
            // ============================================================================
            public static class CelulaDupla<E> {
                private E item;
                private CelulaDupla<E> anterior, proximo;
                public CelulaDupla() { this(null); }
                public CelulaDupla(E item) { this.item = item; }
                public E getItem() { return item; }
                public void setItem(E item) { this.item = item; }
                public CelulaDupla<E> getAnterior() { return anterior; }
                public void setAnterior(CelulaDupla<E> anterior) { this.anterior = anterior; }
                public CelulaDupla<E> getProximo() { return proximo; }
                public void setProximo(CelulaDupla<E> proximo) { this.proximo = proximo; }
            }
            // endregion [F198]
            // ============================================================================
            // region [F199] src/aed/base/Fila.java
            // BUSCA: Fila
            // ORIGEM_NO_ACERVO: src/aed/base/Fila.java
            // ============================================================================
            /** Sentinela FIXA: frente -> S -> primeiro dado -> ... -> tras -> null. */
            public static class Fila<E> {
                private final Celula<E> frente;
                private Celula<E> tras;

                public Fila() { frente = new Celula<>(); tras = frente; }

                /** FF01: ignora os elementos null do vetor. */
                public Fila(E[] itens) {
                    this();
                    if (itens == null) throw new IllegalArgumentException("Vetor nulo");
                    for (E e : itens) if (e != null) enfileirar(e);
                }

                /** FF02: escolha explicita, ordem topo->fundo; restaura a pilha. */
                public Fila(Pilha<E> pilha) {
                    this();
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Pilha<E> aux = new Pilha<>();
                    while (!pilha.vazia()) {
                        E e = pilha.desempilhar();
                        enfileirar(e);
                        aux.empilhar(e);
                    }
                    while (!aux.vazia()) pilha.empilhar(aux.desempilhar());
                }

                public boolean vazia() { return frente == tras; }

                public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Celula<E> nova = new Celula<>(item);
                    tras.setProximo(nova);
                    tras = nova;
                }

                public E consultarInicio() {
                    if (vazia()) throw new NoSuchElementException("Fila vazia");
                    return frente.getProximo().getItem();
                }

                public E desenfileirar() {
                    if (vazia()) throw new NoSuchElementException("Fila vazia");
                    Celula<E> removida = frente.getProximo();
                    frente.setProximo(removida.getProximo());
                    if (removida == tras) tras = frente;
                    removida.setProximo(null);
                    return removida.getItem();
                }

                public int tamanho() {
                    int n = 0;
                    for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }

                public int obterNumeroItens() { return obterNumeroItens(frente.getProximo()); }
                public int obterNumeroItens(Celula<E> aux) {
                    if (aux == null) return 0;
                    return 1 + obterNumeroItens(aux.getProximo());
                }

                public boolean verificarExistencia(E item) { return contem(item); }
                public boolean contem(E item) { return contem(item, frente.getProximo()); }
                public boolean contem(E item, Celula<E> aux) {
                    if (aux == null) return false;
                    if (aux.getItem().equals(item)) return true;
                    return contem(item, aux.getProximo());
                }

                public int quantosAfrente(E item) { return quantosAfrente(frente.getProximo(), item); }
                /** FF10 exige esta ordem: celula primeiro, item segundo. */
                public int quantosAfrente(Celula<E> atual, E item) {
                    if (atual == null) throw new NoSuchElementException("Item nao encontrado");
                    if (atual.getItem().equals(item)) return 0;
                    return 1 + quantosAfrente(atual.getProximo(), item);
                }
                /** Assinatura literal da folha BF04, incluindo throws Exception. */
                public int obterNumItensAFrente(E item) throws Exception { return quantosAfrente(item); }

                public E obterItem(int pos) { return obterItem(frente.getProximo(), pos); }
                public E obterItem(Celula<E> aux, int pos) {
                    if (pos < 0 || aux == null) throw new IndexOutOfBoundsException("Posicao invalida");
                    if (pos == 0) return aux.getItem();
                    return obterItem(aux.getProximo(), pos - 1);
                }

                public Fila<E> copiar() {
                    Fila<E> nova = new Fila<>();
                    for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) nova.enfileirar(p.getItem());
                    return nova;
                }

                public void concatenar(Fila<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Fila nula");
                    Fila<E> fonte = outra == this ? outra.copiar() : outra;
                    for (Celula<E> p = fonte.frente.getProximo(); p != null; p = p.getProximo()) enfileirar(p.getItem());
                }
                public Fila<E> unir(Fila<E> outra) {
                    Fila<E> nova = copiar();
                    nova.concatenar(outra);
                    return nova;
                }

                /** Alterna; preserva outra. Altera this adotando uma cadeia nova. */
                public void mesclar(Fila<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Fila nula");
                    Fila<E> nova = new Fila<>();
                    Celula<E> a = frente.getProximo(), b = outra.frente.getProximo();
                    while (a != null || b != null) {
                        if (a != null) { nova.enfileirar(a.getItem()); a = a.getProximo(); }
                        if (b != null) { nova.enfileirar(b.getItem()); b = b.getProximo(); }
                    }
                    frente.setProximo(nova.frente.getProximo());
                    tras = nova.vazia() ? frente : nova.tras;
                }

                public void inverter() {
                    Celula<E> antigoPrimeiro = frente.getProximo();
                    Celula<E> anterior = null, atual = antigoPrimeiro;
                    while (atual != null) {
                        Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior);
                        anterior = atual;
                        atual = seguinte;
                    }
                    frente.setProximo(anterior);
                    tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
                }
                /** Variante para quem prefere nao usar uma variavel chamada anterior. */
                public void inverterSemAnterior() {
                    Celula<E> antigoPrimeiro = frente.getProximo();
                    Celula<E> atual = antigoPrimeiro;
                    frente.setProximo(null);
                    while (atual != null) {
                        Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(frente.getProximo());
                        frente.setProximo(atual);
                        atual = seguinte;
                    }
                    tras = antigoPrimeiro == null ? frente : antigoPrimeiro;
                }
                public Fila<E> invertida() { Fila<E> nova = copiar(); nova.inverter(); return nova; }
                public Fila<E> inverterOutra(Fila<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Fila nula");
                    outra.inverter();
                    return outra;
                }
                public void inverterPorPilha() {
                    Pilha<E> p = new Pilha<>();
                    while (!vazia()) p.empilhar(desenfileirar());
                    while (!p.vazia()) enfileirar(p.desempilhar());
                }
                public void inverterRecursivamente() {
                    if (vazia()) return;
                    E item = desenfileirar();
                    inverterRecursivamente();
                    enfileirar(item);
                }

                /** Pares das POSICOES originais vao para retorno; impares ficam em this. */
                public Fila<E> dividir() {
                    Fila<E> pares = new Fila<>();
                    Celula<E> anterior = frente, atual = frente.getProximo();
                    int pos = 0;
                    while (atual != null) {
                        Celula<E> seguinte = atual.getProximo();
                        if (pos % 2 == 0) {
                            anterior.setProximo(seguinte);
                            if (atual == tras) tras = anterior;
                            atual.setProximo(null);
                            pares.tras.setProximo(atual);
                            pares.tras = atual;
                        } else anterior = atual;
                        atual = seguinte;
                        pos++;
                    }
                    return pares;
                }

                private void validarQuantidade(int quantidade) {
                    if (quantidade < 0) throw new IllegalArgumentException("Quantidade negativa");
                    Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        if (p == null) throw new IllegalArgumentException("Itens insuficientes");
                        p = p.getProximo();
                    }
                }

                /** Quantidade e o numero de EXAMINADOS, nao o numero de aprovados. */
                public Fila<E> filtrar(Predicate<E> condicao, int quantidade) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    validarQuantidade(quantidade);
                    Fila<E> nova = new Fila<>();
                    Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        if (condicao.test(p.getItem())) nova.enfileirar(p.getItem());
                        p = p.getProximo();
                    }
                    return nova;
                }
                public double somarValores(Function<E, Double> extrator, int quantidade) {
                    if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
                    validarQuantidade(quantidade);
                    double soma = 0;
                    Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        Double valor = extrator.apply(p.getItem());
                        if (valor == null) throw new IllegalArgumentException("Extrator retornou null");
                        soma += valor;
                        p = p.getProximo();
                    }
                    return soma;
                }
                public double calcularValorMedio(Function<E, Double> extrator, int quantidade) {
                    if (quantidade <= 0) throw new IllegalArgumentException("Quantidade deve ser positiva");
                    return somarValores(extrator, quantidade) / quantidade;
                }
                public int contarSe(Predicate<E> condicao, int quantidade) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    validarQuantidade(quantidade);
                    int n = 0;
                    Celula<E> p = frente.getProximo();
                    for (int i = 0; i < quantidade; i++) {
                        if (condicao.test(p.getItem())) n++;
                        p = p.getProximo();
                    }
                    return n;
                }
                public E encontrarMaior(Function<E, Double> extrator) {
                    if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
                    if (vazia()) throw new NoSuchElementException("Fila vazia");
                    Celula<E> p = frente.getProximo();
                    E melhor = p.getItem();
                    Double maior = extrator.apply(melhor);
                    if (maior == null) throw new IllegalArgumentException("Resultado nulo");
                    for (p = p.getProximo(); p != null; p = p.getProximo()) {
                        Double valor = extrator.apply(p.getItem());
                        if (valor == null) throw new IllegalArgumentException("Resultado nulo");
                        if (Double.compare(valor, maior) > 0) { melhor = p.getItem(); maior = valor; }
                    }
                    return melhor;
                }

                public Fila<E> itensDepoisDoAlvo(E alvo) {
                    Fila<E> nova = new Fila<>();
                    buscarECopiar(alvo, frente.getProximo(), nova);
                    return nova;
                }
                private void buscarECopiar(E alvo, Celula<E> atual, Fila<E> nova) {
                    if (atual == null) throw new NoSuchElementException("Alvo ausente");
                    if (atual.getItem().equals(alvo)) { copiarRestante(atual.getProximo(), nova); return; }
                    buscarECopiar(alvo, atual.getProximo(), nova);
                }
                private void copiarRestante(Celula<E> atual, Fila<E> nova) {
                    if (atual == null) return;
                    nova.enfileirar(atual.getItem());
                    copiarRestante(atual.getProximo(), nova);
                }
                public Fila<E> itensAntesDoAlvo(E alvo) {
                    Fila<E> nova = new Fila<>();
                    copiarAntes(alvo, frente.getProximo(), nova);
                    return nova;
                }
                private void copiarAntes(E alvo, Celula<E> atual, Fila<E> nova) {
                    if (atual == null) throw new NoSuchElementException("Alvo ausente");
                    if (atual.getItem().equals(alvo)) return;
                    nova.enfileirar(atual.getItem());
                    copiarAntes(alvo, atual.getProximo(), nova);
                }

                public Object[] toArray() {
                    Object[] a = new Object[tamanho()]; int i = 0;
                    for (Celula<E> p = frente.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
                public boolean estruturaValida() {
                    Celula<E> lento = frente, rapido = frente;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                        if (lento == rapido) return false;
                    }
                    Celula<E> p = frente;
                    while (p.getProximo() != null) p = p.getProximo();
                    return p == tras;
                }
            }
            // endregion [F199]
            // ============================================================================
            // region [F200] src/aed/base/Lista.java
            // BUSCA: Lista
            // ORIGEM_NO_ACERVO: src/aed/base/Lista.java
            // ============================================================================
            /** Primeiro e sentinela. Tamanho foi acrescentado explicitamente pelo acervo. */
            public static class Lista<E> {
                private final Celula<E> primeiro;
                private Celula<E> ultimo;
                private int tamanho;
                public Lista() { primeiro = new Celula<>(); ultimo = primeiro; }
                public boolean vazia() { return primeiro == ultimo; }
                public int tamanho() { return tamanho; }

                public void inserirFinal(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Celula<E> nova = new Celula<>(item);
                    ultimo.setProximo(nova); ultimo = nova; tamanho++;
                }
                public void inserir(E item, int pos) {
                    if (pos < 0 || pos > tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Celula<E> anterior = primeiro;
                    for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
                    Celula<E> nova = new Celula<>(item, anterior.getProximo());
                    anterior.setProximo(nova);
                    if (anterior == ultimo) ultimo = nova;
                    tamanho++;
                }
                public E remover(int pos) {
                    if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                    Celula<E> anterior = primeiro;
                    for (int i = 0; i < pos; i++) anterior = anterior.getProximo();
                    Celula<E> r = anterior.getProximo();
                    anterior.setProximo(r.getProximo());
                    if (r == ultimo) ultimo = anterior;
                    r.setProximo(null); tamanho--;
                    return r.getItem();
                }
                public E removerInicio() {
                    if (vazia()) throw new NoSuchElementException("Lista vazia");
                    return remover(0);
                }
                /** Com E=Integer: remover(2) escolhe posicao; remover(Integer.valueOf(2)) escolhe valor. */
                public E remover(E itemProcurado) {
                    Celula<E> anterior = primeiro;
                    while (anterior.getProximo() != null && !anterior.getProximo().getItem().equals(itemProcurado)) anterior = anterior.getProximo();
                    if (anterior.getProximo() == null) throw new NoSuchElementException("Item ausente");
                    Celula<E> r = anterior.getProximo();
                    anterior.setProximo(r.getProximo());
                    if (r == ultimo) ultimo = anterior;
                    r.setProximo(null); tamanho--;
                    return r.getItem();
                }
                public E localizar(int pos) {
                    if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException("Posicao invalida");
                    Celula<E> p = primeiro.getProximo();
                    for (int i = 0; i < pos; i++) p = p.getProximo();
                    return p.getItem();
                }
                public int obterNumeroItens() {
                    int n = 0;
                    for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) n++;
                    return n;
                }
                public int contarQtos(E item) { return contarQtos(item, primeiro.getProximo()); }
                public int contarQtos(E item, Celula<E> aux) {
                    if (aux == null) return 0;
                    if (aux.getItem().equals(item)) return 1 + contarQtos(item, aux.getProximo());
                    return contarQtos(item, aux.getProximo());
                }
                public boolean contem(E item) { return contem(item, primeiro.getProximo()); }
                public boolean contem(E item, Celula<E> aux) {
                    if (aux == null) return false;
                    if (aux.getItem().equals(item)) return true;
                    return contem(item, aux.getProximo());
                }
                public boolean removerTodos(E item) {
                    if (vazia()) throw new IllegalStateException("Lista vazia");
                    boolean removeu = false;
                    Celula<E> anterior = primeiro;
                    while (anterior.getProximo() != null) {
                        Celula<E> atual = anterior.getProximo();
                        if (atual.getItem().equals(item)) {
                            anterior.setProximo(atual.getProximo());
                            if (atual == ultimo) ultimo = anterior;
                            atual.setProximo(null); tamanho--; removeu = true;
                        } else anterior = atual;
                    }
                    return removeu;
                }
                public void inverter() {
                    Celula<E> antigoPrimeiro = primeiro.getProximo();
                    Celula<E> anterior = null, atual = antigoPrimeiro;
                    while (atual != null) {
                        Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior); anterior = atual; atual = seguinte;
                    }
                    primeiro.setProximo(anterior);
                    ultimo = antigoPrimeiro == null ? primeiro : antigoPrimeiro;
                }
                public Lista<E> invertida() {
                    Lista<E> nova = new Lista<>();
                    for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserir(p.getItem(), 0);
                    return nova;
                }
                @Override public Lista<E> clone() {
                    Lista<E> nova = new Lista<>();
                    for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) nova.inserirFinal(p.getItem());
                    return nova;
                }
                public void mesclar(Lista<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Lista nula");
                    Lista<E> nova = new Lista<>();
                    Celula<E> a = primeiro.getProximo(), b = outra.primeiro.getProximo();
                    while (a != null || b != null) {
                        if (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
                        if (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                    }
                    primeiro.setProximo(nova.primeiro.getProximo());
                    ultimo = nova.vazia() ? primeiro : nova.ultimo;
                    tamanho = nova.tamanho;
                }
                /** LF08: segue o exemplo do PDF, this invertida primeiro. */
                public Lista<E> mesclarInvertidas(Lista<E> outra) {
                    Lista<E> a = invertida(); a.mesclar(outra.invertida()); return a;
                }
                public void unir(Pilha<E> pilha) {
                    if (pilha == null) throw new IllegalArgumentException("Pilha nula");
                    Pilha<E> aux = new Pilha<>();
                    while (!pilha.vazia()) aux.empilhar(pilha.desempilhar());
                    while (!aux.vazia()) {
                        E e = aux.desempilhar(); inserirFinal(e); pilha.empilhar(e);
                    }
                }
                /** Primeiras ocorrencias; troca CELULAS, sem alterar item final. */
                public void trocar(E xItem, E yItem) {
                    Celula<E> ax = primeiro, ay = primeiro;
                    while (ax.getProximo() != null && !ax.getProximo().getItem().equals(xItem)) ax = ax.getProximo();
                    while (ay.getProximo() != null && !ay.getProximo().getItem().equals(yItem)) ay = ay.getProximo();
                    Celula<E> x = ax.getProximo(), y = ay.getProximo();
                    if (x == null || y == null) throw new NoSuchElementException("Item ausente");
                    if (x == y) return;
                    if (x.getProximo() == y) {
                        ax.setProximo(y); x.setProximo(y.getProximo()); y.setProximo(x);
                    } else if (y.getProximo() == x) {
                        ay.setProximo(x); y.setProximo(x.getProximo()); x.setProximo(y);
                    } else {
                        Celula<E> nx = x.getProximo(), ny = y.getProximo();
                        ax.setProximo(y); ay.setProximo(x); x.setProximo(ny); y.setProximo(nx);
                    }
                    if (ultimo == x) ultimo = y; else if (ultimo == y) ultimo = x;
                }
                public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
                public boolean estruturaValida() {
                    Celula<E> lento = primeiro, rapido = primeiro;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                        if (lento == rapido) return false;
                    }
                    int n = 0; Celula<E> p = primeiro;
                    while (p.getProximo() != null) { p = p.getProximo(); n++; }
                    return p == ultimo && n == tamanho;
                }
            }
            // endregion [F200]
            // ============================================================================
            // region [F201] src/aed/base/ListaDupla.java
            // BUSCA: Lista Dupla
            // ORIGEM_NO_ACERVO: src/aed/base/ListaDupla.java
            // ============================================================================
            /** S <-> dados; S.anterior=null e fim.proximo=null. */
            public static class ListaDupla<E> {
                private final CelulaDupla<E> inicio;
                private CelulaDupla<E> fim;
                private int tamanho;
                public ListaDupla() { inicio = new CelulaDupla<>(); fim = inicio; }
                public ListaDupla(Fila<E> fila) {
                    this();
                    if (fila == null) throw new IllegalArgumentException("Fila nula");
                    Fila<E> aux = new Fila<>();
                    while (!fila.vazia()) { E e = fila.desenfileirar(); inserirFim(e); aux.enfileirar(e); }
                    while (!aux.vazia()) fila.enfileirar(aux.desenfileirar());
                }
                public boolean vazia() { return inicio == fim; }
                public int tamanho() { return tamanho; }
                public void inserirFim(E item) { inserir(item, tamanho); }
                public void inserir(E item, int posicao) {
                    if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    CelulaDupla<E> anterior;
                    if (posicao == tamanho) anterior = fim;
                    else {
                        anterior = inicio;
                        for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    }
                    CelulaDupla<E> seguinte = anterior.getProximo();
                    CelulaDupla<E> nova = new CelulaDupla<>(item);
                    nova.setAnterior(anterior); nova.setProximo(seguinte);
                    anterior.setProximo(nova);
                    if (seguinte != null) seguinte.setAnterior(nova); else fim = nova;
                    tamanho++;
                }
                public E removerFim() {
                    if (vazia()) throw new NoSuchElementException("Lista vazia");
                    CelulaDupla<E> r = fim;
                    fim = r.getAnterior(); fim.setProximo(null);
                    r.setAnterior(null); tamanho--;
                    return r.getItem();
                }
                private E desligar(CelulaDupla<E> atual) {
                    CelulaDupla<E> anterior = atual.getAnterior(), seguinte = atual.getProximo();
                    anterior.setProximo(seguinte);
                    if (seguinte != null) seguinte.setAnterior(anterior); else fim = anterior;
                    atual.setAnterior(null); atual.setProximo(null); tamanho--;
                    return atual.getItem();
                }
                public E remover(int pos) {
                    if (pos < 0 || pos >= tamanho) throw new IndexOutOfBoundsException();
                    CelulaDupla<E> p = inicio.getProximo();
                    for (int i = 0; i < pos; i++) p = p.getProximo();
                    return desligar(p);
                }
                public boolean removerTodos(E item) {
                    if (vazia()) throw new IllegalStateException("Lista vazia");
                    boolean removeu = false;
                    CelulaDupla<E> atual = inicio.getProximo();
                    while (atual != null) {
                        CelulaDupla<E> seguinte = atual.getProximo();
                        if (atual.getItem().equals(item)) { desligar(atual); removeu = true; }
                        atual = seguinte;
                    }
                    return removeu;
                }
                public void inverter() {
                    if (vazia()) return;
                    CelulaDupla<E> antigoPrimeiro = inicio.getProximo(), antigoFim = fim;
                    CelulaDupla<E> atual = antigoPrimeiro;
                    while (atual != null) {
                        CelulaDupla<E> seguinte = atual.getProximo(), anterior = atual.getAnterior();
                        atual.setProximo(anterior == inicio ? null : anterior);
                        atual.setAnterior(seguinte == null ? inicio : seguinte);
                        atual = seguinte;
                    }
                    inicio.setProximo(antigoFim); fim = antigoPrimeiro;
                }
                public boolean ehPalindromo() {
                    CelulaDupla<E> a = inicio.getProximo(), b = fim;
                    for (int i = 0; i < tamanho / 2; i++) {
                        if (!a.getItem().equals(b.getItem())) return false;
                        a = a.getProximo(); b = b.getAnterior();
                    }
                    return true;
                }
                /** Transfere os nos, O(1); esvazia outra. */
                public void concatenar(ListaDupla<E> outra) {
                    if (outra == null || outra == this) throw new IllegalArgumentException("Origem invalida");
                    if (outra.vazia()) return;
                    CelulaDupla<E> primeiroOutro = outra.inicio.getProximo();
                    fim.setProximo(primeiroOutro); primeiroOutro.setAnterior(fim);
                    fim = outra.fim; tamanho += outra.tamanho;
                    outra.inicio.setProximo(null); outra.fim = outra.inicio; outra.tamanho = 0;
                }
                public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (CelulaDupla<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
                public Object[] reversoArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (CelulaDupla<E> p = fim; p != inicio; p = p.getAnterior()) a[i++] = p.getItem();
                    return a;
                }
                public boolean estruturaValida() {
                    if (inicio.getAnterior() != null || fim.getProximo() != null) return false;
                    int n = 0; CelulaDupla<E> anterior = inicio, p = inicio.getProximo();
                    while (p != null) {
                        if (p.getAnterior() != anterior || ++n > tamanho) return false;
                        anterior = p; p = p.getProximo();
                    }
                    return anterior == fim && n == tamanho;
                }
            }
            // endregion [F201]
            // ============================================================================
            // region [F202] src/aed/base/Pilha.java
            // BUSCA: Pilha
            // ORIGEM_NO_ACERVO: src/aed/base/Pilha.java
            // ============================================================================
            /** Pilha dos slides: fundo e a sentinela. Topo -> dados -> fundo -> null. */
            public static class Pilha<E> {
                private Celula<E> topo;
                private final Celula<E> fundo;

                public Pilha() { fundo = new Celula<>(); topo = fundo; }
                public boolean vazia() { return topo == fundo; }

                public void empilhar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    topo = new Celula<>(item, topo);
                }

                public E consultarTopo() {
                    if (vazia()) throw new NoSuchElementException("Pilha vazia");
                    return topo.getItem();
                }

                public E desempilhar() {
                    E removido = consultarTopo();
                    topo = topo.getProximo();
                    return removido;
                }

                public int obterNumeroItens() {
                    int n = 0;
                    for (Celula<E> p = topo; p != fundo; p = p.getProximo()) n++;
                    return n;
                }

                public int contarRecursivo() { return contarRecursivo(topo); }
                private int contarRecursivo(Celula<E> atual) {
                    if (atual == fundo) return 0;
                    return 1 + contarRecursivo(atual.getProximo());
                }

                /** Copia celulas; nao clona profundamente os objetos E. Preserva this. */
                public Pilha<E> subPilha(int numItens) {
                    if (numItens < 0) throw new IllegalArgumentException("Quantidade negativa");
                    Celula<E> aux = topo;
                    Pilha<E> inversa = new Pilha<>();
                    for (int i = 0; i < numItens; i++) {
                        if (aux == fundo) throw new IllegalArgumentException("Itens insuficientes");
                        inversa.empilhar(aux.getItem());
                        aux = aux.getProximo();
                    }
                    Pilha<E> resultado = new Pilha<>();
                    while (!inversa.vazia()) resultado.empilhar(inversa.desempilhar());
                    return resultado;
                }

                public Pilha<E> copiar() { return subPilha(obterNumeroItens()); }

                public void inverter() {
                    Celula<E> anterior = fundo;
                    Celula<E> atual = topo;
                    while (atual != fundo) {
                        Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior);
                        anterior = atual;
                        atual = seguinte;
                    }
                    topo = anterior;
                }

                /** Convencao: topo[A,B] + topo[C,D] = topo[A,B,C,D]. Preserva outra. */
                public void concatenar(Pilha<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Pilha nula");
                    Pilha<E> copia = outra.copiar();
                    Celula<E> anterior = fundo;
                    for (Celula<E> p = topo; p != fundo; p = p.getProximo()) anterior = p;
                    while (!copia.vazia()) {
                        Celula<E> nova = new Celula<>(copia.desempilhar(), fundo);
                        if (anterior == fundo) topo = nova;
                        else anterior.setProximo(nova);
                        anterior = nova;
                    }
                }

                /** Apenas API de pilha. O(n^2) tempo e O(n) chamadas. */
                public void inverterRecursivamente() {
                    if (vazia()) return;
                    E item = desempilhar();
                    inverterRecursivamente();
                    inserirFundo(item);
                }
                private void inserirFundo(E item) {
                    if (vazia()) { empilhar(item); return; }
                    E salvo = desempilhar();
                    inserirFundo(item);
                    empilhar(salvo);
                }

                /** Conveniencia do acervo para testes; nao assumir que existe no template. */
                public Object[] toArray() {
                    Object[] a = new Object[obterNumeroItens()];
                    int i = 0;
                    for (Celula<E> p = topo; p != fundo; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
                public boolean estruturaValida() {
                    Celula<E> lento = topo, rapido = topo;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo();
                        rapido = rapido.getProximo().getProximo();
                        if (lento == rapido) return false;
                    }
                    Celula<E> p = topo;
                    while (p != null && p != fundo) p = p.getProximo();
                    return p == fundo && fundo.getProximo() == null;
                }
            }
            // endregion [F202]
            // ============================================================================
            // region [F203] src/aed/base/PseudoFila.java
            // BUSCA: Pseudo Fila
            // ORIGEM_NO_ACERVO: src/aed/base/PseudoFila.java
            // ============================================================================
            /** Entrada recebe; saida entrega. So transfere quando saida esvazia. */
            public static class PseudoFila<E> {
                private final Pilha<E> entrada = new Pilha<>();
                private final Pilha<E> saida = new Pilha<>();
                public boolean vazia() { return entrada.vazia() && saida.vazia(); }
                public void enfileirar(E item) { entrada.empilhar(item); }
                private void prepararSaida() {
                    if (saida.vazia()) while (!entrada.vazia()) saida.empilhar(entrada.desempilhar());
                }
                public E desenfileirar() { prepararSaida(); return saida.desempilhar(); }
                public E consultarInicio() { prepararSaida(); return saida.consultarTopo(); }
            }
            // endregion [F203]
            // ============================================================================
            // region [F204] src/aed/base/PseudoPilha.java
            // BUSCA: Pseudo Pilha
            // ORIGEM_NO_ACERVO: src/aed/base/PseudoPilha.java
            // ============================================================================
            /** Usa somente vazia, enfileirar e desenfileirar da Fila. */
            public static class PseudoPilha<E> {
                private Fila<E> principal = new Fila<>();
                private Fila<E> auxiliar = new Fila<>();
                private int tam;
                public boolean vazia() { return principal.vazia(); }
                public void empilhar(E item) {
                    auxiliar.enfileirar(item);
                    while (!principal.vazia()) auxiliar.enfileirar(principal.desenfileirar());
                    Fila<E> troca = principal; principal = auxiliar; auxiliar = troca;
                    tam++;
                }
                public E desempilhar() {
                    if (vazia()) throw new NoSuchElementException("Pilha vazia");
                    E item = principal.desenfileirar(); tam--; return item;
                }
                public E consultarTopo() {
                    if (vazia()) throw new NoSuchElementException("Pilha vazia");
                    E item = principal.desenfileirar(); principal.enfileirar(item);
                    for (int i = 1; i < tam; i++) principal.enfileirar(principal.desenfileirar());
                    return item;
                }
            }
            // endregion [F204]
        }
        public static final class Revisao {
            // ============================================================================
            // region [F209] src/aed/revisao/Fila.java
            // BUSCA: Fila
            // ORIGEM_NO_ACERVO: src/aed/revisao/Fila.java
            // ============================================================================
            /** Variante da revisao: inicio/fim, com Comparable para ordenar. */
            public static class Fila<E extends Comparable<E>> {
                private final Biblioteca.Base.Celula<E> inicio;
                private Biblioteca.Base.Celula<E> fim;
                public Fila() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }
                public Fila(E[] a, E[] b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Array nulo");
                    int i = 0, j = 0;
                    while (i < a.length && j < b.length) {
                        if (a[i].compareTo(b[j]) <= 0) enfileirar(a[i++]);
                        else enfileirar(b[j++]);
                    }
                    while (i < a.length) enfileirar(a[i++]);
                    while (j < b.length) enfileirar(b[j++]);
                }
                public boolean vazia() { return inicio == fim; }
                public void enfileirar(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    fim.setProximo(nova); fim = nova;
                }
                public E consultarInicio() {
                    if (vazia()) throw new NoSuchElementException("Fila vazia");
                    return inicio.getProximo().getItem();
                }
                public E desenfileirar() {
                    E item = consultarInicio();
                    Biblioteca.Base.Celula<E> r = inicio.getProximo(); inicio.setProximo(r.getProximo());
                    if (r == fim) fim = inicio;
                    r.setProximo(null); return item;
                }
                public E obterItem(int pos) { return obterItem(inicio.getProximo(), pos); }
                public E obterItem(Biblioteca.Base.Celula<E> aux, int pos) {
                    if (pos < 0 || aux == null) throw new IndexOutOfBoundsException("Posicao inexistente");
                    if (pos == 0) return aux.getItem();
                    return obterItem(aux.getProximo(), pos - 1);
                }
                public Fila<E> extrairMenores(E limite) {
                    if (limite == null) throw new IllegalArgumentException("Limite nulo");
                    Fila<E> nova = new Fila<>();
                    Biblioteca.Base.Celula<E> anterior = inicio, atual = inicio.getProximo();
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        if (atual.getItem().compareTo(limite) < 0) {
                            anterior.setProximo(seguinte);
                            if (fim == atual) fim = anterior;
                            atual.setProximo(null);
                            nova.fim.setProximo(atual); nova.fim = atual;
                        } else anterior = atual;
                        atual = seguinte;
                    }
                    return nova;
                }
                public Object[] toArray() {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) n++;
                    Object[] a = new Object[n]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
                public boolean estruturaValida() {
                    Biblioteca.Base.Celula<E> lento = inicio, rapido = inicio;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                        if (lento == rapido) return false;
                    }
                    Biblioteca.Base.Celula<E> p = inicio;
                    while (p.getProximo() != null) p = p.getProximo();
                    return p == fim;
                }
            }
            // endregion [F209]
            // ============================================================================
            // region [F210] src/aed/revisao/Lista.java
            // BUSCA: Lista
            // ORIGEM_NO_ACERVO: src/aed/revisao/Lista.java
            // ============================================================================
            /** Variante da revisao: inicio/fim/tamanho. Item de Celula e final. */
            public static class Lista<E extends Comparable<E>> {
                private Biblioteca.Base.Celula<E> inicio;
                private Biblioteca.Base.Celula<E> fim;
                private int tamanho;
                public Lista() { inicio = new Biblioteca.Base.Celula<>(); fim = inicio; }
                /** LF01: copia via API publica; entradas ficam na mesma ordem. */
                public Lista(Biblioteca.Base.Fila<E> a, Biblioteca.Base.Fila<E> b) {
                    this();
                    if (a == null || b == null) throw new IllegalArgumentException("Fila nula");
                    Biblioteca.Base.Fila<E> ca = copiarPorAPI(a), cb = copiarPorAPI(b);
                    E x = ca.vazia() ? null : ca.desenfileirar();
                    E y = cb.vazia() ? null : cb.desenfileirar();
                    while (x != null && y != null) {
                        if (x.compareTo(y) <= 0) {
                            inserirFinal(x); x = ca.vazia() ? null : ca.desenfileirar();
                        } else {
                            inserirFinal(y); y = cb.vazia() ? null : cb.desenfileirar();
                        }
                    }
                    if (x != null) inserirFinal(x);
                    if (y != null) inserirFinal(y);
                    while (!ca.vazia()) inserirFinal(ca.desenfileirar());
                    while (!cb.vazia()) inserirFinal(cb.desenfileirar());
                }
                private Biblioteca.Base.Fila<E> copiarPorAPI(Biblioteca.Base.Fila<E> fila) {
                    Biblioteca.Base.Fila<E> copia = new Biblioteca.Base.Fila<>(), auxiliar = new Biblioteca.Base.Fila<>();
                    while (!fila.vazia()) {
                        E e = fila.desenfileirar(); copia.enfileirar(e); auxiliar.enfileirar(e);
                    }
                    while (!auxiliar.vazia()) fila.enfileirar(auxiliar.desenfileirar());
                    return copia;
                }
                public boolean vazia() { return inicio == fim; }
                public int tamanho() { return tamanho; }
                public void inserirFinal(E novo) {
                    if (novo == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> c = new Biblioteca.Base.Celula<>(novo);
                    fim.setProximo(c); fim = c; tamanho++;
                }
                public void inserir(E novo, int posicao) {
                    if (posicao < 0 || posicao > tamanho) throw new IndexOutOfBoundsException();
                    if (novo == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> anterior = inicio;
                    for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    Biblioteca.Base.Celula<E> c = new Biblioteca.Base.Celula<>(novo, anterior.getProximo());
                    anterior.setProximo(c); if (anterior == fim) fim = c; tamanho++;
                }
                public E remover(int posicao) {
                    if (posicao < 0 || posicao >= tamanho) throw new IndexOutOfBoundsException();
                    Biblioteca.Base.Celula<E> anterior = inicio;
                    for (int i = 0; i < posicao; i++) anterior = anterior.getProximo();
                    Biblioteca.Base.Celula<E> r = anterior.getProximo(); anterior.setProximo(r.getProximo());
                    if (r == fim) fim = anterior;
                    r.setProximo(null); tamanho--; return r.getItem();
                }
                public Lista<E> intercalarOrdenadas(Lista<E> outra) {
                    if (outra == null) throw new IllegalArgumentException("Lista nula");
                    Lista<E> nova = new Lista<>();
                    Biblioteca.Base.Celula<E> a = inicio.getProximo(), b = outra.inicio.getProximo();
                    while (a != null && b != null) {
                        if (a.getItem().compareTo(b.getItem()) <= 0) {
                            nova.inserirFinal(a.getItem()); a = a.getProximo();
                        } else { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                    }
                    while (a != null) { nova.inserirFinal(a.getItem()); a = a.getProximo(); }
                    while (b != null) { nova.inserirFinal(b.getItem()); b = b.getProximo(); }
                    return nova;
                }
                public E obterMaior() {
                    if (vazia()) throw new NoSuchElementException("Lista vazia");
                    return obterMaior(inicio.getProximo());
                }
                public E obterMaior(Biblioteca.Base.Celula<E> aux) {
                    if (aux == null) throw new NoSuchElementException("Trecho vazio");
                    if (aux.getProximo() == null) return aux.getItem();
                    E maiorResto = obterMaior(aux.getProximo());
                    if (aux.getItem().compareTo(maiorResto) >= 0) return aux.getItem();
                    return maiorResto;
                }
                public void rotacionar(int k) {
                    if (k < 0 || k > tamanho) throw new IllegalArgumentException("k invalido");
                    if (k == 0 || k == tamanho) return;
                    Biblioteca.Base.Celula<E> antigoPrimeiro = inicio.getProximo(), corte = antigoPrimeiro;
                    for (int i = 1; i < k; i++) corte = corte.getProximo();
                    Biblioteca.Base.Celula<E> novoPrimeiro = corte.getProximo();
                    fim.setProximo(antigoPrimeiro); corte.setProximo(null);
                    inicio.setProximo(novoPrimeiro); fim = corte;
                }
                public Lista<E> dividirAoMeio() {
                    Lista<E> outra = new Lista<>();
                    int esquerda = (tamanho + 1) / 2;
                    if (esquerda == tamanho) return outra;
                    Biblioteca.Base.Celula<E> corte = inicio;
                    for (int i = 0; i < esquerda; i++) corte = corte.getProximo();
                    outra.inicio.setProximo(corte.getProximo());
                    outra.fim = fim; outra.tamanho = tamanho - esquerda;
                    corte.setProximo(null); fim = corte; tamanho = esquerda;
                    return outra;
                }
                public void trocarDoisPrimeiros() {
                    if (tamanho < 2) throw new IllegalStateException("Menos de dois itens");
                    Biblioteca.Base.Celula<E> a = inicio.getProximo(), b = a.getProximo();
                    a.setProximo(b.getProximo()); b.setProximo(a); inicio.setProximo(b);
                    if (fim == b) fim = a;
                }
                public void ordenar() {
                    if (tamanho <= 1) return;
                    Lista<E> direita = dividirAoMeio();
                    this.ordenar(); direita.ordenar();
                    Lista<E> ordenada = intercalarOrdenadas(direita);
                    inicio = ordenada.inicio; fim = ordenada.fim; tamanho = ordenada.tamanho;
                }
                public void inserirEmOrdem(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> anterior = inicio;
                    while (anterior.getProximo() != null && anterior.getProximo().getItem().compareTo(item) <= 0) anterior = anterior.getProximo();
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item, anterior.getProximo()); anterior.setProximo(nova);
                    if (anterior == fim) fim = nova;
                    tamanho++;
                }
                public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = inicio.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
                public boolean estruturaValida() {
                    Biblioteca.Base.Celula<E> lento = inicio, rapido = inicio;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                        if (lento == rapido) return false;
                    }
                    int n = 0; Biblioteca.Base.Celula<E> p = inicio;
                    while (p.getProximo() != null) { p = p.getProximo(); n++; }
                    return p == fim && n == tamanho;
                }
            }
            // endregion [F210]
        }
        public static final class Variacoes {
            // ============================================================================
            // region [F212] src/aed/variacoes/FilaCircular.java
            // BUSCA: Fila Circular
            // ORIGEM_NO_ACERVO: src/aed/variacoes/FilaCircular.java
            // ============================================================================
            /** Usa um espaco vazio no array para distinguir cheia de vazia. */
            public static class FilaCircular<E> {
                private final Object[] itens;
                private int frente, tras;
                public FilaCircular(int capacidade) {
                    if (capacidade <= 0 || capacidade == Integer.MAX_VALUE) throw new IllegalArgumentException();
                    itens = new Object[capacidade + 1];
                }
                public boolean vazia() { return frente == tras; }
                public boolean cheia() { return (tras + 1) % itens.length == frente; }
                public int tamanho() { return (tras - frente + itens.length) % itens.length; }
                public void enfileirar(E item) {
                    if (cheia()) throw new IllegalStateException("Fila cheia");
                    itens[tras] = item; tras = (tras + 1) % itens.length;
                }
                @SuppressWarnings("unchecked") public E desenfileirar() {
                    if (vazia()) throw new NoSuchElementException();
                    E item = (E) itens[frente]; itens[frente] = null;
                    frente = (frente + 1) % itens.length; return item;
                }
            }
            // endregion [F212]
            // ============================================================================
            // region [F213] src/aed/variacoes/FilaSemSentinela.java
            // BUSCA: Fila Sem Sentinela
            // ORIGEM_NO_ACERVO: src/aed/variacoes/FilaSemSentinela.java
            // ============================================================================
            public static class FilaSemSentinela<E> {
                private Biblioteca.Base.Celula<E> inicio, fim;
                public boolean vazia() { return inicio == null; }
                public void enfileirar(E e) {
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(e);
                    if (vazia()) inicio = nova; else fim.setProximo(nova);
                    fim = nova;
                }
                public E desenfileirar() {
                    if (vazia()) throw new NoSuchElementException();
                    E e = inicio.getItem(); inicio = inicio.getProximo();
                    if (inicio == null) fim = null;
                    return e;
                }
            }
            // endregion [F213]
            // ============================================================================
            // region [F214] src/aed/variacoes/ModelosRecursivos.java
            // BUSCA: Modelos Recursivos
            // ORIGEM_NO_ACERVO: src/aed/variacoes/ModelosRecursivos.java
            // ============================================================================
            /** Modelos extras. Primeiro parametro e primeiro DADO, nao sentinela. */
            public static final class ModelosRecursivos {
                private ModelosRecursivos() { }
                public static <E> int contarSe(Biblioteca.Base.Celula<E> atual, Predicate<E> condicao) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    if (atual == null) return 0;
                    return (condicao.test(atual.getItem()) ? 1 : 0) + contarSe(atual.getProximo(), condicao);
                }
                public static <E> double somar(Biblioteca.Base.Celula<E> atual, Function<E, Double> extrator) {
                    if (extrator == null) throw new IllegalArgumentException("Extrator nulo");
                    if (atual == null) return 0;
                    Double valor = extrator.apply(atual.getItem());
                    if (valor == null) throw new IllegalArgumentException("Resultado nulo");
                    return valor + somar(atual.getProximo(), extrator);
                }
                public static <E> boolean algum(Biblioteca.Base.Celula<E> atual, Predicate<E> condicao) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    if (atual == null) return false;
                    return condicao.test(atual.getItem()) || algum(atual.getProximo(), condicao);
                }
                public static <E> boolean todos(Biblioteca.Base.Celula<E> atual, Predicate<E> condicao) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    if (atual == null) return true;
                    return condicao.test(atual.getItem()) && todos(atual.getProximo(), condicao);
                }
                public static <E> int indiceOuMenosUm(Biblioteca.Base.Celula<E> atual, E alvo) {
                    if (atual == null) return -1;
                    if (atual.getItem().equals(alvo)) return 0;
                    int resto = indiceOuMenosUm(atual.getProximo(), alvo);
                    return resto < 0 ? -1 : 1 + resto;
                }
                public static <E> int ultimoIndice(Biblioteca.Base.Celula<E> atual, E alvo) {
                    if (atual == null) return -1;
                    int resto = ultimoIndice(atual.getProximo(), alvo);
                    if (resto >= 0) return 1 + resto;
                    return atual.getItem().equals(alvo) ? 0 : -1;
                }
                public static <E> Biblioteca.Base.Celula<E> copiarNos(Biblioteca.Base.Celula<E> atual) {
                    if (atual == null) return null;
                    return new Biblioteca.Base.Celula<>(atual.getItem(), copiarNos(atual.getProximo()));
                }
                public static <E> Biblioteca.Base.Celula<E> filtrarNos(Biblioteca.Base.Celula<E> atual, Predicate<E> condicao) {
                    if (condicao == null) throw new IllegalArgumentException("Condicao nula");
                    if (atual == null) return null;
                    boolean incluir = condicao.test(atual.getItem());
                    Biblioteca.Base.Celula<E> resto = filtrarNos(atual.getProximo(), condicao);
                    return incluir ? new Biblioteca.Base.Celula<>(atual.getItem(), resto) : resto;
                }
                public static <E> Biblioteca.Base.Celula<E> removerTodosNos(Biblioteca.Base.Celula<E> atual, E alvo) {
                    if (atual == null) return null;
                    Biblioteca.Base.Celula<E> resto = removerTodosNos(atual.getProximo(), alvo);
                    if (atual.getItem().equals(alvo)) { atual.setProximo(null); return resto; }
                    atual.setProximo(resto); return atual;
                }
                public static <E> Biblioteca.Base.Fila<E> copiarInvertido(Biblioteca.Base.Celula<E> atual) {
                    Biblioteca.Base.Fila<E> nova = new Biblioteca.Base.Fila<>(); copiarNaVolta(atual, nova); return nova;
                }
                private static <E> void copiarNaVolta(Biblioteca.Base.Celula<E> atual, Biblioteca.Base.Fila<E> nova) {
                    if (atual == null) return;
                    copiarNaVolta(atual.getProximo(), nova);
                    nova.enfileirar(atual.getItem());
                }
                public static <E> Biblioteca.Base.Celula<E> copiarComFuncao(Biblioteca.Base.Celula<E> atual, Function<E, E> copiador) {
                    if (copiador == null) throw new IllegalArgumentException("Copiador nulo");
                    if (atual == null) return null;
                    E novo = copiador.apply(atual.getItem());
                    if (novo == null) throw new IllegalArgumentException("Copia nula");
                    return new Biblioteca.Base.Celula<>(novo, copiarComFuncao(atual.getProximo(), copiador));
                }
            }
            // endregion [F214]
            // ============================================================================
            // region [F215] src/aed/variacoes/PilhaSemSentinela.java
            // BUSCA: Pilha Sem Sentinela
            // ORIGEM_NO_ACERVO: src/aed/variacoes/PilhaSemSentinela.java
            // ============================================================================
            public static class PilhaSemSentinela<E> {
                private Biblioteca.Base.Celula<E> topo;
                public boolean vazia() { return topo == null; }
                public void empilhar(E item) { topo = new Biblioteca.Base.Celula<>(item, topo); }
                public E consultarTopo() {
                    if (vazia()) throw new NoSuchElementException();
                    return topo.getItem();
                }
                public E desempilhar() { E e = consultarTopo(); topo = topo.getProximo(); return e; }
            }
            // endregion [F215]
            // ============================================================================
            // region [F216] src/aed/variacoes/PilhaVetor.java
            // BUSCA: Pilha Vetor
            // ORIGEM_NO_ACERVO: src/aed/variacoes/PilhaVetor.java
            // ============================================================================
            /** topo e a PRIMEIRA posicao livre, nao o indice do ultimo item. */
            public static class PilhaVetor<E> {
                private final Object[] itens;
                private int topo;
                public PilhaVetor(int capacidade) {
                    if (capacidade < 0) throw new IllegalArgumentException();
                    itens = new Object[capacidade];
                }
                public boolean vazia() { return topo == 0; }
                public void empilhar(E e) {
                    if (topo == itens.length) throw new IllegalStateException("Pilha cheia");
                    itens[topo++] = e;
                }
                @SuppressWarnings("unchecked") public E desempilhar() {
                    if (vazia()) throw new NoSuchElementException();
                    E e = (E) itens[--topo]; itens[topo] = null; return e;
                }
            }
            // endregion [F216]
        }
        public static final class Ordenacao {
            // ============================================================================
            // region [F208] src/aed/ordenacao/Ordenacoes.java
            // BUSCA: Ordenacoes
            // ORIGEM_NO_ACERVO: src/aed/ordenacao/Ordenacoes.java
            // ============================================================================
            /** Implementacoes autorais, sem Arrays.sort/Collections.sort. */
            public static final class Ordenacoes {
                private Ordenacoes() { }
                public static void trocar(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }
                public static void mergeSort(int[] a) { mergeSort(a, new int[a.length], 0, a.length - 1); }
                private static void mergeSort(int[] a, int[] aux, int esq, int dir) {
                    if (esq >= dir) return;
                    int meio = esq + (dir - esq) / 2;
                    mergeSort(a, aux, esq, meio); mergeSort(a, aux, meio + 1, dir);
                    int i = esq, j = meio + 1, k = esq;
                    while (i <= meio && j <= dir) aux[k++] = a[i] <= a[j] ? a[i++] : a[j++];
                    while (i <= meio) aux[k++] = a[i++];
                    while (j <= dir) aux[k++] = a[j++];
                    for (k = esq; k <= dir; k++) a[k] = aux[k];
                }
                public static void quickSortCentro(int[] a) { quick(a, 0, a.length - 1, false); }
                public static void quickSortUltimo(int[] a) { quick(a, 0, a.length - 1, true); }
                private static void quick(int[] a, int esq, int dir, boolean ultimo) {
                    if (esq >= dir) return;
                    int i = esq, j = dir;
                    int pivo = a[ultimo ? dir : esq + (dir - esq) / 2];
                    while (i <= j) {
                        while (a[i] < pivo) i++;
                        while (a[j] > pivo) j--;
                        if (i <= j) { trocar(a, i, j); i++; j--; }
                    }
                    if (esq < j) quick(a, esq, j, ultimo);
                    if (i < dir) quick(a, i, dir, ultimo);
                }
                public static int particionar(int[] a, int esq, int dir) {
                    int pivo = a[dir], i = esq - 1;
                    for (int j = esq; j < dir; j++) if (a[j] <= pivo) trocar(a, ++i, j);
                    trocar(a, i + 1, dir); return i + 1;
                }
                public static void quickSortLomuto(int[] a) { lomuto(a, 0, a.length - 1); }
                private static void lomuto(int[] a, int e, int d) {
                    if (e >= d) return;
                    int p = particionar(a, e, d);
                    lomuto(a, e, p - 1); lomuto(a, p + 1, d);
                }
                public static void quickSortTresVias(int[] a) { tresVias(a, 0, a.length - 1); }
                private static void tresVias(int[] a, int e, int d) {
                    if (e >= d) return;
                    int menor = e, maior = d, i = e + 1, pivo = a[e];
                    while (i <= maior) {
                        if (a[i] < pivo) trocar(a, menor++, i++);
                        else if (a[i] > pivo) trocar(a, i, maior--);
                        else i++;
                    }
                    tresVias(a, e, menor - 1); tresVias(a, maior + 1, d);
                }
                public static void heapSort(int[] a) {
                    for (int i = a.length / 2 - 1; i >= 0; i--) descer(a, i, a.length);
                    for (int fim = a.length - 1; fim > 0; fim--) { trocar(a, 0, fim); descer(a, 0, fim); }
                }
                private static void descer(int[] a, int pai, int n) {
                    while (2 * pai + 1 < n) {
                        int filho = 2 * pai + 1;
                        if (filho + 1 < n && a[filho + 1] > a[filho]) filho++;
                        if (a[pai] >= a[filho]) return;
                        trocar(a, pai, filho); pai = filho;
                    }
                }
                /** R19: array[0] ignorado, elementos em 1..n. */
                public static void heapSortBaseUm(int[] a) {
                    int n = a.length - 1;
                    for (int i = n / 2; i >= 1; i--) descerBaseUm(a, i, n);
                    for (int fim = n; fim > 1; fim--) { trocar(a, 1, fim); descerBaseUm(a, 1, fim - 1); }
                }
                private static void descerBaseUm(int[] a, int pai, int n) {
                    while (2 * pai <= n) {
                        int filho = 2 * pai;
                        if (filho < n && a[filho + 1] > a[filho]) filho++;
                        if (a[pai] >= a[filho]) return;
                        trocar(a, pai, filho); pai = filho;
                    }
                }
                public static void insertionSort(int[] a) {
                    for (int i = 1; i < a.length; i++) {
                        int item = a[i], j = i - 1;
                        while (j >= 0 && a[j] > item) { a[j + 1] = a[j]; j--; }
                        a[j + 1] = item;
                    }
                }
                public static void selectionSort(int[] a) {
                    for (int i = 0; i < a.length - 1; i++) {
                        int menor = i;
                        for (int j = i + 1; j < a.length; j++) if (a[j] < a[menor]) menor = j;
                        trocar(a, i, menor);
                    }
                }
                public static void bubbleSort(int[] a) {
                    for (int fim = a.length - 1; fim > 0; fim--) {
                        boolean trocou = false;
                        for (int j = 0; j < fim; j++) if (a[j] > a[j + 1]) { trocar(a, j, j + 1); trocou = true; }
                        if (!trocou) return;
                    }
                }
            }
            // endregion [F208]
        }
        public static final class Aplicacao {
            // ============================================================================
            // region [F194] src/aed/app/AppPedidos.java
            // BUSCA: App Pedidos
            // ORIGEM_NO_ACERVO: src/aed/app/AppPedidos.java
            // ============================================================================
            /** Demo completa, sem arquivo produtos.txt e sem dependencias do projeto original. */
            public static final class AppPedidos {
                private static final Biblioteca.Base.Fila<PedidoDemo> filaPedidos = new Biblioteca.Base.Fila<>();
                private static final Biblioteca.Base.Pilha<PedidoDemo> pilhaPedidos = new Biblioteca.Base.Pilha<>();
                private static int proximoId = 1;
                private AppPedidos() { }
                public static void finalizarPedido(PedidoDemo pedido) {
                    if (pedido == null) throw new IllegalArgumentException("Pedido nulo");
                    filaPedidos.enfileirar(pedido); pilhaPedidos.empilhar(pedido);
                }
                public static void mostrarMediaPedidos(int quantidade) {
                    Function<PedidoDemo, Double> extrator = pedido -> pedido.valorFinal();
                    double media = filaPedidos.calcularValorMedio(extrator, quantidade);
                    System.out.printf("Media: %.2f%n", media);
                }
                public static void mostrarPedidosFiltrados(int quantidade, double minimo) {
                    Predicate<PedidoDemo> condicao = pedido -> pedido.valorFinal() >= minimo;
                    Biblioteca.Base.Fila<PedidoDemo> filtrados = filaPedidos.filtrar(condicao, quantidade);
                    while (!filtrados.vazia()) System.out.println(filtrados.desenfileirar());
                }
                public static void demonstrar() {
                    finalizarPedido(new PedidoDemo(proximoId++, 80));
                    finalizarPedido(new PedidoDemo(proximoId++, 250));
                    finalizarPedido(new PedidoDemo(proximoId++, 120));
                    mostrarMediaPedidos(3); mostrarPedidosFiltrados(3, 100);
                    System.out.println("Fila original preservada: " + filaPedidos.tamanho());
                }
                public static void main(String[] args) {
                    if (args.length == 0 || !args[0].equals("--interativo")) { demonstrar(); return; }
                    Scanner sc = new Scanner(System.in, "UTF-8");
                    while (true) {
                        System.out.println("1 cadastrar, 2 media, 3 filtrar, 4 listar, 0 sair");
                        if (!sc.hasNextLine()) break;
                        String opcao = sc.nextLine().trim();
                        if (opcao.equals("0")) break;
                        try {
                            if (opcao.equals("1")) {
                                System.out.println("Valor:");
                                finalizarPedido(new PedidoDemo(proximoId++, Double.parseDouble(sc.nextLine().trim().replace(',', '.'))));
                            } else if (opcao.equals("2")) {
                                System.out.println("Quantidade:"); mostrarMediaPedidos(Integer.parseInt(sc.nextLine().trim()));
                            } else if (opcao.equals("3")) {
                                System.out.println("Quantidade:"); int n = Integer.parseInt(sc.nextLine().trim());
                                System.out.println("Minimo:"); double minimo = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
                                if (Double.isNaN(minimo) || Double.isInfinite(minimo)) throw new IllegalArgumentException("Minimo invalido");
                                mostrarPedidosFiltrados(n, minimo);
                            } else if (opcao.equals("4")) {
                                Biblioteca.Base.Fila<PedidoDemo> copia = filaPedidos.copiar();
                                while (!copia.vazia()) System.out.println(copia.desenfileirar());
                            } else System.out.println("Opcao invalida");
                        } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
                    }
                    sc.close();
                }
            }
            // endregion [F194]
            // ============================================================================
            // region [F195] src/aed/app/PedidoDemo.java
            // BUSCA: Pedido Demo
            // ORIGEM_NO_ACERVO: src/aed/app/PedidoDemo.java
            // ============================================================================
            /** Exemplo independente: nao substitui a classe Pedido original do comercio. */
            public static final class PedidoDemo implements Comparable<PedidoDemo> {
                private final int id;
                private final double valor;
                public PedidoDemo(int id, double valor) {
                    if (valor < 0 || Double.isNaN(valor) || Double.isInfinite(valor)) throw new IllegalArgumentException("Valor invalido");
                    this.id = id; this.valor = valor;
                }
                public int getId() { return id; }
                public double valorFinal() { return valor; }
                @Override public int compareTo(PedidoDemo outro) { return Integer.compare(id, outro.id); }
                @Override public boolean equals(Object o) {
                    return o instanceof PedidoDemo && id == ((PedidoDemo) o).id;
                }
                @Override public int hashCode() { return Integer.hashCode(id); }
                @Override public String toString() { return "Pedido " + id + " = " + valor; }
            }
            // endregion [F195]
            // ============================================================================
            // region [F196] src/aed/app/RecursaoPassoAPasso.java
            // BUSCA: Recursao Passo APasso
            // ORIGEM_NO_ACERVO: src/aed/app/RecursaoPassoAPasso.java
            // ============================================================================
            /** Leia a saida esperada em 02_RECURSAO. Nao depende de interface grafica. */
            public static final class RecursaoPassoAPasso {
                private RecursaoPassoAPasso() { }
                public static int contar(Biblioteca.Base.Celula<Integer> atual, String margem) {
                    System.out.println(margem + "ENTROU: " + (atual == null ? "null" : atual.getItem()));
                    if (atual == null) {
                        System.out.println(margem + "RETORNA 0");
                        return 0;
                    }
                    System.out.println(margem + "Esta chamada espera o resultado da proxima");
                    int resposta = contar(atual.getProximo(), margem + "  ");
                    System.out.println(margem + "VOLTOU para " + atual.getItem() + "; resposta=" + resposta);
                    System.out.println(margem + "RETORNA " + (1 + resposta));
                    return 1 + resposta;
                }
                public static void main(String[] args) {
                    Biblioteca.Base.Celula<Integer> c30 = new Biblioteca.Base.Celula<>(30);
                    Biblioteca.Base.Celula<Integer> c20 = new Biblioteca.Base.Celula<>(20, c30);
                    Biblioteca.Base.Celula<Integer> c10 = new Biblioteca.Base.Celula<>(10, c20);
                    System.out.println("Resultado final=" + contar(c10, ""));
                }
            }
            // endregion [F196]
        }
        public static final class Verificacao {
            // ============================================================================
            // region [F211] src/aed/testes/Testes.java
            // BUSCA: Testes
            // ORIGEM_NO_ACERVO: src/aed/testes/Testes.java
            // ============================================================================
            /** Sem JUnit. Reflexao somente aqui, para testar IDENTIDADE dos nos. */
            public static final class Testes {
                private static int verificacoes;
                private Testes() { }
                private static void ok(boolean condicao, String nome) {
                    verificacoes++;
                    if (!condicao) throw new AssertionError(nome);
                }
                private static void igual(Object esperado, Object obtido, String nome) {
                    ok(esperado == null ? obtido == null : esperado.equals(obtido),
                            nome + ": esperado=" + esperado + ", obtido=" + obtido);
                }
                private static void seq(Object[] obtido, Object... esperado) {
                    igual(esperado.length, obtido.length, "Comprimento");
                    for (int i = 0; i < esperado.length; i++) igual(esperado[i], obtido[i], "Indice " + i);
                }
                private static void ints(int[] esperado, int[] obtido) {
                    igual(esperado.length, obtido.length, "Tamanho vetor");
                    for (int i = 0; i < esperado.length; i++) igual(esperado[i], obtido[i], "Vetor indice " + i);
                }
                private static void erro(Class<? extends Throwable> tipo, Runnable acao) {
                    verificacoes++;
                    try { acao.run(); }
                    catch (Throwable ex) {
                        if (tipo.isInstance(ex)) return;
                        throw new AssertionError("Esperava " + tipo.getName(), ex);
                    }
                    throw new AssertionError("Faltou excecao " + tipo.getName());
                }
                private static Biblioteca.Base.Fila<Integer> fila(Integer... a) { return new Biblioteca.Base.Fila<>(a); }
                private static Biblioteca.Base.Lista<Integer> lista(Integer... a) {
                    Biblioteca.Base.Lista<Integer> l = new Biblioteca.Base.Lista<>(); for (int x : a) l.inserirFinal(x); return l;
                }
                private static Biblioteca.Base.Pilha<Integer> pilha(Integer... topoPrimeiro) {
                    Biblioteca.Base.Pilha<Integer> p = new Biblioteca.Base.Pilha<>();
                    for (int i = topoPrimeiro.length - 1; i >= 0; i--) p.empilhar(topoPrimeiro[i]);
                    return p;
                }
                private static Biblioteca.Base.ListaDupla<Integer> dupla(Integer... a) {
                    Biblioteca.Base.ListaDupla<Integer> l = new Biblioteca.Base.ListaDupla<>(); for (int x : a) l.inserirFim(x); return l;
                }
                private static Biblioteca.Revisao.Lista<Integer> rev(Integer... a) {
                    Biblioteca.Revisao.Lista<Integer> l = new Biblioteca.Revisao.Lista<>();
                    for (int x : a) l.inserirFinal(x); return l;
                }
                private static Biblioteca.Base.Celula<Integer> cadeia(Integer... a) {
                    Biblioteca.Base.Celula<Integer> p = null;
                    for (int i = a.length - 1; i >= 0; i--) p = new Biblioteca.Base.Celula<>(a[i], p);
                    return p;
                }
                private static Object[] itens(Biblioteca.Base.Celula<?> p) {
                    int n = 0; for (Biblioteca.Base.Celula<?> a = p; a != null; a = a.getProximo()) n++;
                    Object[] r = new Object[n]; int i = 0;
                    for (; p != null; p = p.getProximo()) r[i++] = p.getItem(); return r;
                }
                private static Object campo(Object o, String nome) {
                    try { Field f = o.getClass().getDeclaredField(nome); f.setAccessible(true); return f.get(o); }
                    catch (ReflectiveOperationException e) { throw new AssertionError(e); }
                }
                private static Object[] nos(Object lista) {
                    Biblioteca.Base.Celula<?> p = ((Biblioteca.Base.Celula<?>) campo(lista, "inicio")).getProximo();
                    Object[] a = new Object[itens(p).length]; int i = 0;
                    while (p != null) { a[i++] = p; p = p.getProximo(); } return a;
                }
                private static Object[] nosDuplos(Biblioteca.Base.ListaDupla<?> lista) {
                    Biblioteca.Base.CelulaDupla<?> p = ((Biblioteca.Base.CelulaDupla<?>) campo(lista, "inicio")).getProximo();
                    Object[] a = new Object[lista.tamanho()]; int i = 0;
                    while (p != null) { a[i++] = p; p = p.getProximo(); } return a;
                }

                private static void testarFilas() throws Exception {
                    Biblioteca.Base.Fila<Integer> f = fila();
                    ok(f.vazia() && f.estruturaValida(), "Fila vazia");
                    igual(0, f.obterNumeroItens(), "Contar vazia");
                    erro(java.util.NoSuchElementException.class, () -> f.desenfileirar());
                    for (int i = 0; i < 20; i++) {
                        f.enfileirar(i); igual(i, f.desenfileirar(), "Reuso fila"); ok(f.estruturaValida(), "Extremos");
                    }
                    f.enfileirar(10); f.enfileirar(20); f.enfileirar(30);
                    igual(3, f.obterNumeroItens(), "Contar"); igual(1, f.quantosAfrente(20), "Posicao");
                    igual(2, f.obterNumItensAFrente(30), "Alias BF04");
                    igual(30, f.obterItem(2), "Obter"); ok(f.contem(20) && !f.contem(99), "Contem");
                    erro(java.util.NoSuchElementException.class, () -> f.quantosAfrente(99));
                    erro(IndexOutOfBoundsException.class, () -> f.obterItem(-1));
                    erro(IndexOutOfBoundsException.class, () -> f.obterItem(3));
                    Biblioteca.Base.Fila<Integer> copia = f.copiar(); copia.desenfileirar(); seq(f.toArray(), 10, 20, 30);
                    Biblioteca.Base.Fila<Integer> pares = f.dividir(); seq(pares.toArray(), 10, 30); seq(f.toArray(), 20);
                    ok(f.estruturaValida() && pares.estruturaValida(), "Dividir");
                    f.enfileirar(40); f.inverter(); seq(f.toArray(), 40, 20);
                    f.inverterPorPilha(); seq(f.toArray(), 20, 40);
                    f.inverterRecursivamente(); seq(f.toArray(), 40, 20);
                    f.inverterSemAnterior(); seq(f.toArray(), 20, 40); ok(f.estruturaValida(), "Sem anterior");
                    Biblioteca.Base.Fila<Integer> a = fila(1, 3), b = fila(2, 4, 6); a.mesclar(b);
                    seq(a.toArray(), 1, 2, 3, 4, 6); seq(b.toArray(), 2, 4, 6);
                    a = fila(1, 2); a.concatenar(a); seq(a.toArray(), 1, 2, 1, 2);
                    a = fila(1, 2); a.mesclar(a); seq(a.toArray(), 1, 1, 2, 2);
                    Biblioteca.Base.Fila<Integer> orig = fila(10, 20, 30, 40);
                    seq(orig.filtrar(x -> x > 15, 3).toArray(), 20, 30);
                    igual(20.0, orig.calcularValorMedio(x -> x.doubleValue(), 3), "Media");
                    igual(60.0, orig.somarValores(x -> x.doubleValue(), 3), "Soma");
                    igual(2, orig.contarSe(x -> x > 15, 3), "ContarSe");
                    igual(40, orig.encontrarMaior(x -> x.doubleValue()), "Maior");
                    seq(orig.toArray(), 10, 20, 30, 40);
                    erro(IllegalArgumentException.class, () -> orig.calcularValorMedio(x -> x.doubleValue(), 0));
                    erro(IllegalArgumentException.class, () -> orig.filtrar(x -> true, 5));
                    erro(IllegalArgumentException.class, () -> orig.filtrar(x -> true, -1));
                    erro(IllegalArgumentException.class, () -> orig.somarValores(x -> null, 1));
                    seq(orig.itensDepoisDoAlvo(20).toArray(), 30, 40);
                    seq(orig.itensDepoisDoAlvo(40).toArray());
                    seq(orig.itensAntesDoAlvo(30).toArray(), 10, 20);
                    seq(orig.itensAntesDoAlvo(10).toArray());
                    erro(java.util.NoSuchElementException.class, () -> orig.itensDepoisDoAlvo(99));
                    erro(java.util.NoSuchElementException.class, () -> orig.itensAntesDoAlvo(99));
                    seq(new Biblioteca.Base.Fila<>(new Integer[]{1, null, 2}).toArray(), 1, 2);
                    Biblioteca.Base.Pilha<Integer> p = pilha(3, 2, 1); seq(new Biblioteca.Base.Fila<>(p).toArray(), 3, 2, 1); seq(p.toArray(), 3, 2, 1);
                    seq(fila(1, 2).unir(fila(3, 4)).toArray(), 1, 2, 3, 4);
                    for (int n = 0; n < 20; n++) {
                        Biblioteca.Base.Fila<Integer> q = fila(); for (int i = 0; i < n; i++) q.enfileirar(i);
                        Biblioteca.Base.Fila<Integer> r = q.dividir();
                        for (int i = 0; i < n; i += 2) igual(i, r.desenfileirar(), "Par");
                        for (int i = 1; i < n; i += 2) igual(i, q.desenfileirar(), "Impar");
                        ok(q.estruturaValida() && r.estruturaValida(), "Dividir varios tamanhos");
                    }
                }
                private static void testarPilhas() {
                    Biblioteca.Base.Pilha<Integer> p = pilha(30, 20, 10);
                    igual(3, p.contarRecursivo(), "Contar pilha");
                    seq(p.subPilha(2).toArray(), 30, 20); seq(p.toArray(), 30, 20, 10);
                    erro(IllegalArgumentException.class, () -> p.subPilha(4)); seq(p.toArray(), 30, 20, 10);
                    p.inverter(); seq(p.toArray(), 10, 20, 30); ok(p.estruturaValida(), "Inverter pilha");
                    p.inverterRecursivamente(); seq(p.toArray(), 30, 20, 10);
                    Biblioteca.Base.Pilha<Integer> b = pilha(8, 7); p.concatenar(b);
                    seq(p.toArray(), 30, 20, 10, 8, 7); seq(b.toArray(), 8, 7);
                    Biblioteca.Base.Pilha<Integer> c = pilha(2, 1); c.concatenar(c); seq(c.toArray(), 2, 1, 2, 1);
                    Biblioteca.Base.Pilha<Integer> vazio = pilha(); vazio.inverter(); vazio.concatenar(pilha(1)); seq(vazio.toArray(), 1);
                    Biblioteca.Base.PseudoFila<Integer> pf = new Biblioteca.Base.PseudoFila<>(); pf.enfileirar(1); pf.enfileirar(2);
                    igual(1, pf.consultarInicio(), "Pseudo frente"); igual(1, pf.desenfileirar(), "Pseudo saida");
                    pf.enfileirar(3); igual(2, pf.desenfileirar(), "Pseudo ordem"); igual(3, pf.desenfileirar(), "Pseudo ordem2"); ok(pf.vazia(), "Pseudo vazia");
                    Biblioteca.Base.PseudoPilha<Integer> pp = new Biblioteca.Base.PseudoPilha<>(); pp.empilhar(1); pp.empilhar(2); pp.empilhar(3);
                    igual(3, pp.consultarTopo(), "Pseudo topo"); igual(3, pp.consultarTopo(), "Consulta preservada");
                    igual(3, pp.desempilhar(), "Pop3"); igual(2, pp.desempilhar(), "Pop2"); igual(1, pp.desempilhar(), "Pop1"); ok(pp.vazia(), "Vazia");
                }
                private static void testarListas() {
                    Biblioteca.Base.Lista<Integer> l = lista(); l.inserir(2, 0); l.inserir(1, 0); l.inserir(3, 2);
                    seq(l.toArray(), 1, 2, 3); igual(2, l.localizar(1), "Localizar");
                    igual(1, l.removerInicio(), "Rem inicio"); igual(3, l.remover(Integer.valueOf(3)), "Rem valor");
                    seq(l.toArray(), 2); ok(l.estruturaValida(), "Lista valida");
                    l = lista(1, 2, 1, 1, 3, 1); igual(4, l.contarQtos(1), "Ocorrencias"); ok(l.contem(3), "Contem");
                    l.removerTodos(1); seq(l.toArray(), 2, 3); l.removerTodos(2); l.removerTodos(3);
                    ok(l.vazia() && l.estruturaValida(), "Remove todos");
                    Biblioteca.Base.Lista<Integer> v = l; erro(IllegalStateException.class, () -> v.removerTodos(1));
                    l = lista(1, 2, 3); seq(l.invertida().toArray(), 3, 2, 1); seq(l.toArray(), 1, 2, 3);
                    l.inverter(); seq(l.toArray(), 3, 2, 1);
                    Biblioteca.Base.Lista<Integer> clone = l.clone(); clone.removerInicio(); seq(l.toArray(), 3, 2, 1);
                    Biblioteca.Base.Lista<Integer> a = lista(1, 3, 5), b = lista(2, 4); a.mesclar(b);
                    seq(a.toArray(), 1, 2, 3, 4, 5); seq(b.toArray(), 2, 4);
                    seq(lista(1, 3, 5).mesclarInvertidas(lista(2, 4, 6, 8)).toArray(), 5, 8, 3, 6, 1, 4, 2);
                    Biblioteca.Base.Pilha<Integer> p = pilha(3, 2, 1); l = lista(0); l.unir(p);
                    seq(l.toArray(), 0, 1, 2, 3); seq(p.toArray(), 3, 2, 1);
                    for (int n = 1; n <= 8; n++) for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) {
                        Biblioteca.Base.Lista<Integer> x = lista(); Object[] esperado = new Object[n];
                        for (int k = 0; k < n; k++) { x.inserirFinal(k); esperado[k] = k; }
                        Object t = esperado[i]; esperado[i] = esperado[j]; esperado[j] = t;
                        x.trocar(i, j); seq(x.toArray(), esperado); ok(x.estruturaValida(), "Trocar nos");
                    }
                    Biblioteca.Flexiveis.ListaOrdenada<Integer> ord = new Biblioteca.Flexiveis.ListaOrdenada<>();
                    for (int x : new int[]{3, 1, 2, 2, 0, 5}) ord.inserirEmOrdem(x);
                    seq(ord.toArray(), 0, 1, 2, 2, 3, 5);
                }
                private static void testarRevisao() {
                    Biblioteca.Revisao.Fila<Integer> f = new Biblioteca.Revisao.Fila<>(new Integer[]{1, 3, 5}, new Integer[]{2, 3, 6});
                    seq(f.toArray(), 1, 2, 3, 3, 5, 6); igual(3, f.obterItem(2), "R01");
                    seq(f.extrairMenores(4).toArray(), 1, 2, 3, 3); seq(f.toArray(), 5, 6); ok(f.estruturaValida(), "Extrair");
                    f.extrairMenores(99); ok(f.vazia() && f.estruturaValida(), "Extrair todos"); f.enfileirar(7); igual(7, f.desenfileirar(), "Reuso");
                    Biblioteca.Base.Fila<Integer> a = fila(1, 3, 5), b = fila(2, 4);
                    Biblioteca.Revisao.Lista<Integer> l = new Biblioteca.Revisao.Lista<>(a, b);
                    seq(l.toArray(), 1, 2, 3, 4, 5); seq(a.toArray(), 1, 3, 5); seq(b.toArray(), 2, 4);
                    seq(rev(1, 3, 5).intercalarOrdenadas(rev(2, 4, 6)).toArray(), 1, 2, 3, 4, 5, 6);
                    igual(-2, rev(-9, -2, -7).obterMaior(), "Maior negativo");
                    erro(java.util.NoSuchElementException.class, () -> rev().obterMaior());
                    for (int n = 0; n <= 12; n++) for (int k = 0; k <= n; k++) {
                        Biblioteca.Revisao.Lista<Integer> x = rev(); Object[] esperado = new Object[n];
                        for (int i = 0; i < n; i++) { x.inserirFinal(i); esperado[i] = (i + k) % n; }
                        Object[] antes = nos(x); x.rotacionar(k); seq(x.toArray(), esperado); ok(x.estruturaValida(), "Rotacao");
                        Object[] depois = nos(x); for (int i = 0; i < n; i++) ok(depois[i] == antes[(i + k) % n], "Reutiliza nos");
                    }
                    for (int n = 0; n <= 12; n++) {
                        Biblioteca.Revisao.Lista<Integer> x = rev(); for (int i = 0; i < n; i++) x.inserirFinal(i);
                        Object[] antes = nos(x); Biblioteca.Revisao.Lista<Integer> y = x.dividirAoMeio();
                        igual((n + 1) / 2, x.tamanho(), "Esquerda"); igual(n / 2, y.tamanho(), "Direita");
                        Object[] nx = nos(x), ny = nos(y);
                        for (int i = 0; i < nx.length; i++) ok(nx[i] == antes[i], "Mesmos nos esquerda");
                        for (int i = 0; i < ny.length; i++) ok(ny[i] == antes[nx.length + i], "Mesmos nos direita");
                        ok(x.estruturaValida() && y.estruturaValida(), "Divisao valida");
                    }
                    l = rev(4, 7); l.trocarDoisPrimeiros(); l.inserirFinal(9); seq(l.toArray(), 7, 4, 9); ok(l.estruturaValida(), "Troca corrige fim");
                    erro(IllegalStateException.class, () -> rev(1).trocarDoisPrimeiros());
                    Random rnd = new Random(23917);
                    for (int t = 0; t < 300; t++) {
                        int n = rnd.nextInt(40); int[] v = new int[n]; l = rev();
                        for (int i = 0; i < n; i++) { v[i] = rnd.nextInt(31) - 15; l.inserirFinal(v[i]); }
                        Biblioteca.Ordenacao.Ordenacoes.insertionSort(v); l.ordenar(); Object[] esperado = new Object[n];
                        for (int i = 0; i < n; i++) esperado[i] = v[i];
                        seq(l.toArray(), esperado); ok(l.estruturaValida(), "Merge lista");
                    }
                }
                private static void testarDuplas() {
                    Biblioteca.Base.ListaDupla<Integer> l = dupla(1, 2, 3); l.inserir(0, 0); l.inserir(9, 2); l.inserirFim(4);
                    seq(l.toArray(), 0, 1, 9, 2, 3, 4); seq(l.reversoArray(), 4, 3, 2, 9, 1, 0); ok(l.estruturaValida(), "Dupla inserir");
                    igual(4, l.removerFim(), "Dupla fim"); igual(9, l.remover(2), "Dupla meio"); ok(l.estruturaValida(), "Dupla removida");
                    l = dupla(1, 1, 2, 1); l.removerTodos(1); seq(l.toArray(), 2); l.removerFim(); ok(l.vazia() && l.estruturaValida(), "Dupla esvaziar");
                    ok(dupla().ehPalindromo() && dupla(1).ehPalindromo() && dupla(1, 2, 2, 1).ehPalindromo() && dupla(1, 2, 1).ehPalindromo(), "Palindromos");
                    ok(!dupla(1, 2, 3).ehPalindromo(), "Nao palindromo");
                    for (int n = 0; n < 20; n++) {
                        l = dupla(); for (int i = 0; i < n; i++) l.inserirFim(i);
                        Object s = campo(l, "inicio"); Object[] antes = nosDuplos(l);
                        l.inverter(); Object[] depois = nosDuplos(l);
                        for (int i = 0; i < n; i++) ok(depois[i] == antes[n - 1 - i], "Inverter mesmos nos");
                        ok(campo(l, "inicio") == s && l.estruturaValida(), "Mesma sentinela");
                    }
                    for (int n = 0; n < 5; n++) for (int m = 0; m < 5; m++) {
                        Biblioteca.Base.ListaDupla<Integer> a = dupla(), b = dupla();
                        for (int i = 0; i < n; i++) a.inserirFim(i);
                        for (int i = 0; i < m; i++) b.inserirFim(n + i);
                        Object[] na = nosDuplos(a), nb = nosDuplos(b); a.concatenar(b); Object[] nr = nosDuplos(a);
                        for (int i = 0; i < n; i++) ok(nr[i] == na[i], "Concat preserva A");
                        for (int i = 0; i < m; i++) ok(nr[n + i] == nb[i], "Concat transfere B");
                        ok(a.estruturaValida() && b.vazia() && b.estruturaValida(), "Concat consistente");
                        b.inserirFim(99); igual(99, b.removerFim(), "Reuso B");
                    }
                    Biblioteca.Base.Fila<Integer> f = fila(1, 2, 3); seq(new Biblioteca.Base.ListaDupla<>(f).toArray(), 1, 2, 3); seq(f.toArray(), 1, 2, 3);
                }
                private static void ordenarEConferir(int[] original) {
                    int[] esperado = original.clone(); Biblioteca.Ordenacao.Ordenacoes.insertionSort(esperado);
                    // Propriedades independentes da implementacao de referencia.
                    for (int i = 1; i < esperado.length; i++) ok(esperado[i - 1] <= esperado[i], "Ordem da referencia");
                    for (int v : original) {
                        int n1 = 0, n2 = 0;
                        for (int x : original) if (x == v) n1++;
                        for (int x : esperado) if (x == v) n2++;
                        igual(n1, n2, "Preserva multiplicidade");
                    }
                    for (int alg = 0; alg < 8; alg++) {
                        int[] a = original.clone();
                        switch (alg) {
                            case 0: Biblioteca.Ordenacao.Ordenacoes.mergeSort(a); break;
                            case 1: Biblioteca.Ordenacao.Ordenacoes.quickSortCentro(a); break;
                            case 2: Biblioteca.Ordenacao.Ordenacoes.quickSortUltimo(a); break;
                            case 3: Biblioteca.Ordenacao.Ordenacoes.quickSortLomuto(a); break;
                            case 4: Biblioteca.Ordenacao.Ordenacoes.quickSortTresVias(a); break;
                            case 5: Biblioteca.Ordenacao.Ordenacoes.heapSort(a); break;
                            case 6: Biblioteca.Ordenacao.Ordenacoes.selectionSort(a); break;
                            default: Biblioteca.Ordenacao.Ordenacoes.bubbleSort(a);
                        }
                        ints(esperado, a);
                    }
                    int[] base1 = new int[original.length + 1];
                    for (int i = 0; i < original.length; i++) base1[i + 1] = original[i];
                    Biblioteca.Ordenacao.Ordenacoes.heapSortBaseUm(base1);
                    for (int i = 0; i < esperado.length; i++) igual(esperado[i], base1[i + 1], "Heap base1");
                }
                private static void enumerar(int[] a, int pos) {
                    if (pos == a.length) { ordenarEConferir(a); return; }
                    for (int x = -1; x <= 1; x++) { a[pos] = x; enumerar(a, pos + 1); }
                }
                private static void testarOrdenacoes() {
                    for (int n = 0; n <= 7; n++) enumerar(new int[n], 0);
                    ordenarEConferir(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE, -1, 1});
                    Random r = new Random(20261025);
                    for (int k = 0; k < 200; k++) {
                        int[] a = new int[r.nextInt(70)];
                        for (int i = 0; i < a.length; i++) a[i] = r.nextInt(201) - 100;
                        ordenarEConferir(a);
                    }
                    int[] a = {7, 2, 9, 4, 6, 1, 5}; igual(3, Biblioteca.Ordenacao.Ordenacoes.particionar(a, 0, 6), "Pivo Lomuto");
                    ints(new int[]{2, 4, 1, 5, 6, 9, 7}, a);
                }
                private static void testarClassicosEModelos() {
                    ok(Biblioteca.ProblemasClassicos.Classicos.delimitadoresBalanceados("{a[()]}"), "Delimitadores");
                    ok(!Biblioteca.ProblemasClassicos.Classicos.delimitadoresBalanceados("([)]"), "Cruzado");
                    ok(!Biblioteca.ProblemasClassicos.Classicos.delimitadoresBalanceados("]"), "Sem abertura");
                    igual(14.0, Biblioteca.ProblemasClassicos.Classicos.avaliarPosfixa("2 3 4 * +"), "Posfixa");
                    igual(-2.0, Biblioteca.ProblemasClassicos.Classicos.avaliarPosfixa("3 5 -"), "Ordem operandos");
                    erro(IllegalArgumentException.class, () -> Biblioteca.ProblemasClassicos.Classicos.avaliarPosfixa("1 2"));
                    erro(ArithmeticException.class, () -> Biblioteca.ProblemasClassicos.Classicos.avaliarPosfixa("1 0 /"));
                    igual("0", Biblioteca.ProblemasClassicos.Classicos.binario(0), "Binario0"); igual("1101", Biblioteca.ProblemasClassicos.Classicos.binario(13), "Binario13");
                    ok(Biblioteca.ProblemasClassicos.Classicos.palindromo("Socorram-me em Marrocos"), "Palindromo"); ok(!Biblioteca.ProblemasClassicos.Classicos.palindromo("java"), "Nao palindromo");
                    seq(itens(Biblioteca.ProblemasClassicos.Classicos.inverterLigacoes(cadeia(1, 2, 3))), 3, 2, 1);
                    seq(itens(Biblioteca.ProblemasClassicos.Classicos.inverterLigacoesRec(cadeia(1, 2, 3))), 3, 2, 1);
                    Biblioteca.Base.Celula<Integer> c = cadeia(1, 2, 3), c2 = c.getProximo(); c2.getProximo().setProximo(c2);
                    ok(Biblioteca.ProblemasClassicos.Classicos.temCiclo(c), "Ciclo"); ok(Biblioteca.ProblemasClassicos.Classicos.inicioDoCiclo(c) == c2, "Inicio ciclo");
                    ok(!Biblioteca.ProblemasClassicos.Classicos.temCiclo(cadeia(1, 2, 3)), "Aciclica");
                    igual(3, Biblioteca.ProblemasClassicos.Classicos.meio(cadeia(1, 2, 3, 4)).getItem(), "Meio");
                    igual(2, Biblioteca.ProblemasClassicos.Classicos.kEsimoDoFim(cadeia(1, 2, 3), 2), "K fim");
                    seq(itens(Biblioteca.ProblemasClassicos.Classicos.removerKEsimoDoFim(cadeia(1, 2, 3), 3)), 2, 3);
                    seq(itens(Biblioteca.ProblemasClassicos.Classicos.removerKEsimoDoFim(cadeia(1), 1)));
                    seq(itens(Biblioteca.ProblemasClassicos.Classicos.intercalarNos(cadeia(1, 3, 5), cadeia(2, 3, 4))), 1, 2, 3, 3, 4, 5);
                    seq(itens(Biblioteca.ProblemasClassicos.Classicos.removerDuplicadosOrdenados(cadeia(1, 1, 2, 2, 3))), 1, 2, 3);
                    seq(itens(Biblioteca.ProblemasClassicos.Classicos.removerDuplicados(cadeia(1, 2, 1, 3, 2))), 1, 2, 3);
                    seq(itens(Biblioteca.ProblemasClassicos.Classicos.particionarEstavel(cadeia(4, 1, 5, 2, 3), 3)), 1, 2, 4, 5, 3);
                    Biblioteca.Base.Fila<Integer> f = fila(1, 2, 3, 4, 5); Biblioteca.ProblemasClassicos.Classicos.inverterPrimeiros(f, 3); seq(f.toArray(), 3, 2, 1, 4, 5);
                    igual(3, Biblioteca.ProblemasClassicos.Classicos.josephus(7, 3), "Josephus");
                    ints(new int[]{5, 5, -1, -1}, Biblioteca.ProblemasClassicos.Classicos.proximosMaiores(new int[]{4, 2, 5, 3}));
                    ok(Biblioteca.ProblemasClassicos.Classicos.sequenciaDesempilhavel(new int[]{1, 2, 3}, new int[]{2, 3, 1}), "Saida possivel");
                    ok(!Biblioteca.ProblemasClassicos.Classicos.sequenciaDesempilhavel(new int[]{1, 2, 3}, new int[]{3, 1, 2}), "Saida impossivel");
                    Biblioteca.ProblemasClassicos.PilhaMinima<Integer> p = new Biblioteca.ProblemasClassicos.PilhaMinima<>(); p.empilhar(3); p.empilhar(1); p.empilhar(1);
                    igual(1, p.minimo(), "Minimo"); p.desempilhar(); igual(1, p.minimo(), "Minimo repetido"); p.desempilhar(); igual(3, p.minimo(), "Minimo anterior");
                    Biblioteca.Base.Celula<Integer> h = cadeia(1, 2, 3, 2);
                    igual(2, Biblioteca.Variacoes.ModelosRecursivos.contarSe(h, x -> x % 2 == 0), "Rec contarSe");
                    igual(8.0, Biblioteca.Variacoes.ModelosRecursivos.somar(h, x -> x.doubleValue()), "Rec soma");
                    ok(Biblioteca.Variacoes.ModelosRecursivos.algum(h, x -> x == 3), "Algum");
                    ok(!Biblioteca.Variacoes.ModelosRecursivos.todos(h, x -> x < 3), "Todos");
                    ok(Biblioteca.Variacoes.ModelosRecursivos.todos(null, (Integer x) -> false), "Todos vazio");
                    ok(!Biblioteca.Variacoes.ModelosRecursivos.algum(null, (Integer x) -> true), "Algum vazio");
                    igual(1, Biblioteca.Variacoes.ModelosRecursivos.indiceOuMenosUm(h, 2), "Indice");
                    igual(-1, Biblioteca.Variacoes.ModelosRecursivos.indiceOuMenosUm(h, 9), "Ausencia");
                    igual(3, Biblioteca.Variacoes.ModelosRecursivos.ultimoIndice(h, 2), "Ultimo indice");
                    Biblioteca.Base.Celula<Integer> cp = Biblioteca.Variacoes.ModelosRecursivos.copiarNos(h);
                    seq(itens(cp), 1, 2, 3, 2); ok(cp != h && cp.getProximo() != h.getProximo(), "Nos copiados");
                    seq(itens(Biblioteca.Variacoes.ModelosRecursivos.filtrarNos(h, x -> x % 2 == 0)), 2, 2);
                    seq(itens(Biblioteca.Variacoes.ModelosRecursivos.removerTodosNos(cp, 2)), 1, 3); seq(itens(h), 1, 2, 3, 2);
                    seq(Biblioteca.Variacoes.ModelosRecursivos.copiarInvertido(h).toArray(), 2, 3, 2, 1);
                    Biblioteca.Base.Celula<Biblioteca.Aplicacao.PedidoDemo> original = new Biblioteca.Base.Celula<>(new Biblioteca.Aplicacao.PedidoDemo(9, 100));
                    Biblioteca.Base.Celula<Biblioteca.Aplicacao.PedidoDemo> novo = Biblioteca.Variacoes.ModelosRecursivos.copiarComFuncao(original, x -> new Biblioteca.Aplicacao.PedidoDemo(x.getId(), x.valorFinal()));
                    ok(original != novo && original.getItem() != novo.getItem(), "Copia de item");
                }
                private static void testarVariantes() {
                    Biblioteca.Variacoes.FilaCircular<Integer> f = new Biblioteca.Variacoes.FilaCircular<>(3);
                    f.enfileirar(1); f.enfileirar(2); f.enfileirar(3); ok(f.cheia(), "Circular cheia");
                    erro(IllegalStateException.class, () -> f.enfileirar(4));
                    igual(1, f.desenfileirar(), "Circular retira"); f.enfileirar(4); igual(3, f.tamanho(), "Modulo");
                    igual(2, f.desenfileirar(), "Circular2"); igual(3, f.desenfileirar(), "Circular3"); igual(4, f.desenfileirar(), "Circular4"); ok(f.vazia(), "Circular vazia");
                    Biblioteca.Variacoes.PilhaVetor<Integer> p = new Biblioteca.Variacoes.PilhaVetor<>(1); p.empilhar(9);
                    erro(IllegalStateException.class, () -> p.empilhar(10)); igual(9, p.desempilhar(), "Pilha vetor");
                    Biblioteca.Variacoes.FilaSemSentinela<Integer> q = new Biblioteca.Variacoes.FilaSemSentinela<>(); q.enfileirar(1);
                    igual(1, q.desenfileirar(), "Sem sentinela"); q.enfileirar(2); igual(2, q.desenfileirar(), "Sem reuso");
                    Biblioteca.Variacoes.PilhaSemSentinela<Integer> r = new Biblioteca.Variacoes.PilhaSemSentinela<>(); r.empilhar(1);
                    igual(1, r.desempilhar(), "Pilha sem sentinela"); ok(r.vazia(), "Sem vazia");
                }
                public static void main(String[] args) throws Exception {
                    testarFilas(); testarPilhas(); testarListas(); testarRevisao(); testarDuplas();
                    testarOrdenacoes(); testarClassicosEModelos(); testarVariantes();
                    System.out.println("OK: " + verificacoes + " verificacoes passaram.");
                    System.out.println("Testes incluem vazio, unidade, duplicatas, limites, alias, preservacao e identidade de celulas.");
                }
            }
            // endregion [F211]
        }
        public static final class ProblemasClassicos {
            // ============================================================================
            // region [F205] src/aed/classicos/Classicos.java
            // BUSCA: Classicos
            // ORIGEM_NO_ACERVO: src/aed/classicos/Classicos.java
            // ============================================================================
            /** Fontes e adaptacoes: pasta 09_FONTES_E_VALIDACAO. Solucoes autorais. */
            public static final class Classicos {
                private Classicos() { }
                public static boolean delimitadoresBalanceados(String texto) {
                    if (texto == null) throw new IllegalArgumentException("Texto nulo");
                    Biblioteca.Base.Pilha<Character> p = new Biblioteca.Base.Pilha<>();
                    for (int i = 0; i < texto.length(); i++) {
                        char c = texto.charAt(i);
                        if (c == '(' || c == '[' || c == '{') p.empilhar(c);
                        else if (c == ')' || c == ']' || c == '}') {
                            if (p.vazia()) return false;
                            char a = p.desempilhar();
                            if ((c == ')' && a != '(') || (c == ']' && a != '[') || (c == '}' && a != '{')) return false;
                        }
                    }
                    return p.vazia();
                }
                /** Tokens separados por espacos. O primeiro pop e o operando DIREITO. */
                public static double avaliarPosfixa(String expressao) {
                    if (expressao == null || expressao.trim().isEmpty()) throw new IllegalArgumentException("Expressao vazia");
                    Biblioteca.Base.Pilha<Double> p = new Biblioteca.Base.Pilha<>();
                    for (String token : expressao.trim().split("\\s+")) {
                        if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                            if (p.vazia()) throw new IllegalArgumentException("Falta operando");
                            double b = p.desempilhar();
                            if (p.vazia()) throw new IllegalArgumentException("Falta operando");
                            double a = p.desempilhar();
                            if (token.equals("+")) p.empilhar(a + b);
                            else if (token.equals("-")) p.empilhar(a - b);
                            else if (token.equals("*")) p.empilhar(a * b);
                            else { if (b == 0) throw new ArithmeticException("Divisao por zero"); p.empilhar(a / b); }
                        } else p.empilhar(Double.parseDouble(token));
                    }
                    if (p.vazia()) throw new IllegalArgumentException("Sem resultado");
                    double r = p.desempilhar();
                    if (!p.vazia()) throw new IllegalArgumentException("Operandos sobrando");
                    return r;
                }
                public static String binario(int n) {
                    if (n < 0) throw new IllegalArgumentException("Numero negativo");
                    if (n == 0) return "0";
                    Biblioteca.Base.Pilha<Integer> p = new Biblioteca.Base.Pilha<>();
                    while (n > 0) { p.empilhar(n % 2); n /= 2; }
                    StringBuilder s = new StringBuilder();
                    while (!p.vazia()) s.append(p.desempilhar());
                    return s.toString();
                }
                /** Politica explicita: ignora caixa, espacos, pontuacao e marcas de acento. */
                public static boolean palindromo(String texto) {
                    if (texto == null) throw new IllegalArgumentException("Texto nulo");
                    String s = Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{M}+", "").toLowerCase(Locale.ROOT);
                    Biblioteca.Base.Pilha<Integer> p = new Biblioteca.Base.Pilha<>(); Biblioteca.Base.Fila<Integer> f = new Biblioteca.Base.Fila<>();
                    for (int i = 0; i < s.length();) {
                        int c = s.codePointAt(i); i += Character.charCount(c);
                        if (Character.isLetterOrDigit(c)) { p.empilhar(c); f.enfileirar(c); }
                    }
                    while (!f.vazia()) if (!f.desenfileirar().equals(p.desempilhar())) return false;
                    return true;
                }
                /** Cadeias SEM sentinela: devolver a nova cabeca nao atualiza seu objeto Lista. */
                public static <E> Biblioteca.Base.Celula<E> inverterLigacoes(Biblioteca.Base.Celula<E> atual) {
                    Biblioteca.Base.Celula<E> anterior = null;
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior); anterior = atual; atual = seguinte;
                    }
                    return anterior;
                }
                public static <E> Biblioteca.Base.Celula<E> inverterLigacoesRec(Biblioteca.Base.Celula<E> atual) {
                    if (atual == null || atual.getProximo() == null) return atual;
                    Biblioteca.Base.Celula<E> novaCabeca = inverterLigacoesRec(atual.getProximo());
                    atual.getProximo().setProximo(atual); atual.setProximo(null);
                    return novaCabeca;
                }
                public static <E> boolean temCiclo(Biblioteca.Base.Celula<E> inicio) {
                    Biblioteca.Base.Celula<E> lento = inicio, rapido = inicio;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                        if (lento == rapido) return true;
                    }
                    return false;
                }
                public static <E> Biblioteca.Base.Celula<E> inicioDoCiclo(Biblioteca.Base.Celula<E> inicio) {
                    Biblioteca.Base.Celula<E> lento = inicio, rapido = inicio;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                        if (lento == rapido) {
                            lento = inicio;
                            while (lento != rapido) { lento = lento.getProximo(); rapido = rapido.getProximo(); }
                            return lento;
                        }
                    }
                    return null;
                }
                /** Tamanho par: segunda celula central. */
                public static <E> Biblioteca.Base.Celula<E> meio(Biblioteca.Base.Celula<E> inicio) {
                    Biblioteca.Base.Celula<E> lento = inicio, rapido = inicio;
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo(); rapido = rapido.getProximo().getProximo();
                    }
                    return lento;
                }
                /** k=1 consulta o ultimo item. */
                public static <E> E kEsimoDoFim(Biblioteca.Base.Celula<E> inicio, int k) {
                    if (k <= 0) throw new IllegalArgumentException("k invalido");
                    Biblioteca.Base.Celula<E> rapido = inicio, lento = inicio;
                    for (int i = 0; i < k; i++) {
                        if (rapido == null) throw new IllegalArgumentException("k maior que tamanho");
                        rapido = rapido.getProximo();
                    }
                    while (rapido != null) { rapido = rapido.getProximo(); lento = lento.getProximo(); }
                    return lento.getItem();
                }
                public static <E> Biblioteca.Base.Celula<E> removerKEsimoDoFim(Biblioteca.Base.Celula<E> inicio, int k) {
                    if (k <= 0) throw new IllegalArgumentException("k invalido");
                    Biblioteca.Base.Celula<E> s = new Biblioteca.Base.Celula<>(null, inicio), rapido = s, lento = s;
                    for (int i = 0; i < k; i++) {
                        rapido = rapido.getProximo();
                        if (rapido == null) throw new IllegalArgumentException("k maior que tamanho");
                    }
                    while (rapido.getProximo() != null) { rapido = rapido.getProximo(); lento = lento.getProximo(); }
                    lento.setProximo(lento.getProximo().getProximo());
                    return s.getProximo();
                }
                /** Consome ligacoes. Entradas devem ser disjuntas e ordenadas. */
                public static <E extends Comparable<E>> Biblioteca.Base.Celula<E> intercalarNos(Biblioteca.Base.Celula<E> a, Biblioteca.Base.Celula<E> b) {
                    Biblioteca.Base.Celula<E> s = new Biblioteca.Base.Celula<>(), fim = s;
                    while (a != null && b != null) {
                        if (a.getItem().compareTo(b.getItem()) <= 0) { fim.setProximo(a); a = a.getProximo(); }
                        else { fim.setProximo(b); b = b.getProximo(); }
                        fim = fim.getProximo();
                    }
                    fim.setProximo(a != null ? a : b);
                    return s.getProximo();
                }
                public static <E> Biblioteca.Base.Celula<E> removerDuplicadosOrdenados(Biblioteca.Base.Celula<E> inicio) {
                    Biblioteca.Base.Celula<E> p = inicio;
                    while (p != null && p.getProximo() != null) {
                        if (p.getItem().equals(p.getProximo().getItem())) p.setProximo(p.getProximo().getProximo());
                        else p = p.getProximo();
                    }
                    return inicio;
                }
                public static <E> Biblioteca.Base.Celula<E> removerDuplicados(Biblioteca.Base.Celula<E> inicio) {
                    for (Biblioteca.Base.Celula<E> p = inicio; p != null; p = p.getProximo()) {
                        Biblioteca.Base.Celula<E> anterior = p;
                        while (anterior.getProximo() != null) {
                            if (p.getItem().equals(anterior.getProximo().getItem())) anterior.setProximo(anterior.getProximo().getProximo());
                            else anterior = anterior.getProximo();
                        }
                    }
                    return inicio;
                }
                public static <E extends Comparable<E>> Biblioteca.Base.Celula<E> particionarEstavel(Biblioteca.Base.Celula<E> inicio, E limite) {
                    Biblioteca.Base.Celula<E> s1 = new Biblioteca.Base.Celula<>(), s2 = new Biblioteca.Base.Celula<>(), f1 = s1, f2 = s2;
                    for (Biblioteca.Base.Celula<E> atual = inicio; atual != null;) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo(); atual.setProximo(null);
                        if (atual.getItem().compareTo(limite) < 0) { f1.setProximo(atual); f1 = atual; }
                        else { f2.setProximo(atual); f2 = atual; }
                        atual = seguinte;
                    }
                    f1.setProximo(s2.getProximo()); return s1.getProximo();
                }
                public static <E> void inverterPrimeiros(Biblioteca.Base.Fila<E> fila, int k) {
                    int n = fila.tamanho();
                    if (k < 0 || k > n) throw new IllegalArgumentException("k invalido");
                    Biblioteca.Base.Pilha<E> p = new Biblioteca.Base.Pilha<>();
                    for (int i = 0; i < k; i++) p.empilhar(fila.desenfileirar());
                    while (!p.vazia()) fila.enfileirar(p.desempilhar());
                    for (int i = 0; i < n - k; i++) fila.enfileirar(fila.desenfileirar());
                }
                /** Pessoas 0..n-1; retorna sobrevivente. */
                public static int josephus(int n, int m) {
                    if (n <= 0 || m <= 0) throw new IllegalArgumentException();
                    Biblioteca.Base.Fila<Integer> f = new Biblioteca.Base.Fila<>();
                    for (int i = 0; i < n; i++) f.enfileirar(i);
                    for (int restam = n; restam > 1; restam--) {
                        int passos = (m - 1) % restam;
                        for (int i = 0; i < passos; i++) f.enfileirar(f.desenfileirar());
                        f.desenfileirar();
                    }
                    return f.desenfileirar();
                }
                public static int[] proximosMaiores(int[] a) {
                    int[] resultado = new int[a.length]; Biblioteca.Base.Pilha<Integer> indices = new Biblioteca.Base.Pilha<>();
                    for (int i = 0; i < a.length; i++) {
                        resultado[i] = -1;
                        while (!indices.vazia() && a[i] > a[indices.consultarTopo()]) resultado[indices.desempilhar()] = a[i];
                        indices.empilhar(i);
                    }
                    return resultado;
                }
                public static boolean sequenciaDesempilhavel(int[] entrada, int[] saida) {
                    if (entrada.length != saida.length) return false;
                    Biblioteca.Base.Pilha<Integer> p = new Biblioteca.Base.Pilha<>(); int j = 0;
                    for (int x : entrada) {
                        p.empilhar(x);
                        while (!p.vazia() && j < saida.length && p.consultarTopo() == saida[j]) { p.desempilhar(); j++; }
                    }
                    return j == saida.length;
                }
            }
            // endregion [F205]
            // ============================================================================
            // region [F206] src/aed/classicos/PilhaMinima.java
            // BUSCA: Pilha Minima
            // ORIGEM_NO_ACERVO: src/aed/classicos/PilhaMinima.java
            // ============================================================================
            public static class PilhaMinima<E extends Comparable<E>> {
                private final Biblioteca.Base.Pilha<E> dados = new Biblioteca.Base.Pilha<>();
                private final Biblioteca.Base.Pilha<E> minimos = new Biblioteca.Base.Pilha<>();
                public boolean vazia() { return dados.vazia(); }
                public void empilhar(E item) {
                    dados.empilhar(item);
                    if (minimos.vazia() || item.compareTo(minimos.consultarTopo()) <= 0) minimos.empilhar(item);
                }
                public E desempilhar() {
                    E item = dados.desempilhar();
                    if (item.compareTo(minimos.consultarTopo()) == 0) minimos.desempilhar();
                    return item;
                }
                public E consultarTopo() { return dados.consultarTopo(); }
                public E minimo() { return minimos.consultarTopo(); }
            }
            // endregion [F206]
        }
        public static final class Flexiveis {
            // ============================================================================
            // region [F207] src/aed/flexiveis/ListaOrdenada.java
            // BUSCA: Lista Ordenada
            // ORIGEM_NO_ACERVO: src/aed/flexiveis/ListaOrdenada.java
            // ============================================================================
            public static class ListaOrdenada<E extends Comparable<E>> {
                private final Biblioteca.Base.Celula<E> primeiro = new Biblioteca.Base.Celula<>();
                private Biblioteca.Base.Celula<E> ultimo = primeiro;
                private int tamanho;
                public void inserirEmOrdem(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> anterior = primeiro;
                    while (anterior.getProximo() != null && anterior.getProximo().getItem().compareTo(item) <= 0) anterior = anterior.getProximo();
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item, anterior.getProximo());
                    anterior.setProximo(nova); if (anterior == ultimo) ultimo = nova; tamanho++;
                }
                public Object[] toArray() {
                    Object[] a = new Object[tamanho]; int i = 0;
                    for (Biblioteca.Base.Celula<E> p = primeiro.getProximo(); p != null; p = p.getProximo()) a[i++] = p.getItem();
                    return a;
                }
            }
            // endregion [F207]
        }
        public static final class Ampliacoes {
            // ============================================================================
            // region [F188] src/aed/ampliacoes/AmpliacoesV2.java
            // BUSCA: Ampliacoes V2
            // ORIGEM_NO_ACERVO: src/aed/ampliacoes/AmpliacoesV2.java
            // ============================================================================
            /**
             * AMPLIACOES AUTORAIS V2. Nao sao novos enunciados dos PDFs.
             * BUSCA: V2_01 ate V2_36. Casos extras para adaptar, nao previsao de prova.
             *
             * CONTRATO GERAL DAS CADEIAS:
             * cabeca/atual apontam para o PRIMEIRO DADO, nunca para a sentinela.
             * Cadeias aciclicas. Celas validas armazenam itens nao nulos neste repertorio.
             * Quando o retorno e Celula<E>, ele pode ser uma NOVA CABECA: atribua o retorno!
             * Na classe da professora, religue inicio.setProximo(retorno) e atualize fim e
             * tamanho se uma operacao muda a cadeia. Os metodos abaixo nao conhecem esses
             * atributos da classe proprietaria. Veja GUIA_V2_03_ADOTAR_CABECA.
             *
             * Comparator e um complemento: se o enunciado exige compareTo, use compareTo.
             * Nao substitua uma assinatura fixa de questao por estas assinaturas extras.
             * Uma funcao recebida deve ser total para os itens e nao alterar a estrutura.
             * Salvo indicacao contraria, falhas lancadas por callbacks nao sao desfeitas.
             */
            public static final class AmpliacoesV2 {
                private AmpliacoesV2() { }

                private static void exigir(Object obj, String mensagem) {
                    if (obj == null) throw new IllegalArgumentException(mensagem);
                }

                // V2_01 | CONTAR RECURSIVAMENTE | tamanho quantidade return 1 +
                // Base: null -> 0. Cada chamada nao nula devolve 1 + tamanho do sufixo.
                // O(n) tempo, O(n) pilha de chamadas. Nao modifica nenhuma referencia.
                public static <E> int tamanhoRecursivo(Biblioteca.Base.Celula<E> atual) {
                    if (atual == null) return 0;
                    int tamanhoDoResto = tamanhoRecursivo(atual.getProximo());
                    return 1 + tamanhoDoResto;
                }

                // V2_02 | BUSCAR CELULA RECURSIVA | retornar no ou null
                // Retorna a propria celula encontrada, NAO uma copia, nem apenas seu item.
                // [10,20,30], alvo 20 -> referencia da segunda celula. Ausente -> null.
                public static <E> Biblioteca.Base.Celula<E> buscarCelulaRecursiva(Biblioteca.Base.Celula<E> atual, E alvo) {
                    if (atual == null) return null;
                    if (atual.getItem().equals(alvo)) return atual;
                    return buscarCelulaRecursiva(atual.getProximo(), alvo);
                }

                // V2_03 | PRIMEIRA POSICAO RECURSIVA | indice -1 nao encontrado
                // Nao faca 1 + (-1): isso viraria 0 e inventaria uma posicao existente.
                public static <E> int primeiroIndice(Biblioteca.Base.Celula<E> atual, E alvo) {
                    if (atual == null) return -1;
                    if (atual.getItem().equals(alvo)) return 0;
                    int indiceDoResto = primeiroIndice(atual.getProximo(), alvo);
                    if (indiceDoResto == -1) return -1;
                    return 1 + indiceDoResto;
                }

                // V2_04 | ULTIMA POSICAO RECURSIVA | ultima ocorrencia na volta
                // Priorize resultado do sufixo. So escolha atual se nao houve alvo depois.
                public static <E> int ultimoIndice(Biblioteca.Base.Celula<E> atual, E alvo) {
                    if (atual == null) return -1;
                    int indiceDoResto = ultimoIndice(atual.getProximo(), alvo);
                    if (indiceDoResto >= 0) return 1 + indiceDoResto;
                    if (atual.getItem().equals(alvo)) return 0;
                    return -1;
                }

                // V2_05 | OBTER POSICAO RECURSIVA | retorno E pos - 1
                // Posicao e relativa a atual; indice 0 significa item da propria atual.
                public static <E> E obterPosicao(Biblioteca.Base.Celula<E> atual, int posicao) {
                    if (posicao < 0 || atual == null) {
                        throw new IndexOutOfBoundsException("Posicao inexistente");
                    }
                    if (posicao == 0) return atual.getItem();
                    return obterPosicao(atual.getProximo(), posicao - 1);
                }

                // V2_06 | MAIOR RECURSIVO COM COMPARATOR | negativo empate primeiro
                // Nunca use 0 como maior inicial: todos os numeros podem ser negativos.
                // Empate: escolhe o primeiro item. Retorna objeto E, nao sua chave.
                public static <E> E maiorRecursivo(Biblioteca.Base.Celula<E> atual, Comparator<E> ordem) {
                    exigir(ordem, "Comparador nulo");
                    if (atual == null) throw new NoSuchElementException("Cadeia vazia");
                    if (atual.getProximo() == null) return atual.getItem();
                    E maiorDoResto = maiorRecursivo(atual.getProximo(), ordem);
                    if (ordem.compare(atual.getItem(), maiorDoResto) >= 0) {
                        return atual.getItem();
                    }
                    return maiorDoResto;
                }

                // V2_07 | COPIAR CADEIA RECURSIVA | copia rasa nos diferentes itens iguais
                // Novas celulas; os objetos E permanecem compartilhados com a fonte.
                public static <E> Biblioteca.Base.Celula<E> copiarCadeia(Biblioteca.Base.Celula<E> atual) {
                    if (atual == null) return null;
                    Biblioteca.Base.Celula<E> copiaAtual = new Biblioteca.Base.Celula<>(atual.getItem());
                    copiaAtual.setProximo(copiarCadeia(atual.getProximo()));
                    return copiaAtual;
                }

                // V2_08 | REMOVER PREDICATE RECURSIVO | devolver cabeca religar na volta
                // Destrutivo: reaproveita nos sobreviventes. Nao cria celulas novas.
                // Predicate avaliado na ida; religacao feita na volta. O(n) stack.
                public static <E> Biblioteca.Base.Celula<E> removerSeRecursivo(
                        Biblioteca.Base.Celula<E> atual, Predicate<E> condicao) {
                    exigir(condicao, "Condicao nula");
                    if (atual == null) return null;
                    boolean remover = condicao.test(atual.getItem());
                    Biblioteca.Base.Celula<E> resto = removerSeRecursivo(atual.getProximo(), condicao);
                    if (remover) {
                        atual.setProximo(null);
                        return resto;
                    }
                    atual.setProximo(resto);
                    return atual;
                }

                private static <E> int comprimento(Biblioteca.Base.Celula<E> cabeca) {
                    int n = 0;
                    for (Biblioteca.Base.Celula<E> p = cabeca; p != null; p = p.getProximo()) n++;
                    return n;
                }

                private static <E> Biblioteca.Base.Celula<E> celulaEm(Biblioteca.Base.Celula<E> cabeca, int posicao) {
                    Biblioteca.Base.Celula<E> p = cabeca;
                    for (int i = 0; i < posicao; i++) p = p.getProximo();
                    return p;
                }

                private static void validarIntervalo(int inicio, int fimExclusivo, int tamanho) {
                    if (inicio < 0 || fimExclusivo < inicio || fimExclusivo > tamanho) {
                        throw new IndexOutOfBoundsException("Intervalo invalido");
                    }
                }

                // V2_09 | COPIAR INTERVALO | sublista subfila [inicio, fimExclusivo)
                // [10,20,30,40], (1,3) -> [20,30]. (n,n) -> vazia.
                // Valida antes; fonte intacta. O(n + k) tempo, O(k) novas celulas.
                public static <E> Biblioteca.Base.Fila<E> copiarIntervalo(
                        Biblioteca.Base.Celula<E> cabeca, int inicio, int fimExclusivo) {
                    validarIntervalo(inicio, fimExclusivo, comprimento(cabeca));
                    Biblioteca.Base.Fila<E> resultado = new Biblioteca.Base.Fila<>();
                    Biblioteca.Base.Celula<E> p = celulaEm(cabeca, inicio);
                    for (int i = inicio; i < fimExclusivo; i++) {
                        resultado.enfileirar(p.getItem());
                        p = p.getProximo();
                    }
                    return resultado;
                }

                // V2_10 | INVERTER INTERVALO | religar nos sem criar [inicio,fimExclusivo)
                // [1,2,3,4,5], (1,4) -> [1,4,3,2,5]. Itens final nao impedem a inversao.
                // Intervalo vazio/unitario nao muda nada. Memoria auxiliar O(1).
                public static <E> Biblioteca.Base.Celula<E> inverterIntervalo(
                        Biblioteca.Base.Celula<E> cabeca, int inicio, int fimExclusivo) {
                    validarIntervalo(inicio, fimExclusivo, comprimento(cabeca));
                    if (fimExclusivo - inicio < 2) return cabeca;
                    Biblioteca.Base.Celula<E> antes = inicio == 0 ? null : celulaEm(cabeca, inicio - 1);
                    Biblioteca.Base.Celula<E> primeiroTrecho = antes == null ? cabeca : antes.getProximo();
                    Biblioteca.Base.Celula<E> atual = primeiroTrecho;
                    Biblioteca.Base.Celula<E> anterior = null;
                    for (int i = inicio; i < fimExclusivo; i++) {
                        Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                        atual.setProximo(anterior);
                        anterior = atual;
                        atual = seguinte;
                    }
                    primeiroTrecho.setProximo(atual);
                    if (antes == null) cabeca = anterior;
                    else antes.setProximo(anterior);
                    return cabeca;
                }

                // V2_11 | INVERTER GRUPOS DE K | blocos completos ultimo incompleto
                // [1,2,3,4,5], k=2 -> [2,1,4,3,5]. Nao inverte bloco incompleto.
                // O(n) tempo, O(1) extra, reaproveita TODAS as celulas.
                public static <E> Biblioteca.Base.Celula<E> inverterGrupos(Biblioteca.Base.Celula<E> cabeca, int k) {
                    if (k <= 0) throw new IllegalArgumentException("k deve ser positivo");
                    if (k == 1) return cabeca;
                    Biblioteca.Base.Celula<E> novaCabeca = cabeca;
                    Biblioteca.Base.Celula<E> fimAnterior = null;
                    Biblioteca.Base.Celula<E> atual = cabeca;
                    while (atual != null) {
                        Biblioteca.Base.Celula<E> depois = atual;
                        int encontrados = 0;
                        while (encontrados < k && depois != null) {
                            depois = depois.getProximo();
                            encontrados++;
                        }
                        if (encontrados < k) break;
                        Biblioteca.Base.Celula<E> antigoInicio = atual;
                        Biblioteca.Base.Celula<E> anterior = depois;
                        for (int i = 0; i < k; i++) {
                            Biblioteca.Base.Celula<E> seguinte = atual.getProximo();
                            atual.setProximo(anterior);
                            anterior = atual;
                            atual = seguinte;
                        }
                        if (fimAnterior == null) novaCabeca = anterior;
                        else fimAnterior.setProximo(anterior);
                        fimAnterior = antigoInicio;
                    }
                    return novaCabeca;
                }

                // V2_12 | TROCAR DUAS CELULAS POR POSICAO | adjacentes nao adjacentes
                // Nao troca item; funciona quando Celula.item e final. O(n), O(1) extra.
                // Indices comecam em zero. Indices iguais sao uma operacao sem efeito.
                public static <E> Biblioteca.Base.Celula<E> trocarNos(Biblioteca.Base.Celula<E> cabeca, int i, int j) {
                    int n = comprimento(cabeca);
                    if (i < 0 || j < 0 || i >= n || j >= n) {
                        throw new IndexOutOfBoundsException("Posicao inexistente");
                    }
                    if (i == j) return cabeca;
                    if (i > j) { int t = i; i = j; j = t; }
                    Biblioteca.Base.Celula<E> antesA = i == 0 ? null : celulaEm(cabeca, i - 1);
                    Biblioteca.Base.Celula<E> a = antesA == null ? cabeca : antesA.getProximo();
                    Biblioteca.Base.Celula<E> antesB = celulaEm(cabeca, j - 1);
                    Biblioteca.Base.Celula<E> b = antesB.getProximo();
                    Biblioteca.Base.Celula<E> depoisB = b.getProximo();
                    if (a.getProximo() == b) {
                        a.setProximo(depoisB);
                        b.setProximo(a);
                    } else {
                        Biblioteca.Base.Celula<E> depoisA = a.getProximo();
                        antesB.setProximo(a);
                        a.setProximo(depoisB);
                        b.setProximo(depoisA);
                    }
                    if (antesA == null) cabeca = b;
                    else antesA.setProximo(b);
                    return cabeca;
                }

                // V2_13 | REMOVER ULTIMA OCORRENCIA | igualdade equals guardar anterior
                // Ausente: retorna a mesma cabeca, sem modificar. O(n) / O(1).
                public static <E> Biblioteca.Base.Celula<E> removerUltimaOcorrencia(Biblioteca.Base.Celula<E> cabeca, E alvo) {
                    Biblioteca.Base.Celula<E> anterior = null;
                    Biblioteca.Base.Celula<E> antesDaUltima = null;
                    Biblioteca.Base.Celula<E> ultima = null;
                    for (Biblioteca.Base.Celula<E> p = cabeca; p != null; p = p.getProximo()) {
                        if (p.getItem().equals(alvo)) {
                            antesDaUltima = anterior;
                            ultima = p;
                        }
                        anterior = p;
                    }
                    if (ultima == null) return cabeca;
                    if (antesDaUltima == null) cabeca = ultima.getProximo();
                    else antesDaUltima.setProximo(ultima.getProximo());
                    ultima.setProximo(null);
                    return cabeca;
                }

                // V2_14 | MOVER CELULA PARA FINAL | retirar e religar sem copiar item
                // [1,2,3], pos=0 -> [2,3,1]. Mover ultimo/unitaria nao muda a cadeia.
                public static <E> Biblioteca.Base.Celula<E> moverParaFinal(Biblioteca.Base.Celula<E> cabeca, int posicao) {
                    int n = comprimento(cabeca);
                    if (posicao < 0 || posicao >= n) throw new IndexOutOfBoundsException();
                    if (posicao == n - 1) return cabeca;
                    Biblioteca.Base.Celula<E> fim = celulaEm(cabeca, n - 1);
                    Biblioteca.Base.Celula<E> anterior = posicao == 0 ? null : celulaEm(cabeca, posicao - 1);
                    Biblioteca.Base.Celula<E> movida = anterior == null ? cabeca : anterior.getProximo();
                    if (anterior == null) cabeca = movida.getProximo();
                    else anterior.setProximo(movida.getProximo());
                    movida.setProximo(null);
                    fim.setProximo(movida);
                    return cabeca;
                }

                // V2_15 | INTERCALAR ORDENADAS REAPROVEITANDO | merge estavel
                // PRE: duas cadeias crescentes e SEM celulas em comum. Consome suas ligacoes.
                // Em empate, escolhe a. O(n+m), O(1) extra. Nao cria sentinela auxiliar.
                public static <E> Biblioteca.Base.Celula<E> intercalarNos(
                        Biblioteca.Base.Celula<E> a, Biblioteca.Base.Celula<E> b, Comparator<E> ordem) {
                    exigir(ordem, "Comparador nulo");
                    Biblioteca.Base.Celula<E> cabeca = null;
                    Biblioteca.Base.Celula<E> fim = null;
                    while (a != null && b != null) {
                        Biblioteca.Base.Celula<E> escolhido;
                        if (ordem.compare(a.getItem(), b.getItem()) <= 0) {
                            escolhido = a;
                            a = a.getProximo();
                        } else {
                            escolhido = b;
                            b = b.getProximo();
                        }
                        if (cabeca == null) cabeca = escolhido;
                        else fim.setProximo(escolhido);
                        fim = escolhido;
                    }
                    Biblioteca.Base.Celula<E> resto = a != null ? a : b;
                    if (fim == null) return resto;
                    fim.setProximo(resto);
                    return cabeca;
                }

                // V2_16 | MERGESORT NOS SEM COPIAR | ordenar religando comparator
                // Nao e a solucao literal de R23: R23 exige dividirAoMeio/intercalarOrdenadas.
                // Esta variante rearranja nos existentes. O(n log n), O(log n) stack.
                // A intercalacao e iterativa; uma intercalacao recursiva gastaria O(n) stack.
                public static <E> Biblioteca.Base.Celula<E> mergeSortNos(Biblioteca.Base.Celula<E> cabeca, Comparator<E> ordem) {
                    exigir(ordem, "Comparador nulo");
                    if (cabeca == null || cabeca.getProximo() == null) return cabeca;
                    Biblioteca.Base.Celula<E> lento = cabeca;
                    Biblioteca.Base.Celula<E> rapido = cabeca.getProximo();
                    while (rapido != null && rapido.getProximo() != null) {
                        lento = lento.getProximo();
                        rapido = rapido.getProximo().getProximo();
                    }
                    Biblioteca.Base.Celula<E> direita = lento.getProximo();
                    lento.setProximo(null);
                    Biblioteca.Base.Celula<E> esquerdaOrdenada = mergeSortNos(cabeca, ordem);
                    Biblioteca.Base.Celula<E> direitaOrdenada = mergeSortNos(direita, ordem);
                    return intercalarNos(esquerdaOrdenada, direitaOrdenada, ordem);
                }

                // V2_17 | INTERSECAO POR IDENTIDADE | mesmo no nao apenas item igual
                // Duas cadeias aciclicas podem compartilhar um sufixo. Usa == entre CELULAS.
                // [1]->C->[3] e [2]->C->[3] -> C. Itens iguais em nos distintos -> null.
                public static <E> Biblioteca.Base.Celula<E> intersecaoPorIdentidade(Biblioteca.Base.Celula<E> a, Biblioteca.Base.Celula<E> b) {
                    int na = comprimento(a);
                    int nb = comprimento(b);
                    while (na > nb) { a = a.getProximo(); na--; }
                    while (nb > na) { b = b.getProximo(); nb--; }
                    while (a != b) {
                        a = a.getProximo();
                        b = b.getProximo();
                    }
                    return a;
                }

                // V2_18 | VERIFICAR ORDENACAO | crescente igualdade permitida
                // Vazia/unitaria sao ordenadas. Nao basta comparar primeiro com ultimo.
                public static <E> boolean estaOrdenada(Biblioteca.Base.Celula<E> atual, Comparator<E> ordem) {
                    exigir(ordem, "Comparador nulo");
                    if (atual == null) return true;
                    while (atual.getProximo() != null) {
                        if (ordem.compare(atual.getItem(), atual.getProximo().getItem()) > 0) {
                            return false;
                        }
                        atual = atual.getProximo();
                    }
                    return true;
                }

                // V2_19 | COPIAR ENTRE ALVOS | primeiro inicio ate proximo fim excluidos
                // [1,2,3,4,5], alvos 2/5 -> [3,4]. Inicio/fim consecutivos -> vazia.
                // Procura fim SOMENTE depois do inicio. Ausencia de qualquer limite: excecao.
                // Alvos iguais: utiliza duas ocorrencias distintas. Fonte nao e alterada.
                public static <E> Biblioteca.Base.Fila<E> copiarEntreAlvos(
                        Biblioteca.Base.Celula<E> cabeca, E alvoInicio, E alvoFim) {
                    Biblioteca.Base.Celula<E> p = buscarCelulaRecursiva(cabeca, alvoInicio);
                    if (p == null) throw new NoSuchElementException("Alvo inicial ausente");
                    p = p.getProximo();
                    Biblioteca.Base.Fila<E> resultado = new Biblioteca.Base.Fila<>();
                    while (p != null && !p.getItem().equals(alvoFim)) {
                        resultado.enfileirar(p.getItem());
                        p = p.getProximo();
                    }
                    if (p == null) throw new NoSuchElementException("Alvo final ausente");
                    return resultado;
                }

                // V2_20 | COPIAR DEPOIS DA ULTIMA OCORRENCIA | sufixo alvo excluido
                // [1,2,3,2,4], alvo 2 -> [4]. Alvo no fim -> vazia. Ausente -> excecao.
                public static <E> Biblioteca.Base.Fila<E> copiarDepoisUltimo(Biblioteca.Base.Celula<E> cabeca, E alvo) {
                    Biblioteca.Base.Celula<E> ultima = null;
                    for (Biblioteca.Base.Celula<E> p = cabeca; p != null; p = p.getProximo()) {
                        if (p.getItem().equals(alvo)) ultima = p;
                    }
                    if (ultima == null) throw new NoSuchElementException("Alvo ausente");
                    Biblioteca.Base.Fila<E> resultado = new Biblioteca.Base.Fila<>();
                    for (Biblioteca.Base.Celula<E> p = ultima.getProximo(); p != null; p = p.getProximo()) {
                        resultado.enfileirar(p.getItem());
                    }
                    return resultado;
                }

                public static final class Particao<E> {
                    public final Biblioteca.Base.Fila<E> aprovados = new Biblioteca.Base.Fila<>();
                    public final Biblioteca.Base.Fila<E> rejeitados = new Biblioteca.Base.Fila<>();
                }

                // V2_21 | SEPARAR EM DUAS FILAS | particionar estavel preservando original
                // Usa copiar() da biblioteca DESTE repertorio. Itens E nao sao clonados.
                public static <E> Particao<E> separarPreservando(Biblioteca.Base.Fila<E> fonte, Predicate<E> condicao) {
                    exigir(fonte, "Fila nula");
                    exigir(condicao, "Condicao nula");
                    Biblioteca.Base.Fila<E> copia = fonte.copiar();
                    Particao<E> resultado = new Particao<>();
                    while (!copia.vazia()) {
                        E item = copia.desenfileirar();
                        if (condicao.test(item)) resultado.aprovados.enfileirar(item);
                        else resultado.rejeitados.enfileirar(item);
                    }
                    return resultado;
                }

                // V2_22 | EXTRAIR SE | remover aprovados manter rejeitados em ordem
                // Processa exatamente n ORIGINAIS; nao use while(!fila.vazia()) reenfileirando.
                // Resultado retira os aprovados. Rejeitados ficam na fonte, na ordem original.
                // Recria celulas via API; nao serve para enunciado "nao criar novas celulas".
                public static <E> Biblioteca.Base.Fila<E> extrairSe(Biblioteca.Base.Fila<E> fonte, Predicate<E> condicao) {
                    exigir(fonte, "Fila nula");
                    exigir(condicao, "Condicao nula");
                    int n = fonte.tamanho();
                    Biblioteca.Base.Fila<E> resultado = new Biblioteca.Base.Fila<>();
                    for (int i = 0; i < n; i++) {
                        E item = fonte.desenfileirar();
                        if (condicao.test(item)) resultado.enfileirar(item);
                        else fonte.enfileirar(item);
                    }
                    return resultado;
                }

                // V2_23 | COPIAR PRIMEIROS VIA API | restaurar ordem apos rotacao
                // Le somente APIs publicas, usa tamanho() disponivel no repertorio.
                // No final mesmos itens/ordem; identidade das CELULAS pode ser diferente.
                public static <E> Biblioteca.Base.Fila<E> copiarPrimeirosViaAPI(Biblioteca.Base.Fila<E> fonte, int quantidade) {
                    exigir(fonte, "Fila nula");
                    int n = fonte.tamanho();
                    if (quantidade < 0 || quantidade > n) throw new IllegalArgumentException();
                    Biblioteca.Base.Fila<E> resultado = new Biblioteca.Base.Fila<>();
                    for (int i = 0; i < n; i++) {
                        E item = fonte.desenfileirar();
                        fonte.enfileirar(item);
                        if (i < quantidade) resultado.enfileirar(item);
                    }
                    return resultado;
                }

                // V2_24 | REMOVER CADA K ELEMENTOS | posicoes originais contagem desde 1
                // [10,20,30,40,50], k=2 -> retirados [20,40], fonte [10,30,50].
                // Nao e Josephus: nao reinicia contando circularmente entre sobreviventes.
                public static <E> Biblioteca.Base.Fila<E> removerCadaK(Biblioteca.Base.Fila<E> fonte, int k) {
                    exigir(fonte, "Fila nula");
                    if (k <= 0) throw new IllegalArgumentException("k deve ser positivo");
                    int n = fonte.tamanho();
                    Biblioteca.Base.Fila<E> resultado = new Biblioteca.Base.Fila<>();
                    for (int i = 1; i <= n; i++) {
                        E item = fonte.desenfileirar();
                        if (i % k == 0) resultado.enfileirar(item);
                        else fonte.enfileirar(item);
                    }
                    return resultado;
                }

                // V2_25 | ROTACIONAR FILA | primeiros k para final por metodos publicos
                // [A,B,C,D], k=2 -> [C,D,A,B]. Contrato: 0 <= k <= tamanho.
                // Usa celulas novas em enfileirar. R07 pede religar lista SEM essa abordagem.
                public static <E> void rotacionarFila(Biblioteca.Base.Fila<E> fila, int k) {
                    exigir(fila, "Fila nula");
                    if (k < 0 || k > fila.tamanho()) throw new IllegalArgumentException();
                    for (int i = 0; i < k; i++) fila.enfileirar(fila.desenfileirar());
                }

                // V2_26 | PRIMEIROS K APROVADOS | diferente de primeiros K EXAMINADOS
                // [1,2,3,4], pares, k=2 -> [2,4], examinando 4 itens.
                // Se houver menos aprovados, lanca excecao; fonte preservada.
                public static <E> Biblioteca.Base.Fila<E> primeirosKAprovados(
                        Biblioteca.Base.Fila<E> fonte, Predicate<E> condicao, int quantidade) {
                    exigir(fonte, "Fila nula");
                    exigir(condicao, "Condicao nula");
                    if (quantidade < 0) throw new IllegalArgumentException();
                    Biblioteca.Base.Fila<E> copia = fonte.copiar();
                    Biblioteca.Base.Fila<E> resultado = new Biblioteca.Base.Fila<>();
                    int aprovados = 0;
                    while (aprovados < quantidade && !copia.vazia()) {
                        E item = copia.desenfileirar();
                        if (condicao.test(item)) {
                            resultado.enfileirar(item);
                            aprovados++;
                        }
                    }
                    if (aprovados < quantidade) throw new NoSuchElementException("Aprovados insuficientes");
                    return resultado;
                }

                // V2_27 | MESCLAR EM BLOCOS | k de A depois k de B preservar ambas
                // A=[1,2,3], B=[8,9,10], k=2 -> [1,2,8,9,3,10].
                // k=1 e mesclagem alternada. Sobras entram no final. Mesma fonte e permitida.
                public static <E> Biblioteca.Base.Fila<E> mesclarEmBlocos(Biblioteca.Base.Fila<E> a, Biblioteca.Base.Fila<E> b, int k) {
                    exigir(a, "Fila A nula");
                    exigir(b, "Fila B nula");
                    if (k <= 0) throw new IllegalArgumentException();
                    Biblioteca.Base.Fila<E> ca = a.copiar();
                    Biblioteca.Base.Fila<E> cb = b.copiar();
                    Biblioteca.Base.Fila<E> resultado = new Biblioteca.Base.Fila<>();
                    while (!ca.vazia() || !cb.vazia()) {
                        for (int i = 0; i < k && !ca.vazia(); i++) resultado.enfileirar(ca.desenfileirar());
                        for (int i = 0; i < k && !cb.vazia(); i++) resultado.enfileirar(cb.desenfileirar());
                    }
                    return resultado;
                }

                // V2_28 | INSERIR NO FUNDO DA PILHA | recursao desfaz restaura
                // Nao usa campo fundo: fundo aqui significa ABAIXO DOS DADOS, nao sentinela.
                // [3,2,1] topo->base, inserir 0 -> [3,2,1,0]. O(n) tempo e stack.
                public static <E> void inserirNoFundo(Biblioteca.Base.Pilha<E> pilha, E item) {
                    exigir(pilha, "Pilha nula");
                    exigir(item, "Item nulo");
                    if (pilha.vazia()) {
                        pilha.empilhar(item);
                        return;
                    }
                    E retirado = pilha.desempilhar();
                    inserirNoFundo(pilha, item);
                    pilha.empilhar(retirado);
                }

                // V2_29 | INVERTER PILHA SO RECURSAO | usa inserirNoFundo
                // [3,2,1] -> [1,2,3]. O(n^2), O(n) stack. Nao e O(n)!
                public static <E> void inverterPilhaRecursiva(Biblioteca.Base.Pilha<E> pilha) {
                    exigir(pilha, "Pilha nula");
                    if (pilha.vazia()) return;
                    E topoAntigo = pilha.desempilhar();
                    inverterPilhaRecursiva(pilha);
                    inserirNoFundo(pilha, topoAntigo);
                }

                // V2_30 | REMOVER FUNDO DA PILHA | retorna E restaura demais
                // [3,2,1] -> retorna 1, pilha [3,2]. Vazia -> excecao. O(n)/O(n).
                public static <E> E removerFundo(Biblioteca.Base.Pilha<E> pilha) {
                    exigir(pilha, "Pilha nula");
                    if (pilha.vazia()) throw new NoSuchElementException("Pilha vazia");
                    E item = pilha.desempilhar();
                    if (pilha.vazia()) return item;
                    E removido = removerFundo(pilha);
                    pilha.empilhar(item);
                    return removido;
                }

                // V2_31 | ORDENAR PILHA RECURSIVA | menor no topo comparator
                // [3,1,2] topo->base -> [1,2,3]. O(n^2) pior caso; O(n) stack.
                public static <E> void ordenarPilha(Biblioteca.Base.Pilha<E> pilha, Comparator<E> ordem) {
                    exigir(pilha, "Pilha nula");
                    exigir(ordem, "Comparador nulo");
                    if (pilha.vazia()) return;
                    E item = pilha.desempilhar();
                    ordenarPilha(pilha, ordem);
                    inserirNaPilhaOrdenada(pilha, item, ordem);
                }

                private static <E> void inserirNaPilhaOrdenada(Biblioteca.Base.Pilha<E> pilha, E item, Comparator<E> ordem) {
                    if (pilha.vazia() || ordem.compare(item, pilha.consultarTopo()) <= 0) {
                        pilha.empilhar(item);
                        return;
                    }
                    E retirado = pilha.desempilhar();
                    inserirNaPilhaOrdenada(pilha, item, ordem);
                    pilha.empilhar(retirado);
                }

                // V2_32 | MAPEAR FILA FUNCTION E R | transformar objetos nao filtrar
                // Fila<Pedido> + Function<Pedido,Double> -> Fila<Double>. Ordem preservada.
                // Uma saida para cada entrada. Nao aceita resultado nulo neste repertorio.
                public static <E, R> Biblioteca.Base.Fila<R> mapear(Biblioteca.Base.Fila<E> fonte, Function<E, R> funcao) {
                    exigir(fonte, "Fila nula");
                    exigir(funcao, "Funcao nula");
                    Biblioteca.Base.Fila<E> copia = fonte.copiar();
                    Biblioteca.Base.Fila<R> resultado = new Biblioteca.Base.Fila<>();
                    while (!copia.vazia()) {
                        R transformado = funcao.apply(copia.desenfileirar());
                        exigir(transformado, "Funcao retornou null");
                        resultado.enfileirar(transformado);
                    }
                    return resultado;
                }

                // V2_33 | REDUZIR FILA | acumulador BinaryOperator E E -> E
                // Exemplo: reduzir([1,2,3], 0, (a,b)->a+b) -> 6. Vazia -> identidade.
                // Funcao nao deve modificar os itens para preservar seus estados internos.
                public static <E> E reduzir(Biblioteca.Base.Fila<E> fonte, E identidade, BinaryOperator<E> operacao) {
                    exigir(fonte, "Fila nula");
                    exigir(identidade, "Identidade nula");
                    exigir(operacao, "Operacao nula");
                    E acumulado = identidade;
                    Biblioteca.Base.Fila<E> copia = fonte.copiar();
                    while (!copia.vazia()) {
                        acumulado = operacao.apply(acumulado, copia.desenfileirar());
                        exigir(acumulado, "Operacao retornou null");
                    }
                    return acumulado;
                }

                // V2_34 | MEDIA FILTRADA | Predicate + Function denominador aprovados
                // Analisa exatamente quantidade primeiros itens; soma so os aprovados.
                // Divide pelo numero de aprovados, NAO pela quantidade examinada.
                // Contrato adicional autoral: rejeita null, NaN e infinito; sem aprovados erra.
                public static <E> double mediaFiltrada(Biblioteca.Base.Fila<E> fonte, Predicate<E> condicao,
                        Function<E, Double> extrator, int quantidade) {
                    exigir(fonte, "Fila nula");
                    exigir(condicao, "Condicao nula");
                    exigir(extrator, "Extrator nulo");
                    if (quantidade <= 0 || quantidade > fonte.tamanho()) {
                        throw new IllegalArgumentException("Quantidade invalida");
                    }
                    Biblioteca.Base.Fila<E> copia = fonte.copiar();
                    double soma = 0.0;
                    int aprovados = 0;
                    for (int i = 0; i < quantidade; i++) {
                        E item = copia.desenfileirar();
                        if (condicao.test(item)) {
                            Double valor = extrator.apply(item);
                            if (valor == null || !Double.isFinite(valor)) {
                                throw new IllegalArgumentException("Numero invalido");
                            }
                            soma += valor;
                            aprovados++;
                        }
                    }
                    if (aprovados == 0) throw new NoSuchElementException("Nenhum aprovado");
                    if (!Double.isFinite(soma)) throw new ArithmeticException("Soma fora do limite");
                    return soma / aprovados;
                }

                // V2_35 | ORDENAR FILA COM COMPARATOR | copia encadeada + mergesort
                // Preserva fonte. Custo O(n log n) tempo, O(n) novas celulas + O(log n) stack.
                // Comparator exemplo: (a,b) -> Double.compare(a.valorFinal(), b.valorFinal()).
                public static <E> Biblioteca.Base.Fila<E> ordenarFila(Biblioteca.Base.Fila<E> fonte, Comparator<E> ordem) {
                    exigir(fonte, "Fila nula");
                    exigir(ordem, "Comparador nulo");
                    Biblioteca.Base.Fila<E> copia = fonte.copiar();
                    Biblioteca.Base.Celula<E> cabeca = null;
                    Biblioteca.Base.Celula<E> fim = null;
                    while (!copia.vazia()) {
                        Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(copia.desenfileirar());
                        if (fim == null) cabeca = nova;
                        else fim.setProximo(nova);
                        fim = nova;
                    }
                    cabeca = mergeSortNos(cabeca, ordem);
                    Biblioteca.Base.Fila<E> resultado = new Biblioteca.Base.Fila<>();
                    for (Biblioteca.Base.Celula<E> p = cabeca; p != null; p = p.getProximo()) resultado.enfileirar(p.getItem());
                    return resultado;
                }

                // V2_36 | TROCAR TOPO E DUPLICAR TOPO | exercicios de pilha por API
                // Nenhum aux de celula: usa consultarTopo/desempilhar/empilhar/obterNumeroItens.
                public static <E> void duplicarTopo(Biblioteca.Base.Pilha<E> pilha) {
                    exigir(pilha, "Pilha nula");
                    pilha.empilhar(pilha.consultarTopo());
                }

                public static <E> void trocarDoisDoTopo(Biblioteca.Base.Pilha<E> pilha) {
                    exigir(pilha, "Pilha nula");
                    if (pilha.obterNumeroItens() < 2) throw new IllegalStateException("Menos de dois itens");
                    E primeiro = pilha.desempilhar();
                    E segundo = pilha.desempilhar();
                    pilha.empilhar(primeiro);
                    pilha.empilhar(segundo);
                }
            }
            // endregion [F188]
            // ============================================================================
            // region [F189] src/aed/ampliacoes/AppExplicita.java
            // BUSCA: App Explicita
            // ORIGEM_NO_ACERVO: src/aed/ampliacoes/AppExplicita.java
            // ============================================================================
            /**
             * V2_39 | APP EXPLICITA DO ZERO | onde declarar filaPedidos condicao extrator.
             * Exemplo AUTONOMO: PedidoExemplo nao e a classe Pedido original do comercio.
             * Nenhum arquivo produtos.txt e necessario. Nao ha prompts ocultos.
             *
             * A fila original e criada UMA VEZ como atributo; nao dentro de mostrarMedia.
             * finalizarPedido alimenta essa mesma fila. filtrar cria OUTRA fila.
             * Predicate recebe um pedido e devolve boolean. Function recebe pedido e devolve
             * Double. Comparator recebe DOIS pedidos e devolve int com sinal de ordenacao.
             * As regras sao definidas aqui na App, executadas na Fila/Ampliacoes.
             */
            public static final class AppExplicita {
                private static final Biblioteca.Base.Fila<PedidoExemplo> filaPedidos = new Biblioteca.Base.Fila<>();

                public static final class PedidoExemplo {
                    private final int id;
                    private final double valor;

                    public PedidoExemplo(int id, double valor) {
                        this.id = id;
                        this.valor = valor;
                    }
                    public double valorFinal() { return valor; }
                    public int getId() { return id; }
                    @Override public String toString() { return "Pedido " + id + " / valor " + valor; }
                }

                public static void finalizarPedido(PedidoExemplo pedido) {
                    if (pedido == null) throw new IllegalArgumentException("Pedido nulo");
                    filaPedidos.enfileirar(pedido);
                }

                public static double mostrarMediaPedidos(int quantidade) {
                    Function<PedidoExemplo, Double> extrator = pedido -> pedido.valorFinal();
                    double media = filaPedidos.calcularValorMedio(extrator, quantidade);
                    System.out.println("Media dos primeiros " + quantidade + ": " + media);
                    return media;
                }

                public static void mostrarPedidosFiltrados(int quantidade, double minimo) {
                    Predicate<PedidoExemplo> condicao = pedido -> pedido.valorFinal() >= minimo;
                    Biblioteca.Base.Fila<PedidoExemplo> filtrados = filaPedidos.filtrar(condicao, quantidade);
                    while (!filtrados.vazia()) {
                        PedidoExemplo pedido = filtrados.desenfileirar();
                        System.out.println(pedido);
                    }
                }

                public static void mostrarOrdenadosPorValor() {
                    Comparator<PedidoExemplo> ordem =
                            (a, b) -> Double.compare(a.valorFinal(), b.valorFinal());
                    Biblioteca.Base.Fila<PedidoExemplo> ordenada = AmpliacoesV2.ordenarFila(filaPedidos, ordem);
                    while (!ordenada.vazia()) System.out.println(ordenada.desenfileirar());
                }

                public static void main(String[] args) {
                    while (!filaPedidos.vazia()) filaPedidos.desenfileirar();
                    finalizarPedido(new PedidoExemplo(1, 80.0));
                    finalizarPedido(new PedidoExemplo(2, 250.0));
                    finalizarPedido(new PedidoExemplo(3, 120.0));
                    finalizarPedido(new PedidoExemplo(4, 500.0));
                    mostrarMediaPedidos(3);
                    System.out.println("Filtrados entre os 3 primeiros; minimo 100:");
                    mostrarPedidosFiltrados(3, 100.0);
                    System.out.println("Todos ordenados por valor:");
                    mostrarOrdenadosPorValor();
                    System.out.println("Original continua com " + filaPedidos.tamanho() + " pedidos.");
                }
            }
            // endregion [F189]
            // ============================================================================
            // region [F190] src/aed/ampliacoes/DequeDuasSentinelas.java
            // BUSCA: Deque Duas Sentinelas
            // ORIGEM_NO_ACERVO: src/aed/ampliacoes/DequeDuasSentinelas.java
            // ============================================================================
            /**
             * V2_37 | DEQUE DUPLAMENTE ENCADEADO COM DUAS SENTINELAS.
             * COMPLEMENTO AUTORAL; nao substitui a ListaDupla com UMA sentinela dos PDFs.
             * BUSCA: duas sentinelas deque inserir frente tras remover ambas extremidades.
             *
             * inicioSentinela <-> dados <-> fimSentinela
             * As duas sentinelas sao OBJETOS DIFERENTES, mesmo no deque vazio.
             * Vazio: inicioSentinela.proximo == fimSentinela e tamanho == 0.
             * Em contraste, Fila de uma sentinela: frente == tras indica vazio.
             *
             * Insercoes/remocoes O(1). toArray O(n). Nao aceita item null.
             */
            public static final class DequeDuasSentinelas<E> {
                private final Biblioteca.Base.CelulaDupla<E> inicioSentinela = new Biblioteca.Base.CelulaDupla<>();
                private final Biblioteca.Base.CelulaDupla<E> fimSentinela = new Biblioteca.Base.CelulaDupla<>();
                private int tamanho;

                public DequeDuasSentinelas() {
                    inicioSentinela.setProximo(fimSentinela);
                    fimSentinela.setAnterior(inicioSentinela);
                }

                public boolean vazia() { return tamanho == 0; }
                public int tamanho() { return tamanho; }

                private void inserirAntes(Biblioteca.Base.CelulaDupla<E> posterior, E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.CelulaDupla<E> anterior = posterior.getAnterior();
                    Biblioteca.Base.CelulaDupla<E> nova = new Biblioteca.Base.CelulaDupla<>(item);
                    nova.setAnterior(anterior);
                    nova.setProximo(posterior);
                    anterior.setProximo(nova);
                    posterior.setAnterior(nova);
                    tamanho++;
                }

                public void inserirInicio(E item) { inserirAntes(inicioSentinela.getProximo(), item); }
                public void inserirFim(E item) { inserirAntes(fimSentinela, item); }

                private E retirar(Biblioteca.Base.CelulaDupla<E> celula) {
                    celula.getAnterior().setProximo(celula.getProximo());
                    celula.getProximo().setAnterior(celula.getAnterior());
                    celula.setAnterior(null);
                    celula.setProximo(null);
                    tamanho--;
                    return celula.getItem();
                }

                public E removerInicio() {
                    if (vazia()) throw new NoSuchElementException("Deque vazio");
                    return retirar(inicioSentinela.getProximo());
                }

                public E removerFim() {
                    if (vazia()) throw new NoSuchElementException("Deque vazio");
                    return retirar(fimSentinela.getAnterior());
                }

                public Object[] toArray() {
                    Object[] itens = new Object[tamanho];
                    int i = 0;
                    for (Biblioteca.Base.CelulaDupla<E> p = inicioSentinela.getProximo(); p != fimSentinela; p = p.getProximo()) {
                        itens[i++] = p.getItem();
                    }
                    return itens;
                }

                public boolean estruturaValida() {
                    if (inicioSentinela.getAnterior() != null || fimSentinela.getProximo() != null) return false;
                    Biblioteca.Base.CelulaDupla<E> anterior = inicioSentinela;
                    Biblioteca.Base.CelulaDupla<E> atual = inicioSentinela.getProximo();
                    int contagem = 0;
                    while (atual != fimSentinela) {
                        if (atual == null || atual.getAnterior() != anterior || contagem >= tamanho) return false;
                        anterior = atual;
                        atual = atual.getProximo();
                        contagem++;
                    }
                    return fimSentinela.getAnterior() == anterior && contagem == tamanho;
                }
            }
            // endregion [F190]
            // ============================================================================
            // region [F191] src/aed/ampliacoes/ListaCircular.java
            // BUSCA: Lista Circular
            // ORIGEM_NO_ACERVO: src/aed/ampliacoes/ListaCircular.java
            // ============================================================================
            /**
             * V2_38 | LISTA CIRCULAR ENCADEADA SEM SENTINELA.
             * COMPLEMENTO AUTORAL. Nao e o vetor circular explicado nos slides.
             * BUSCA: anel circular ultimo aponta primeiro do while parada sem null.
             *
             * Vazia: tras == null. Nao vazia: tras.proximo referencia o primeiro dado.
             * Uma celula: tras.proximo == tras. Nao existe null no encadeamento valido.
             * Inserir inicio/fim e remover inicio: O(1). Rotacionar: O(k % n).
             */
            public static final class ListaCircular<E> {
                private Biblioteca.Base.Celula<E> tras;
                private int tamanho;

                public boolean vazia() { return tras == null; }
                public int tamanho() { return tamanho; }

                public void inserirInicio(E item) {
                    if (item == null) throw new IllegalArgumentException("Item nulo");
                    Biblioteca.Base.Celula<E> nova = new Biblioteca.Base.Celula<>(item);
                    if (vazia()) {
                        nova.setProximo(nova);
                        tras = nova;
                    } else {
                        nova.setProximo(tras.getProximo());
                        tras.setProximo(nova);
                    }
                    tamanho++;
                }

                public void inserirFim(E item) {
                    inserirInicio(item);
                    tras = tras.getProximo();
                }

                public E removerInicio() {
                    if (vazia()) throw new NoSuchElementException("Lista circular vazia");
                    Biblioteca.Base.Celula<E> removida = tras.getProximo();
                    if (removida == tras) tras = null;
                    else tras.setProximo(removida.getProximo());
                    removida.setProximo(null);
                    tamanho--;
                    return removida.getItem();
                }

                public void rotacionar(int k) {
                    if (k < 0 || (vazia() && k != 0)) throw new IllegalArgumentException();
                    if (vazia()) return;
                    int passos = k % tamanho;
                    for (int i = 0; i < passos; i++) tras = tras.getProximo();
                }

                public boolean contem(E item) {
                    if (vazia()) return false;
                    Biblioteca.Base.Celula<E> primeiro = tras.getProximo();
                    Biblioteca.Base.Celula<E> atual = primeiro;
                    do {
                        if (atual.getItem().equals(item)) return true;
                        atual = atual.getProximo();
                    } while (atual != primeiro);
                    return false;
                }

                public Object[] toArray() {
                    Object[] itens = new Object[tamanho];
                    if (vazia()) return itens;
                    Biblioteca.Base.Celula<E> atual = tras.getProximo();
                    for (int i = 0; i < tamanho; i++) {
                        itens[i] = atual.getItem();
                        atual = atual.getProximo();
                    }
                    return itens;
                }

                public boolean estruturaValida() {
                    if (tras == null) return tamanho == 0;
                    if (tamanho <= 0 || tras.getProximo() == null) return false;
                    Biblioteca.Base.Celula<E> primeiro = tras.getProximo();
                    Biblioteca.Base.Celula<E> atual = primeiro;
                    for (int i = 0; i < tamanho; i++) {
                        if (atual == null) return false;
                        if (i > 0 && atual == primeiro) return false;
                        if (i == tamanho - 1 && atual != tras) return false;
                        atual = atual.getProximo();
                    }
                    return atual == primeiro;
                }
            }
            // endregion [F191]
            // ============================================================================
            // region [F192] src/aed/ampliacoes/RecursaoRastreada.java
            // BUSCA: Recursao Rastreada
            // ORIGEM_NO_ACERVO: src/aed/ampliacoes/RecursaoRastreada.java
            // ============================================================================
            /**
             * V2_40 | CHAMADA RETORNO ESPERA | rastros reais int boolean E void.
             * As mensagens dizem onde cada chamada suspende e retoma. Nao ha animacao.
             * O parametro nivel e APENAS para formatar o rastro: nao copie para uma questao
             * que proiba parametros extras. As solucoes literais ficam nas fichas FF/LF/R.
             */
            public static final class RecursaoRastreada {
                private static String recuo(int nivel) {
                    String r = "";
                    for (int i = 0; i < nivel; i++) r += "  ";
                    return r;
                }
                private static String nome(Biblioteca.Base.Celula<Integer> atual) {
                    return atual == null ? "null" : "celula " + atual.getItem();
                }
                public static int contar(Biblioteca.Base.Celula<Integer> atual, int nivel) {
                    String r = recuo(nivel);
                    System.out.println(r + "ENTRA contar(" + nome(atual) + ")");
                    if (atual == null) {
                        System.out.println(r + "BASE: devolve 0 e termina ESTA chamada");
                        return 0;
                    }
                    System.out.println(r + "ESPERA: resposta = contar(proxima)");
                    int resposta = contar(atual.getProximo(), nivel + 1);
                    System.out.println(r + "RETOMA " + nome(atual) + ": resposta = " + resposta);
                    System.out.println(r + "DEVOLVE 1 + " + resposta + " = " + (1 + resposta));
                    return 1 + resposta;
                }
                public static boolean contem(Biblioteca.Base.Celula<Integer> atual, Integer alvo, int nivel) {
                    String r = recuo(nivel);
                    System.out.println(r + "ENTRA contem(" + nome(atual) + ", " + alvo + ")");
                    if (atual == null) {
                        System.out.println(r + "BASE: false");
                        return false;
                    }
                    if (atual.getItem().equals(alvo)) {
                        System.out.println(r + "ACHOU: true");
                        return true;
                    }
                    boolean resposta = contem(atual.getProximo(), alvo, nivel + 1);
                    System.out.println(r + "REPASSE em " + nome(atual) + ": " + resposta);
                    return resposta;
                }
                public static Integer obter(Biblioteca.Base.Celula<Integer> atual, int pos, int nivel) {
                    String r = recuo(nivel);
                    System.out.println(r + "ENTRA obter(" + nome(atual) + ", pos=" + pos + ")");
                    if (pos < 0 || atual == null) throw new IndexOutOfBoundsException();
                    if (pos == 0) {
                        System.out.println(r + "ENCONTROU: devolve ITEM " + atual.getItem());
                        return atual.getItem();
                    }
                    Integer resposta = obter(atual.getProximo(), pos - 1, nivel + 1);
                    System.out.println(r + "REPASSE do ITEM " + resposta + " por " + nome(atual));
                    return resposta;
                }
                public static void idaEVolta(Biblioteca.Base.Celula<Integer> atual, int nivel) {
                    String r = recuo(nivel);
                    if (atual == null) {
                        System.out.println(r + "BASE void: return; sem numero");
                        return;
                    }
                    System.out.println(r + "ANTES da chamada: " + atual.getItem());
                    idaEVolta(atual.getProximo(), nivel + 1);
                    System.out.println(r + "DEPOIS da chamada: " + atual.getItem());
                }
                public static void main(String[] args) {
                    Biblioteca.Base.Celula<Integer> a = new Biblioteca.Base.Celula<>(10);
                    a.setProximo(new Biblioteca.Base.Celula<>(20));
                    a.getProximo().setProximo(new Biblioteca.Base.Celula<>(30));
                    System.out.println("=== CONTAR: 1 + resultado ===");
                    System.out.println("FINAL: " + contar(a, 0));
                    System.out.println("=== CONTER: repassar boolean ===");
                    System.out.println("FINAL: " + contem(a, 30, 0));
                    System.out.println("=== OBTER: repassar item ===");
                    System.out.println("FINAL: " + obter(a, 2, 0));
                    System.out.println("=== VOID: acao antes e depois ===");
                    idaEVolta(a, 0);
                }
            }
            // endregion [F192]
            // ============================================================================
            // region [F193] src/aed/ampliacoes/TestesAmpliacoesV2.java
            // BUSCA: Testes Ampliacoes V2
            // ORIGEM_NO_ACERVO: src/aed/ampliacoes/TestesAmpliacoesV2.java
            // ============================================================================
            /**
             * TESTES V2. Solucoes nao dependem de framework nem colecoes prontas.
             * Arrays usados SOMENTE como oraculo de teste. Sem JUnit e sem internet.
             * Verificacao != prova formal: os limites do teste estao no relatorio V2.
             */
            public static final class TestesAmpliacoesV2 {
                private static long verificacoes;
                private static final Comparator<Integer> ORDEM = (a, b) -> Integer.compare(a, b);

                private static void ok(boolean condicao, String rotulo) {
                    verificacoes++;
                    if (!condicao) throw new AssertionError(rotulo);
                }
                private static void igual(Object esperado, Object obtido, String rotulo) {
                    ok(esperado == null ? obtido == null : esperado.equals(obtido),
                            rotulo + " esperado=" + esperado + " obtido=" + obtido);
                }
                private static void erro(Class<? extends Throwable> tipo, Runnable acao) {
                    verificacoes++;
                    try { acao.run(); }
                    catch (Throwable ex) {
                        if (tipo.isInstance(ex)) return;
                        throw new AssertionError("Tipo de excecao inesperado", ex);
                    }
                    throw new AssertionError("Excecao esperada: " + tipo.getSimpleName());
                }
                private static Biblioteca.Base.Celula<Integer> cadeia(int... itens) {
                    Biblioteca.Base.Celula<Integer> cabeca = null;
                    Biblioteca.Base.Celula<Integer> fim = null;
                    for (int item : itens) {
                        Biblioteca.Base.Celula<Integer> nova = new Biblioteca.Base.Celula<>(item);
                        if (cabeca == null) cabeca = nova;
                        else fim.setProximo(nova);
                        fim = nova;
                    }
                    return cabeca;
                }
                private static Biblioteca.Base.Fila<Integer> fila(int... itens) {
                    Biblioteca.Base.Fila<Integer> f = new Biblioteca.Base.Fila<>();
                    for (int item : itens) f.enfileirar(item);
                    return f;
                }
                private static Biblioteca.Base.Pilha<Integer> pilha(int... topoParaFundo) {
                    Biblioteca.Base.Pilha<Integer> p = new Biblioteca.Base.Pilha<>();
                    for (int i = topoParaFundo.length - 1; i >= 0; i--) p.empilhar(topoParaFundo[i]);
                    return p;
                }
                private static int[] vetor(Biblioteca.Base.Celula<Integer> cabeca) {
                    int n = 0;
                    for (Biblioteca.Base.Celula<Integer> p = cabeca; p != null; p = p.getProximo()) {
                        if (++n > 5000) throw new AssertionError("Ciclo inesperado no teste");
                    }
                    int[] itens = new int[n];
                    int i = 0;
                    for (Biblioteca.Base.Celula<Integer> p = cabeca; p != null; p = p.getProximo()) itens[i++] = p.getItem();
                    return itens;
                }
                private static void seq(Object[] obtido, int... esperado) {
                    igual(esperado.length, obtido.length, "Comprimento sequencia");
                    for (int i = 0; i < esperado.length; i++) igual(esperado[i], obtido[i], "Sequencia " + i);
                }
                private static void seqNos(Biblioteca.Base.Celula<Integer> cabeca, int... esperado) {
                    int[] obtido = vetor(cabeca);
                    igual(esperado.length, obtido.length, "Comprimento cadeia");
                    for (int i = 0; i < esperado.length; i++) igual(esperado[i], obtido[i], "Cadeia " + i);
                }
                private static void identidadeNos(Biblioteca.Base.Celula<Integer> antes, Biblioteca.Base.Celula<Integer> depois, Object[] identidades) {
                    int n = 0;
                    for (Biblioteca.Base.Celula<Integer> p = depois; p != null; p = p.getProximo()) {
                        boolean achou = false;
                        for (Object original : identidades) if (original == p) achou = true;
                        ok(achou, "Nao criou celula na operacao de religacao");
                        if (++n > identidades.length) throw new AssertionError("Ciclo ou celula duplicada");
                    }
                    igual(identidades.length, n, "Preservacao do numero de nos");
                }
                private static Object[] referencias(Biblioteca.Base.Celula<Integer> cabeca) {
                    int n = vetor(cabeca).length;
                    Object[] r = new Object[n];
                    int i = 0;
                    for (Biblioteca.Base.Celula<Integer> p = cabeca; p != null; p = p.getProximo()) r[i++] = p;
                    return r;
                }
                private static void ordenarReferencia(int[] a) {
                    for (int i = 1; i < a.length; i++) {
                        int v = a[i];
                        int j = i - 1;
                        while (j >= 0 && a[j] > v) { a[j + 1] = a[j]; j--; }
                        a[j + 1] = v;
                    }
                }
                private static void inverterReferencia(int[] a, int inicio, int fimExclusivo) {
                    for (int i = inicio, j = fimExclusivo - 1; i < j; i++, j--) {
                        int t = a[i]; a[i] = a[j]; a[j] = t;
                    }
                }

                private static void testarBasicos() {
                    Biblioteca.Base.Celula<Integer> c = cadeia(10, 20, 30, 20);
                    igual(4, AmpliacoesV2.tamanhoRecursivo(c), "Tamanho");
                    igual(0, AmpliacoesV2.tamanhoRecursivo(null), "Tamanho vazio");
                    ok(AmpliacoesV2.buscarCelulaRecursiva(c, 20) == c.getProximo(), "Busca identidade");
                    igual(null, AmpliacoesV2.buscarCelulaRecursiva(c, 9), "Busca ausente");
                    igual(1, AmpliacoesV2.primeiroIndice(c, 20), "Primeiro indice");
                    igual(3, AmpliacoesV2.ultimoIndice(c, 20), "Ultimo indice");
                    igual(-1, AmpliacoesV2.primeiroIndice(c, 99), "Indice ausente");
                    igual(-1, AmpliacoesV2.ultimoIndice(c, 99), "Ultimo ausente");
                    igual(30, AmpliacoesV2.obterPosicao(c, 2), "Obter");
                    erro(IndexOutOfBoundsException.class, () -> AmpliacoesV2.obterPosicao(c, -1));
                    erro(IndexOutOfBoundsException.class, () -> AmpliacoesV2.obterPosicao(c, 4));
                    igual(-2, AmpliacoesV2.maiorRecursivo(cadeia(-8, -2, -3), ORDEM), "Maior negativo");
                    erro(NoSuchElementException.class, () -> AmpliacoesV2.maiorRecursivo(null, ORDEM));
                    Biblioteca.Base.Celula<Integer> copia = AmpliacoesV2.copiarCadeia(c);
                    seqNos(copia, 10, 20, 30, 20);
                    ok(copia != c && copia.getProximo() != c.getProximo(), "Copia cria nos");
                    Biblioteca.Base.Celula<Integer> filtrada = AmpliacoesV2.removerSeRecursivo(copia, x -> x == 20);
                    seqNos(filtrada, 10, 30); seqNos(c, 10, 20, 30, 20);
                    seqNos(AmpliacoesV2.removerSeRecursivo(cadeia(1, 1), x -> true));
                    seq(AmpliacoesV2.copiarIntervalo(c, 1, 3).toArray(), 20, 30);
                    seq(AmpliacoesV2.copiarIntervalo(c, 4, 4).toArray());
                    erro(IndexOutOfBoundsException.class, () -> AmpliacoesV2.copiarIntervalo(c, 1, 5));
                    seq(AmpliacoesV2.copiarEntreAlvos(cadeia(1, 2, 3, 4, 5), 2, 5).toArray(), 3, 4);
                    seq(AmpliacoesV2.copiarEntreAlvos(cadeia(1, 2, 2, 3), 2, 2).toArray());
                    erro(NoSuchElementException.class, () -> AmpliacoesV2.copiarEntreAlvos(c, 99, 30));
                    erro(NoSuchElementException.class, () -> AmpliacoesV2.copiarEntreAlvos(c, 30, 99));
                    seq(AmpliacoesV2.copiarDepoisUltimo(cadeia(1, 2, 3, 2, 4), 2).toArray(), 4);
                    seq(AmpliacoesV2.copiarDepoisUltimo(c, 20).toArray());
                    erro(NoSuchElementException.class, () -> AmpliacoesV2.copiarDepoisUltimo(c, 99));
                    Biblioteca.Base.Celula<Integer> ca = cadeia(1, 2), cb = cadeia(8);
                    Biblioteca.Base.Celula<Integer> comum = cadeia(9, 10);
                    ca.getProximo().setProximo(comum); cb.setProximo(comum);
                    ok(AmpliacoesV2.intersecaoPorIdentidade(ca, cb) == comum, "Intersecao identidade");
                    igual(null, AmpliacoesV2.intersecaoPorIdentidade(cadeia(1), cadeia(1)), "Mesmo item nao mesmo no");
                    igual(null, AmpliacoesV2.intersecaoPorIdentidade(null, cadeia(1)), "Intersecao vazio");
                    ok(AmpliacoesV2.estaOrdenada(null, ORDEM), "Ordenada vazia");
                    ok(!AmpliacoesV2.estaOrdenada(cadeia(1, 3, 2, 4), ORDEM), "Inversao interna");
                }

                private static void testarReligacoes() {
                    Random random = new Random(20261025L);
                    for (int rodada = 0; rodada < 300; rodada++) {
                        int n = random.nextInt(18);
                        int[] valores = new int[n];
                        for (int i = 0; i < n; i++) valores[i] = random.nextInt(9) - 4;
                        for (int inicio = 0; inicio <= n; inicio++) {
                            for (int fim = inicio; fim <= n; fim++) {
                                Biblioteca.Base.Celula<Integer> c = cadeia(valores);
                                Object[] ids = referencias(c);
                                int[] esperado = valores.clone();
                                inverterReferencia(esperado, inicio, fim);
                                Biblioteca.Base.Celula<Integer> r = AmpliacoesV2.inverterIntervalo(c, inicio, fim);
                                seqNos(r, esperado); identidadeNos(c, r, ids);
                            }
                        }
                        for (int k = 1; k <= n + 2; k++) {
                            Biblioteca.Base.Celula<Integer> c = cadeia(valores); Object[] ids = referencias(c);
                            int[] esperado = valores.clone();
                            for (int i = 0; i + k <= n; i += k) inverterReferencia(esperado, i, i + k);
                            Biblioteca.Base.Celula<Integer> r = AmpliacoesV2.inverterGrupos(c, k);
                            seqNos(r, esperado); identidadeNos(c, r, ids);
                        }
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                Biblioteca.Base.Celula<Integer> c = cadeia(valores); Object[] ids = referencias(c);
                                int[] esperado = valores.clone(); int t = esperado[i]; esperado[i] = esperado[j]; esperado[j] = t;
                                Biblioteca.Base.Celula<Integer> r = AmpliacoesV2.trocarNos(c, i, j);
                                seqNos(r, esperado); identidadeNos(c, r, ids);
                            }
                            int[] esperado = new int[n]; int pos = 0;
                            for (int j = 0; j < n; j++) if (j != i) esperado[pos++] = valores[j];
                            esperado[pos] = valores[i];
                            Biblioteca.Base.Celula<Integer> c = cadeia(valores); Object[] ids = referencias(c);
                            Biblioteca.Base.Celula<Integer> r = AmpliacoesV2.moverParaFinal(c, i);
                            seqNos(r, esperado); identidadeNos(c, r, ids);
                        }
                        for (int alvo = -5; alvo <= 5; alvo++) {
                            int ultimo = -1;
                            for (int i = 0; i < n; i++) if (valores[i] == alvo) ultimo = i;
                            int[] esperado = new int[n - (ultimo == -1 ? 0 : 1)]; int k = 0;
                            for (int i = 0; i < n; i++) if (i != ultimo) esperado[k++] = valores[i];
                            seqNos(AmpliacoesV2.removerUltimaOcorrencia(cadeia(valores), alvo), esperado);
                        }
                        Biblioteca.Base.Celula<Integer> c = cadeia(valores); Object[] ids = referencias(c);
                        int[] esperado = valores.clone(); ordenarReferencia(esperado);
                        Biblioteca.Base.Celula<Integer> r = AmpliacoesV2.mergeSortNos(c, ORDEM);
                        seqNos(r, esperado); identidadeNos(c, r, ids);
                        ok(AmpliacoesV2.estaOrdenada(r, ORDEM), "Mergesort ordenado");
                    }
                    erro(IllegalArgumentException.class, () -> AmpliacoesV2.inverterGrupos(cadeia(1), 0));
                    erro(IndexOutOfBoundsException.class, () -> AmpliacoesV2.inverterIntervalo(cadeia(1), -1, 1));
                    erro(IndexOutOfBoundsException.class, () -> AmpliacoesV2.trocarNos(cadeia(1), 0, 1));
                    erro(IndexOutOfBoundsException.class, () -> AmpliacoesV2.moverParaFinal(null, 0));
                    seqNos(AmpliacoesV2.intercalarNos(cadeia(1, 3), cadeia(2, 3, 4), ORDEM), 1, 2, 3, 3, 4);
                    seqNos(AmpliacoesV2.intercalarNos(null, cadeia(2), ORDEM), 2);
                }

                private static void testarEstabilidade() {
                    final class Registro {
                        int chave; String nome;
                        Registro(int chave, String nome) { this.chave = chave; this.nome = nome; }
                    }
                    Registro a = new Registro(2, "A"), b = new Registro(1, "B");
                    Registro c = new Registro(2, "C"), d = new Registro(1, "D");
                    Biblioteca.Base.Celula<Registro> n1 = new Biblioteca.Base.Celula<>(a), n2 = new Biblioteca.Base.Celula<>(b);
                    Biblioteca.Base.Celula<Registro> n3 = new Biblioteca.Base.Celula<>(c), n4 = new Biblioteca.Base.Celula<>(d);
                    n1.setProximo(n2); n2.setProximo(n3); n3.setProximo(n4);
                    Biblioteca.Base.Celula<Registro> r = AmpliacoesV2.mergeSortNos(n1, (x, y) -> Integer.compare(x.chave, y.chave));
                    ok(r == n2 && r.getProximo() == n4, "Empate chave1 preserva ordem B D");
                    ok(r.getProximo().getProximo() == n1, "Chave2 A antes C");
                    ok(r.getProximo().getProximo().getProximo() == n3, "Mesmo no C no fim");
                    ok(AmpliacoesV2.maiorRecursivo(r, (x,y) -> Integer.compare(x.chave,y.chave)) == a, "Maior desempate primeiro");
                }

                private static void testarFilasEFuncionais() {
                    Biblioteca.Base.Fila<Integer> original = fila(1, 2, 3, 4, 5);
                    AmpliacoesV2.Particao<Integer> separadas = AmpliacoesV2.separarPreservando(original, x -> x % 2 == 0);
                    seq(separadas.aprovados.toArray(), 2, 4); seq(separadas.rejeitados.toArray(), 1, 3, 5);
                    seq(original.toArray(), 1, 2, 3, 4, 5);
                    seq(AmpliacoesV2.copiarPrimeirosViaAPI(original, 3).toArray(), 1, 2, 3);
                    seq(original.toArray(), 1, 2, 3, 4, 5);
                    erro(IllegalArgumentException.class, () -> AmpliacoesV2.copiarPrimeirosViaAPI(original, 6));
                    seq(original.toArray(), 1, 2, 3, 4, 5);
                    seq(AmpliacoesV2.extrairSe(original, x -> x % 2 == 0).toArray(), 2, 4);
                    seq(original.toArray(), 1, 3, 5); ok(original.estruturaValida(), "Estrutura apos extracao");
                    Biblioteca.Base.Fila<Integer> f = fila(1, 2, 3, 4, 5);
                    seq(AmpliacoesV2.removerCadaK(f, 2).toArray(), 2, 4); seq(f.toArray(), 1, 3, 5);
                    AmpliacoesV2.rotacionarFila(f, 1); seq(f.toArray(), 3, 5, 1);
                    erro(IllegalArgumentException.class, () -> AmpliacoesV2.rotacionarFila(f, 4));
                    seq(AmpliacoesV2.primeirosKAprovados(fila(1,2,3,4), x -> x % 2 == 0, 2).toArray(), 2, 4);
                    seq(AmpliacoesV2.primeirosKAprovados(fila(), x -> true, 0).toArray());
                    erro(NoSuchElementException.class, () -> AmpliacoesV2.primeirosKAprovados(fila(1), x -> false, 1));
                    seq(AmpliacoesV2.mesclarEmBlocos(fila(1,2,3), fila(8,9,10), 2).toArray(), 1,2,8,9,3,10);
                    seq(AmpliacoesV2.mesclarEmBlocos(fila(), fila(8,9), 3).toArray(), 8,9);
                    Biblioteca.Base.Fila<Integer> m = fila(1, 2);
                    seq(AmpliacoesV2.mesclarEmBlocos(m, m, 1).toArray(), 1,1,2,2); seq(m.toArray(), 1,2);
                    Biblioteca.Base.Fila<String> textos = AmpliacoesV2.mapear(m, x -> "N" + x);
                    igual("N1", textos.desenfileirar(), "Mapear1"); igual("N2", textos.desenfileirar(), "Mapear2");
                    igual(3, AmpliacoesV2.reduzir(m, 0, (a,b) -> a+b), "Reduzir");
                    igual(0, AmpliacoesV2.reduzir(fila(), 0, (a,b) -> a+b), "Reduzir vazio");
                    igual(3.0, AmpliacoesV2.mediaFiltrada(fila(1,2,3,4,99), x -> x%2==0, x->x.doubleValue(), 4), "Media aprovados");
                    erro(NoSuchElementException.class, () -> AmpliacoesV2.mediaFiltrada(fila(1), x->false, x->x.doubleValue(), 1));
                    erro(IllegalArgumentException.class, () -> AmpliacoesV2.mediaFiltrada(fila(1), x->true, x->Double.NaN, 1));
                    erro(IllegalArgumentException.class, () -> AmpliacoesV2.mediaFiltrada(fila(1), x->true, x->null, 1));
                    Biblioteca.Base.Fila<Integer> semOrdem = fila(4, 1, 3, 1);
                    seq(AmpliacoesV2.ordenarFila(semOrdem, ORDEM).toArray(), 1, 1, 3, 4);
                    seq(semOrdem.toArray(), 4, 1, 3, 1);
                    erro(IllegalArgumentException.class, () -> AmpliacoesV2.mapear(m, null));
                    erro(IllegalArgumentException.class, () -> AmpliacoesV2.mapear(m, x -> null));
                }

                private static void testarPilhas() {
                    Biblioteca.Base.Pilha<Integer> p = pilha(3, 2, 1);
                    AmpliacoesV2.inserirNoFundo(p, 0); seq(p.toArray(), 3,2,1,0);
                    AmpliacoesV2.inverterPilhaRecursiva(p); seq(p.toArray(), 0,1,2,3);
                    igual(3, AmpliacoesV2.removerFundo(p), "Remover fundo"); seq(p.toArray(), 0,1,2);
                    AmpliacoesV2.duplicarTopo(p); seq(p.toArray(), 0,0,1,2);
                    AmpliacoesV2.trocarDoisDoTopo(p); seq(p.toArray(), 0,0,1,2);
                    p = pilha(9,8); AmpliacoesV2.trocarDoisDoTopo(p); seq(p.toArray(), 8,9);
                    erro(IllegalStateException.class, () -> AmpliacoesV2.trocarDoisDoTopo(pilha(1)));
                    erro(NoSuchElementException.class, () -> AmpliacoesV2.removerFundo(pilha()));
                    Random random = new Random(777L);
                    for (int r = 0; r < 500; r++) {
                        int[] a = new int[random.nextInt(20)];
                        for (int i=0;i<a.length;i++) a[i]=random.nextInt(21)-10;
                        Biblioteca.Base.Pilha<Integer> original = pilha(a);
                        int[] esperado=a.clone(); ordenarReferencia(esperado);
                        AmpliacoesV2.ordenarPilha(original,ORDEM); seq(original.toArray(),esperado);
                        ok(original.estruturaValida(), "Pilha valida ordenada");
                    }
                }

                private static void testarDequeECircular() {
                    DequeDuasSentinelas<Integer> d = new DequeDuasSentinelas<>();
                    ok(d.vazia() && d.estruturaValida(), "Deque vazio");
                    erro(NoSuchElementException.class, d::removerFim);
                    for (int i=0;i<100;i++) { d.inserirFim(i); ok(d.estruturaValida(),"Inserir fim"); }
                    for (int i=99;i>=0;i--) { igual(i,d.removerFim(),"Remover fim"); ok(d.estruturaValida(),"Religacao deque"); }
                    for (int i=0;i<100;i++) { d.inserirInicio(i); ok(d.estruturaValida(),"Inserir inicio"); }
                    for (int i=0;i<100;i++) { igual(i,d.removerFim(),"Remover apos inserir inicio"); ok(d.estruturaValida(),"Deque volta vazio"); }
                    d.inserirInicio(2); d.inserirInicio(1); d.inserirFim(3); seq(d.toArray(),1,2,3);
                    igual(1,d.removerInicio(),"Deque remover inicio"); igual(3,d.removerFim(),"Deque remover fim");
                    igual(2,d.removerInicio(),"Deque unico");ok(d.vazia()&&d.estruturaValida(),"Deque vazio final");
                    ListaCircular<Integer> c = new ListaCircular<>();
                    ok(c.estruturaValida(),"Circular vazia");c.rotacionar(0);
                    erro(NoSuchElementException.class,c::removerInicio);
                    erro(IllegalArgumentException.class,()->c.rotacionar(1));
                    c.inserirFim(1);c.inserirFim(2);c.inserirFim(3);seq(c.toArray(),1,2,3);
                    ok(c.contem(2)&&!c.contem(9),"Circular contem");
                    c.rotacionar(4);seq(c.toArray(),2,3,1);ok(c.estruturaValida(),"Circular rotacionada");
                    c.inserirInicio(9);seq(c.toArray(),9,2,3,1);
                    igual(9,c.removerInicio(),"Circular inicio");igual(2,c.removerInicio(),"Circular2");
                    igual(3,c.removerInicio(),"Circular3");igual(1,c.removerInicio(),"Circular1");
                    ok(c.estruturaValida()&&c.vazia(),"Circular esvaziada");c.inserirFim(7);seq(c.toArray(),7);
                    ok(c.estruturaValida(),"Circular reutilizada");
                }

                public static void main(String[] args) {
                    verificacoes = 0;
                    testarBasicos(); testarReligacoes(); testarEstabilidade();
                    testarFilasEFuncionais(); testarPilhas(); testarDequeECircular();
                    System.out.println("OK V2: " + verificacoes + " verificacoes passaram.");
                    System.out.println("Inclui identidade de nos, intervalos, estabilidade, preservacao, limites e sentinelas.");
                }
            }
            // endregion [F193]
        }
    }

    public static void main(String[] args) throws Exception {
        String modo = args.length == 0 ? "ajuda" : args[0];
        if ("testes".equals(modo)) {
            Biblioteca.Verificacao.Testes.main(new String[0]);
            Biblioteca.Ampliacoes.TestesAmpliacoesV2.main(new String[0]);
        } else if ("recursao".equals(modo)) {
            Biblioteca.Ampliacoes.RecursaoRastreada.main(new String[0]);
        } else if ("app".equals(modo)) {
            Biblioteca.Ampliacoes.AppExplicita.main(new String[0]);
        } else {
            System.out.println("GUIA MESTRE AEDII - consulta completa em um arquivo Java.");
            System.out.println("Busque por BF, BL, BP, LF, FF, R23, V2_10, Predicate, caso-base...");
            System.out.println("Execucao opcional: java GUIA_MESTRE_AEDII testes | recursao | app");
            System.out.println("Na leitura: Ctrl+F para tema; Ctrl+G para linha do indice.");
        }
    }
}
