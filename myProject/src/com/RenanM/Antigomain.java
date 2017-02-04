package com.RenanM;

////public class Antigomain {
////
////    private static String evitarerrodata(boolean inicial){
////        boolean bissexexto = false;
////        int year, mes, dia;
////        Scanner ler = new Scanner(System.in);
////        if(inicial) {
////            System.out.println("Digite a data inicial da procura:");
////        } else {
////            System.out.println("Digite a data final da procura: [Limite no grafico de 3 meses] ");
////        }
////        System.out.println("Digite o ano: [yyyy] ");
////        year = ler.nextInt();
////        ler.nextLine();
////        while(year < 2000 || year > 2017){
////            System.out.println("Ano invalido. Deve ser entre 2000 e 2017:");
////            year = ler.nextInt();
////            ler.nextLine();
////        }
////        if((year % 400) == 0 || (year % 4) == 0 || (year % 100) == 0){
////            bissexexto = true;
////        }
////        System.out.println("Digite o mes: [mm]");
////        mes = ler.nextInt();
////        ler.nextLine();
////        while(mes < 1 || mes > 12){
////            System.out.println("Mes invalido. Deve ser entre 1 e 12:");
////            mes = ler.nextInt();
////            ler.nextLine();
////        }
////        System.out.println("Digite o dia: [dd] ");
////        dia = ler.nextInt();
////        ler.nextLine();
////        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
////            while(dia < 1 || dia > 31){
////                System.out.println("Dia invalido. Deve ser entre 1 e 31 ");
////                dia = ler.nextInt();
////                ler.nextLine();
////            }
////        } else if (mes == 2){
////            if(bissexexto){
////                while(dia < 1 || dia > 29){
////                    System.out.println("Dia invalido. Deve ser entre 1 e 29 ");
////                    dia = ler.nextInt();
////                    ler.nextLine();
////                }
////            } else{
////                while(dia < 1 || dia > 28){
////                    System.out.println("Dia invalido. Deve ser entre 1 e 28 ");
////                    dia = ler.nextInt();
////                    ler.nextLine();
////                }
////            }
////        } else {
////            while(dia < 1 || dia > 30){
////                System.out.println("Dia invalido. Deve ser entre 1 e 30 ");
////                dia = ler.nextInt();
////                ler.nextLine();
////            }
////        }
////        return (year + "-" + mes + "-" + dia);
////    }
////
////    public static void main(String[] args) throws IOException, ParseException {
////        SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd");
////        Simbolos simbolos = new Simbolos();
////        Scanner ler = new Scanner(System.in);
////        System.out.println("Digite o simbolo: ");
////        String keyarqv = ler.nextLine();
////        while(!simbolos.contains(keyarqv)){
////            System.out.print("Entradas validas [ENTER]:");
////            ler.nextLine();
////            simbolos.print();
////            System.out.println("Nova entrada: ");
////            keyarqv = ler.nextLine();
////        }
////        URLConnection con = (simbolos.getarqurl(keyarqv)).openConnection();
////        InputStream is = con.getInputStream();
////        BufferedReader br = new BufferedReader(new InputStreamReader(is));
////        List<Caracteristicas> todosvalores = new ArrayList<>();
////        String line;
////        br.readLine();
////        while((line = br.readLine()) != null){
////            String[] datasep = line.split(",");
////            Date date = null;
////            Double open = null;
////            Double high = null;
////            Double low = null;
////            Double close = null;
////            Double volume = null;
////            Double adjClose;
////            int i=0;
////            while(i<7) {
////                switch (i) {
////                    case 0:
////                        date = formatar.parse(datasep[i]);
////                        break;
////                    case 1:
////                        open = Double.parseDouble(datasep[i]);
////                        break;
////                    case 2:
////                        high = Double.parseDouble(datasep[i]);
////                        break;
////                    case 3:
////                        low = Double.parseDouble(datasep[i]);
////                        break;
////                    case 4:
////                        close = Double.parseDouble(datasep[i]);
////                        break;
////                    case 5:
////                        volume = Double.parseDouble(datasep[i]);
////                        break;
////                    case 6:
////                        adjClose = Double.parseDouble(datasep[i]);
////                        Caracteristicas novo = new Caracteristicas(date, open, high, low, close, volume, adjClose);
////                        todosvalores.add(novo);
////                        break;
////                }
////                i++;
////            }
////        }
////
////
////
//////        while(arq.hasNextLine()){
//////            String data = arq.nextLine();
//////            String[] datasep = data.split(",");
//////            Date date = null;
//////            Double open = null;
//////            Double high = null;
//////            Double low = null;
//////            Double close = null;
//////            Double volume = null;
//////            Double adjClose = null;
//////            int i=0;
//////            while(i<7) {
//////                switch (i) {
//////                    case 0:
//////                        date = formatar.parse(datasep[i]);
//////                        break;
//////                    case 1:
//////                        open = Double.parseDouble(datasep[i]);
//////                        break;
//////                    case 2:
//////                        high = Double.parseDouble(datasep[i]);
//////                        break;
//////                    case 3:
//////                        low = Double.parseDouble(datasep[i]);
//////                        break;
//////                    case 4:
//////                        close = Double.parseDouble(datasep[i]);
//////                        break;
//////                    case 5:
//////                        volume = Double.parseDouble(datasep[i]);
//////                        break;
//////                    case 6:
//////                        adjClose = Double.parseDouble(datasep[i]);
//////                        Caracteristicas novo = new Caracteristicas(date, open, high, low, close, volume, adjClose);
//////                        todosvalores.add(novo);
//////                        break;
//////                }
//////                i++;
//////            }
//////        }
////
////        Acao acao = new Acao(simbolos.getarqvnome(keyarqv), todosvalores);
////        Date datainicial = formatar.parse(evitarerrodata(true));
////        datainicial = acao.getmindata(datainicial);
////        System.out.println("Data inicial: " + datainicial);
////        Calendar c = Calendar.getInstance();
////        c.setTime(datainicial);
////        c.add(Calendar.MONTH, 3);
////        Date comparedata = c.getTime();
////
////
////        Date datafinal = formatar.parse(evitarerrodata(false));
////
////        if(comparedata.after(datafinal) || comparedata.equals(datafinal)) {
////            datafinal = acao.getmaxdata(datafinal);
////        } else {
////            System.out.println("Datas muito afastadas. Limite de 6 meses aplicado.");
////            datafinal = acao.getmaxdata(comparedata);
////        }
////        System.out.println("Data final: " + datafinal);
////        List<Caracteristicas> exemplo = acao.intervaloList(datainicial, datafinal);
////        System.out.println("Quantidade de linhas: " + exemplo.size());
////        //acao.printprecodata(datainicial, datafinal);
////        System.out.println("O que deseja verificar: ");
////        System.out.println("0 - Abertura" + "\n" +
////                "1 - Alta: " + "\n" +
////                "2 - Baixa " +"\n" +
////                "3 - Fechar " + "\n" +
////                "4 - Ajuste " + "\n" +
////                "5 - Volume ");
////        int opcao = ler.nextInt();
////        ler.nextLine();
////        while((opcao < 0) && (opcao > 5)){
////            System.out.println("Opcao Invalida. ");
////            System.out.println("O que deseja verificar: ");
////            System.out.println("0 - Abertura" + "\n" +
////                    "1 - Alta: " + "\n" +
////                    "2 - Baixa " +"\n" +
////                    "3 - Fechar " + "\n" +
////                    "4 - Ajuste " + "\n" +
////                    "5 - Volume ");
////            opcao = ler.nextInt();
////            ler.nextLine();
////        }
////        Grafico grafico = new Grafico(simbolos.getarqvnome(keyarqv),exemplo, opcao);
////
////
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        System.out.println("Sucess");
//    }
//}
