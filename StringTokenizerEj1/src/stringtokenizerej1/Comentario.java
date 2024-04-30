package stringtokenizerej1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Comentario {
    private String Autor;
    private String Contenido;
    public Comentario(String Autor, String Contenido)
    {
        this.Autor=Autor;
        this.Contenido=Contenido;
    }
    public String ObtenerPalabraMasRepetida()
    {
        Integer i=0;
        String Saux="";
        LinkedHashMap<String,Integer>aux=ObtenerRepeticionesPalabrasTotal();
        for(Map.Entry<String,Integer>entrada:aux.entrySet())
        {
            if(entrada.getValue()>i)
            {
                Saux=entrada.getKey();
                i=entrada.getValue();
            }
        }
        return Saux;
    }
    public int ContarNumeroPalabras()
    {
        StringTokenizer t=new StringTokenizer(Contenido);
        return t.countTokens();
    }
    public int ContarRepeticiones(String Buscado)
    {
        Buscado=Buscado.toLowerCase();
        int i=0;
        StringTokenizer t=new StringTokenizer(Contenido);
        while(t.hasMoreTokens()){
            if(t.nextToken().toLowerCase().equals(Buscado))
            {
                i++;
            }
            
        }
        return i;
    }
    public LinkedHashMap<String,Integer> ObtenerRepeticionesPalabrasTotal()
    {
        LinkedHashMap<String,Integer> aux=new LinkedHashMap<String,Integer>();
	StringTokenizer t=new StringTokenizer(Contenido);
        while(t.hasMoreTokens()){
            String Saux=t.nextToken().toLowerCase();
            if(aux.containsKey(Saux))
            {
                aux.put(Saux,aux.get(Saux)+1);
            }
            else
            {
                aux.put(Saux,1);
            }
        }
        return aux;
    }
    
    public String getDatos()
    {
        return "Autor:"+this.Autor+":"+this.Contenido;
    }
    public String getContenido()
    {
        return this.Contenido;
    }
    public String getAutor()
    {
        return this.Autor;
    }
}
