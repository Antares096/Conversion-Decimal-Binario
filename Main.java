package numerobinario;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        int num = Numero();
        
        int bin [] = NumBinario(num);
        
        ImpresionBin(bin);
        
        String num_binario = OrdenarNumero(bin);
    }
    
    public static int Numero()
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("Digite un numero:");
        
        int numero = sca.nextInt();
        System.out.println("-----------");
        return numero;
    }
    
    public static int [] NumBinario(int numero)
    {
        int binario [] = null;
        
        int  num_bin = 0,cont_bin = 0,temp = 0,mod_bin = 0;
        
        temp = numero;
        
        do
        {
            mod_bin = temp % 2;
            
            if(mod_bin == 0 || mod_bin == 1)
            {
                cont_bin++;
            }
            
            temp = temp / 2;
            
            if(temp == 1)
            {
                cont_bin++;
            }
            
        }while(temp != 1);

        binario = new int[cont_bin];
        
        for(int i = 0; i < cont_bin; i++)
        {
            num_bin = numero % 2;
            binario[i] = num_bin;
            
            if(numero == 1)
            {
                binario[i] = numero;
            }
            
            numero = numero / 2;
        }
        
        return binario;
    }
    
    public static void ImpresionBin(int bin[])
    {
        for (int i = 0; i < bin.length; i++)
        {
            System.out.println("B["+i+"] = "+bin[i]);
        }
    }
    
    public static String OrdenarNumero(int binario [])
    {
        String binario_cad ="";
        
        int aux_bin [] = new int[binario.length];
        int index = 0;
        
        for(int i = binario.length-1; i >= 0; i--)
        {
            aux_bin[index] = binario[i];
            
            index++;
        }
        
        for(int j = 0; j < aux_bin.length; j++)
        {
            binario_cad+=" "+aux_bin[j];
        }
        
        System.out.println("Numero en binario: "+binario_cad);
        
        index = 0;
        aux_bin = null;
        return binario_cad;
    }
}
