package clase9;

import java.util.Calendar;

public class Fecha {
	
	private int dia,mes,anio;
	public Fecha (int dia, int mes, int anio) {
		this.dia=dia;
		this.mes = mes;
		this.anio = anio;
		
		
		if(!fechaCorrecta()) {
			
			Calendar fechaDelSistema = Calendar.getInstance();
			setDia(fechaDelSistema.get(Calendar.DAY_OF_MONTH));
			setMes(fechaDelSistema.get(Calendar.MONTH));
			setAnio(fechaDelSistema.get(Calendar.YEAR));
			this.mes++;
		}
	}
	private boolean esBisiesto() {
		return ((anio % 4==0)) && (anio% 100 !=0) || (anio % 400 ==0);
		
	}
	
	public boolean fechaCorrecta(){
		boolean diaCorrecto, mesCorrecto , anioCorrecto;
		anioCorrecto = (anio >0);
		mesCorrecto = (mes>1)&&  (mes <=12);
		switch (mes) {
	case 2: //febrero
		if(esBisiesto()) {
			diaCorrecto = (dia > 1 && dia <=29);
		}else { 
			diaCorrecto = (dia >=1 && dia <=28);
		} break;
	case 4: //abril
		
	case 6: //junio
		
	case 9://septiembre
		
	case 11://noviembrne
	
	diaCorrecto = (dia >1 && dia <=30);
	break;
	default: diaCorrecto = (dia >1 && dia <=30);
	break;}
		return diaCorrecto && mesCorrecto && anioCorrecto;
}
	//SOBRECARGA DE METODOS
	//primer metodo
	public void asignarFecha() {
		//este metodo asigna la fecha del sistema
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(fechaDelSistema.get(Calendar.DAY_OF_MONTH));
		setMes(fechaDelSistema.get(Calendar.MONTH));
		setAnio(fechaDelSistema.get(Calendar.YEAR));
	}
	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	//primer metodo sobrecargado 
	public void asignarFecha(int d) {
		Calendar fechaDelSistema = Calendar.getInstance();
	setDia(d);
	setMes(fechaDelSistema.get(Calendar.MONTH));
	setAnio(fechaDelSistema.get(Calendar.YEAR));
		
	}	public void asignarFecha(int d, int m) {
		Calendar fechaDelSistema = Calendar.getInstance();
	setDia(d);
	setMes(m);
	setAnio(fechaDelSistema.get(Calendar.YEAR));}
	
	public void asignarFecha(int d, int m, int a) {

	setDia(d);
	setMes(m);
	setAnio(a);
	
	
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}}
