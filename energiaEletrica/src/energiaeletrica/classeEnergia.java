package energiaeletrica;

import javax.swing.JOptionPane;

public class classeEnergia {
    
    private int leituraAnterior;
    private int leituraAtual;
    private float gasto;
    private float taxaTusd;
    private float taxaTe;
    private float total;
    private float icms;
    private float acrescimo;
    private String bandeira;
    private float totalConta;

    public float getTotalConta() {
        return totalConta;
    }
    public void setTotalConta(float totalConta) {
        this.totalConta = totalConta;
    }
    public String getBandeira() {
        return bandeira;
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public float getTaxaTusd() {
        return taxaTusd;
    }
    public void setTaxaTusd(float taxaTusd) {
        this.taxaTusd = taxaTusd;
    }
    public float getTaxaTe() {
        return taxaTe;
    }
    public void setTaxaTe(float taxaTe) {
        this.taxaTe = taxaTe;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public float getIcms() {
        return icms;
    }
    public void setIcms(float icms) {
        this.icms = icms;
    }
    public float getAcrescimo() {
        return acrescimo;
    }
    public void setAcrescimo(float acrescimo) {
        this.acrescimo = acrescimo;
    }    
    public float getGasto() {
        return gasto;
    }
    public void setGasto(float gasto) {
        this.gasto = gasto;
    }  
    public int getLeituraAnterior() {
        return leituraAnterior;
    }
    public void setLeituraAnterior(int leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }
    public int getLeituraAtual() {
        return leituraAtual;
    }
    public void setLeituraAtual(int leituraAtual) {
        this.leituraAtual = leituraAtual;
    }
    
    public float gasto(int leituraAtual, int leituraAnterior){
        this.gasto = leituraAtual - leituraAnterior;
        return this.gasto;
    }
    
    public float taxaTusd(float gasto){
        this.taxaTusd = this.gasto * 3;
        this.taxaTusd = this.taxaTusd/10;
        return this.taxaTusd;
    }
    
    public float taxaTe(float gasto){
        this.taxaTe = this.gasto * 29;
        this.taxaTe = this.taxaTe/100;
        return this.taxaTe;
    }
    
    public float total(float taxaTusd, float taxaTe){
    
        this.total = this.taxaTusd + this.taxaTe;
        return this.total;
        
    }
    
    public float calcSemBand (float total, float icms){
        
        this.icms = this.total * 25;
        this.icms = this.icms/100;
        this.icms = this.icms + this.total;
        return this.icms;
    
    }
    
    public String bandeira (float gasto){
    
        if (this.gasto<100) {
            this.bandeira = "Verde";
        }else if (this.gasto>101 && this.gasto <150) {
            this.bandeira = "Amarela";
        }else if (this.gasto > 150 && this.gasto<200) {
            this.bandeira = "Vermelha";
        }else{
            this.bandeira = "Vermelha2";
        }
        return this.bandeira;
    }
    
    public float acrescimo(String bandeira, float icms){
        
        if("Verde".equals(this.bandeira)) {
            this.acrescimo = 1;
        }else if ("Amarela".equals(this.bandeira)) {
            this.acrescimo = 1343;
            this.acrescimo = this.acrescimo / 100000;
        }else if ("Vermelha".equals(this.bandeira)) {
            this.acrescimo = 4169;
            this.acrescimo = this.acrescimo / 100000;
        }else{
            this.acrescimo = 6243;
            this.acrescimo = this.acrescimo / 100000;
        }
       
        return this.acrescimo;
    
    }
    
    public float calcComBand (String bandeira, float icms){
        
        this.totalConta = this.icms * this.acrescimo;
        this.totalConta = this.totalConta + this.icms;
        
        return this.totalConta;
        
    }

    public void notinha(int leituraAnterior, int leituraAtual, float gasto, float taxaTusd, float taxaTe, float total, float icms, String bandeira, float acrescimo, float totalConta) {
       
        JOptionPane.showMessageDialog(null, "----- NOTINHA -----"
                + "\n\nLeitura Anterior: "
                + this.leituraAnterior
                + "\nLeitura Atual: "
                + this.leituraAtual
                + "\nGasto de energia: "
                + this.gasto
                + "\nTaxa TUSD: R$"
                + this.taxaTusd
                + "\nTaxa TE: R$"
                + this.taxaTe
                + "\nSoma das taxas: R$"
                + this.total
                + "\n\nTotal a pagar sem Bandeira: R$"
                + this.icms
                + "\n\nBandeira: "
                + this.bandeira
                + "\nAcrescimo: R$"
                + this.acrescimo
                + "\n\nTotal a pagar COM Bandeira: R$"
                + this.totalConta
        );
        
    }
    
}
