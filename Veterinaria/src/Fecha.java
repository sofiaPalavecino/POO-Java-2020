public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean esAnioBisiesto() {
        boolean esBisiesto = false;
        if (this.anio % 4 == 0 && this.anio % 100 != 0 || this.anio % 400 == 0) {
            esBisiesto = true;
        }

        return esBisiesto;
    }

    public int cantidadDeDiasSegunNumeroDeMes(int numeroDeMes) {
        int cantidadDeDias = 0;
        byte canDeDias;
        if (this.entreEneroYJulio(numeroDeMes) && !this.mesPar(numeroDeMes)) {
            cantidadDeDias = 31;
        } else if (numeroDeMes == 2 && this.esAnioBisiesto()) {
            cantidadDeDias = 29;
        } else {
            cantidadDeDias = 30;
        }

        return cantidadDeDias;
    }

    public boolean mesPar(int numeroDeMes) {
        boolean esPar = numeroDeMes % 2 == 0;
        return esPar;
    }

    public boolean entreEneroYJulio(int numeroDeMes) {
        boolean dentroDelRango = false;
        if (numeroDeMes >= 1 && numeroDeMes <= 7) {
            dentroDelRango = true;
        }

        return dentroDelRango;
    }

    public boolean entreAgostoYDiciembre(int numeroDeMes) {
        boolean dentroDelRango = false;
        if (numeroDeMes >= 8 && numeroDeMes <= 12) {
            dentroDelRango = true;
        }

        return dentroDelRango;
    }

    public boolean esIgualA(Fecha fecha) {
        boolean sonIguales = this.dia == fecha.getDia() && this.mes == fecha.getMes() && this.anio == fecha.getAnio();
        return sonIguales;
    }

    public int cantidadDeDiasDeDiferenciaCon(Fecha fecha) {
        int cantidadDeDias = 0;
        if (!this.esIgualA(fecha)) {
            for(int i = this.anio; i <= fecha.getAnio(); ++i) {
            }
        }

        return cantidadDeDias;
    }
}
