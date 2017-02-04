package com.RenanM;

import java.net.URL;
import java.util.*;

/**
 * Created by Marcel on 1/26/2017.
 */
public final class Simbolos {
    private static final Map<String, Info> simbolos;

    static {
        Calendar c = Calendar.getInstance();
        int dia = c.get(Calendar.DAY_OF_MONTH);
        int mes = c.get(Calendar.MONTH);
        simbolos = new HashMap<>();
        simbolos.put("ABEV3.SA", new Info("Ambev SA", "http://real-chart.finance.yahoo.com/table.csv?s=ABEV3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=5&c=2000&ignore=.csv"));
        simbolos.put("BBAS3.SA", new Info("Banco do Brasil SA BB Brasil", "http://real-chart.finance.yahoo.com/table.csv?s=BBAS3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("BBDC3.SA", new Info("Banco Bradesco S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=BBDC3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("BBDC4.SA", new Info("BCO Bradesco S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=BBDC4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=2&c=2008&ignore=.csv"));
        simbolos.put("BBSE3.SA", new Info("BB Seguridade Participacoes SA", "http://real-chart.finance.yahoo.com/table.csv?s=BBSE3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=3&b=29&c=2013&ignore=.csv"));
        simbolos.put("BRAP4.SA", new Info("Bradespar SA", "http://real-chart.finance.yahoo.com/table.csv?s=BRAP4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=7&b=14&c=2000&ignore=.csv"));
        simbolos.put("BRFS3.SA", new Info("BRF S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=BRFS3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("BRKM5.SA", new Info("Braskem SA", "http://real-chart.finance.yahoo.com/table.csv?s=BRKM5.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=8&b=4&c=2002&ignore=.csv"));
        simbolos.put("BRLM3.SA", new Info("BR Malls Participações S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=BRML3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=3&b=5&c=2007&ignore=.csv"));
        simbolos.put("BRPR3.SA", new Info("BR Properties S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=BRPR3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=2&b=8&c=2010&ignore=.csv"));
        simbolos.put("BVMF3.SA", new Info("BM&FBOVESPA S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=BVMF3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=4&b=9&c=2011&ignore=.csv"));
        simbolos.put("CCRO3.SA", new Info("CCR SA", "http://real-chart.finance.yahoo.com/table.csv?s=CCRO3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=1&b=1&c=2002&ignore=.csv"));
        simbolos.put("CESP6.SA", new Info("CESP - Cia Energetica de Sao Paulo", "http://real-chart.finance.yahoo.com/table.csv?s=CESP6.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=6&b=31&c=2006&ignore=.csv"));
        simbolos.put("CIEL3.SA", new Info("Cielo S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=CIEL3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=5&b=29&c=2009&ignore=.csv"));
        simbolos.put("CMIG4.SA", new Info("Energy Company of Minas Gerais", "http://real-chart.finance.yahoo.com/table.csv?s=CMIG4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("CPFE3.SA", new Info("CPL Energy SA", "http://real-chart.finance.yahoo.com/table.csv?s=CPFE3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("CPLE6.SA", new Info("Energy Company of Parana", "http://real-chart.finance.yahoo.com/table.csv?s=CPLE6.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("CSAN3.SA", new Info("Cosan S.A. Indústria e Comércio", "http://real-chart.finance.yahoo.com/table.csv?s=CSAN3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=10&b=18&c=2005&ignore=.csv"));
        simbolos.put("CSNA3.SA", new Info("Companhia Siderurgica Nacional", "http://real-chart.finance.yahoo.com/table.csv?s=CSNA3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("CTIP3.SA", new Info("CETIP SA Mercados Organizados", "http://real-chart.finance.yahoo.com/table.csv?s=CTIP3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=9&b=28&c=2009&ignore=.csv"));
        simbolos.put("CYRE3.SA", new Info("Cyrela Brazil Realty SA Empreend e Part", "http://real-chart.finance.yahoo.com/table.csv?s=CYRE3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("ECOR3.SA", new Info("EcoRodovias Infraestrutura e Logistica SA", "http://real-chart.finance.yahoo.com/table.csv?s=ECOR3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=3&b=1&c=2010&ignore=.csv"));
        simbolos.put("ELET3.SA", new Info("Centrais Eletricas Brasileiras SA", "http://real-chart.finance.yahoo.com/table.csv?s=ELET3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("EMBR3.SA", new Info("Embraer S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=EMBR3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("ENBR3.SA", new Info("EDP - Energias do Brasil SA", "http://real-chart.finance.yahoo.com/table.csv?s=ENBR3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("EQTL3.SA", new Info("Equatorial Energia SA", "http://real-chart.finance.yahoo.com/table.csv?s=EQTL3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=3&b=7&c=2008&ignore=.csv"));
        simbolos.put("ESTC3.SA", new Info("Estacio Participacoes SA", "http://real-chart.finance.yahoo.com/table.csv?s=ESTC3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=6&b=11&c=2008&ignore=.csv"));
        simbolos.put("FIBR3.SA", new Info("Fibria Celulose S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=FIBR3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("GGBR4.SA", new Info("Gerdau SA", "http://real-chart.finance.yahoo.com/table.csv?s=GGBR4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=4&b=2&c=2000&ignore=.csv"));
        simbolos.put("GOAU4.SA", new Info("Metalurgica Gerdau SA", "http://real-chart.finance.yahoo.com/table.csv?s=GOAU4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=4&b=2&c=2000&ignore=.csv"));
        simbolos.put("GOLL4.SA", new Info("Gol Intelligent Airlines Inc", "http://real-chart.finance.yahoo.com/table.csv?s=GOLL4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=5&b=24&c=2004&ignore=.csv"));
        simbolos.put("HGTX3.SA", new Info("CIA Hering SA", "http://real-chart.finance.yahoo.com/table.csv?s=HGTX3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("HYPE3.SA", new Info("Hypermarcas SA", "http://real-chart.finance.yahoo.com/table.csv?s=HYPE3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=3&b=18&c=2008&ignore=.csv"));
        simbolos.put("ITSA4.SA", new Info("Itausa Investimentos ITAU SA", "http://real-chart.finance.yahoo.com/table.csv?s=ITSA4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("ITUB4.SA", new Info("Itaú Unibanco Holding S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=ITUB4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=11&b=21&c=2000&ignore=.csv"));
        simbolos.put("JBSS3.SA", new Info("JBS SA", "http://real-chart.finance.yahoo.com/table.csv?s=JBSS3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=2&b=29&c=2007&ignore=.csv"));
        //simbolos.put("KLBN11.SA", "KLABIN S/A UNT N2");
        simbolos.put("KROT3.SA", new Info("Kroton Educacional S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=KROT3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=2&b=14&c=2012&ignore=.csv"));
        simbolos.put("LAME4.SA", new Info("Lojas Americanas SA", "http://real-chart.finance.yahoo.com/table.csv?s=LAME4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("LREN3.SA", new Info("Lojas Renner SA", "http://real-chart.finance.yahoo.com/table.csv?s=LREN3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=4&c=2000&ignore=.csv"));
        simbolos.put("MRFG3.SA", new Info("Marfrig Global Foods S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=MRFG3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=5&b=29&c=2007&ignore=.csv"));
        simbolos.put("MRVE3.SA", new Info("MRV Engenharia e Participacoes SA", "http://real-chart.finance.yahoo.com/table.csv?s=MRVE3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=6&b=23&c=2007&ignore=.csv"));
        simbolos.put("MULT3.SA", new Info("Multiplan Empreendimentos Imobiliarios SA", "http://real-chart.finance.yahoo.com/table.csv?s=MULT3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=6&b=27&c=2007&ignore=.csv"));
        simbolos.put("NATU3.SA", new Info("Natura Cosmeticos SA", "http://real-chart.finance.yahoo.com/table.csv?s=NATU3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=4&b=26&c=2004&ignore=.csv"));
        simbolos.put("OIBR4.SA", new Info("Oi SA", "http://real-chart.finance.yahoo.com/table.csv?s=OIBR4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=5&b=6&c=2002&ignore=.csv"));
        simbolos.put("PCAR4.SA", new Info("Companhia Brasileira de Distribuicao", "http://real-chart.finance.yahoo.com/table.csv?s=PCAR4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=2&c=2008&ignore=.csv"));
        simbolos.put("PETR3.SA", new Info("Petroleo Brasileiro SA Petrobras", "http://real-chart.finance.yahoo.com/table.csv?s=PETR3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("PETR4.SA", new Info("Petroleo Brasileiro SA Petrobras-", "http://real-chart.finance.yahoo.com/table.csv?s=PETR4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("QUAL3.SA", new Info("Qualicorp SA", "http://real-chart.finance.yahoo.com/table.csv?s=QUAL3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=5&b=29&c=2011&ignore=.csv"));
        simbolos.put("RADL3.SA", new Info("Raia Drogasil SA", "http://real-chart.finance.yahoo.com/table.csv?s=RADL3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=6&c=2000&ignore=.csv"));
        simbolos.put("RENT3.SA", new Info("Localiza Rent A Car SA", "http://real-chart.finance.yahoo.com/table.csv?s=RENT3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=4&b=23&c=2005&ignore=.csv"));
        simbolos.put("RUMO3.SA", new Info("Rumo Logistica Operadora Multimodal SA", "http://real-chart.finance.yahoo.com/table.csv?s=RUMO3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=3&b=2&c=2015&ignore=.csv"));
        simbolos.put("SANB11.SA", new Info("SANTANDER BRUNT", "http://real-chart.finance.yahoo.com/table.csv?s=SANB11.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=9&b=7&c=2009&ignore=.csv"));
        simbolos.put("SBSP3.SA", new Info("Companhia de Saneamento Basico do Estado de Sao Paulo", "http://real-chart.finance.yahoo.com/table.csv?s=SBSP3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("SMLE3.SA", new Info("Smiles SA", "http://real-chart.finance.yahoo.com/table.csv?s=SMLE3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=3&b=29&c=2013&ignore=.csv"));
        simbolos.put("SUZB5.SA", new Info("Suzano Papel e Celulose S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=SUZB5.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        //simbolos.put("TBLE3.SA", "Tractebel Energia SA");
        simbolos.put("TIMP3.SA", new Info("TIM Participações S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=TIMP3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=6&b=8&c=2005&ignore=.csv"));
        simbolos.put("UGPA3.SA", new Info("Ultrapar Participacoes SA", "http://real-chart.finance.yahoo.com/table.csv?s=UGPA3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=11&b=11&c=2002&ignore=.csv"));
        simbolos.put("USIM5.SA", new Info("Usinas Siderurgicas de Minas Gerais,S.A.", "http://real-chart.finance.yahoo.com/table.csv?s=USIM5.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("VALE3.SA", new Info("Vale SA", "http://real-chart.finance.yahoo.com/table.csv?s=VALE3.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
        simbolos.put("VALE5.SA", new Info("Vale SA-", "http://real-chart.finance.yahoo.com/table.csv?s=VALE5.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=1&c=2003&ignore=.csv"));
        simbolos.put("VIVT4.SA", new Info("Telefonica Brasil SA", "http://real-chart.finance.yahoo.com/table.csv?s=VIVT4.SA&d=" + mes + "&e=" + dia + "&f=2017&g=d&a=0&b=3&c=2000&ignore=.csv"));
    }


    public String getarqvnome(String simbolo){
        return simbolos.get(simbolo).getNome();
    }

    public List<String> getSimbolos(){
        List<String> lista = new ArrayList<>();
        for(String simbolo : simbolos.keySet()){
            lista.add(simbolo);
        }
        return lista;
    }

    public List<String> getListnames(){
        List<String> lista = new ArrayList<>();
        for(String simbolo : simbolos.keySet()){
            lista.add(simbolos.get(simbolo).getNome());
        }
        return lista;

    }

    public URL getarqurl(String simbolo){
        return simbolos.get(simbolo).getUrl();
    }

    public boolean contains(String simbolo){
        if(simbolos.containsKey(simbolo)){
            return true;
        }
        return false;
    }
}


