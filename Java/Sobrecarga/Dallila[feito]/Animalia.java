public class Animalia {
    private String ave;
    private String maritimo;
    private String terestre;

    public Animalia(String ave, String maritimo, String terestre) {
        this.ave = ave;
        this.maritimo = maritimo;
        this.terestre = terestre;

        
    }
    public String getave() {
        return ave;
    }
    public void setave(String ave) {
        this.ave = ave;
    }
    public String getmaritimo() {
        return maritimo;
    }
    public void setmaritimo(String maritimo) {
        this.maritimo = maritimo;
    }
    public String getterestre() {
        return terestre;
    }
    public void setterestre(String terestre) {
        this.terestre = terestre;
    }
}
