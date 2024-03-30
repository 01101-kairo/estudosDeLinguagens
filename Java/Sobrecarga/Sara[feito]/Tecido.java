public class Tecido {
    private String algodao;
    private String elastano;
    private String poliester;
    private String malha;

    public Tecido(String algodao, String elastano, String poliester, String malha) {
        this.algodao = algodao;
        this.elastano = elastano;
        this.poliester = poliester;
        this.malha = malha;

        
    }
    public String getAlgodao() {
        return algodao;
    }
    public void setAlgodao(String algodao) {
        this.algodao = algodao;
    }
    public String getElastano() {
        return elastano;
    }
    public void setElastano(String elastano) {
        this.elastano = elastano;
    }
    public String getPoliester() {
        return poliester;
    }
    public void setPoliester(String poliester) {
        this.poliester = poliester;
    }
    public String getMalha() {
        return malha;
    }
    public void setMalha(String malha) {
        this.malha = malha;
    }

    
    
}
