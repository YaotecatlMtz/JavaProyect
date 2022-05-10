package mx.iteso.javaproyect;

public class Vector implements Operators{
    private double[] vect = new double[3];

   public Vector(double[] vect){
        this.vect = vect;
   }

    public void setVect(double[] vect) {
        this.vect = vect;
    }

    public double[] getVect() {
        return vect;
    }

   

    public double[] suma(double[] x) {

        for(int i = 0; i < 3;i++){
            this.vect[i] += x[i];
        } 
        return this.vect;
    }

 
    public double[] resta(double[] x) {
        for(int i = 0; i < 3;i++){
            this.vect[i] -= x[i];
        }
        return null;
    }



  
    public double[] productoxEscalar(int y) {
        for(int i = 0; i < 3;i++){
            this.vect[i] *= y;
        }
        return this.vect;
    }

    @Override
    public String toString(){

        String msg = " ";
        if(this.vect[2] == 0 ){
            msg = String.format("Vector: [%.2f], [%.2f]", this.vect[0],this.vect[1]);

        }else{
            msg = String.format("Vector: [%.2f], [%.2f], [%.2f]", this.vect[0],this.vect[1],this.vect[2]);

        }
        return msg;
    }

    @Override
    public boolean independenciaLineal() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
