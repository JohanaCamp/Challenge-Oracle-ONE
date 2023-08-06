package currencyConverter;

import javax.swing.JOptionPane;

public class function {

	ConvertToCurrency monedas = new ConvertToCurrency();
	ConvertCurrencyToSoles pesos = new ConvertCurrencyToSoles();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.convertirPesosADolares(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.convertirPesosAEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.convertirPesosALibras(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.convertirPesosAYenes(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.convertirPesosAWones(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.convertirDolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirLibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirWonAPesos(Minput);
            break;
        }      
    }
        
}
