package energiaeletrica;

import javax.swing.JOptionPane;

public class EnergiaEletrica {

    public static void main(String[] args) {
        
        classeEnergia dados = new classeEnergia();
        
        dados.setLeituraAnterior(Integer.parseInt(JOptionPane.showInputDialog("Digeite a leitura anterior: ")));
        dados.setLeituraAtual(Integer.parseInt(JOptionPane.showInputDialog("Digeite a leitura atual: ")));
        
        dados.gasto(dados.getLeituraAtual(),dados.getLeituraAnterior());
        dados.taxaTusd(dados.getGasto());
        dados.taxaTe(dados.getGasto());
        dados.total(dados.getTaxaTusd(),dados.getTaxaTe());
        dados.calcSemBand(dados.getTotal(), dados.getIcms());
        
        dados.bandeira(dados.getGasto());
        dados.acrescimo(dados.getBandeira(),dados.getIcms());
        dados.calcComBand(dados.getBandeira(),dados.getIcms());
        dados.notinha(dados.getLeituraAnterior(),dados.getLeituraAtual(),dados.getGasto(),dados.getTaxaTusd(),dados.getTaxaTe(),dados.getTotal(),dados.getIcms(),dados.getBandeira(),dados.getAcrescimo(),dados.getTotalConta());
        
    }

    
}
