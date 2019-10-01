package progra.Sistema.Fifa.Model;

public class Registro {

    private String sector;
    private double pm25;
    private double pm10;
    private double temperatura;
    private int dispositivo;
    private String fecha;
    private String hora;

    public Registro() {

    }

    public Registro(String sector, int dispositivo, String fecha, String hora, double pm10, double pm25, double temperatura) {
        this.sector = sector;
        this.pm25 = pm25;
        this.pm10 = pm10;
        this.temperatura = temperatura;
        this.dispositivo = dispositivo;
        this.fecha = fecha;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Sector:" + sector + " Dispositivo:" + dispositivo + " Fecha:" + fecha + " Hora:" + hora + " PM10:" + pm10 + " PM2.5:" + pm25 + " Temperatura:" + temperatura;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double getPm25() {
        return pm25;
    }

    public void setPm25(double pm25) {
        this.pm25 = pm25;
    }

    public double getPm10() {
        return pm10;
    }

    public void setPm10(double pm10) {
        this.pm10 = pm10;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(int dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
